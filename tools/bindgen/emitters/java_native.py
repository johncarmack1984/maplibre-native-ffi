"""Generate the desktop Java FFM interface with C's signatures and ownership.

Pointers stay zero-length MemorySegments until a caller supplies their extent.
Records wrap bounded segments; their accessors preserve the arena's checks.
"""

from __future__ import annotations

import html
import re
from dataclasses import replace

from tools.bindgen import docs
from tools.bindgen.abi import Abi, Array, Primitive, Record
from tools.bindgen.compiler import compile_api, served
from tools.bindgen.frontend import reachable_types
from tools.bindgen.model import Api, CType, Lowered, Parameter
from tools.bindgen.names import pascal
from tools.bindgen.protocol import (
    BUFFER_VIEW,
    COMPLETION,
    COMPLETION_RESULT,
    DIAGNOSTIC,
)
from tools.bindgen.semantic import BoundApi

DIRECTORY = "bindings/java/src/main/java/org/maplibre/nativeffi/internal/c"
TARGETS = frozenset({"linux", "macos", "windows", "freebsd"})
KEYWORDS = {
    "default",
    "native",
    "class",
    "interface",
    "long",
    "int",
    "float",
    "double",
    "boolean",
    "short",
    "byte",
    "char",
    "void",
    "switch",
    "case",
    "return",
    "new",
    "static",
    "public",
    "private",
    "protected",
    "final",
    "this",
    "super",
    "enum",
    "assert",
    "package",
    "import",
    "throws",
    "throw",
    "try",
    "catch",
    "finally",
    "if",
    "else",
    "while",
    "for",
    "do",
    "break",
    "continue",
    "instanceof",
    "synchronized",
    "volatile",
    "transient",
    "abstract",
    "extends",
    "implements",
    "const",
    "goto",
    "true",
    "false",
    "null",
    "_",
}
HEADER = "// Generated from the C headers by tools/bindgen. Do not edit.\npackage org.maplibre.nativeffi.internal.c;\n\n"
IMPORTS = """import java.lang.foreign.*;
import java.lang.invoke.*;
import static java.lang.foreign.ValueLayout.*;

"""
PRIMITIVES = {
    "Boolean": ("boolean", "JAVA_BOOLEAN"),
    "Byte": ("byte", "JAVA_BYTE"),
    "Short": ("short", "JAVA_SHORT"),
    "Int": ("int", "JAVA_INT"),
    "Long": ("long", "JAVA_LONG"),
    "Float": ("float", "JAVA_FLOAT"),
    "Double": ("double", "JAVA_DOUBLE"),
}


def identifier(name: str) -> str:
    return name + "_" if name in KEYWORDS else name


def name(native: str) -> str:
    return pascal(native.removeprefix("mln_"))


def comment(decl) -> str:
    text = html.escape(docs.summary(decl.documentation)).replace("*/", "*&#47;")
    text = re.sub(r"`([^`]+)`", r"{@code \1}", text)
    url = docs.reference_url(decl.location.path)
    return f'/** {text}\n * @see <a href="{url}">{decl.name}</a>\n */\n'


