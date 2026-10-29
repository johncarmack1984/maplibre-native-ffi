// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Optional fitting controls for camera-for-viewport queries.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_camera_fit_options</a>
 */
public record CameraFitOptions(EdgeInsets padding, Double bearing, Double pitch) {
  public CameraFitOptions() {
    this(null, null, null);
  }

  public CameraFitOptions withPadding(EdgeInsets replacement) {
    return new CameraFitOptions(replacement, this.bearing, this.pitch);
  }

  public CameraFitOptions withBearing(Double replacement) {
    return new CameraFitOptions(this.padding, replacement, this.pitch);
  }

  public CameraFitOptions withPitch(Double replacement) {
    return new CameraFitOptions(this.padding, this.bearing, replacement);
  }
}
