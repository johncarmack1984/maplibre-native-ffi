// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi.internal.c;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Receives one terminal result for an accepted asynchronous submission.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/completion_8h.html">mln_completion_callback</a>
 */
@FunctionalInterface
public interface CompletionCallback {
  void invoke(MemorySegment user_data, MemorySegment result);

  FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ADDRESS, ADDRESS);

  /**
   * Creates a stub valid until the shared arena closes. Keep it alive until native releases the
   * registration. Callback exceptions are sent to the current thread's uncaught exception handler.
   */
  default MemorySegment stub(Arena arena) {
    return Ffm.upcall(this, CompletionCallback.class, DESCRIPTOR, arena);
  }

  default void invokeSafely(MemorySegment user_data, MemorySegment result) {
    try {
      invoke(user_data, result);
    } catch (Throwable failure) {
      Ffm.callbackFailure(failure);
      return;
    }
  }
}
