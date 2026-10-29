// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import org.maplibre.nativeffi.internal.c.C;

/**
 * A resource URL transform that waits for its host&#x27;s answer.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/base_8h.html">mln_resource_transform_request</a>
 */
public final class ResourceTransformRequestHandle extends Owner implements AutoCloseable {
  ResourceTransformRequestHandle(long id, Object parent) {
    super(
        "ResourceTransformRequestHandle",
        id,
        parent,
        ResourceTransformRequestHandle::disposeNative);
  }

  static ResourceTransformRequestHandle adopt(long id, Object parent) {
    try {
      return new ResourceTransformRequestHandle(id, parent);
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
      C.mln_resource_transform_request_release(id);
    }
  }

  /**
   * Answers a resource transform request with a replacement URL and consumes its handle.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_transform_request_complete</a>
   */
  public void complete(String url) {
    try (var call = new Call(this, 2, false)) {
      call.check(
          C.mln_resource_transform_request_complete(
              id(), call.view(call.text(url)), call.diagnostic.segment()));
      call.accept(this);
    }
  }

  /**
   * Releases a resource transform request without answering it.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_transform_request_release</a>
   */
  public void close() {
    if (isClosed()) return;
    try (var call = new Call(this, 2, false)) {
      C.mln_resource_transform_request_release(id());
      call.accept(this);
    }
  }
}
