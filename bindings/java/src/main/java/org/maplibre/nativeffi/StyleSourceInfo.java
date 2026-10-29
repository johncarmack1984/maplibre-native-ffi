// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Complete metadata of one style source.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_style_source_info</a>
 */
public record StyleSourceInfo(
    String id,
    StyleSourceType type,
    boolean isVolatile,
    String attribution,
    String url,
    StyleSourceTileInfo tileJson,
    LatLngBounds bounds,
    Integer tileSize,
    StyleVectorTileEncoding vectorEncoding,
    StyleRasterDemEncoding rasterEncoding) {
  public StyleSourceInfo() {
    this("", new StyleSourceType(0), false, "", "", null, null, null, null, null);
  }

  public StyleSourceInfo withId(String replacement) {
    return new StyleSourceInfo(
        replacement,
        this.type,
        this.isVolatile,
        this.attribution,
        this.url,
        this.tileJson,
        this.bounds,
        this.tileSize,
        this.vectorEncoding,
        this.rasterEncoding);
  }

  public StyleSourceInfo withType(StyleSourceType replacement) {
    return new StyleSourceInfo(
        this.id,
        replacement,
        this.isVolatile,
        this.attribution,
        this.url,
        this.tileJson,
        this.bounds,
        this.tileSize,
        this.vectorEncoding,
        this.rasterEncoding);
  }

  public StyleSourceInfo withIsVolatile(boolean replacement) {
    return new StyleSourceInfo(
        this.id,
        this.type,
        replacement,
        this.attribution,
        this.url,
        this.tileJson,
        this.bounds,
        this.tileSize,
        this.vectorEncoding,
        this.rasterEncoding);
  }

  public StyleSourceInfo withAttribution(String replacement) {
    return new StyleSourceInfo(
        this.id,
        this.type,
        this.isVolatile,
        replacement,
        this.url,
        this.tileJson,
        this.bounds,
        this.tileSize,
        this.vectorEncoding,
        this.rasterEncoding);
  }

  public StyleSourceInfo withUrl(String replacement) {
    return new StyleSourceInfo(
        this.id,
        this.type,
        this.isVolatile,
        this.attribution,
        replacement,
        this.tileJson,
        this.bounds,
        this.tileSize,
        this.vectorEncoding,
        this.rasterEncoding);
  }

  public StyleSourceInfo withTileJson(StyleSourceTileInfo replacement) {
    return new StyleSourceInfo(
        this.id,
        this.type,
        this.isVolatile,
        this.attribution,
        this.url,
        replacement,
        this.bounds,
        this.tileSize,
        this.vectorEncoding,
        this.rasterEncoding);
  }

  public StyleSourceInfo withBounds(LatLngBounds replacement) {
    return new StyleSourceInfo(
        this.id,
        this.type,
        this.isVolatile,
        this.attribution,
        this.url,
        this.tileJson,
        replacement,
        this.tileSize,
        this.vectorEncoding,
        this.rasterEncoding);
  }

  public StyleSourceInfo withTileSize(Integer replacement) {
    return new StyleSourceInfo(
        this.id,
        this.type,
        this.isVolatile,
        this.attribution,
        this.url,
        this.tileJson,
        this.bounds,
        replacement,
        this.vectorEncoding,
        this.rasterEncoding);
  }

  public StyleSourceInfo withVectorEncoding(StyleVectorTileEncoding replacement) {
    return new StyleSourceInfo(
        this.id,
        this.type,
        this.isVolatile,
        this.attribution,
        this.url,
        this.tileJson,
        this.bounds,
        this.tileSize,
        replacement,
        this.rasterEncoding);
  }

  public StyleSourceInfo withRasterEncoding(StyleRasterDemEncoding replacement) {
    return new StyleSourceInfo(
        this.id,
        this.type,
        this.isVolatile,
        this.attribution,
        this.url,
        this.tileJson,
        this.bounds,
        this.tileSize,
        this.vectorEncoding,
        replacement);
  }
}
