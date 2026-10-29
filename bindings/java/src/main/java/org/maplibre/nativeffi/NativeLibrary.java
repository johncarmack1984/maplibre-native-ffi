package org.maplibre.nativeffi;

import java.nio.file.Path;
import org.maplibre.nativeffi.internal.c.C;
import org.maplibre.nativeffi.internal.c.NativeLoading;

/** Loads the desktop native library and verifies its C ABI before managed calls reach it. */
public final class NativeLibrary {
  private static volatile boolean checked;

  private NativeLibrary() {}

  /** Loads from java.library.path and checks the C ABI version. */
  public static void load() {
    ensureLoaded();
  }

  /** Loads an exact native library file, then checks its C ABI version. */
  public static synchronized void load(Path path) {
    NativeLoading.load(path);
    ensureLoaded();
  }

  static synchronized void ensureLoaded() {
    if (checked) return;
    int actual = C.mln_c_version();
    if (actual != C.MLN_C_VERSION)
      throw new MaplibreException(
          C.MLN_STATUS_UNSUPPORTED,
          "C ABI mismatch: expected " + C.MLN_C_VERSION + ", got " + actual,
          0);
    checked = true;
  }
}
