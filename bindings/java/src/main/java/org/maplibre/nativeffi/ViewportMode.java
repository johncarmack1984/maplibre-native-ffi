// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Viewport orientation modes used by {@code mln_map_viewport_options}.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_viewport_mode</a>
 */
public record ViewportMode(int rawValue) {
  public static final ViewportMode DEFAULT = new ViewportMode(0);
  public static final ViewportMode FLIPPED_Y = new ViewportMode(1);
}
