// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Options for custom vector sources.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_custom_vector_source_options</a>
 */
public final class CustomVectorSourceOptions {
  private final NativeRegistration nativeRegistration;
  private final CustomSourceFetchTileCallback fetchTile;
  private final CustomSourceCancelTileCallback cancelTile;
  private final Double minZoom;
  private final Double maxZoom;

  public CustomVectorSourceOptions(
      CustomSourceFetchTileCallback fetchTile,
      CustomSourceCancelTileCallback cancelTile,
      Double minZoom,
      Double maxZoom) {
    this(fetchTile, cancelTile, minZoom, maxZoom, null);
  }

  CustomVectorSourceOptions(
      CustomSourceFetchTileCallback fetchTile,
      CustomSourceCancelTileCallback cancelTile,
      Double minZoom,
      Double maxZoom,
      NativeRegistration nativeRegistration) {
    this.nativeRegistration = nativeRegistration;
    this.fetchTile = fetchTile;
    this.cancelTile = cancelTile;
    this.minZoom = minZoom;
    this.maxZoom = maxZoom;
  }

  public CustomSourceFetchTileCallback fetchTile() {
    return fetchTile;
  }

  public CustomSourceCancelTileCallback cancelTile() {
    return cancelTile;
  }

  public Double minZoom() {
    return minZoom;
  }

  public Double maxZoom() {
    return maxZoom;
  }

  public CustomVectorSourceOptions(CustomSourceFetchTileCallback fetchTile) {
    this(fetchTile, null, null, null);
  }

  NativeRegistration nativeRegistration() {
    return nativeRegistration;
  }

  public static CustomVectorSourceOptions nativeRegistration(
      NativePointer fetchTile,
      NativePointer cancelTile,
      NativePointer userData,
      NativePointer releaseUserData,
      double minZoom,
      double maxZoom) {
    return new CustomVectorSourceOptions(
        null,
        null,
        minZoom,
        maxZoom,
        new NativeRegistration(
            new NativePointer[] {fetchTile, cancelTile}, userData, releaseUserData));
  }

  public CustomVectorSourceOptions withFetchTile(CustomSourceFetchTileCallback replacement) {
    return new CustomVectorSourceOptions(
        replacement, this.cancelTile, this.minZoom, this.maxZoom, null);
  }

  public CustomVectorSourceOptions withCancelTile(CustomSourceCancelTileCallback replacement) {
    return new CustomVectorSourceOptions(
        this.fetchTile, replacement, this.minZoom, this.maxZoom, null);
  }

  public CustomVectorSourceOptions withMinZoom(Double replacement) {
    return new CustomVectorSourceOptions(
        this.fetchTile, this.cancelTile, replacement, this.maxZoom, nativeRegistration);
  }

  public CustomVectorSourceOptions withMaxZoom(Double replacement) {
    return new CustomVectorSourceOptions(
        this.fetchTile, this.cancelTile, this.minZoom, replacement, nativeRegistration);
  }
}
