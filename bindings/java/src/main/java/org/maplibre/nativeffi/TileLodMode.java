// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Tile LOD algorithms used by {@code mln_map_tile_options}.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_tile_lod_mode</a>
 */
public record TileLodMode(int rawValue) {
  public static final TileLodMode DEFAULT = new TileLodMode(0);
  public static final TileLodMode DISTANCE = new TileLodMode(1);
}
