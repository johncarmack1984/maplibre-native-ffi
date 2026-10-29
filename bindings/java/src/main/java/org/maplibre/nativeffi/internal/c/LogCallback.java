// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi.internal.c;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Receives a MapLibre Native log record.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/logging_8h.html">mln_log_callback</a>
 */
@FunctionalInterface
public interface LogCallback {
  boolean invoke(
      MemorySegment user_data, int severity, int event, long code, MemorySegment message);

  FunctionDescriptor DESCRIPTOR =
      FunctionDescriptor.of(
          JAVA_BOOLEAN, ADDRESS, JAVA_INT, JAVA_INT, JAVA_LONG, Layouts.BufferView);

  /**
   * Creates a stub valid until the shared arena closes. Keep it alive until native releases the
   * registration. Callback exceptions are sent to the current thread's uncaught exception handler.
   */
  default MemorySegment stub(Arena arena) {
    return Ffm.upcall(this, LogCallback.class, DESCRIPTOR, arena);
  }

  default boolean invokeSafely(
      MemorySegment user_data, int severity, int event, long code, MemorySegment message) {
    try {
      return invoke(user_data, severity, event, code, message);
    } catch (Throwable failure) {
      Ffm.callbackFailure(failure);
      return false;
    }
  }
}
