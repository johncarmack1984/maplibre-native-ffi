// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import org.maplibre.nativeffi.internal.c.C;

/**
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_http_header_transform_response</a>
 */
public final class HttpHeaderTransformResponse {
  final java.lang.foreign.MemorySegment address;
  final Scope scope;

  HttpHeaderTransformResponse(java.lang.foreign.MemorySegment address, Scope scope) {
    this.address = address;
    this.scope = scope;
  }

  /**
   * Sets one outgoing HTTP request header for the current transform invocation.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_http_header_transform_response_set_header</a>
   */
  public void setHeader(String name, String value$) {
    scope.check();
    try (var call = new Call(null, 0, false)) {
      call.check(
          C.mln_http_header_transform_response_set_header(
              address,
              call.view(call.text(name)),
              call.view(call.text(value$)),
              call.diagnostic.segment()));
      call.accept(null);
    }
  }
}
