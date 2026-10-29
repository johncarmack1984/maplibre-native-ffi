// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Inclusive byte range of a resource request.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_range</a>
 */
public record ResourceRange(long start, long end) {
  public ResourceRange() {
    this(0L, 0L);
  }

  public ResourceRange withStart(long replacement) {
    return new ResourceRange(replacement, this.end);
  }

  public ResourceRange withEnd(long replacement) {
    return new ResourceRange(this.start, replacement);
  }
}
