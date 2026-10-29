"""Render managed Java operations from the common ownership and execution plans."""

from __future__ import annotations

from collections import defaultdict
from dataclasses import replace

from tools.bindgen.compiler import served
from tools.bindgen.semantic import output_member

from .java_native import TARGETS, comment, name
from .java_values import BOX, argument, member, owner


def receives(p):
    return next((x.value.unwrapped for x in p.inputs if x.name == p.receiver), None)


def borrowed(v):
    return v.kind in {"reference", "array", "buffer"} or any(
        borrowed(f.value) for f in v.fields
    )


class Operations:
    def __init__(self, bound, values):
        self.bound = bound
        self.values = values
        self.members = defaultdict(list)
        self.factories = defaultdict(list)
        self.globals = []
        self.discards = defaultdict(list)
        self.extra = {}

    def method(self, p, discard=False):
        v = self.values
        lengths = {
            x.value.length: x
            for x in p.inputs
            if x.value.kind in {"array", "buffer"}
            and x.value.length not in {None, "nul", "1"}
        }
        inputs = [
            x
            for x in p.inputs
            if x.name not in {p.receiver, p.scoped_receiver} and x.name not in lengths
        ]
        if p.caller_sized_text:
            inputs = [x for x in inputs if x.name != p.caller_sized_text.value.length]
        params = [(v.type(x.value), argument(x.name)) for x in inputs]
        args = {}
        for x in p.inputs:
            if x.name == p.receiver:
                args[x.name] = "id()"
            elif x.name == p.scoped_receiver:
                args[x.name] = "address"
            elif x.name in lengths:
                args[x.name] = (
                    f"({v.raw_type(x.value)}) Call.length({argument(lengths[x.name].name)})"
                )
            elif p.caller_sized_text and x.name == p.caller_sized_text.value.length:
                args[x.name] = "capacity"
            else:
                args[x.name] = v.encode(x.value, argument(x.name))
        result_type = "void"
        result = ""
        setup = ""
        after = ""
        if p.caller_sized_text:
            return self.text_method(p, inputs, args)
        outnames = {}
        for index, x in enumerate(p.outputs):
            value = x.value.unwrapped
            local = "out" + str(index)
            outnames[x.name] = local
            args[x.name] = local
            if x.sized_by:
                count = f"{argument(x.sized_by)}.size()"
                setup += f"var {local} = call.arena.allocate(Math.multiplyExact({count}, {v.layout(value.element)}.byteSize()), {v.layout(value.element)}.byteAlignment());\n"
                setup += (
                    f"for(int index=0;index<{count};index++) {{ "
                    + self.size_init(
                        value.element,
                        f"{local}.asSlice(index*{v.layout(value.element)}.byteSize())",
                    )
                    + " }\n"
                )
            else:
                setup += (
                    f"var {local} = call.arena.allocate({v.layout(value)});\n"
                    + self.size_init(value, local)
                )
        if p.completion and discard:
            args[p.completion.parameter] = "MemorySegment.NULL"
        elif p.completion:
            args[p.completion.parameter] = "completion"
            if p.completion.immediate_owners:
                owned = p.completion.immediate_owners[0]
                typ = owner(owned.handle)
                result_type = f"Pending<{typ}>"
                parent = self.parent(owned)
                setup += ""
                result = f"new Pending<>({typ}.adopt({outnames[owned.parameter]}.get(JAVA_LONG,0), {parent}), ready)"
                decode = "result -> null"
            elif p.execution == "command":
                result_type = "CompletableFuture<CommandCompletion>"
                result = "ready"
                decode = "result -> new CommandCompletion(result.generation(), result.render_update_generation())"
            elif p.result:
                result_type = f"CompletableFuture<{v.type(p.result, True)}>"
                result = "ready"
                decode = "result -> " + self.completion_decode(p.result)
            else:
                result_type = "CompletableFuture<Void>"
                result = "ready"
                decode = "result -> null"
        elif p.drain:
            value = p.drain.view.value.unwrapped
            result_type = v.type(value)
            release = self.bound.handles[p.drain.batch.value.unwrapped.native].release
            local = outnames[p.drain.view.name]
            result = v.decode(value, local)
            after = f"try {{ return {result}; }} finally {{ C.{release}({outnames[p.drain.batch.name]}.get(JAVA_LONG,0)); }}\n"
        elif p.outputs:
            results = []
            types = []
            for x in p.outputs:
                val = x.value.unwrapped
                typ = v.type(val)
                if val.kind == "handle" and val.ownership == "owned":
                    owned = next(o for o in p.owned_outputs if o.parameter == x.name)
                    expr = f"{owner(val.handle)}.adopt({outnames[x.name]}.get(JAVA_LONG,0), {self.parent(owned)})"
                elif x.sized_by:
                    expr = v.decode(
                        val,
                        f"call.pointer({outnames[x.name]})",
                        length=f"{argument(x.sized_by)}.size()",
                    )
                else:
                    expr = v.decode(
                        val, outnames[x.name], "scope" if p.view else "null"
                    )
                results.append(expr)
                types.append(typ)
            if len(results) == 1:
                result_type = types[0]
                result = results[0]
            else:
                result_type = name(p.name) + "Result"
                self.extra[result_type] = (
                    "public record "
                    + result_type
                    + "("
                    + ", ".join(
                        t + " " + member(output_member(x.name))
                        for t, x in zip(types, p.outputs)
                    )
                    + ") {}\n"
                )
                result = f"new {result_type}(" + ", ".join(results) + ")"
        elif p.result:
            result_type = v.type(p.result)
            if p.result.kind == "enum":
                result = f"new {result_type}(raw)"
            elif p.result.kind == "native_pointer":
                result = "NativePointer.ofAddress(raw.address())"
            else:
                result = "raw"
        if p.absence and not p.drain:
            result_type = BOX.get(result_type, result_type)
        signature = member(p.member)
        receiver = receives(p)
        if (
            receiver
            and p.name == receiver.handle.release
            and not p.completion
            and len(inputs) == 0
        ):
            signature = "close"
        if p.view:
            original = result_type
            result_type = "R"
            params.append((f"java.util.function.Function<{original}, R>", "block"))
            signature = member("with_" + p.view.stem)
            setup = (
                "var token=call.arena.allocate(ADDRESS);\ncall.check(C."
                + p.view.begin
                + "(id(), token, call.diagnostic.segment()));\ntry (var scope = new Scope()) {\ntry {\n"
                + setup
            )
            after = f"return block.apply({result});\n}} finally {{ C.{p.view.end}(token.get(ADDRESS,0)); }}\n}}\n"
        read = bool(
            receiver
            and not p.completion
            and not p.consumes
            and any(borrowed(x.value) for x in p.outputs)
        )
        mode = 2 if p.consumes else 1 if read or p.view else 0
        selfarg = (
            (owner(receiver.handle) + ".this" if discard else "this")
            if receiver
            else "null"
        )
        static = "static " if not receiver and not p.scoped_receiver else ""
        generic = "<R> " if p.view else ""
        body = (
            comment(p.function)
            + f"public {static}{generic}{result_type} {signature}("
            + ", ".join(t + " " + n for t, n in params)
            + ") {\n"
        )
        if signature == "close" or p.shape == "discard":
            body += "if(isClosed()) return;\n"
        if p.scoped_receiver:
            body += "scope.check();\n"
        body += (
            f"try (var call = new Call({selfarg}, {mode}, {str(p.unchecked).lower()})) {{\n"
            + setup
        )
        args["out_diagnostic"] = "call.diagnostic.segment()"
        invocation = (
            f"C.{p.name}("
            + ", ".join(args[x.name] for x in p.function.parameters)
            + (
                (", " if p.function.parameters else "") + "call.diagnostic.segment()"
                if p.function.diagnostic
                else ""
            )
            + ")"
        )
        if p.completion and not discard:
            # The native call copies every arena-backed input before it returns.
            future_type = (
                "CompletableFuture<Void>"
                if p.completion.immediate_owners
                else result_type
            )
            body += f"{future_type} ready = Completions.submit((completion, diagnostic) -> {invocation.replace('call.diagnostic.segment()', 'diagnostic')}, {decode});\n"
        elif p.status:
            if p.absence:
                body += f"int status = {invocation};\nif(status == {p.absence.value}) return {'java.util.List.of()' if p.drain else 'null'};\ncall.check(status);\n"
            else:
                body += f"call.check({invocation});\n"
        elif p.result:
            body += f"var raw = {invocation};\n"
        else:
            body += invocation + ";\n"
        accepted_owner = selfarg
        if p.owned_outputs and not p.drain:
            body += f"var adopted = {result};\n"
            result = "adopted"
            accepted_owner = "adopted.handle()" if p.completion else "adopted"
        unless = [r.accepted_unless for r in p.registrations if r.accepted_unless]
        if unless:
            body += "if(!" + outnames[unless[0]] + ".get(JAVA_BOOLEAN,0)) "
        body += f"call.accept({accepted_owner});\n"
        body += (
            after if after else (f"return {result};\n" if result_type != "void" else "")
        )
        return body + "}\n}\n"

    def size_init(self, value, local):
        if value.kind == "record":
            size = next((x for x in value.fields if x.role == "size"), None)
            if size:
                return (
                    self.values.scalar_set(
                        size.value,
                        self.values.at(value, local, size.name),
                        f"(int) {self.values.layout(value)}.byteSize()",
                    )
                    + "\n"
                )
        return ""

    def parent(self, owned):
        if not owned.handle.parent:
            return "null"
        return "this" if owned.parent_parameter else "null"

    def completion_decode(self, value):
        v = self.values
        if value.kind == "array":
            decode = v.decode(
                value,
                "result.segment().asSlice(48)",
                length="result.value_count()",
                stride="Integer.toUnsignedLong(result.value_size())",
            )
        else:
            size = v.layout(value) + ".byteSize()"
            decode = v.decode(
                replace(value, nullable=False), f"result.value().reinterpret({size})"
            )
        if value.nullable:
            absent = (
                "result.value().address() == 0"
                if value.kind == "array"
                else "result.value_count() == 0"
            )
            decode = f"({absent} ? null : {decode})"
        return decode

    def text_method(self, p, inputs, args):
        v = self.values
        out = p.caller_sized_text
        args[out.name] = "buffer"
        args[out.result_length] = "length"
        args[out.value.length] = "capacity"
        invocation = (
            f"C.{p.name}("
            + ", ".join(args[x.name] for x in p.function.parameters)
            + ", call.diagnostic.segment())"
        )
        params = ", ".join(v.type(x.value) + " " + argument(x.name) for x in inputs)
        return (
            comment(p.function)
            + f"public String {member(p.member)}({params}) {{\ntry(var call=new Call(this,1)) {{\nlong capacity=256;\nwhile(true) {{\nvar buffer=call.arena.allocate(capacity);var length=call.arena.allocate(JAVA_LONG);\nint status={invocation};\nlong needed=length.get(JAVA_LONG,0);\nif(needed>=capacity) {{ capacity=Math.addExact(needed,1); continue; }}\ncall.check(status);return Memory.text(buffer,needed);\n}}\n}}\n}}\n"
        )

    def render(self):
        for p in self.bound.operations:
            if p.support or served(p.function, TARGETS) == frozenset():
                continue
            method = self.method(p)
            if p.scoped_receiver:
                parameter = next(x for x in p.inputs if x.name == p.scoped_receiver)
                native = parameter.value.unwrapped.native
                self.values.extra[native] = self.values.extra.get(native, "") + method
            elif p.receiver:
                self.members[receives(p).native].append(method)
                if p.execution == "command":
                    self.discards[receives(p).native].append(self.method(p, True))
            elif p.factory:
                self.factories[p.factory].append(method)
            else:
                self.globals.append(method)
        return self

    def handles(self):
        files = {}
        for native, handle in self.bound.public_handles.items():
            typ = owner(handle)
            cleanup = handle.cleanup or handle.release
            fn = self.bound.source.functions_by_name[cleanup]
            args = []
            for p in fn.parameters:
                args.append("MemorySegment.NULL" if p.type.kind == "pointer" else "id")
            if fn.diagnostic:
                args.append("call.diagnostic.segment()")
            invocation = f"C.{cleanup}(" + ", ".join(args) + ")"
            disposal = (
                f"call.check({invocation});" if fn.diagnostic else invocation + ";"
            )
            body = (
                comment(self.bound.source.typedefs_by_name[native])
                + f"public final class {typ} extends Owner"
            )
            # A frame needs the caller's consumer sync, so it has no parameterless close.
            closeable = not handle.release_inputs and not handle.discard
            body += " implements AutoCloseable" if closeable else ""
            if handle.observable_root_release:
                body += (
                    ", AsyncReleasable" if closeable else " implements AsyncReleasable"
                )
            body += " {\n"
            enroll = ""
            if handle.abandon:
                plan = self.bound.operations_by_name[handle.abandon]
                setup = ""
                output_argument = ""
                if plan.outputs:
                    output = plan.outputs[0].value.unwrapped
                    layout = self.values.layout(output)
                    setup = f"var out=call.arena.allocate({layout}); " + self.size_init(
                        output, "out"
                    )
                    output_argument = ",out"
                enroll = f"Shutdown.enroll(state, value -> {{ try(var call=new Call(null,0)) {{ {setup}C.{handle.abandon}(value{output_argument},call.diagnostic.segment()); }} }});"
            body += f'{typ}(long id,Object parent) {{ super("{typ}",id,parent,{typ}::disposeNative); {enroll} }}\n'
            body += f"static {typ} adopt(long id,Object parent) {{ try {{ return new {typ}(id,parent); }} catch(Throwable failure) {{ try {{ disposeNative(id); }} catch(Throwable cleanup) {{ failure.addSuppressed(cleanup); }} throw failure; }} }}\n"
            body += f"private static void disposeNative(long id) {{ try(var call=new Call(null,0)) {{ {disposal} }} }}\n"
            body += "".join(self.members[native]) + "".join(self.factories[native])
            if self.discards[native]:
                body += (
                    "/** Ordered commands that discard their asynchronous outcomes. */\npublic Discarding discarding() { return new Discarding(); }\npublic final class Discarding { private Discarding() {}\n"
                    + "".join(self.discards[native])
                    + "}\n"
                )
            if handle.observable_root_release and not any(
                " release(" in m for m in self.members[native]
            ):
                body += (
                    "public CompletableFuture<Void> release() { return "
                    + member(
                        self.bound.source.functions_by_name[
                            handle.release
                        ].name.removeprefix("mln_" + handle.stem + "_")
                    )
                    + "(); }\n"
                )
            # Async roots dispose synchronously via close, even when their release returns a future.
            if closeable and not any(" void close(" in m for m in self.members[native]):
                body += "public void close() { if(isClosed()) return;try(var call=new Call(this,2)) { disposeNative(id());call.accept(this); } }\n"
            files[typ] = body + "}\n"
        return files
