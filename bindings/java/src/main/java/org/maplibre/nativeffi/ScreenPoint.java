// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Screen-space point in logical map pixels, from the top-left of the viewport with y growing
 * downward.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_screen_point</a>
 */
public record ScreenPoint(double x, double y) {
  public ScreenPoint() {
    this(0.0, 0.0);
  }

  public ScreenPoint withX(double replacement) {
    return new ScreenPoint(replacement, this.y);
  }

  public ScreenPoint withY(double replacement) {
    return new ScreenPoint(this.x, replacement);
  }
}
