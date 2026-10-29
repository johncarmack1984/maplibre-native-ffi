// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Screen-space line string in logical map pixels.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/query_8h.html">mln_screen_line_string</a>
 */
public record ScreenLineString(java.util.List<ScreenPoint> points) {
  public ScreenLineString {
    points = java.util.List.copyOf(points);
  }

  public ScreenLineString() {
    this(java.util.List.of());
  }

  public ScreenLineString withPoints(java.util.List<ScreenPoint> replacement) {
    return new ScreenLineString(replacement);
  }
}