class Java:
    def __init__(self, api):
        self.api = api
        self.abi = Abi(api)

    def kind(self, type_: CType):
        if type_.canonical == "void":
            return None
        return self.abi.classify(type_)

    def carrier(self, kind):
        if kind is None:
            return "void"
        if isinstance(kind, Primitive):
            return (
                "MemorySegment" if kind.name == "ptr" else PRIMITIVES[kind.carrier][0]
            )
        return "MemorySegment"

    def layout(self, kind):
        if isinstance(kind, Primitive):
            return "ADDRESS" if kind.name == "ptr" else PRIMITIVES[kind.carrier][1]
        if isinstance(kind, Array):
            return f"MemoryLayout.sequenceLayout({kind.length}, {self.layout(kind.element)})"
        return f"Layouts.{name(kind.name)}"

    def descriptor(self, result, parameters):
        args = ", ".join(self.layout(self.kind(p.type)) for p in parameters)
        if self.kind(result) is None:
            return f"FunctionDescriptor.ofVoid({args})"
        return f"FunctionDescriptor.of({self.layout(self.kind(result))}{', ' if args else ''}{args})"

    def record(self, record):
        kind = self.abi.classify(CType("record", record.name, record.name, record.name))
        layout = self.abi.record(kind, 64)
        fields = []
        cursor = 0
        for field_name, field_kind in kind.fields:
            offset = layout.offsets[field_name]
            size, _align = self.abi.size_align(field_kind, 64)
            if not kind.union and offset > cursor:
                fields.append(f"MemoryLayout.paddingLayout({offset - cursor})")
            fields.append(self.layout(field_kind) + f'.withName("{field_name}")')
            cursor = max(cursor, offset + size)
        if not kind.union and cursor < layout.size:
            fields.append(f"MemoryLayout.paddingLayout({layout.size - cursor})")
        constructor = "unionLayout" if kind.union else "structLayout"
        class_name = name(record.name)
        body = (
            comment(record) + f"public record {class_name}(MemorySegment segment) {{\n"
        )
        body += (
            f"public static final GroupLayout LAYOUT = MemoryLayout.{constructor}(\n"
            + ",\n".join(fields)
            + ");\n"
        )
        body += f"public {class_name} {{\nsegment = segment.asSlice(0, LAYOUT);\n}}\n"
        body += f"/** Allocates zeroed native storage in the supplied arena. */\npublic static {class_name} allocate(Arena arena) {{\n"
        body += f"var value = new {class_name}(arena.allocate(LAYOUT));\n"
        # Sized records are the public C API's versioned descriptors and outputs.
        size_field = next(
            (
                f
                for f in record.fields
                if f.name == "size" and f.type.canonical in {"unsigned int", "uint32_t"}
            ),
            None,
        )
        if size_field:
            body += "value.size((int) LAYOUT.byteSize());\n"
        body += "return value;\n}\n"
        for field in record.fields:
            field_kind = self.kind(field.type)
            offset = layout.offsets[field.name]
            member = identifier(field.name)
            typ = self.carrier(field_kind)
            body += comment(field)
            if isinstance(field_kind, Primitive):
                field_layout = self.layout(field_kind)
                body += f"public {typ} {member}() {{ return segment.get({field_layout}, {offset}); }}\n"
                body += f"public void {member}({typ} value) {{ segment.set({field_layout}, {offset}, value); }}\n"
            elif isinstance(field_kind, Record):
                typ = name(field_kind.name)
                body += f"public {typ} {member}() {{ return new {typ}(segment.asSlice({offset}, {typ}.LAYOUT)); }}\n"
                body += f"public void {member}({typ} value) {{ MemorySegment.copy(value.segment(), 0, segment, {offset}, {typ}.LAYOUT.byteSize()); }}\n"
            else:
                size, _align = self.abi.size_align(field_kind, 64)
                body += f"public MemorySegment {member}() {{ return segment.asSlice({offset}, {size}); }}\n"
        return body + "}\n"

    def function(self, function):
        parameters = list(function.parameters)
        if function.diagnostic:
            parameters.append(
                Parameter(
                    "out_diagnostic",
                    CType("pointer", f"{DIAGNOSTIC} *", f"struct {DIAGNOSTIC} *"),
                )
            )
        args = [
            (identifier(p.name), self.carrier(self.kind(p.type))) for p in parameters
        ]
        result = self.kind(function.return_type)
        typ = self.carrier(result)
        signature = ", ".join(f"{t} {n}" for n, t in args)
        invocation = ", ".join(n for n, _t in args)
        aggregate = isinstance(result, Record)
        if aggregate:
            signature = "SegmentAllocator allocator" + (
                ", " + signature if signature else ""
            )
            invocation = "allocator" + (", " + invocation if invocation else "")
        descriptor = self.descriptor(function.return_type, parameters)
        holder = "Fn_" + function.name
        body = f'private static final class {holder} {{\nstatic final MethodHandle HANDLE = Ffm.downcall("{function.name}", {descriptor});\n}}\n'
        body += comment(function)
        platforms = served(function, TARGETS)
        if platforms is not None:
            body += f"/** Available on: {', '.join(sorted(platforms))}. */\n"
        body += f"public static {typ} {function.name}({signature}) {{\ntry {{\n"
        call = f"{holder}.HANDLE.invokeExact({invocation})"
        body += f"{call};\n" if typ == "void" else f"return ({typ}) {call};\n"
        body += "} catch (Throwable failure) { throw Ffm.rethrow(failure); }\n}\n"
        return body

    def callback(self, typedef):
        function = typedef.type.pointee
        assert function is not None and function.result is not None
        args = [
            (identifier(p.name), self.carrier(self.kind(p.type)))
            for p in typedef.parameters
        ]
        typ = self.carrier(self.kind(function.result))
        descriptor = self.descriptor(function.result, typedef.parameters)
        class_name = name(typedef.name)
        signature = ", ".join(f"{t} {n}" for n, t in args)
        invocation = ", ".join(n for n, _t in args)
        fallback = {
            "void": "return;",
            "MemorySegment": "return MemorySegment.NULL;",
            "boolean": "return false;",
        }.get(typ, "return 0;")
        failure = typedef.metadata.get("failure")
        if failure and typ not in {"void", "MemorySegment", "boolean"}:
            fallback = f"return C.{failure};"
        body = (
            comment(typedef)
            + f"@FunctionalInterface\npublic interface {class_name} {{\n{typ} invoke({signature});\n"
        )
        body += f"FunctionDescriptor DESCRIPTOR = {descriptor};\n"
        body += f"/** Creates a stub valid until the shared arena closes. Keep it alive until native releases the registration.\n * Callback exceptions are sent to the current thread's uncaught exception handler.\n */\ndefault MemorySegment stub(Arena arena) {{ return Ffm.upcall(this, {class_name}.class, DESCRIPTOR, arena); }}\n"
        # An exception may never escape an FFM upcall: the VM would terminate.
        body += f"default {typ} invokeSafely({signature}) {{\ntry {{\n"
        body += ("" if typ == "void" else "return ") + f"invoke({invocation});\n"
        body += f"}} catch (Throwable failure) {{ Ffm.callbackFailure(failure); {fallback} }}\n}}\n}}\n"
        return body


