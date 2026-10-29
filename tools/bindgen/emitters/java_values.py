"""Managed Java values and native codecs over the shared semantic plans."""

from __future__ import annotations

from dataclasses import replace

from tools.bindgen.model import CType
from tools.bindgen.names import camel, pascal
from tools.bindgen.semantic import (
    FieldPlan,
    ValuePlan,
    enum_member_prefix,
    required_member,
)

from .java_native import Java, comment, identifier, name

NATIVE = "org.maplibre.nativeffi.internal.c."
BOX = {
    "boolean": "Boolean",
    "byte": "Byte",
    "short": "Short",
    "int": "Integer",
    "long": "Long",
    "float": "Float",
    "double": "Double",
    "void": "Void",
}


def member(text):
    return identifier(camel(text))


def argument(text):
    value = member(text)
    reserved = {
        "call",
        "ready",
        "raw",
        "adopted",
        "result",
        "scope",
        "token",
        "block",
        "capacity",
        "buffer",
        "length",
        "needed",
        "status",
        "index",
        "elementTarget",
        "elementValue",
        "value",
        "failure",
        "completion",
        "diagnostic",
        "address",
    }
    return (
        value + "$"
        if value in reserved or (value.startswith("out") and value[3:].isdigit())
        else value
    )


def owner(handle):
    return pascal(handle.stem) + "Handle"


