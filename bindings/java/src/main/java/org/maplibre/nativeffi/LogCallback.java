// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Receives a MapLibre Native log record.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/logging_8h.html">mln_log_callback</a>
 */
@FunctionalInterface
public interface LogCallback {
  boolean invoke(LogSeverity severity, LogEvent event, long code, String message);
}
