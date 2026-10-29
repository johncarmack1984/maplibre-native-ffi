// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * How a resource provider answered a request.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_response_status</a>
 */
public record ResourceResponseStatus(int rawValue) {
  public static final ResourceResponseStatus OK = new ResourceResponseStatus(0);
  public static final ResourceResponseStatus ERROR = new ResourceResponseStatus(1);
  public static final ResourceResponseStatus NO_CONTENT = new ResourceResponseStatus(2);
  public static final ResourceResponseStatus NOT_MODIFIED = new ResourceResponseStatus(3);
}
