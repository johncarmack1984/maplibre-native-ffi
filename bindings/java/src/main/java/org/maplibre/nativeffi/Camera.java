// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * A complete camera, as native reports it.
 *
 * @see <a href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_camera</a>
 */
public record Camera(
    LatLng center,
    double centerAltitude,
    EdgeInsets padding,
    double zoom,
    double bearing,
    double pitch,
    double roll,
    double fieldOfView) {
  public Camera() {
    this(new LatLng(), 0.0, new EdgeInsets(), 0.0, 0.0, 0.0, 0.0, 0.0);
  }

  public Camera withCenter(LatLng replacement) {
    return new Camera(
        replacement,
        this.centerAltitude,
        this.padding,
        this.zoom,
        this.bearing,
        this.pitch,
        this.roll,
        this.fieldOfView);
  }

  public Camera withCenterAltitude(double replacement) {
    return new Camera(
        this.center,
        replacement,
        this.padding,
        this.zoom,
        this.bearing,
        this.pitch,
        this.roll,
        this.fieldOfView);
  }

  public Camera withPadding(EdgeInsets replacement) {
    return new Camera(
        this.center,
        this.centerAltitude,
        replacement,
        this.zoom,
        this.bearing,
        this.pitch,
        this.roll,
        this.fieldOfView);
  }

  public Camera withZoom(double replacement) {
    return new Camera(
        this.center,
        this.centerAltitude,
        this.padding,
        replacement,
        this.bearing,
        this.pitch,
        this.roll,
        this.fieldOfView);
  }

  public Camera withBearing(double replacement) {
    return new Camera(
        this.center,
        this.centerAltitude,
        this.padding,
        this.zoom,
        replacement,
        this.pitch,
        this.roll,
        this.fieldOfView);
  }

  public Camera withPitch(double replacement) {
    return new Camera(
        this.center,
        this.centerAltitude,
        this.padding,
        this.zoom,
        this.bearing,
        replacement,
        this.roll,
        this.fieldOfView);
  }

  public Camera withRoll(double replacement) {
    return new Camera(
        this.center,
        this.centerAltitude,
        this.padding,
        this.zoom,
        this.bearing,
        this.pitch,
        replacement,
        this.fieldOfView);
  }

  public Camera withFieldOfView(double replacement) {
    return new Camera(
        this.center,
        this.centerAltitude,
        this.padding,
        this.zoom,
        this.bearing,
        this.pitch,
        this.roll,
        replacement);
  }
}
