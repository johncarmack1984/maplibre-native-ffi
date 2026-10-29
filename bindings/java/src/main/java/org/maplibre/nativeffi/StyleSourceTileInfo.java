// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Inline TileJSON metadata of a tile source.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_style_source_tile_info</a>
 */
public record StyleSourceTileInfo(
    java.util.List<String> tileUrls, double minZoom, double maxZoom, StyleTileScheme scheme) {
  public StyleSourceTileInfo {
    tileUrls = java.util.List.copyOf(tileUrls);
  }

  public StyleSourceTileInfo() {
    this(java.util.List.of(), 0.0, 0.0, new StyleTileScheme(0));
  }

  public StyleSourceTileInfo withTileUrls(java.util.List<String> replacement) {
    return new StyleSourceTileInfo(replacement, this.minZoom, this.maxZoom, this.scheme);
  }

  public StyleSourceTileInfo withMinZoom(double replacement) {
    return new StyleSourceTileInfo(this.tileUrls, replacement, this.maxZoom, this.scheme);
  }

  public StyleSourceTileInfo withMaxZoom(double replacement) {
    return new StyleSourceTileInfo(this.tileUrls, this.minZoom, replacement, this.scheme);
  }

  public StyleSourceTileInfo withScheme(StyleTileScheme replacement) {
    return new StyleSourceTileInfo(this.tileUrls, this.minZoom, this.maxZoom, replacement);
  }
}
