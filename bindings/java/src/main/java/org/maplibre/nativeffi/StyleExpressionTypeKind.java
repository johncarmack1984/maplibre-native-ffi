// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Style expression types that a parsed expression may be required to have.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style__expression_8h.html">mln_style_expression_type_kind</a>
 */
public record StyleExpressionTypeKind(int rawValue) {
  public static final StyleExpressionTypeKind VALUE = new StyleExpressionTypeKind(0);
  public static final StyleExpressionTypeKind NUMBER = new StyleExpressionTypeKind(1);
  public static final StyleExpressionTypeKind STRING = new StyleExpressionTypeKind(2);
  public static final StyleExpressionTypeKind BOOLEAN = new StyleExpressionTypeKind(3);
  public static final StyleExpressionTypeKind COLOR = new StyleExpressionTypeKind(4);
  public static final StyleExpressionTypeKind OBJECT = new StyleExpressionTypeKind(5);
  public static final StyleExpressionTypeKind FORMATTED = new StyleExpressionTypeKind(6);
  public static final StyleExpressionTypeKind IMAGE = new StyleExpressionTypeKind(7);
  public static final StyleExpressionTypeKind PADDING = new StyleExpressionTypeKind(8);
  public static final StyleExpressionTypeKind VARIABLE_ANCHOR_OFFSET_COLLECTION =
      new StyleExpressionTypeKind(9);
  public static final StyleExpressionTypeKind ARRAY = new StyleExpressionTypeKind(10);
}
