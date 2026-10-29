// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Tile operations reported by tile observer events.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_tile_operation</a>
 */
public record TileOperation(int rawValue) {
  public static final TileOperation REQUESTED_FROM_CACHE = new TileOperation(0);
  public static final TileOperation REQUESTED_FROM_NETWORK = new TileOperation(1);
  public static final TileOperation LOAD_FROM_NETWORK = new TileOperation(2);
  public static final TileOperation LOAD_FROM_CACHE = new TileOperation(3);
  public static final TileOperation START_PARSE = new TileOperation(4);
  public static final TileOperation END_PARSE = new TileOperation(5);
  public static final TileOperation ERROR = new TileOperation(6);
  public static final TileOperation CANCELLED = new TileOperation(7);
  public static final TileOperation NULL = new TileOperation(8);
}
