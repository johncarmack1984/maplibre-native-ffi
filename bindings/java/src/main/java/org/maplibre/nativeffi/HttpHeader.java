// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * One HTTP header that a header rule supplies.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_http_header</a>
 */
public record HttpHeader(String name, String value) {
  public HttpHeader(String name) {
    this(name, "");
  }

  public HttpHeader withName(String replacement) {
    return new HttpHeader(replacement, this.value);
  }

  public HttpHeader withValue(String replacement) {
    return new HttpHeader(this.name, replacement);
  }
}
