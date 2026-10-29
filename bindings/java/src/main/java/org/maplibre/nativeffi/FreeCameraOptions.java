// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Free camera position and orientation in MapLibre Native camera space.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_free_camera_options</a>
 */
public record FreeCameraOptions(Vec3 position, Quaternion orientation) {
  public FreeCameraOptions() {
    this(null, null);
  }

  public FreeCameraOptions withPosition(Vec3 replacement) {
    return new FreeCameraOptions(replacement, this.orientation);
  }

  public FreeCameraOptions withOrientation(Quaternion replacement) {
    return new FreeCameraOptions(this.position, replacement);
  }
}
