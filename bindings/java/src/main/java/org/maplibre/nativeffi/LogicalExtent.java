// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Logical extent in UI pixels and the device-pixel scale.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_logical_extent</a>
 */
public record LogicalExtent(int width, int height, double scaleFactor) {
  public LogicalExtent() {
    this(0, 0, 0.0);
  }

  public LogicalExtent withWidth(int replacement) {
    return new LogicalExtent(replacement, this.height, this.scaleFactor);
  }

  public LogicalExtent withHeight(int replacement) {
    return new LogicalExtent(this.width, replacement, this.scaleFactor);
  }

  public LogicalExtent withScaleFactor(double replacement) {
    return new LogicalExtent(this.width, this.height, replacement);
  }
}
