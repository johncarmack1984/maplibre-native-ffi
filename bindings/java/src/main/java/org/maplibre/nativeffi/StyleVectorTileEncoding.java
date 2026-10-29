// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Vector tile encoding values.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_style_vector_tile_encoding</a>
 */
public record StyleVectorTileEncoding(int rawValue) {
  public static final StyleVectorTileEncoding MVT = new StyleVectorTileEncoding(0);
  public static final StyleVectorTileEncoding MLT = new StyleVectorTileEncoding(1);
}
