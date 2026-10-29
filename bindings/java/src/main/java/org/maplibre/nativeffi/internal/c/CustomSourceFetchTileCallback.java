// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi.internal.c;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Requests one tile of a custom geometry or custom vector source.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_custom_source_fetch_tile_callback</a>
 */
@FunctionalInterface
public interface CustomSourceFetchTileCallback {
  void invoke(MemorySegment user_data, MemorySegment tile_id);

  FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ADDRESS, Layouts.CanonicalTileId);

  /**
   * Creates a stub valid until the shared arena closes. Keep it alive until native releases the
   * registration. Callback exceptions are sent to the current thread's uncaught exception handler.
   */
  default MemorySegment stub(Arena arena) {
    return Ffm.upcall(this, CustomSourceFetchTileCallback.class, DESCRIPTOR, arena);
  }

  default void invokeSafely(MemorySegment user_data, MemorySegment tile_id) {
    try {
      invoke(user_data, tile_id);
    } catch (Throwable failure) {
      Ffm.callbackFailure(failure);
      return;
    }
  }
}
