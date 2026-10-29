// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Tile URL coordinate scheme values.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_style_tile_scheme</a>
 */
public record StyleTileScheme(int rawValue) {
  public static final StyleTileScheme XYZ = new StyleTileScheme(0);
  public static final StyleTileScheme TMS = new StyleTileScheme(1);
}
