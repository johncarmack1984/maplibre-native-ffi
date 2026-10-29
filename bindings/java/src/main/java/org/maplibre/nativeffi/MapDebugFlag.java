// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Debug overlay mask values for {@code mln_map_set_debug_options()}.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_debug_flag</a>
 */
public record MapDebugFlag(int rawValue) {
  public static final MapDebugFlag TILE_BORDERS = new MapDebugFlag(2);
  public static final MapDebugFlag PARSE_STATUS = new MapDebugFlag(4);
  public static final MapDebugFlag TIMESTAMPS = new MapDebugFlag(8);
  public static final MapDebugFlag COLLISION = new MapDebugFlag(16);
  public static final MapDebugFlag OVERDRAW = new MapDebugFlag(32);
  public static final MapDebugFlag STENCIL_CLIP = new MapDebugFlag(64);
  public static final MapDebugFlag DEPTH_BUFFER = new MapDebugFlag(128);

  public MapDebugFlag or(MapDebugFlag other) {
    return new MapDebugFlag(rawValue | other.rawValue);
  }

  public boolean contains(MapDebugFlag other) {
    return (rawValue & other.rawValue) == other.rawValue;
  }
}
