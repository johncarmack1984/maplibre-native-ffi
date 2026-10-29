// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Tile prefetch and LOD tuning controls.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_tile_options</a>
 */
public record MapTileOptions(
    Integer prefetchZoomDelta,
    Double lodMinRadius,
    Double lodScale,
    Double lodPitchThreshold,
    Double lodZoomShift,
    TileLodMode lodMode) {
  public MapTileOptions() {
    this(null, null, null, null, null, null);
  }

  public MapTileOptions withPrefetchZoomDelta(Integer replacement) {
    return new MapTileOptions(
        replacement,
        this.lodMinRadius,
        this.lodScale,
        this.lodPitchThreshold,
        this.lodZoomShift,
        this.lodMode);
  }

  public MapTileOptions withLodMinRadius(Double replacement) {
    return new MapTileOptions(
        this.prefetchZoomDelta,
        replacement,
        this.lodScale,
        this.lodPitchThreshold,
        this.lodZoomShift,
        this.lodMode);
  }

  public MapTileOptions withLodScale(Double replacement) {
    return new MapTileOptions(
        this.prefetchZoomDelta,
        this.lodMinRadius,
        replacement,
        this.lodPitchThreshold,
        this.lodZoomShift,
        this.lodMode);
  }

  public MapTileOptions withLodPitchThreshold(Double replacement) {
    return new MapTileOptions(
        this.prefetchZoomDelta,
        this.lodMinRadius,
        this.lodScale,
        replacement,
        this.lodZoomShift,
        this.lodMode);
  }

  public MapTileOptions withLodZoomShift(Double replacement) {
    return new MapTileOptions(
        this.prefetchZoomDelta,
        this.lodMinRadius,
        this.lodScale,
        this.lodPitchThreshold,
        replacement,
        this.lodMode);
  }

  public MapTileOptions withLodMode(TileLodMode replacement) {
    return new MapTileOptions(
        this.prefetchZoomDelta,
        this.lodMinRadius,
        this.lodScale,
        this.lodPitchThreshold,
        this.lodZoomShift,
        replacement);
  }
}
