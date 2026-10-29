// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_ambient_cache_operation</a>
 */
public record AmbientCacheOperation(int rawValue) {
  public static final AmbientCacheOperation RESET_DATABASE = new AmbientCacheOperation(1);
  public static final AmbientCacheOperation PACK_DATABASE = new AmbientCacheOperation(2);
  public static final AmbientCacheOperation INVALIDATE = new AmbientCacheOperation(3);
  public static final AmbientCacheOperation CLEAR = new AmbientCacheOperation(4);
}
