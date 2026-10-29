// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_error_reason</a>
 */
public record ResourceErrorReason(int rawValue) {
  public static final ResourceErrorReason NONE = new ResourceErrorReason(0);
  public static final ResourceErrorReason NOT_FOUND = new ResourceErrorReason(1);
  public static final ResourceErrorReason SERVER = new ResourceErrorReason(2);
  public static final ResourceErrorReason CONNECTION = new ResourceErrorReason(3);
  public static final ResourceErrorReason RATE_LIMIT = new ResourceErrorReason(4);
  public static final ResourceErrorReason OTHER = new ResourceErrorReason(5);
}
