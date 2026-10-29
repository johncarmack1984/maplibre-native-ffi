// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Everything that a projection depends on: the transform that a published snapshot or a rendered
 * frame describes.
 *
 * @see <a href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_view</a>
 */
public record MapView(
    Camera camera,
    LogicalExtent extent,
    ProjectionMode projectionMode,
    MapViewportOptions viewport) {
  public MapView() {
    this(new Camera(), new LogicalExtent(), new ProjectionMode(), new MapViewportOptions());
  }

  public MapView withCamera(Camera replacement) {
    return new MapView(replacement, this.extent, this.projectionMode, this.viewport);
  }

  public MapView withExtent(LogicalExtent replacement) {
    return new MapView(this.camera, replacement, this.projectionMode, this.viewport);
  }

  public MapView withProjectionMode(ProjectionMode replacement) {
    return new MapView(this.camera, this.extent, replacement, this.viewport);
  }

  public MapView withViewport(MapViewportOptions replacement) {
    return new MapView(this.camera, this.extent, this.projectionMode, replacement);
  }
}
