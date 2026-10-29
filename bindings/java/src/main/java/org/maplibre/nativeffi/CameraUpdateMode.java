// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Camera transition behavior for {@code mln_camera_update}.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_camera_update_mode</a>
 */
public record CameraUpdateMode(int rawValue) {
  public static final CameraUpdateMode JUMP = new CameraUpdateMode(0);
  public static final CameraUpdateMode EASE = new CameraUpdateMode(1);
  public static final CameraUpdateMode FLY = new CameraUpdateMode(2);
}
