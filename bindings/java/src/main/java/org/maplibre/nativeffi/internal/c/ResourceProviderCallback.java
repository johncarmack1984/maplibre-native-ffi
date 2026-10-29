// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi.internal.c;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Intercepts a network resource request.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_provider_callback</a>
 */
@FunctionalInterface
public interface ResourceProviderCallback {
  void invoke(MemorySegment user_data, MemorySegment request, long handle);

  FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ADDRESS, ADDRESS, JAVA_LONG);

  /**
   * Creates a stub valid until the shared arena closes. Keep it alive until native releases the
   * registration. Callback exceptions are sent to the current thread's uncaught exception handler.
   */
  default MemorySegment stub(Arena arena) {
    return Ffm.upcall(this, ResourceProviderCallback.class, DESCRIPTOR, arena);
  }

  default void invokeSafely(MemorySegment user_data, MemorySegment request, long handle) {
    try {
      invoke(user_data, request, handle);
    } catch (Throwable failure) {
      Ffm.callbackFailure(failure);
      return;
    }
  }
}
