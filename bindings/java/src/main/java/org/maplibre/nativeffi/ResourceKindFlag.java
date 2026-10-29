// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * The resource kinds that a route or rule matches, one bit per {@code mln_resource_kind} value.
 * Registration rejects unknown bits. {@code MLN_RESOURCE_KIND_FLAG_ALL}, like zero, selects every
 * resource kind.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_kind_flag</a>
 */
public record ResourceKindFlag(int rawValue) {
  public static final ResourceKindFlag UNKNOWN = new ResourceKindFlag(1);
  public static final ResourceKindFlag STYLE = new ResourceKindFlag(2);
  public static final ResourceKindFlag SOURCE = new ResourceKindFlag(4);
  public static final ResourceKindFlag TILE = new ResourceKindFlag(8);
  public static final ResourceKindFlag GLYPHS = new ResourceKindFlag(16);
  public static final ResourceKindFlag SPRITE_IMAGE = new ResourceKindFlag(32);
  public static final ResourceKindFlag SPRITE_JSON = new ResourceKindFlag(64);
  public static final ResourceKindFlag IMAGE = new ResourceKindFlag(128);
  public static final ResourceKindFlag ALL = new ResourceKindFlag(255);

  public ResourceKindFlag or(ResourceKindFlag other) {
    return new ResourceKindFlag(rawValue | other.rawValue);
  }

  public boolean contains(ResourceKindFlag other) {
    return (rawValue & other.rawValue) == other.rawValue;
  }
}
