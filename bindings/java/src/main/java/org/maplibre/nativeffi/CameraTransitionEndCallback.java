// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Receives the end of one camera command&#x27;s transitions.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_camera_transition_end_callback</a>
 */
@FunctionalInterface
public interface CameraTransitionEndCallback {
  void invoke(CameraTransitionEnd end);
}
