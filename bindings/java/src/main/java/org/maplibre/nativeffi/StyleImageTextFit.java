// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * How a stretchable image fits text along one axis.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_style_image_text_fit</a>
 */
public record StyleImageTextFit(int rawValue) {
  public static final StyleImageTextFit STRETCH_OR_SHRINK = new StyleImageTextFit(0);
  public static final StyleImageTextFit STRETCH_ONLY = new StyleImageTextFit(1);
  public static final StyleImageTextFit PROPORTIONAL = new StyleImageTextFit(2);
}
