// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * One atomic absolute camera update.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_camera_update</a>
 */
public record CameraUpdate(
    CameraUpdateMode mode,
    CameraOptions camera,
    AnimationOptions animation,
    GesturePhase gesturePhase) {
  public CameraUpdate() {
    this(new CameraUpdateMode(0), new CameraOptions(), new AnimationOptions(), new GesturePhase(0));
  }

  public CameraUpdate withMode(CameraUpdateMode replacement) {
    return new CameraUpdate(replacement, this.camera, this.animation, this.gesturePhase);
  }

  public CameraUpdate withCamera(CameraOptions replacement) {
    return new CameraUpdate(this.mode, replacement, this.animation, this.gesturePhase);
  }

  public CameraUpdate withAnimation(AnimationOptions replacement) {
    return new CameraUpdate(this.mode, this.camera, replacement, this.gesturePhase);
  }

  public CameraUpdate withGesturePhase(GesturePhase replacement) {
    return new CameraUpdate(this.mode, this.camera, this.animation, replacement);
  }
}
