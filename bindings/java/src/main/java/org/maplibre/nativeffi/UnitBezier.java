// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Cubic easing curve for animated camera transitions.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_unit_bezier</a>
 */
public record UnitBezier(double x1, double y1, double x2, double y2) {
  public UnitBezier() {
    this(0.0, 0.0, 0.0, 0.0);
  }

  public UnitBezier withX1(double replacement) {
    return new UnitBezier(replacement, this.y1, this.x2, this.y2);
  }

  public UnitBezier withY1(double replacement) {
    return new UnitBezier(this.x1, replacement, this.x2, this.y2);
  }

  public UnitBezier withX2(double replacement) {
    return new UnitBezier(this.x1, this.y1, replacement, this.y2);
  }

  public UnitBezier withY2(double replacement) {
    return new UnitBezier(this.x1, this.y1, this.x2, replacement);
  }
}