class Values:
    def __init__(self, bound):
        self.bound = bound
        self.native = Java(bound.source)
        self.used = {}
        self.codecs = {}
        self.extra = {}
        self.callbacks = set()

    def fields(self, v):
        return [f for f in v.fields if f.public] + [
            FieldPlan(
                flag.member,
                ValuePlan(
                    "scalar",
                    "bool",
                    CType("bool", "bool", "bool"),
                    scalar_carrier="bool",
                ),
            )
            for flag in v.mask_flags
        ]

    def use(self, v):
        if v.kind in {"reference", "array"}:
            self.use(v.element)
        elif v.kind in {"record", "enum", "union", "callback"}:
            if v.native in self.used:
                return
            self.used[v.native] = v
            if v.kind == "callback":
                self.callbacks.add(v.native)
                for p in self.bound.callbacks[v.native].arguments:
                    self.use(p.value)
            for f in self.fields(v):
                self.use(f.value)

    def type(self, v, boxed=False):
        self.use(v)
        if v.kind == "reference":
            return self.type(replace(v.element, nullable=v.nullable), boxed)
        if v.kind == "record" and v.native in self.bound.slices:
            return self.type(self.bound.slices[v.native].value, boxed)
        if v.kind in {"record", "enum", "union", "callback"}:
            return name(v.native)
        if v.kind == "array":
            return "java.util.List<" + self.type(v.element, True) + ">"
        if v.kind == "buffer":
            return "String" if v.encoding in {"utf8", "json"} else "byte[]"
        if v.kind == "native_pointer":
            return "NativePointer"
        if v.kind == "handle":
            return owner(v.handle)
        typ = self.native.carrier(self.native.kind(v.enum_underlying or v.ctype))
        return BOX.get(typ, typ) if boxed or v.nullable else typ

    def default(self, v, seen=()):
        if v.nullable:
            return "null"
        if v.kind == "reference":
            return self.default(v.element, seen)
        if v.kind == "scalar":
            return {
                "boolean": "false",
                "long": "0L",
                "double": "0.0",
                "float": "0f",
                "byte": "(byte) 0",
                "short": "(short) 0",
            }.get(self.type(v), "0")
        if v.kind == "enum":
            return (
                (
                    f"new {name(v.native)}(0"
                    + ("L" if self.raw_type(v) == "long" else "")
                    + ")"
                )
                if v.enum_kind == "bitmask" or any(n == 0 for _, n in v.enum_values)
                else None
            )
        if v.kind == "array":
            return "java.util.List.of()"
        if v.kind == "buffer":
            return '""' if v.encoding in {"utf8", "json"} else "new byte[0]"
        if v.kind == "native_pointer":
            return "NativePointer.NULL"
        if (
            v.kind == "record"
            and not v.response
            and v.native not in seen
            and all(
                not required_member(f)
                and (
                    (f.presence and f.presence.mask)
                    or self.default(f.value, (*seen, v.native)) is not None
                )
                for f in self.fields(v)
            )
        ):
            return "new " + name(v.native) + "()"
        return None

    def raw_type(self, v):
        return self.native.carrier(self.native.kind(v.enum_underlying or v.ctype))

    def declaration(self, v):
        source = next(
            (
                d
                for d in (
                    *self.bound.source.records,
                    *self.bound.source.enums,
                    *self.bound.source.typedefs,
                )
                if d.name == v.native
            ),
            None,
        )
        return (comment(source) if source else "") + self.declaration_body(v)

    def declaration_body(self, v):
        typ = name(v.native)
        if v.kind == "enum":
            raw = self.raw_type(v)
            prefix = enum_member_prefix([n for n, _ in v.enum_values], v.native)
            body = f"public record {typ}({raw} rawValue) {{\n"
            for constant, number in v.enum_values:
                bits = 64 if raw == "long" else 32
                number = number % (1 << bits)
                if number >= 1 << (bits - 1):
                    number -= 1 << bits
                body += f"public static final {typ} {constant.removeprefix(prefix)} = new {typ}({number}{'L' if raw == 'long' else ''});\n"
            if v.enum_kind == "bitmask":
                body += f"public {typ} or({typ} other) {{ return new {typ}(rawValue | other.rawValue); }}\npublic boolean contains({typ} other) {{ return (rawValue & other.rawValue) == other.rawValue; }}\n"
            return body + "}\n"
        if v.kind == "callback":
            callback = self.bound.callbacks[v.native]
            result = "void" if callback.status else self.type(callback.result)
            params = ", ".join(
                self.type(p.value) + " " + member(p.name) for p in callback.arguments
            )
            return f"@FunctionalInterface\npublic interface {typ} {{ {result} invoke({params}); }}\n"
        if v.kind == "union":
            body = f"public sealed interface {typ} {{\n"
            for f in v.fields:
                body += f"record {pascal(f.name)}({self.type(f.value)} value) implements {typ} {{}}\n"
            if v.empty_variant:
                body += f"record Empty() implements {typ} {{}}\n"
            return (
                body
                + f"record Unknown(int rawTag, byte[] bytes) implements {typ} {{ public Unknown {{ bytes=bytes.clone(); }} @Override public byte[] bytes() {{ return bytes.clone(); }} @Override public boolean equals(Object other) {{ return other instanceof Unknown value && rawTag==value.rawTag && java.util.Arrays.equals(bytes,value.bytes); }} @Override public int hashCode() {{ return 31*rawTag+java.util.Arrays.hashCode(bytes); }} }}\n}}\n"
            )
        if v.response:
            return (
                f"public final class {typ} {{ final java.lang.foreign.MemorySegment address; final Scope scope; {typ}(java.lang.foreign.MemorySegment address, Scope scope) {{ this.address=address; this.scope=scope; }}\n"
                + self.extra.get(v.native, "")
                + "}\n"
            )
        if v.registration or any(f.scoped for f in self.fields(v)):
            return self.managed_class(v)
        fields = self.fields(v)
        # A tagged descriptor keeps its one union as an explicit, typed member.
        types = [
            self.type(f.value, bool(f.presence and f.presence.mask)) for f in fields
        ]
        members = [member(f.name) for f in fields]
        body = (
            f"public record {typ}("
            + ", ".join(t + " " + n for t, n in zip(types, members))
            + ") {\n"
        )
        # Copy mutable containers on construction and access.
        copies = []
        for f, t, n in zip(fields, types, members):
            nullable = f.value.nullable or bool(f.presence and f.presence.mask)
            if f.value.kind == "array":
                copies.append(
                    f"{n} = "
                    + (f"{n} == null ? null : " if nullable else "")
                    + f"java.util.List.copyOf({n});"
                )
            elif f.value.kind == "buffer" and t == "byte[]":
                copies.append(
                    f"{n} = "
                    + (f"{n} == null ? null : " if nullable else "")
                    + f"{n}.clone();"
                )
                body += (
                    f"@Override public byte[] {n}() {{ return "
                    + (f"{n} == null ? null : " if nullable else "")
                    + f"{n}.clone(); }}\n"
                )
        if copies:
            body += f"public {typ} {{ " + "".join(copies) + " }\n"
        required = [
            (f, t, n)
            for f, t, n in zip(fields, types, members)
            if required_member(f)
            or (not (f.presence and f.presence.mask) and self.default(f.value) is None)
        ]
        if len(required) != len(fields):
            req = {f.name for f, t, n in required}
            defaults = [
                member(f.name)
                if f.name in req
                else "null"
                if f.presence and f.presence.mask
                else self.default(f.value)
                for f in fields
            ]
            body += (
                f"public {typ}("
                + ", ".join(t + " " + n for f, t, n in required)
                + ") { this("
                + ", ".join(defaults)
                + "); }\n"
            )
        for t, n in zip(types, members):
            body += (
                f"public {typ} with{n[0].upper() + n[1:]}({t} replacement) {{ return new {typ}("
                + ", ".join(
                    "replacement" if n == other else "this." + other
                    for other in members
                )
                + "); }\n"
            )
        if any(t == "byte[]" for t in types):
            body += (
                f"@Override public boolean equals(Object other) {{ return other instanceof {typ} value && java.util.Arrays.deepEquals(new Object[]{{"
                + ", ".join("this." + n for n in members)
                + "}, new Object[]{"
                + ", ".join("value." + n for n in members)
                + "}); }\n"
            )
            body += (
                "@Override public int hashCode() { return java.util.Arrays.deepHashCode(new Object[]{"
                + ", ".join(members)
                + "}); }\n"
            )
        return body + "}\n"

    def managed_class(self, v):
        typ = name(v.native)
        fields = self.fields(v)
        scoped = any(f.scoped for f in fields)
        names = [member(f.name) for f in fields]
        types = [
            self.type(f.value, bool(f.presence and f.presence.mask)) for f in fields
        ]
        pairs = list(zip(fields, types, names))
        control = "Scope scope" if scoped else "NativeRegistration nativeRegistration"
        control_name = "scope" if scoped else "nativeRegistration"
        body = f"public final class {typ} {{\nprivate final {control};\n"
        for f, t, n in pairs:
            body += f"private final {t} {n};\n"
        params = ", ".join(t + " " + n for f, t, n in pairs)
        body += (
            f"public {typ}({params}) {{ this("
            + ", ".join(names)
            + (", " if names else "")
            + "null); }\n"
        )
        body += f"{typ}({params}{', ' if params else ''}{control}) {{\nthis.{control_name}={control_name};\n"
        for f, t, n in pairs:
            expr = n
            if f.value.kind == "array":
                expr = f"java.util.List.copyOf({n})"
            body += f"this.{n}={expr};\n"
        body += "}\n"
        for f, t, n in pairs:
            guard = "if(scope!=null)scope.check();" if f.scoped else ""
            body += f"public {t} {n}() {{ {guard}return {n}; }}\n"
        required = [
            (f, t, n)
            for f, t, n in pairs
            if required_member(f)
            or (not (f.presence and f.presence.mask) and self.default(f.value) is None)
        ]
        if len(required) != len(fields):
            req = {f.name for f, t, n in required}
            defaults = [
                member(f.name)
                if f.name in req
                else "null"
                if f.presence and f.presence.mask
                else self.default(f.value)
                for f in fields
            ]
            body += (
                f"public {typ}("
                + ", ".join(t + " " + n for f, t, n in required)
                + ") { this("
                + ", ".join(defaults)
                + "); }\n"
            )
        if v.registration:
            body += "NativeRegistration nativeRegistration() { return nativeRegistration; }\n"
            callbacks = [f for f in fields if f.name in v.registration.callbacks]
            other = [f for f in fields if f.name not in v.registration.callbacks]
            native_params = ["NativePointer " + member(f.name) for f in callbacks] + [
                "NativePointer userData",
                "NativePointer releaseUserData",
            ]
            native_params += [self.type(f.value) + " " + member(f.name) for f in other]
            args = [
                member(f.name) if f.name not in v.registration.callbacks else "null"
                for f in fields
            ]
            body += (
                f"public static {typ} nativeRegistration("
                + ", ".join(native_params)
                + ") { return new "
                + typ
                + "("
                + ", ".join(args)
                + ", new NativeRegistration(new NativePointer[]{"
                + ", ".join(member(f.name) for f in callbacks)
                + "}, userData, releaseUserData)); }\n"
            )
            for f, t, n in pairs:
                body += (
                    f"public {typ} with{n[0].upper() + n[1:]}({t} replacement) {{ return new {typ}("
                    + ", ".join(
                        "replacement" if other == n else "this." + other
                        for other in names
                    )
                    + (
                        ", null); }\n"
                        if f.name in v.registration.callbacks
                        else ", nativeRegistration); }\n"
                    )
                )
        return body + "}\n"

    def scalar_get(self, v, source):
        kind = self.native.kind(v.enum_underlying or v.ctype)
        return f"{source}.get({self.native.layout(kind)}, 0)"

    def scalar_set(self, v, target, value):
        return f"{target}.set({self.native.layout(self.native.kind(v.enum_underlying or v.ctype))}, 0, {value});"

    def layout(self, v):
        if v.kind == "reference":
            return self.layout(v.element)
        if v.kind in {"record", "union"} or (
            v.kind == "buffer" and v.buffer_form == "view"
        ):
            return NATIVE + "Layouts." + name(v.native)
        return self.native.layout(self.native.kind(v.enum_underlying or v.ctype))

    def at(self, v, source, field):
        offset = self.native.abi.record_named(v.native, 64).offsets[field]
        return f"{source}.asSlice({offset})"

    def encode(self, v, expr, call="call"):
        self.use(v)
        if v.nullable:
            empty = (
                f"{call}.arena.allocate({self.layout(v)})"
                if v.kind == "buffer" and v.buffer_form == "view"
                else "MemorySegment.NULL"
            )
            return (
                f"({expr} == null ? {empty} : {self.encode(replace(v, nullable=False), expr, call)})"
                if v.kind in {"reference", "array", "buffer"}
                else self.encode(replace(v, nullable=False), expr, call)
            )
        if v.kind == "reference":
            return self.encode(v.element, expr, call)
        if v.kind in {"scalar", "enum"}:
            return expr + (".rawValue()" if v.kind == "enum" else "")
        if v.kind == "handle":
            return f"{call}.handle({expr})"
        if v.kind == "native_pointer":
            return f"MemorySegment.ofAddress({expr}.address())"
        if v.kind == "buffer":
            method = "text" if v.encoding in {"utf8", "json"} else "bytes"
            pointer = f"{call}.{method}({expr})"
            if v.buffer_form == "view":
                return f"{call}.view({pointer})"
            return pointer
        if v.kind == "array":
            element = v.element
            statement = self.place(element, "elementTarget", "elementValue", call)
            return f"{call}.array({expr}, {self.layout(element)}, (elementTarget, elementValue) -> {{ {statement} }})"
        if v.kind == "record":
            self.codec(v)
            return f"Codecs.write{name(v.native)}({call}, {expr})"
        raise ValueError(f"encode {v.kind} {v.native}")

    def place(self, v, target, expr, call="call"):
        if v.kind in {"scalar", "enum"}:
            return self.scalar_set(v, target, self.encode(v, expr, call))
        encoded = self.encode(v, expr, call)
        if v.kind == "record" or v.kind == "buffer" and v.buffer_form == "view":
            return f"MemorySegment.copy({encoded}, 0, {target}, 0, {self.layout(v)}.byteSize());"
        return f"{target}.set(ADDRESS, 0, {encoded});"

    def decode(self, v, source, scope="null", length=None, stride=None):
        self.use(v)
        if v.nullable and v.kind in {"buffer", "array", "reference"}:
            decoded = self.decode(
                replace(v, nullable=False), source, scope, length, stride
            )
            return f"({source}.get(ADDRESS,0).address() == 0 ? null : {decoded})"
        if v.kind == "reference":
            return self.decode(
                v.element,
                f"Memory.readPointer({source}, {self.layout(v.element)}.byteSize())",
                scope,
            )
        if v.kind == "scalar":
            return self.scalar_get(v, source)
        if v.kind == "enum":
            return f"new {name(v.native)}({self.scalar_get(v, source)})"
        if v.kind == "native_pointer":
            return f"new NativePointer({source}.get(ADDRESS, 0).address(), {scope})"
        if v.kind == "handle":
            return f"{owner(v.handle)}.adopt({source}.get(JAVA_LONG, 0), null)"
        if v.kind == "record":
            self.codec(v)
            return f"Codecs.read{name(v.native)}({source}, {scope})"
        if v.kind == "buffer":
            method = "text" if v.encoding in {"utf8", "json"} else "bytes"
            if v.buffer_form == "view":
                return f"Memory.{method}View({source})"
            if v.length == "nul":
                return f"Memory.{method}Z({source}.get(ADDRESS, 0))"
            assert length is not None, (v.native, v.length)
            return f"Memory.{method}({source}.get(ADDRESS, 0), {length})"
        if v.kind == "array":
            assert length is not None
            item = self.decode(v.element, "item", scope)
            layout = self.layout(v.element)
            return f"Memory.array({source}.get(ADDRESS, 0), {length}, {stride or layout + '.byteSize()'}, {layout}.byteSize(), item -> {item})"
        raise ValueError(f"decode {v.kind} {v.native}")

    def field_read(self, v, f, source, scope):
        flag = next((x for x in v.mask_flags if x.member == f.name), None)
        if flag:
            mask = next(x for x in v.fields if x.name == flag.mask)
            raw = self.scalar_get(mask.value, self.at(v, source, mask.name))
            return f"(({raw} & C.{flag.name}) != 0)"
        at = self.at(v, source, f.name)
        if f.value.kind == "union":
            tag = next(x for x in v.fields if x.name == f.presence.tag)
            raw = self.scalar_get(tag.value, self.at(v, source, tag.name))
            return self.union_read(f.value, at, raw, scope)
        length = None
        stride = None
        if f.value.length and f.value.length not in {"nul", "1"}:
            lf = next(x for x in v.fields if x.name == f.value.length)
            length = self.scalar_get(lf.value, self.at(v, source, lf.name))
        if f.value.stride:
            sf = next(x for x in v.fields if x.name == f.value.stride)
            stride = (
                "Integer.toUnsignedLong("
                + self.scalar_get(sf.value, self.at(v, source, sf.name))
                + ")"
            )
        decoded = self.decode(f.value, at, scope, length, stride)
        if f.presence and f.presence.mask:
            mask = next(x for x in v.fields if x.name == f.presence.mask)
            raw = self.scalar_get(mask.value, self.at(v, source, mask.name))
            decoded = f"(({raw} & C.{f.presence.bit}) == 0 ? null : {decoded})"
        return decoded

    def union_read(self, v, source, tag, scope):
        typ = name(v.native)
        arms = []
        for f in v.fields:
            arms.append(
                f"case C.{f.presence.variant} -> new {typ}.{pascal(f.name)}({self.decode(f.value, source, scope)});"
            )
        if v.empty_variant:
            arms.append(f"case C.{v.empty_variant[0]} -> new {typ}.Empty();")
        return (
            f"(switch ({tag}) {{ "
            + "".join(arms)
            + f"default -> new {typ}.Unknown({tag}, {source}.asSlice(0, {self.layout(v)}.byteSize()).toArray(JAVA_BYTE)); }})"
        )

    def codec(self, v):
        if v.native in self.codecs:
            return
        self.codecs[v.native] = ""
        typ = name(v.native)
        layout = self.layout(v)
        if v.response:
            return
        if v.native in self.bound.slices:
            f = self.bound.slices[v.native]
            self.codecs[v.native] = (
                f"static {self.type(f.value)} read{typ}(MemorySegment source, Scope scope) {{ return {self.field_read(v, f, 'source', 'scope')}; }}\n"
            )
            return
        # Read copied values. Registration values only travel into native.
        read = ""
        if not v.registration and v.native in self.bound.returned:
            decoded = [self.field_read(v, f, "source", "scope") for f in self.fields(v)]
            read = (
                f"static {typ} read{typ}(MemorySegment source, Scope scope) {{ return new {typ}("
                + ", ".join(decoded)
                + (", scope" if any(f.scoped for f in self.fields(v)) else "")
                + "); }\n"
            )
        writes = f"static MemorySegment write{typ}(Call call, {typ} value) {{\nvar target = call.arena.allocate({layout});\n"
        for f in v.fields:
            if f.role == "size":
                writes += (
                    self.scalar_set(
                        f.value,
                        self.at(v, "target", f.name),
                        f"(int) {layout}.byteSize()",
                    )
                    + "\n"
                )
        if v.registration:
            writes += self.registration(v)
        masks = {f.name: f for f in v.fields if f.role == "presence_mask"}
        for mask in masks.values():
            writes += f"{self.raw_type(mask.value)} {member(mask.name)} = 0;\n"
        for flag in v.mask_flags:
            writes += f"if(value.{member(flag.member)}()) {member(flag.mask)} |= C.{flag.name};\n"
        for f in self.fields(v):
            if any(flag.member == f.name for flag in v.mask_flags):
                continue
            if v.registration and f.name in v.registration.callbacks:
                continue
            expr = f"value.{member(f.name)}()"
            optional = f.presence and f.presence.mask
            if optional:
                writes += f"if ({expr} != null) {{ {member(f.presence.mask)} |= C.{f.presence.bit};\n"
            if f.value.kind == "union":
                tag = next(x for x in v.fields if x.name == f.presence.tag)
                writes += f"switch ({expr}) {{\n"
                for arm in f.value.fields:
                    writes += (
                        f"case {name(f.value.native)}.{pascal(arm.name)} arm -> {{ "
                        + self.scalar_set(
                            tag.value,
                            self.at(v, "target", tag.name),
                            f"C.{arm.presence.variant}",
                        )
                        + self.place(
                            arm.value, self.at(v, "target", f.name), "arm.value()"
                        )
                        + " }\n"
                    )
                if f.value.empty_variant:
                    writes += (
                        f"case {name(f.value.native)}.Empty ignored -> {{ "
                        + self.scalar_set(
                            tag.value,
                            self.at(v, "target", tag.name),
                            f"C.{f.value.empty_variant[0]}",
                        )
                        + " }\n"
                    )
                writes += (
                    f"case {name(f.value.native)}.Unknown arm -> {{ "
                    + self.scalar_set(
                        tag.value, self.at(v, "target", tag.name), "arm.rawTag()"
                    )
                    + f"MemorySegment.copy(arm.bytes(), 0, {self.at(v, 'target', f.name)}, JAVA_BYTE, 0, Math.toIntExact({self.layout(f.value)}.byteSize()));"
                    + " }\n}\n"
                )
            else:
                writes += self.place(f.value, self.at(v, "target", f.name), expr) + "\n"
                if f.value.length and f.value.length not in {"nul", "1"}:
                    lf = next(x for x in v.fields if x.name == f.value.length)
                    length = f"Call.length({expr})"
                    cast = self.raw_type(lf.value)
                    writes += (
                        self.scalar_set(
                            lf.value,
                            self.at(v, "target", lf.name),
                            f"({cast}) {length}",
                        )
                        + "\n"
                    )
                if f.value.stride:
                    sf = next(x for x in v.fields if x.name == f.value.stride)
                    writes += (
                        self.scalar_set(
                            sf.value,
                            self.at(v, "target", sf.name),
                            f"(int) {self.layout(f.value.element)}.byteSize()",
                        )
                        + "\n"
                    )
            if optional:
                writes += "}\n"
        for mask in masks.values():
            writes += (
                self.scalar_set(
                    mask.value, self.at(v, "target", mask.name), member(mask.name)
                )
                + "\n"
            )
        writes += "return target;\n}\n"
        self.codecs[v.native] = read + writes

    def registration(self, v):
        reg = v.registration
        typ = name(v.native)
        callback_fields = [f for f in v.fields if f.name in reg.callbacks]
        condition = " || ".join(
            "value." + member(f.name) + "() != null" for f in callback_fields
        )
        result = "if(value.nativeRegistration() != null) {\nvar registration=call.nativeRegistration(value.nativeRegistration());\n"
        result += (
            self.at(v, "target", reg.user_data)
            + ".set(ADDRESS,0,registration.userData());\n"
        )
        result += (
            self.at(v, "target", reg.release)
            + ".set(ADDRESS,0,registration.releaseUserData());\n"
        )
        for index, f in enumerate(callback_fields):
            result += (
                self.at(v, "target", f.name)
                + f".set(ADDRESS,0,registration.callback({index}));\n"
            )
        result += f"}} else if ({condition}) {{\nlong token = call.register(value);\n"
        result += (
            self.at(v, "target", reg.user_data)
            + ".set(ADDRESS, 0, MemorySegment.ofAddress(token));\n"
        )
        result += (
            self.at(v, "target", reg.release) + ".set(ADDRESS, 0, Roots.RELEASE);\n"
        )
        for f in callback_fields:
            result += (
                f"if (value.{member(f.name)}() != null) "
                + self.at(v, "target", f.name)
                + f".set(ADDRESS, 0, Upcalls.{typ}_{member(f.name)});\n"
            )
        return result + "}\n"
