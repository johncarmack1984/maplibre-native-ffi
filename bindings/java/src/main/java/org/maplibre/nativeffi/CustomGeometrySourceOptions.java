// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Options for custom geometry sources.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_custom_geometry_source_options</a>
 */
public final class CustomGeometrySourceOptions {
  private final NativeRegistration nativeRegistration;
  private final CustomSourceFetchTileCallback fetchTile;
  private final CustomSourceCancelTileCallback cancelTile;
  private final Double minZoom;
  private final Double maxZoom;
  private final Double tolerance;
  private final Integer tileSize;
  private final Integer buffer;
  private final Boolean clip;
  private final Boolean wrap;

  public CustomGeometrySourceOptions(
      CustomSourceFetchTileCallback fetchTile,
      CustomSourceCancelTileCallback cancelTile,
      Double minZoom,
      Double maxZoom,
      Double tolerance,
      Integer tileSize,
      Integer buffer,
      Boolean clip,
      Boolean wrap) {
    this(fetchTile, cancelTile, minZoom, maxZoom, tolerance, tileSize, buffer, clip, wrap, null);
  }

  CustomGeometrySourceOptions(
      CustomSourceFetchTileCallback fetchTile,
      CustomSourceCancelTileCallback cancelTile,
      Double minZoom,
      Double maxZoom,
      Double tolerance,
      Integer tileSize,
      Integer buffer,
      Boolean clip,
      Boolean wrap,
      NativeRegistration nativeRegistration) {
    this.nativeRegistration = nativeRegistration;
    this.fetchTile = fetchTile;
    this.cancelTile = cancelTile;
    this.minZoom = minZoom;
    this.maxZoom = maxZoom;
    this.tolerance = tolerance;
    this.tileSize = tileSize;
    this.buffer = buffer;
    this.clip = clip;
    this.wrap = wrap;
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

  public Double tolerance() {
    return tolerance;
  }

  public Integer tileSize() {
    return tileSize;
  }

  public Integer buffer() {
    return buffer;
  }

  public Boolean clip() {
    return clip;
  }

  public Boolean wrap() {
    return wrap;
  }

  public CustomGeometrySourceOptions(CustomSourceFetchTileCallback fetchTile) {
    this(fetchTile, null, null, null, null, null, null, null, null);
  }

  NativeRegistration nativeRegistration() {
    return nativeRegistration;
  }

  public static CustomGeometrySourceOptions nativeRegistration(
      NativePointer fetchTile,
      NativePointer cancelTile,
      NativePointer userData,
      NativePointer releaseUserData,
      double minZoom,
      double maxZoom,
      double tolerance,
      int tileSize,
      int buffer,
      boolean clip,
      boolean wrap) {
    return new CustomGeometrySourceOptions(
        null,
        null,
        minZoom,
        maxZoom,
        tolerance,
        tileSize,
        buffer,
        clip,
        wrap,
        new NativeRegistration(
            new NativePointer[] {fetchTile, cancelTile}, userData, releaseUserData));
  }

  public CustomGeometrySourceOptions withFetchTile(CustomSourceFetchTileCallback replacement) {
    return new CustomGeometrySourceOptions(
        replacement,
        this.cancelTile,
        this.minZoom,
        this.maxZoom,
        this.tolerance,
        this.tileSize,
        this.buffer,
        this.clip,
        this.wrap,
        null);
  }

  public CustomGeometrySourceOptions withCancelTile(CustomSourceCancelTileCallback replacement) {
    return new CustomGeometrySourceOptions(
        this.fetchTile,
        replacement,
        this.minZoom,
        this.maxZoom,
        this.tolerance,
        this.tileSize,
        this.buffer,
        this.clip,
        this.wrap,
        null);
  }

  public CustomGeometrySourceOptions withMinZoom(Double replacement) {
    return new CustomGeometrySourceOptions(
        this.fetchTile,
        this.cancelTile,
        replacement,
        this.maxZoom,
        this.tolerance,
        this.tileSize,
        this.buffer,
        this.clip,
        this.wrap,
        nativeRegistration);
  }

  public CustomGeometrySourceOptions withMaxZoom(Double replacement) {
    return new CustomGeometrySourceOptions(
        this.fetchTile,
        this.cancelTile,
        this.minZoom,
        replacement,
        this.tolerance,
        this.tileSize,
        this.buffer,
        this.clip,
        this.wrap,
        nativeRegistration);
  }

  public CustomGeometrySourceOptions withTolerance(Double replacement) {
    return new CustomGeometrySourceOptions(
        this.fetchTile,
        this.cancelTile,
        this.minZoom,
        this.maxZoom,
        replacement,
        this.tileSize,
        this.buffer,
        this.clip,
        this.wrap,
        nativeRegistration);
  }

  public CustomGeometrySourceOptions withTileSize(Integer replacement) {
    return new CustomGeometrySourceOptions(
        this.fetchTile,
        this.cancelTile,
        this.minZoom,
        this.maxZoom,
        this.tolerance,
        replacement,
        this.buffer,
        this.clip,
        this.wrap,
        nativeRegistration);
  }

  public CustomGeometrySourceOptions withBuffer(Integer replacement) {
    return new CustomGeometrySourceOptions(
        this.fetchTile,
        this.cancelTile,
        this.minZoom,
        this.maxZoom,
        this.tolerance,
        this.tileSize,
        replacement,
        this.clip,
        this.wrap,
        nativeRegistration);
  }

  public CustomGeometrySourceOptions withClip(Boolean replacement) {
    return new CustomGeometrySourceOptions(
        this.fetchTile,
        this.cancelTile,
        this.minZoom,
        this.maxZoom,
        this.tolerance,
        this.tileSize,
        this.buffer,
        replacement,
        this.wrap,
        nativeRegistration);
  }

  public CustomGeometrySourceOptions withWrap(Boolean replacement) {
    return new CustomGeometrySourceOptions(
        this.fetchTile,
        this.cancelTile,
        this.minZoom,
        this.maxZoom,
        this.tolerance,
        this.tileSize,
        this.buffer,
        this.clip,
        replacement,
        nativeRegistration);
  }
}
