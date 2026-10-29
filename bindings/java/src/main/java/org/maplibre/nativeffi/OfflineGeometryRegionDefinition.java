// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Geometry offline region definition.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_offline_geometry_region_definition</a>
 */
public record OfflineGeometryRegionDefinition(
    String styleUrl,
    String geometry,
    double minZoom,
    double maxZoom,
    float pixelRatio,
    boolean includeIdeographs) {
  public OfflineGeometryRegionDefinition(String geometry) {
    this("", geometry, 0.0, 0.0, 0f, false);
  }

  public OfflineGeometryRegionDefinition withStyleUrl(String replacement) {
    return new OfflineGeometryRegionDefinition(
        replacement,
        this.geometry,
        this.minZoom,
        this.maxZoom,
        this.pixelRatio,
        this.includeIdeographs);
  }

  public OfflineGeometryRegionDefinition withGeometry(String replacement) {
    return new OfflineGeometryRegionDefinition(
        this.styleUrl,
        replacement,
        this.minZoom,
        this.maxZoom,
        this.pixelRatio,
        this.includeIdeographs);
  }

  public OfflineGeometryRegionDefinition withMinZoom(double replacement) {
    return new OfflineGeometryRegionDefinition(
        this.styleUrl,
        this.geometry,
        replacement,
        this.maxZoom,
        this.pixelRatio,
        this.includeIdeographs);
  }

  public OfflineGeometryRegionDefinition withMaxZoom(double replacement) {
    return new OfflineGeometryRegionDefinition(
        this.styleUrl,
        this.geometry,
        this.minZoom,
        replacement,
        this.pixelRatio,
        this.includeIdeographs);
  }

  public OfflineGeometryRegionDefinition withPixelRatio(float replacement) {
    return new OfflineGeometryRegionDefinition(
        this.styleUrl,
        this.geometry,
        this.minZoom,
        this.maxZoom,
        replacement,
        this.includeIdeographs);
  }

  public OfflineGeometryRegionDefinition withIncludeIdeographs(boolean replacement) {
    return new OfflineGeometryRegionDefinition(
        this.styleUrl, this.geometry, this.minZoom, this.maxZoom, this.pixelRatio, replacement);
  }
}
