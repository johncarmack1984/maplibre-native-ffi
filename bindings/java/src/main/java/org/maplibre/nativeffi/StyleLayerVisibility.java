// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Layer visibility values used by the visibility setter and layer info.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_style_layer_visibility</a>
 */
public record StyleLayerVisibility(int rawValue) {
  public static final StyleLayerVisibility VISIBLE = new StyleLayerVisibility(0);
  public static final StyleLayerVisibility NONE = new StyleLayerVisibility(1);
}
