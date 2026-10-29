// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Options for GeoJSON sources, indexed and rendered at a fixed 512-pixel tile size.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_geo_json_source_options</a>
 */
public record GeoJsonSourceOptions(
    Double minZoom,
    Double maxZoom,
    Double tolerance,
    Double clusterMaxZoom,
    String clusterProperties,
    Integer buffer,
    Integer clusterRadius,
    Integer clusterMinPoints,
    Boolean lineMetrics,
    Boolean cluster,
    Boolean synchronousTiling) {
  public GeoJsonSourceOptions() {
    this(null, null, null, null, "", null, null, null, null, null, null);
  }

  public GeoJsonSourceOptions withMinZoom(Double replacement) {
    return new GeoJsonSourceOptions(
        replacement,
        this.maxZoom,
        this.tolerance,
        this.clusterMaxZoom,
        this.clusterProperties,
        this.buffer,
        this.clusterRadius,
        this.clusterMinPoints,
        this.lineMetrics,
        this.cluster,
        this.synchronousTiling);
  }

  public GeoJsonSourceOptions withMaxZoom(Double replacement) {
    return new GeoJsonSourceOptions(
        this.minZoom,
        replacement,
        this.tolerance,
        this.clusterMaxZoom,
        this.clusterProperties,
        this.buffer,
        this.clusterRadius,
        this.clusterMinPoints,
        this.lineMetrics,
        this.cluster,
        this.synchronousTiling);
  }

  public GeoJsonSourceOptions withTolerance(Double replacement) {
    return new GeoJsonSourceOptions(
        this.minZoom,
        this.maxZoom,
        replacement,
        this.clusterMaxZoom,
        this.clusterProperties,
        this.buffer,
        this.clusterRadius,
        this.clusterMinPoints,
        this.lineMetrics,
        this.cluster,
        this.synchronousTiling);
  }

  public GeoJsonSourceOptions withClusterMaxZoom(Double replacement) {
    return new GeoJsonSourceOptions(
        this.minZoom,
        this.maxZoom,
        this.tolerance,
        replacement,
        this.clusterProperties,
        this.buffer,
        this.clusterRadius,
        this.clusterMinPoints,
        this.lineMetrics,
        this.cluster,
        this.synchronousTiling);
  }

  public GeoJsonSourceOptions withClusterProperties(String replacement) {
    return new GeoJsonSourceOptions(
        this.minZoom,
        this.maxZoom,
        this.tolerance,
        this.clusterMaxZoom,
        replacement,
        this.buffer,
        this.clusterRadius,
        this.clusterMinPoints,
        this.lineMetrics,
        this.cluster,
        this.synchronousTiling);
  }

  public GeoJsonSourceOptions withBuffer(Integer replacement) {
    return new GeoJsonSourceOptions(
        this.minZoom,
        this.maxZoom,
        this.tolerance,
        this.clusterMaxZoom,
        this.clusterProperties,
        replacement,
        this.clusterRadius,
        this.clusterMinPoints,
        this.lineMetrics,
        this.cluster,
        this.synchronousTiling);
  }

  public GeoJsonSourceOptions withClusterRadius(Integer replacement) {
    return new GeoJsonSourceOptions(
        this.minZoom,
        this.maxZoom,
        this.tolerance,
        this.clusterMaxZoom,
        this.clusterProperties,
        this.buffer,
        replacement,
        this.clusterMinPoints,
        this.lineMetrics,
        this.cluster,
        this.synchronousTiling);
  }

  public GeoJsonSourceOptions withClusterMinPoints(Integer replacement) {
    return new GeoJsonSourceOptions(
        this.minZoom,
        this.maxZoom,
        this.tolerance,
        this.clusterMaxZoom,
        this.clusterProperties,
        this.buffer,
        this.clusterRadius,
        replacement,
        this.lineMetrics,
        this.cluster,
        this.synchronousTiling);
  }

  public GeoJsonSourceOptions withLineMetrics(Boolean replacement) {
    return new GeoJsonSourceOptions(
        this.minZoom,
        this.maxZoom,
        this.tolerance,
        this.clusterMaxZoom,
        this.clusterProperties,
        this.buffer,
        this.clusterRadius,
        this.clusterMinPoints,
        replacement,
        this.cluster,
        this.synchronousTiling);
  }

  public GeoJsonSourceOptions withCluster(Boolean replacement) {
    return new GeoJsonSourceOptions(
        this.minZoom,
        this.maxZoom,
        this.tolerance,
        this.clusterMaxZoom,
        this.clusterProperties,
        this.buffer,
        this.clusterRadius,
        this.clusterMinPoints,
        this.lineMetrics,
        replacement,
        this.synchronousTiling);
  }

  public GeoJsonSourceOptions withSynchronousTiling(Boolean replacement) {
    return new GeoJsonSourceOptions(
        this.minZoom,
        this.maxZoom,
        this.tolerance,
        this.clusterMaxZoom,
        this.clusterProperties,
        this.buffer,
        this.clusterRadius,
        this.clusterMinPoints,
        this.lineMetrics,
        this.cluster,
        replacement);
  }
}
