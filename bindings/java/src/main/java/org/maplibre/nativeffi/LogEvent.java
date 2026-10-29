// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Log event categories emitted by MapLibre Native.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/logging_8h.html">mln_log_event</a>
 */
public record LogEvent(int rawValue) {
  public static final LogEvent GENERAL = new LogEvent(0);
  public static final LogEvent SETUP = new LogEvent(1);
  public static final LogEvent SHADER = new LogEvent(2);
  public static final LogEvent PARSE_STYLE = new LogEvent(3);
  public static final LogEvent PARSE_TILE = new LogEvent(4);
  public static final LogEvent RENDER = new LogEvent(5);
  public static final LogEvent STYLE = new LogEvent(6);
  public static final LogEvent DATABASE = new LogEvent(7);
  public static final LogEvent HTTP_REQUEST = new LogEvent(8);
  public static final LogEvent SPRITE = new LogEvent(9);
  public static final LogEvent IMAGE = new LogEvent(10);
  public static final LogEvent GRAPHICS_BACKEND = new LogEvent(11);
  public static final LogEvent JNI = new LogEvent(12);
  public static final LogEvent ANDROID = new LogEvent(13);
  public static final LogEvent CRASH = new LogEvent(14);
  public static final LogEvent GLYPH = new LogEvent(15);
  public static final LogEvent TIMING = new LogEvent(16);
}
