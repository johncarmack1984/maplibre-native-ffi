// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Optional animation controls for camera transitions.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_animation_options</a>
 */
public record AnimationOptions(
    Double durationMs,
    Double velocity,
    Double minZoom,
    UnitBezier easing,
    Long transitionId,
    CameraTransitionHandler endHandler) {
  public AnimationOptions() {
    this(null, null, null, null, null, new CameraTransitionHandler());
  }

  public AnimationOptions withDurationMs(Double replacement) {
    return new AnimationOptions(
        replacement, this.velocity, this.minZoom, this.easing, this.transitionId, this.endHandler);
  }

  public AnimationOptions withVelocity(Double replacement) {
    return new AnimationOptions(
        this.durationMs,
        replacement,
        this.minZoom,
        this.easing,
        this.transitionId,
        this.endHandler);
  }

  public AnimationOptions withMinZoom(Double replacement) {
    return new AnimationOptions(
        this.durationMs,
        this.velocity,
        replacement,
        this.easing,
        this.transitionId,
        this.endHandler);
  }

  public AnimationOptions withEasing(UnitBezier replacement) {
    return new AnimationOptions(
        this.durationMs,
        this.velocity,
        this.minZoom,
        replacement,
        this.transitionId,
        this.endHandler);
  }

  public AnimationOptions withTransitionId(Long replacement) {
    return new AnimationOptions(
        this.durationMs, this.velocity, this.minZoom, this.easing, replacement, this.endHandler);
  }

  public AnimationOptions withEndHandler(CameraTransitionHandler replacement) {
    return new AnimationOptions(
        this.durationMs, this.velocity, this.minZoom, this.easing, this.transitionId, replacement);
  }
}
