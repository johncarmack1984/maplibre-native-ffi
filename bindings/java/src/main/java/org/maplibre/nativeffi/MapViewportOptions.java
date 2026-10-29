// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Live map viewport and render-transform controls.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_viewport_options</a>
 */
public record MapViewportOptions(
    NorthOrientation northOrientation,
    ConstrainMode constrainMode,
    ViewportMode viewportMode,
    EdgeInsets frustumOffset) {
  public MapViewportOptions() {
    this(null, null, null, null);
  }

  public MapViewportOptions withNorthOrientation(NorthOrientation replacement) {
    return new MapViewportOptions(
        replacement, this.constrainMode, this.viewportMode, this.frustumOffset);
  }

  public MapViewportOptions withConstrainMode(ConstrainMode replacement) {
    return new MapViewportOptions(
        this.northOrientation, replacement, this.viewportMode, this.frustumOffset);
  }

  public MapViewportOptions withViewportMode(ViewportMode replacement) {
    return new MapViewportOptions(
        this.northOrientation, this.constrainMode, replacement, this.frustumOffset);
  }

  public MapViewportOptions withFrustumOffset(EdgeInsets replacement) {
    return new MapViewportOptions(
        this.northOrientation, this.constrainMode, this.viewportMode, replacement);
  }
}
