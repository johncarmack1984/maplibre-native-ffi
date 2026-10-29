// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Screen-space inset in logical map pixels.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_edge_insets</a>
 */
public record EdgeInsets(double top, double left, double bottom, double right) {
  public EdgeInsets() {
    this(0.0, 0.0, 0.0, 0.0);
  }

  public EdgeInsets withTop(double replacement) {
    return new EdgeInsets(replacement, this.left, this.bottom, this.right);
  }

  public EdgeInsets withLeft(double replacement) {
    return new EdgeInsets(this.top, replacement, this.bottom, this.right);
  }

  public EdgeInsets withBottom(double replacement) {
    return new EdgeInsets(this.top, this.left, replacement, this.right);
  }

  public EdgeInsets withRight(double replacement) {
    return new EdgeInsets(this.top, this.left, this.bottom, replacement);
  }
}
