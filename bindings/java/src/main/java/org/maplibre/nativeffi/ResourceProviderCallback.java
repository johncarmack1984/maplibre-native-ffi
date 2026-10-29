// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Intercepts a network resource request.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_provider_callback</a>
 */
@FunctionalInterface
public interface ResourceProviderCallback {
  void invoke(ResourceRequestInfo request, ResourceRequestHandle handle);
}
