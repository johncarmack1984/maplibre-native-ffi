// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_kind</a>
 */
public record ResourceKind(int rawValue) {
  public static final ResourceKind UNKNOWN = new ResourceKind(0);
  public static final ResourceKind STYLE = new ResourceKind(1);
  public static final ResourceKind SOURCE = new ResourceKind(2);
  public static final ResourceKind TILE = new ResourceKind(3);
  public static final ResourceKind GLYPHS = new ResourceKind(4);
  public static final ResourceKind SPRITE_IMAGE = new ResourceKind(5);
  public static final ResourceKind SPRITE_JSON = new ResourceKind(6);
  public static final ResourceKind IMAGE = new ResourceKind(7);
}
