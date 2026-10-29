// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Camera fields used by snapshots and camera updates.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_camera_options</a>
 */
public record CameraOptions(
    LatLng center,
    Double centerAltitude,
    EdgeInsets padding,
    ScreenPoint anchor,
    Double zoom,
    Double bearing,
    Double pitch,
    Double roll,
    Double fieldOfView) {
  public CameraOptions() {
    this(null, null, null, null, null, null, null, null, null);
  }

  public CameraOptions withCenter(LatLng replacement) {
    return new CameraOptions(
        replacement,
        this.centerAltitude,
        this.padding,
        this.anchor,
        this.zoom,
        this.bearing,
        this.pitch,
        this.roll,
        this.fieldOfView);
  }

  public CameraOptions withCenterAltitude(Double replacement) {
    return new CameraOptions(
        this.center,
        replacement,
        this.padding,
        this.anchor,
        this.zoom,
        this.bearing,
        this.pitch,
        this.roll,
        this.fieldOfView);
  }

  public CameraOptions withPadding(EdgeInsets replacement) {
    return new CameraOptions(
        this.center,
        this.centerAltitude,
        replacement,
        this.anchor,
        this.zoom,
        this.bearing,
        this.pitch,
        this.roll,
        this.fieldOfView);
  }

  public CameraOptions withAnchor(ScreenPoint replacement) {
    return new CameraOptions(
        this.center,
        this.centerAltitude,
        this.padding,
        replacement,
        this.zoom,
        this.bearing,
        this.pitch,
        this.roll,
        this.fieldOfView);
  }

  public CameraOptions withZoom(Double replacement) {
    return new CameraOptions(
        this.center,
        this.centerAltitude,
        this.padding,
        this.anchor,
        replacement,
        this.bearing,
        this.pitch,
        this.roll,
        this.fieldOfView);
  }

  public CameraOptions withBearing(Double replacement) {
    return new CameraOptions(
        this.center,
        this.centerAltitude,
        this.padding,
        this.anchor,
        this.zoom,
        replacement,
        this.pitch,
        this.roll,
        this.fieldOfView);
  }

  public CameraOptions withPitch(Double replacement) {
    return new CameraOptions(
        this.center,
        this.centerAltitude,
        this.padding,
        this.anchor,
        this.zoom,
        this.bearing,
        replacement,
        this.roll,
        this.fieldOfView);
  }

  public CameraOptions withRoll(Double replacement) {
    return new CameraOptions(
        this.center,
        this.centerAltitude,
        this.padding,
        this.anchor,
        this.zoom,
        this.bearing,
        this.pitch,
        replacement,
        this.fieldOfView);
  }

  public CameraOptions withFieldOfView(Double replacement) {
    return new CameraOptions(
        this.center,
        this.centerAltitude,
        this.padding,
        this.anchor,
        this.zoom,
        this.bearing,
        this.pitch,
        this.roll,
        replacement);
  }
}
