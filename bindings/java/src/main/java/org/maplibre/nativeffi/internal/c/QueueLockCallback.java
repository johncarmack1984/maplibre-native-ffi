// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi.internal.c;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Takes or returns the host&#x27;s lock on the queue that a session shares with it. Native code
 * relies on the lock being held or released when the call returns.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__target_8h.html">mln_queue_lock_callback</a>
 */
@FunctionalInterface
public interface QueueLockCallback {
  void invoke(MemorySegment user_data);

  FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ADDRESS);

  /**
   * Creates a stub valid until the shared arena closes. Keep it alive until native releases the
   * registration. Callback exceptions are sent to the current thread's uncaught exception handler.
   */
  default MemorySegment stub(Arena arena) {
    return Ffm.upcall(this, QueueLockCallback.class, DESCRIPTOR, arena);
  }

  default void invokeSafely(MemorySegment user_data) {
    try {
      invoke(user_data);
    } catch (Throwable failure) {
      Ffm.callbackFailure(failure);
      return;
    }
  }
}
