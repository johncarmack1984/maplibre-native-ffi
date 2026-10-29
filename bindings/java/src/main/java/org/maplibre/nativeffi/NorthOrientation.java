// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Map north orientation values used by {@code mln_map_viewport_options}.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_north_orientation</a>
 */
public record NorthOrientation(int rawValue) {
  public static final NorthOrientation UP = new NorthOrientation(0);
  public static final NorthOrientation RIGHT = new NorthOrientation(1);
  public static final NorthOrientation DOWN = new NorthOrientation(2);
  public static final NorthOrientation LEFT = new NorthOrientation(3);
}