def lower(api: Api | BoundApi) -> Lowered:
    bound = api if isinstance(api, BoundApi) else compile_api(api)
    api = bound.source
    java = Java(api)
    functions = [f for f in api.functions if served(f, TARGETS) != frozenset()]
    reachable = reachable_types(
        api,
        [
            replace(
                f,
                parameters=(
                    *f.parameters,
                    Parameter(
                        "out_diagnostic",
                        CType(
                            "pointer",
                            f"{DIAGNOSTIC} *",
                            f"struct {DIAGNOSTIC} *",
                            pointee=CType(
                                "record", DIAGNOSTIC, f"struct {DIAGNOSTIC}", DIAGNOSTIC
                            ),
                        ),
                    ),
                ),
            )
            if f.diagnostic
            else f
            for f in functions
        ],
    )
    files = {}
    generated = []
    layouts = {}

    def visit(kind):
        if isinstance(kind, Array):
            visit(kind.element)
        elif isinstance(kind, Record) and kind.name not in layouts:
            for _, child in kind.fields:
                visit(child)
            record = api.records_by_name[kind.name]
            source = java.record(record)
            expression = source.split("public static final GroupLayout LAYOUT = ", 1)[
                1
            ].split(";\n", 1)[0]
            layouts[kind.name] = (
                f"public static final GroupLayout {name(kind.name)} = {expression};\n"
            )

    for record in api.records:
        if not record.complete:
            continue
        visit(java.abi.classify(CType("record", record.name, record.name, record.name)))
        if record.name in {DIAGNOSTIC, BUFFER_VIEW, COMPLETION, COMPLETION_RESULT}:
            files[f"{DIRECTORY}/{name(record.name)}.java"] = (
                HEADER + IMPORTS + java.record(record)
            )
        generated.append(record.name)
    files[f"{DIRECTORY}/Layouts.java"] = (
        HEADER
        + IMPORTS
        + "public final class Layouts { private Layouts() {}\n"
        + "".join(layouts.values())
        + "}\n"
    )
    for typedef in api.typedefs:
        if (
            typedef.name in reachable
            and typedef.type.pointee
            and typedef.type.pointee.kind == "function"
        ):
            files[f"{DIRECTORY}/{name(typedef.name)}.java"] = (
                HEADER + IMPORTS + java.callback(typedef)
            )
            generated.append(typedef.name)
    constants = []
    for enum in api.enums:
        typ = java.carrier(java.kind(enum.underlying_type))
        for member in enum.values:
            value = member.value
            bits = 64 if typ == "long" else 32
            if value >= 1 << (bits - 1):
                value -= 1 << bits
            constants.append(
                f"public static final {typ} {member.name} = {value}{'L' if typ == 'long' else ''};\n"
            )
        generated.append(enum.name)
    body = "/** Desktop C API. Unsigned integers use Java's signed carriers with the same bits. */\npublic final class C {\nprivate C() {}\n"
    if api.c_version is not None:
        body += f"public static final int MLN_C_VERSION = {api.c_version};\n"
    body += "".join(constants)
    for function in functions:
        body += java.function(function)
        generated.append(function.name)
    files[f"{DIRECTORY}/C.java"] = HEADER + IMPORTS + body + "}\n"
    return Lowered(files, {}, generated)
