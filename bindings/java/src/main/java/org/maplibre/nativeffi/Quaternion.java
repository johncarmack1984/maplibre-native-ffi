// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Quaternion stored as x, y, z, w components.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_quaternion</a>
 */
public record Quaternion(double x, double y, double z, double w) {
  public Quaternion() {
    this(0.0, 0.0, 0.0, 0.0);
  }

  public Quaternion withX(double replacement) {
    return new Quaternion(replacement, this.y, this.z, this.w);
  }

  public Quaternion withY(double replacement) {
    return new Quaternion(this.x, replacement, this.z, this.w);
  }

  public Quaternion withZ(double replacement) {
    return new Quaternion(this.x, this.y, replacement, this.w);
  }

  public Quaternion withW(double replacement) {
    return new Quaternion(this.x, this.y, this.z, replacement);
  }
}
