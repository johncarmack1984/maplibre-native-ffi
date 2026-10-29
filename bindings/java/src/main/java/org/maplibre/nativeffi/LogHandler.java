// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Process-global log callback.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/logging_8h.html">mln_log_handler</a>
 */
public final class LogHandler {
  private final NativeRegistration nativeRegistration;
  private final LogCallback callback;

  public LogHandler(LogCallback callback) {
    this(callback, null);
  }

  LogHandler(LogCallback callback, NativeRegistration nativeRegistration) {
    this.nativeRegistration = nativeRegistration;
    this.callback = callback;
  }

  public LogCallback callback() {
    return callback;
  }

  NativeRegistration nativeRegistration() {
    return nativeRegistration;
  }

  public static LogHandler nativeRegistration(
      NativePointer callback, NativePointer userData, NativePointer releaseUserData) {
    return new LogHandler(
        null, new NativeRegistration(new NativePointer[] {callback}, userData, releaseUserData));
  }

  public LogHandler withCallback(LogCallback replacement) {
    return new LogHandler(replacement, null);
  }
}
