// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * HTTP header transform state: a callback, or native header rules.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_http_header_transform</a>
 */
public final class HttpHeaderTransform {
  private final NativeRegistration nativeRegistration;
  private final HttpHeaderTransformCallback callback;
  private final java.util.List<HttpHeaderRule> rules;

  public HttpHeaderTransform(
      HttpHeaderTransformCallback callback, java.util.List<HttpHeaderRule> rules) {
    this(callback, rules, null);
  }

  HttpHeaderTransform(
      HttpHeaderTransformCallback callback,
      java.util.List<HttpHeaderRule> rules,
      NativeRegistration nativeRegistration) {
    this.nativeRegistration = nativeRegistration;
    this.callback = callback;
    this.rules = java.util.List.copyOf(rules);
  }

  public HttpHeaderTransformCallback callback() {
    return callback;
  }

  public java.util.List<HttpHeaderRule> rules() {
    return rules;
  }

  public HttpHeaderTransform() {
    this(null, java.util.List.of());
  }

  NativeRegistration nativeRegistration() {
    return nativeRegistration;
  }

  public static HttpHeaderTransform nativeRegistration(
      NativePointer callback,
      NativePointer userData,
      NativePointer releaseUserData,
      java.util.List<HttpHeaderRule> rules) {
    return new HttpHeaderTransform(
        null,
        rules,
        new NativeRegistration(new NativePointer[] {callback}, userData, releaseUserData));
  }

  public HttpHeaderTransform withCallback(HttpHeaderTransformCallback replacement) {
    return new HttpHeaderTransform(replacement, this.rules, null);
  }

  public HttpHeaderTransform withRules(java.util.List<HttpHeaderRule> replacement) {
    return new HttpHeaderTransform(this.callback, replacement, nativeRegistration);
  }
}
