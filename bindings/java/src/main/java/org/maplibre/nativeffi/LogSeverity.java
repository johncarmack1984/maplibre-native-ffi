// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Log severity values emitted by MapLibre Native.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/logging_8h.html">mln_log_severity</a>
 */
public record LogSeverity(int rawValue) {
  public static final LogSeverity INFO = new LogSeverity(1);
  public static final LogSeverity WARNING = new LogSeverity(2);
  public static final LogSeverity ERROR = new LogSeverity(3);
}
