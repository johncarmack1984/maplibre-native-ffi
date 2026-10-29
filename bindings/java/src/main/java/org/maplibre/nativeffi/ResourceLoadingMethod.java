// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_loading_method</a>
 */
public record ResourceLoadingMethod(int rawValue) {
  public static final ResourceLoadingMethod ALL = new ResourceLoadingMethod(0);
  public static final ResourceLoadingMethod CACHE_ONLY = new ResourceLoadingMethod(1);
  public static final ResourceLoadingMethod NETWORK_ONLY = new ResourceLoadingMethod(2);
}
