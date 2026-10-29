// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi.internal.c;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Borrowed data. The data pointer may be null only when size is zero.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/base_8h.html">mln_buffer_view</a>
 */
public record BufferView(MemorySegment segment) {
  public static final GroupLayout LAYOUT =
      MemoryLayout.structLayout(ADDRESS.withName("data"), JAVA_LONG.withName("size"));

  public BufferView {
    segment = segment.asSlice(0, LAYOUT);
  }

  /** Allocates zeroed native storage in the supplied arena. */
  public static BufferView allocate(Arena arena) {
    var value = new BufferView(arena.allocate(LAYOUT));
    return value;
  }

  /**
   * @see <a href="https://maplibre.org/maplibre-native-ffi/reference/c/base_8h.html">data</a>
   */
  public MemorySegment data() {
    return segment.get(ADDRESS, 0);
  }

  public void data(MemorySegment value) {
    segment.set(ADDRESS, 0, value);
  }

  /**
   * @see <a href="https://maplibre.org/maplibre-native-ffi/reference/c/base_8h.html">size</a>
   */
  public long size() {
    return segment.get(JAVA_LONG, 8);
  }

  public void size(long value) {
    segment.set(JAVA_LONG, 8, value);
  }
}
