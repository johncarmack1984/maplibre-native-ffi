// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_priority</a>
 */
public record ResourcePriority(int rawValue) {
  public static final ResourcePriority REGULAR = new ResourcePriority(0);
  public static final ResourcePriority LOW = new ResourcePriority(1);
}
