// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * One style layer.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_style_layer_info</a>
 */
public record StyleLayerInfo(
    String id,
    String type,
    String sourceId,
    String sourceLayer,
    double minZoom,
    double maxZoom,
    StyleLayerVisibility visibility) {
  public StyleLayerInfo() {
    this("", "", "", "", 0.0, 0.0, new StyleLayerVisibility(0));
  }

  public StyleLayerInfo withId(String replacement) {
    return new StyleLayerInfo(
        replacement,
        this.type,
        this.sourceId,
        this.sourceLayer,
        this.minZoom,
        this.maxZoom,
        this.visibility);
  }

  public StyleLayerInfo withType(String replacement) {
    return new StyleLayerInfo(
        this.id,
        replacement,
        this.sourceId,
        this.sourceLayer,
        this.minZoom,
        this.maxZoom,
        this.visibility);
  }

  public StyleLayerInfo withSourceId(String replacement) {
    return new StyleLayerInfo(
        this.id,
        this.type,
        replacement,
        this.sourceLayer,
        this.minZoom,
        this.maxZoom,
        this.visibility);
  }

  public StyleLayerInfo withSourceLayer(String replacement) {
    return new StyleLayerInfo(
        this.id,
        this.type,
        this.sourceId,
        replacement,
        this.minZoom,
        this.maxZoom,
        this.visibility);
  }

  public StyleLayerInfo withMinZoom(double replacement) {
    return new StyleLayerInfo(
        this.id,
        this.type,
        this.sourceId,
        this.sourceLayer,
        replacement,
        this.maxZoom,
        this.visibility);
  }

  public StyleLayerInfo withMaxZoom(double replacement) {
    return new StyleLayerInfo(
        this.id,
        this.type,
        this.sourceId,
        this.sourceLayer,
        this.minZoom,
        replacement,
        this.visibility);
  }

  public StyleLayerInfo withVisibility(StyleLayerVisibility replacement) {
    return new StyleLayerInfo(
        this.id,
        this.type,
        this.sourceId,
        this.sourceLayer,
        this.minZoom,
        this.maxZoom,
        replacement);
  }
}
