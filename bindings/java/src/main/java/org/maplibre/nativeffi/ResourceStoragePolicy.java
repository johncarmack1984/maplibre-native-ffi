// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_storage_policy</a>
 */
public record ResourceStoragePolicy(int rawValue) {
  public static final ResourceStoragePolicy PERMANENT = new ResourceStoragePolicy(0);
  public static final ResourceStoragePolicy VOLATILE = new ResourceStoragePolicy(1);
}
