// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import org.maplibre.nativeffi.internal.c.C;

/**
 * A GPU device that native code creates for texture render targets.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/base_8h.html">mln_graphics_device</a>
 */
public final class GraphicsDeviceHandle extends Owner implements AutoCloseable {
  GraphicsDeviceHandle(long id, Object parent) {
    super("GraphicsDeviceHandle", id, parent, GraphicsDeviceHandle::disposeNative);
  }

  static GraphicsDeviceHandle adopt(long id, Object parent) {
    try {
      return new GraphicsDeviceHandle(id, parent);
    } catch (Throwable failure) {
      try {
        disposeNative(id);
      } catch (Throwable cleanup) {
        failure.addSuppressed(cleanup);
      }
      throw failure;
    }
  }

  private static void disposeNative(long id) {
    try (var call = new Call(null, 0)) {
      C.mln_graphics_device_release(id);
    }
  }

  /**
   * Releases a graphics device.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/graphics__device_8h.html">mln_graphics_device_release</a>
   */
  public void close() {
    if (isClosed()) return;
    try (var call = new Call(this, 2, false)) {
      C.mln_graphics_device_release(id());
      call.accept(this);
    }
  }

  /**
   * Creates a graphics device for this build&#x27;s render backend.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/graphics__device_8h.html">mln_graphics_device_create</a>
   */
  public static GraphicsDeviceHandle create(GraphicsDeviceOptions options) {
    try (var call = new Call(null, 0, false)) {
      var out0 = call.arena.allocate(JAVA_LONG);
      call.check(
          C.mln_graphics_device_create(
              (options == null
                  ? MemorySegment.NULL
                  : Codecs.writeGraphicsDeviceOptions(call, options)),
              out0,
              call.diagnostic.segment()));
      var adopted = GraphicsDeviceHandle.adopt(out0.get(JAVA_LONG, 0), null);
      call.accept(adopted);
      return adopted;
    }
  }
}
