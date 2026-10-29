// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_usage</a>
 */
public record ResourceUsage(int rawValue) {
  public static final ResourceUsage ONLINE = new ResourceUsage(0);
  public static final ResourceUsage OFFLINE = new ResourceUsage(1);
}
