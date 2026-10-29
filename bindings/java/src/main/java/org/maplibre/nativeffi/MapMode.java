// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Map rendering modes used when creating a map.
 *
 * @see <a href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_mode</a>
 */
public record MapMode(int rawValue) {
  public static final MapMode CONTINUOUS = new MapMode(0);
  public static final MapMode STATIC = new MapMode(1);
  public static final MapMode TILE = new MapMode(2);
}
