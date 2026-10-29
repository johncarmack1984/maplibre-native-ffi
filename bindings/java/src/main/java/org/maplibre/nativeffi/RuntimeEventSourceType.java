// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Source kinds used by {@code mln_runtime_event.source_type}.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_event_source_type</a>
 */
public record RuntimeEventSourceType(int rawValue) {
  public static final RuntimeEventSourceType RUNTIME = new RuntimeEventSourceType(0);
  public static final RuntimeEventSourceType MAP = new RuntimeEventSourceType(1);
}
