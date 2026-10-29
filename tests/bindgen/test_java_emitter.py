"""Compile Java consumers and verify emitted FFM layouts and API boundaries."""

import unittest
from pathlib import Path
from tempfile import TemporaryDirectory

from support import ROOT, real_api, require_tool, run

from tools.bindgen.abi import Abi, LayoutError
from tools.bindgen.emitters import java
from tools.bindgen.emitters.java_native import name


class JavaEmitterTests(unittest.TestCase):
    def test_generated_api_compiles_and_layouts_match_shared_abi(self):
        javac = require_tool(self, "javac", ROOT / "bindings/java")
        jvm = require_tool(self, "java", ROOT / "bindings/java")
        clang = require_tool(self, "clang")
        api = real_api()
        lowered = java.lower(api)
        self.assertEqual(lowered.unsupported, {})
        abi = Abi(api)
        checks = []
        for record in api.records:
            if not record.complete or record.name.startswith("@"):
                continue
            try:
                layout = abi.record_named(record.name, 64)
            except LayoutError:
                continue
            expression = (
                f"org.maplibre.nativeffi.internal.c.Layouts.{name(record.name)}"
            )
            checks.extend(
                [
                    f'check({expression}.byteSize()=={layout.size}, "{record.name} size");',
                    f'check({expression}.byteAlignment()=={layout.align}, "{record.name} alignment");',
                ]
            )
            checks.extend(
                f'check({expression}.byteOffset(java.lang.foreign.MemoryLayout.PathElement.groupElement("{field}"))=={offset}, "{record.name}.{field}");'
                for field, offset in layout.offsets.items()
            )
        classes = []
        for path, source in lowered.files.items():
            if "/internal/" not in path and "public " in source:
                classes.append(Path(path).stem)
        for typ in classes:
            checks.append(
                f"for(var method: org.maplibre.nativeffi.{typ}.class.getMethods()) {{ checkType(method.getGenericReturnType()); for(var type:method.getGenericParameterTypes())checkType(type); }}"
            )
        probe = (
            """
public class Probe {
  static void check(boolean ok,String message) { if(!ok)throw new AssertionError(message); }
  static void checkType(java.lang.reflect.Type type) {
    check(!type.getTypeName().contains("java.lang.foreign") && !type.getTypeName().contains("kotlin."),type.toString());
  }
  public static void main(String[] args) {
"""
            + "\n".join(checks)
            + "\n}\n}"
        )
        with TemporaryDirectory() as directory:
            root = Path(directory)
            for path, source in lowered.files.items():
                target = root / path
                target.parent.mkdir(parents=True, exist_ok=True)
                target.write_text(source)
            runtime = ROOT / "bindings/java/src/main/java"
            sources = list(root.rglob("*.java"))
            sources.extend(
                path
                for path in runtime.rglob("*.java")
                if not path.read_text().startswith("// Generated")
            )
            check = root / "Probe.java"
            check.write_text(probe)
            run(
                self,
                [
                    javac.executable,
                    "-d",
                    str(root / "classes"),
                    *[str(p) for p in sources],
                    str(check),
                ],
                cwd=root,
                env=javac.env,
            )
            run(
                self,
                [
                    jvm.executable,
                    "--enable-native-access=ALL-UNNAMED",
                    "-cp",
                    str(root / "classes"),
                    "Probe",
                ],
                cwd=root,
                env=jvm.env,
            )

            wrong = root / "wrong.c"
            wrong.write_text(
                "#ifdef _WIN32\n__declspec(dllexport)\n#endif\nint mln_c_version(void) {return 123456;}\n"
            )
            library = (
                root / "wrong.dll"
                if __import__("sys").platform == "win32"
                else root / "wrong.so"
            )
            clang.run(
                self, "-shared", "-fPIC", str(wrong), "-o", str(library), cwd=root
            )
            mismatch = root / "Mismatch.java"
            mismatch.write_text("""
import org.maplibre.nativeffi.*;
public class Mismatch {
  public static void main(String[] args) {
    try {
      NativeLibrary.load(java.nio.file.Path.of(args[0]));
      throw new AssertionError("ABI mismatch accepted");
    } catch(MaplibreException error) {
      if(!error.status().equals(Status.UNSUPPORTED) || !error.getMessage().contains("123456")) throw new AssertionError(error);
    }
    if(Maplibre.cVersion()!=123456)throw new AssertionError("unchecked version query");
  }
}
""")
            javac.run(
                self,
                "-cp",
                str(root / "classes"),
                "-d",
                str(root / "classes"),
                str(mismatch),
                cwd=root,
            )
            jvm.run(
                self,
                "--enable-native-access=ALL-UNNAMED",
                "-cp",
                str(root / "classes"),
                "Mismatch",
                str(library),
                cwd=root,
            )
