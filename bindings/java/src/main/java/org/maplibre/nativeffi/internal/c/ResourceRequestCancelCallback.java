// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi.internal.c;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Reports that MapLibre cancelled a C API resource provider request.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_request_cancel_callback</a>
 */
@FunctionalInterface
public interface ResourceRequestCancelCallback {
  void invoke(MemorySegment user_data, long handle);

  FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ADDRESS, JAVA_LONG);

  /**
   * Creates a stub valid until the shared arena closes. Keep it alive until native releases the
   * registration. Callback exceptions are sent to the current thread's uncaught exception handler.
   */
  default MemorySegment stub(Arena arena) {
    return Ffm.upcall(this, ResourceRequestCancelCallback.class, DESCRIPTOR, arena);
  }

  default void invokeSafely(MemorySegment user_data, long handle) {
    try {
      invoke(user_data, handle);
    } catch (Throwable failure) {
      Ffm.callbackFailure(failure);
      return;
    }
  }
}
