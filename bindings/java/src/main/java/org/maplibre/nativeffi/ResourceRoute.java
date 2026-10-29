// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * One request pattern that a resource provider claims.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_route</a>
 */
public record ResourceRoute(ResourceKindFlag kinds, UrlMatchFlag flags, String url) {
  public ResourceRoute() {
    this(new ResourceKindFlag(0), new UrlMatchFlag(0), "");
  }

  public ResourceRoute withKinds(ResourceKindFlag replacement) {
    return new ResourceRoute(replacement, this.flags, this.url);
  }

  public ResourceRoute withFlags(UrlMatchFlag replacement) {
    return new ResourceRoute(this.kinds, replacement, this.url);
  }

  public ResourceRoute withUrl(String replacement) {
    return new ResourceRoute(this.kinds, this.flags, replacement);
  }
}
