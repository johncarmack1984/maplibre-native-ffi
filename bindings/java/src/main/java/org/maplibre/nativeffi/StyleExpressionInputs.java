// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * What one evaluation reads.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style__expression_8h.html">mln_style_expression_inputs</a>
 */
public record StyleExpressionInputs(
    Double zoom,
    Double colorRampParameter,
    Double elevation,
    String feature,
    String featureState,
    String globalState,
    CanonicalTileId canonicalTileId,
    java.util.List<String> availableImages) {
  public StyleExpressionInputs {
    availableImages = java.util.List.copyOf(availableImages);
  }

  public StyleExpressionInputs() {
    this(null, null, null, "", "", "", null, java.util.List.of());
  }

  public StyleExpressionInputs withZoom(Double replacement) {
    return new StyleExpressionInputs(
        replacement,
        this.colorRampParameter,
        this.elevation,
        this.feature,
        this.featureState,
        this.globalState,
        this.canonicalTileId,
        this.availableImages);
  }

  public StyleExpressionInputs withColorRampParameter(Double replacement) {
    return new StyleExpressionInputs(
        this.zoom,
        replacement,
        this.elevation,
        this.feature,
        this.featureState,
        this.globalState,
        this.canonicalTileId,
        this.availableImages);
  }

  public StyleExpressionInputs withElevation(Double replacement) {
    return new StyleExpressionInputs(
        this.zoom,
        this.colorRampParameter,
        replacement,
        this.feature,
        this.featureState,
        this.globalState,
        this.canonicalTileId,
        this.availableImages);
  }

  public StyleExpressionInputs withFeature(String replacement) {
    return new StyleExpressionInputs(
        this.zoom,
        this.colorRampParameter,
        this.elevation,
        replacement,
        this.featureState,
        this.globalState,
        this.canonicalTileId,
        this.availableImages);
  }

  public StyleExpressionInputs withFeatureState(String replacement) {
    return new StyleExpressionInputs(
        this.zoom,
        this.colorRampParameter,
        this.elevation,
        this.feature,
        replacement,
        this.globalState,
        this.canonicalTileId,
        this.availableImages);
  }

  public StyleExpressionInputs withGlobalState(String replacement) {
    return new StyleExpressionInputs(
        this.zoom,
        this.colorRampParameter,
        this.elevation,
        this.feature,
        this.featureState,
        replacement,
        this.canonicalTileId,
        this.availableImages);
  }

  public StyleExpressionInputs withCanonicalTileId(CanonicalTileId replacement) {
    return new StyleExpressionInputs(
        this.zoom,
        this.colorRampParameter,
        this.elevation,
        this.feature,
        this.featureState,
        this.globalState,
        replacement,
        this.availableImages);
  }

  public StyleExpressionInputs withAvailableImages(java.util.List<String> replacement) {
    return new StyleExpressionInputs(
        this.zoom,
        this.colorRampParameter,
        this.elevation,
        this.feature,
        this.featureState,
        this.globalState,
        this.canonicalTileId,
        replacement);
  }
}
