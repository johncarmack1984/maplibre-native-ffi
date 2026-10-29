// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * How the transitions of one camera command ended.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_camera_transition_outcome</a>
 */
public record CameraTransitionOutcome(int rawValue) {
  public static final CameraTransitionOutcome COMPLETED = new CameraTransitionOutcome(0);
  public static final CameraTransitionOutcome CANCELLED = new CameraTransitionOutcome(1);
  public static final CameraTransitionOutcome CLOSED = new CameraTransitionOutcome(2);
}
