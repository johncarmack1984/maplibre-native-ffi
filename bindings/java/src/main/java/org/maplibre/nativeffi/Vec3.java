// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Three-component vector used by free camera options.
 *
 * @see <a href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_vec3</a>
 */
public record Vec3(double x, double y, double z) {
  public Vec3() {
    this(0.0, 0.0, 0.0);
  }

  public Vec3 withX(double replacement) {
    return new Vec3(replacement, this.y, this.z);
  }

  public Vec3 withY(double replacement) {
    return new Vec3(this.x, replacement, this.z);
  }

  public Vec3 withZ(double replacement) {
    return new Vec3(this.x, this.y, replacement);
  }
}
