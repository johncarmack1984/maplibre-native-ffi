// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * What a parsed expression depends on.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style__expression_8h.html">mln_style_expression_info</a>
 */
public record StyleExpressionInfo(boolean isFeatureConstant, boolean isZoomConstant) {
  public StyleExpressionInfo() {
    this(false, false);
  }

  public StyleExpressionInfo withIsFeatureConstant(boolean replacement) {
    return new StyleExpressionInfo(replacement, this.isZoomConstant);
  }

  public StyleExpressionInfo withIsZoomConstant(boolean replacement) {
    return new StyleExpressionInfo(this.isFeatureConstant, replacement);
  }
}
