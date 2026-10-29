// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi.internal.c;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The diagnostic message of one status-returning call.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/base_8h.html">mln_diagnostic</a>
 */
public record Diagnostic(MemorySegment segment) {
  public static final GroupLayout LAYOUT =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.sequenceLayout(4096, JAVA_BYTE).withName("message"));

  public Diagnostic {
    segment = segment.asSlice(0, LAYOUT);
  }

  /** Allocates zeroed native storage in the supplied arena. */
  public static Diagnostic allocate(Arena arena) {
    var value = new Diagnostic(arena.allocate(LAYOUT));
    value.size((int) LAYOUT.byteSize());
    return value;
  }

  /**
   * @see <a href="https://maplibre.org/maplibre-native-ffi/reference/c/base_8h.html">size</a>
   */
  public int size() {
    return segment.get(JAVA_INT, 0);
  }

  public void size(int value) {
    segment.set(JAVA_INT, 0, value);
  }

  /**
   * @see <a href="https://maplibre.org/maplibre-native-ffi/reference/c/base_8h.html">message</a>
   */
  public MemorySegment message() {
    return segment.asSlice(4, 4096);
  }
}
