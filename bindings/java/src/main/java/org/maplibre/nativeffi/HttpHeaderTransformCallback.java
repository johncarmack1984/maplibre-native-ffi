// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Adds end-to-end headers to one outgoing HTTP request attempt.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_http_header_transform_callback</a>
 */
@FunctionalInterface
public interface HttpHeaderTransformCallback {
  void invoke(ResourceKind kind, String url, HttpHeaderTransformResponse outResponse);
}
