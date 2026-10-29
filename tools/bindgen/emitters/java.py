"""Generate managed Java desktop bindings over a private FFM interface."""

from __future__ import annotations

from tools.bindgen.compiler import compile_api
from tools.bindgen.model import Api, Lowered
from tools.bindgen.protocol import STATUS
from tools.bindgen.semantic import BoundApi

from . import java_native
from .java_operations import Operations
from .java_values import NATIVE, Values, argument, member, name, owner

DIRECTORY = "bindings/java/src/main/java/org/maplibre/nativeffi"
HEADER = "// Generated from the C headers by tools/bindgen. Do not edit.\npackage org.maplibre.nativeffi;\n\n"
IMPORTS = """import java.lang.foreign.*;
import java.util.concurrent.CompletableFuture;
import static java.lang.foreign.ValueLayout.*;
import org.maplibre.nativeffi.internal.c.C;

"""


def upcalls(values):
    body = "final class Upcalls { private Upcalls() {}\n"
    for v in list(values.used.values()):
        if not v.registration:
            continue
        for f in v.fields:
            if f.name not in v.registration.callbacks:
                continue
            cb = values.bound.callbacks[f.value.native]
            typedef = values.bound.source.typedefs_by_name[f.value.native]
            args = [argument(p.name) for p in cb.parameters]
            context = argument(cb.context)
            invoke = "value." + member(f.name) + "().invoke("
            converted = []
            for p in cb.arguments:
                arg = argument(p.name)
                if p.value.unwrapped.response:
                    converted.append(f"new {values.type(p.value)}({arg}, scope)")
                elif p.value.kind == "handle":
                    converted.append(f"{owner(p.value.handle)}.adopt({arg},null)")
                elif p.value.kind == "enum":
                    converted.append(f"new {values.type(p.value)}({arg})")
                elif p.value.kind in {"scalar"}:
                    converted.append(arg)
                elif p.value.kind == "reference":
                    converted.append(
                        values.decode(
                            p.value.element,
                            f"{arg}.reinterpret({values.layout(p.value.element)}.byteSize())",
                            "scope",
                        )
                    )
                else:
                    converted.append(values.decode(p.value, arg, "scope"))
            invoke += ", ".join(converted) + ")"
            returns = values.native.carrier(
                values.native.kind(typedef.type.pointee.result)
            )
            fallback = (
                "return;"
                if returns == "void"
                else "return false;"
                if returns == "boolean"
                else "return C.MLN_STATUS_NATIVE_ERROR;"
            )
            body += (
                f"static final MemorySegment {name(v.native)}_{member(f.name)} = (({NATIVE}{name(f.value.native)}) ("
                + ", ".join(args)
                + ") -> {\n"
            )
            body += f"var value = ({name(v.native)}) Roots.get({context}.address());\nif(value == null) {{ {fallback} }}\ntry(var scope = new Scope()) {{\n"
            body += (
                ("" if returns in {"void"} or cb.status else "return ") + invoke + ";\n"
            )
            if cb.status:
                body += "return C.MLN_STATUS_OK;\n"
            body += "} catch(Throwable failure) {\n"
            if cb.status:
                body += "if(failure instanceof MaplibreException error) return error.status().rawValue();\n"
            body += (
                "Roots.report(failure);" + fallback + "\n}\n}).stub(Arena.global());\n"
            )
    return body + "}\n"


def lower(api: Api | BoundApi) -> Lowered:
    bound = api if isinstance(api, BoundApi) else compile_api(api)
    native = java_native.lower(bound)
    values = Values(bound)
    if STATUS in bound.values:
        values.use(bound.values[STATUS])
    operations = Operations(bound, values).render()
    # Read/write codecs recursively discover the complete set of public values.
    callback_code = upcalls(values)
    declarations = {}
    for native_name, value in list(values.used.items()):
        if value.kind == "record" and value.native in bound.slices:
            continue
        declarations[name(native_name)] = values.declaration(value)
    bodies = {**declarations, **operations.handles(), **operations.extra}
    bodies["Maplibre"] = (
        "public final class Maplibre { private Maplibre() {}\n"
        + "".join(operations.globals)
        + "}\n"
    )
    bodies["Codecs"] = (
        "final class Codecs { private Codecs() {}\n"
        + "".join(values.codecs.values())
        + "}\n"
    )
    bodies["Upcalls"] = callback_code
    files = dict(native.files)
    for typ, body in bodies.items():
        files[f"{DIRECTORY}/{typ}.java"] = HEADER + IMPORTS + body
    return Lowered(
        files,
        {n: "\n".join(reasons) for n, reasons in bound.unsupported.items()},
        [
            p.name
            for p in bound.operations
            if not p.support
            and java_native.served(p.function, java_native.TARGETS) != frozenset()
        ],
        tuple(p.name for p in bound.operations if p.support),
    )
