// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi.internal.c;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Asks the host for the URL of one network resource request.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_transform_callback</a>
 */
@FunctionalInterface
public interface ResourceTransformCallback {
  void invoke(MemorySegment user_data, int kind, MemorySegment url, long request);

  FunctionDescriptor DESCRIPTOR =
      FunctionDescriptor.ofVoid(ADDRESS, JAVA_INT, Layouts.BufferView, JAVA_LONG);

  /**
   * Creates a stub valid until the shared arena closes. Keep it alive until native releases the
   * registration. Callback exceptions are sent to the current thread's uncaught exception handler.
   */
  default MemorySegment stub(Arena arena) {
    return Ffm.upcall(this, ResourceTransformCallback.class, DESCRIPTOR, arena);
  }

  default void invokeSafely(MemorySegment user_data, int kind, MemorySegment url, long request) {
    try {
      invoke(user_data, kind, url, request);
    } catch (Throwable failure) {
      Ffm.callbackFailure(failure);
      return;
    }
  }
}
