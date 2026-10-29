// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * One rule of a native HTTP header transform.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_http_header_rule</a>
 */
public record HttpHeaderRule(
    ResourceKindFlag kinds, UrlMatchFlag flags, String url, java.util.List<HttpHeader> headers) {
  public HttpHeaderRule {
    headers = java.util.List.copyOf(headers);
  }

  public HttpHeaderRule() {
    this(new ResourceKindFlag(0), new UrlMatchFlag(0), "", java.util.List.of());
  }

  public HttpHeaderRule withKinds(ResourceKindFlag replacement) {
    return new HttpHeaderRule(replacement, this.flags, this.url, this.headers);
  }

  public HttpHeaderRule withFlags(UrlMatchFlag replacement) {
    return new HttpHeaderRule(this.kinds, replacement, this.url, this.headers);
  }

  public HttpHeaderRule withUrl(String replacement) {
    return new HttpHeaderRule(this.kinds, this.flags, replacement, this.headers);
  }

  public HttpHeaderRule withHeaders(java.util.List<HttpHeader> replacement) {
    return new HttpHeaderRule(this.kinds, this.flags, this.url, replacement);
  }
}
