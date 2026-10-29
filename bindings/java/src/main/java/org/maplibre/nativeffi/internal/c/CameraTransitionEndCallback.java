// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi.internal.c;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Receives the end of one camera command&#x27;s transitions.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_camera_transition_end_callback</a>
 */
@FunctionalInterface
public interface CameraTransitionEndCallback {
  void invoke(MemorySegment user_data, MemorySegment end);

  FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ADDRESS, ADDRESS);

  /**
   * Creates a stub valid until the shared arena closes. Keep it alive until native releases the
   * registration. Callback exceptions are sent to the current thread's uncaught exception handler.
   */
  default MemorySegment stub(Arena arena) {
    return Ffm.upcall(this, CameraTransitionEndCallback.class, DESCRIPTOR, arena);
  }

  default void invokeSafely(MemorySegment user_data, MemorySegment end) {
    try {
      invoke(user_data, end);
    } catch (Throwable failure) {
      Ffm.callbackFailure(failure);
      return;
    }
  }
}
