// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Tile-pyramid offline region definition.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_offline_tile_pyramid_region_definition</a>
 */
public record OfflineTilePyramidRegionDefinition(
    String styleUrl,
    LatLngBounds bounds,
    double minZoom,
    double maxZoom,
    float pixelRatio,
    boolean includeIdeographs) {
  public OfflineTilePyramidRegionDefinition() {
    this("", new LatLngBounds(), 0.0, 0.0, 0f, false);
  }

  public OfflineTilePyramidRegionDefinition withStyleUrl(String replacement) {
    return new OfflineTilePyramidRegionDefinition(
        replacement,
        this.bounds,
        this.minZoom,
        this.maxZoom,
        this.pixelRatio,
        this.includeIdeographs);
  }

  public OfflineTilePyramidRegionDefinition withBounds(LatLngBounds replacement) {
    return new OfflineTilePyramidRegionDefinition(
        this.styleUrl,
        replacement,
        this.minZoom,
        this.maxZoom,
        this.pixelRatio,
        this.includeIdeographs);
  }

  public OfflineTilePyramidRegionDefinition withMinZoom(double replacement) {
    return new OfflineTilePyramidRegionDefinition(
        this.styleUrl,
        this.bounds,
        replacement,
        this.maxZoom,
        this.pixelRatio,
        this.includeIdeographs);
  }

  public OfflineTilePyramidRegionDefinition withMaxZoom(double replacement) {
    return new OfflineTilePyramidRegionDefinition(
        this.styleUrl,
        this.bounds,
        this.minZoom,
        replacement,
        this.pixelRatio,
        this.includeIdeographs);
  }

  public OfflineTilePyramidRegionDefinition withPixelRatio(float replacement) {
    return new OfflineTilePyramidRegionDefinition(
        this.styleUrl,
        this.bounds,
        this.minZoom,
        this.maxZoom,
        replacement,
        this.includeIdeographs);
  }

  public OfflineTilePyramidRegionDefinition withIncludeIdeographs(boolean replacement) {
    return new OfflineTilePyramidRegionDefinition(
        this.styleUrl, this.bounds, this.minZoom, this.maxZoom, this.pixelRatio, replacement);
  }
}
