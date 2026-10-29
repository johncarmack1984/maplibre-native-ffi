// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * One atomic relative camera update.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_camera_delta</a>
 */
public record CameraDelta(
    ScreenPoint offset,
    Double scale,
    Double bearing,
    Double pitch,
    ScreenPoint anchor,
    AnimationOptions animation,
    GesturePhase gesturePhase) {
  public CameraDelta() {
    this(null, null, null, null, null, new AnimationOptions(), new GesturePhase(0));
  }

  public CameraDelta withOffset(ScreenPoint replacement) {
    return new CameraDelta(
        replacement,
        this.scale,
        this.bearing,
        this.pitch,
        this.anchor,
        this.animation,
        this.gesturePhase);
  }

  public CameraDelta withScale(Double replacement) {
    return new CameraDelta(
        this.offset,
        replacement,
        this.bearing,
        this.pitch,
        this.anchor,
        this.animation,
        this.gesturePhase);
  }

  public CameraDelta withBearing(Double replacement) {
    return new CameraDelta(
        this.offset,
        this.scale,
        replacement,
        this.pitch,
        this.anchor,
        this.animation,
        this.gesturePhase);
  }

  public CameraDelta withPitch(Double replacement) {
    return new CameraDelta(
        this.offset,
        this.scale,
        this.bearing,
        replacement,
        this.anchor,
        this.animation,
        this.gesturePhase);
  }

  public CameraDelta withAnchor(ScreenPoint replacement) {
    return new CameraDelta(
        this.offset,
        this.scale,
        this.bearing,
        this.pitch,
        replacement,
        this.animation,
        this.gesturePhase);
  }

  public CameraDelta withAnimation(AnimationOptions replacement) {
    return new CameraDelta(
        this.offset,
        this.scale,
        this.bearing,
        this.pitch,
        this.anchor,
        replacement,
        this.gesturePhase);
  }

  public CameraDelta withGesturePhase(GesturePhase replacement) {
    return new CameraDelta(
        this.offset,
        this.scale,
        this.bearing,
        this.pitch,
        this.anchor,
        this.animation,
        replacement);
  }
}
