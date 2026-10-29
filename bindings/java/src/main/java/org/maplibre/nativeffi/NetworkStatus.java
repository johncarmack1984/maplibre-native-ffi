// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_network_status</a>
 */
public record NetworkStatus(int rawValue) {
  public static final NetworkStatus ONLINE = new NetworkStatus(1);
  public static final NetworkStatus OFFLINE = new NetworkStatus(2);
}
