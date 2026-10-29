// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Asks the host for the URL of one network resource request.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_transform_callback</a>
 */
@FunctionalInterface
public interface ResourceTransformCallback {
  void invoke(ResourceKind kind, String url, ResourceTransformRequestHandle request);
}
