// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Bitmask values for log severities dispatched asynchronously.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/logging_8h.html">mln_log_severity_flag</a>
 */
public record LogSeverityFlag(int rawValue) {
  public static final LogSeverityFlag INFO = new LogSeverityFlag(2);
  public static final LogSeverityFlag WARNING = new LogSeverityFlag(4);
  public static final LogSeverityFlag ERROR = new LogSeverityFlag(8);
  public static final LogSeverityFlag DEFAULT = new LogSeverityFlag(6);
  public static final LogSeverityFlag ALL = new LogSeverityFlag(14);

  public LogSeverityFlag or(LogSeverityFlag other) {
    return new LogSeverityFlag(rawValue | other.rawValue);
  }

  public boolean contains(LogSeverityFlag other) {
    return (rawValue & other.rawValue) == other.rawValue;
  }
}
