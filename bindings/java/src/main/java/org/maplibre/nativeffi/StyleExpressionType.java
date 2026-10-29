// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * A style expression type.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style__expression_8h.html">mln_style_expression_type</a>
 */
public record StyleExpressionType(
    StyleExpressionTypeKind kind, StyleExpressionTypeKind itemKind, int itemCount) {
  public StyleExpressionType() {
    this(new StyleExpressionTypeKind(0), new StyleExpressionTypeKind(0), 0);
  }

  public StyleExpressionType withKind(StyleExpressionTypeKind replacement) {
    return new StyleExpressionType(replacement, this.itemKind, this.itemCount);
  }

  public StyleExpressionType withItemKind(StyleExpressionTypeKind replacement) {
    return new StyleExpressionType(this.kind, replacement, this.itemCount);
  }

  public StyleExpressionType withItemCount(int replacement) {
    return new StyleExpressionType(this.kind, this.itemKind, replacement);
  }
}
