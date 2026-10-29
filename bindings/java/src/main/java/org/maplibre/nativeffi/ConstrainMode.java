// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Map constraint modes used by {@code mln_map_viewport_options}.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_constrain_mode</a>
 */
public record ConstrainMode(int rawValue) {
  public static final ConstrainMode NONE = new ConstrainMode(0);
  public static final ConstrainMode HEIGHT_ONLY = new ConstrainMode(1);
  public static final ConstrainMode WIDTH_AND_HEIGHT = new ConstrainMode(2);
  public static final ConstrainMode SCREEN = new ConstrainMode(3);
}
