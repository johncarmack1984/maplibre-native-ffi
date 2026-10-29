// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Options for parsing a style expression.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style__expression_8h.html">mln_style_expression_options</a>
 */
public record StyleExpressionOptions(StyleExpressionType expectedType) {
  public StyleExpressionOptions() {
    this(null);
  }

  public StyleExpressionOptions withExpectedType(StyleExpressionType replacement) {
    return new StyleExpressionOptions(replacement);
  }
}
