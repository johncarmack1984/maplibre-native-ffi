// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi.internal.c;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Receives selected events after their snapshots have been published.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_event_callback</a>
 */
@FunctionalInterface
public interface RuntimeEventCallback {
  void invoke(MemorySegment user_data, MemorySegment events);

  FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ADDRESS, ADDRESS);

  /**
   * Creates a stub valid until the shared arena closes. Keep it alive until native releases the
   * registration. Callback exceptions are sent to the current thread's uncaught exception handler.
   */
  default MemorySegment stub(Arena arena) {
    return Ffm.upcall(this, RuntimeEventCallback.class, DESCRIPTOR, arena);
  }

  default void invokeSafely(MemorySegment user_data, MemorySegment events) {
    try {
      invoke(user_data, events);
    } catch (Throwable failure) {
      Ffm.callbackFailure(failure);
      return;
    }
  }
}
