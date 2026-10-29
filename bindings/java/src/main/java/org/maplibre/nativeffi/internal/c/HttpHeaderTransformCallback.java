// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi.internal.c;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Adds end-to-end headers to one outgoing HTTP request attempt.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_http_header_transform_callback</a>
 */
@FunctionalInterface
public interface HttpHeaderTransformCallback {
  int invoke(MemorySegment user_data, int kind, MemorySegment url, MemorySegment out_response);

  FunctionDescriptor DESCRIPTOR =
      FunctionDescriptor.of(JAVA_INT, ADDRESS, JAVA_INT, Layouts.BufferView, ADDRESS);

  /**
   * Creates a stub valid until the shared arena closes. Keep it alive until native releases the
   * registration. Callback exceptions are sent to the current thread's uncaught exception handler.
   */
  default MemorySegment stub(Arena arena) {
    return Ffm.upcall(this, HttpHeaderTransformCallback.class, DESCRIPTOR, arena);
  }

  default int invokeSafely(
      MemorySegment user_data, int kind, MemorySegment url, MemorySegment out_response) {
    try {
      return invoke(user_data, kind, url, out_response);
    } catch (Throwable failure) {
      Ffm.callbackFailure(failure);
      return C.MLN_STATUS_NATIVE_ERROR;
    }
  }
}
