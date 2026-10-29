// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * The end of one camera command&#x27;s transitions.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_camera_transition_end</a>
 */
public record CameraTransitionEnd(CameraTransitionOutcome outcome, long generation) {
  public CameraTransitionEnd() {
    this(new CameraTransitionOutcome(0), 0L);
  }

  public CameraTransitionEnd withOutcome(CameraTransitionOutcome replacement) {
    return new CameraTransitionEnd(replacement, this.generation);
  }

  public CameraTransitionEnd withGeneration(long replacement) {
    return new CameraTransitionEnd(this.outcome, replacement);
  }
}
