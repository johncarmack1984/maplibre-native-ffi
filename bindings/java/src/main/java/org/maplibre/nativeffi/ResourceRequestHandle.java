// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import org.maplibre.nativeffi.internal.c.C;

/**
 * A resource request that a resource provider handles.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/base_8h.html">mln_resource_request</a>
 */
public final class ResourceRequestHandle extends Owner implements AutoCloseable {
  ResourceRequestHandle(long id, Object parent) {
    super("ResourceRequestHandle", id, parent, ResourceRequestHandle::disposeNative);
  }

  static ResourceRequestHandle adopt(long id, Object parent) {
    try {
      return new ResourceRequestHandle(id, parent);
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
      C.mln_resource_request_release(id);
    }
  }

  /**
   * Completes a C API resource provider request and consumes its handle.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_request_complete</a>
   */
  public void complete(ResourceResponse response) {
    try (var call = new Call(this, 2, false)) {
      call.check(
          C.mln_resource_request_complete(
              id(), Codecs.writeResourceResponse(call, response), call.diagnostic.segment()));
      call.accept(this);
    }
  }

  /**
   * Reports whether MapLibre has cancelled a C API resource provider request.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_request_is_cancelled</a>
   */
  public boolean isCancelled() {
    try (var call = new Call(this, 1, false)) {
      var out0 = call.arena.allocate(JAVA_BOOLEAN);
      call.check(C.mln_resource_request_is_cancelled(id(), out0, call.diagnostic.segment()));
      call.accept(this);
      return out0.get(JAVA_BOOLEAN, 0);
    }
  }

  /**
   * Hands an outstanding provider request to the built-in network loader and consumes its handle.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_request_pass_through</a>
   */
  public void passThrough() {
    try (var call = new Call(this, 2, false)) {
      call.check(C.mln_resource_request_pass_through(id(), call.diagnostic.segment()));
      call.accept(this);
    }
  }

  /**
   * Releases the provider&#x27;s resource request handle without answering it.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_request_release</a>
   */
  public void close() {
    if (isClosed()) return;
    try (var call = new Call(this, 2, false)) {
      C.mln_resource_request_release(id());
      call.accept(this);
    }
  }

  /**
   * Registers a callback that runs when MapLibre cancels a C API resource provider request.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_request_set_cancel_callback</a>
   */
  public boolean setCancelCallback(ResourceRequestCancelHandler handler) {
    try (var call = new Call(this, 1, false)) {
      var out0 = call.arena.allocate(JAVA_BOOLEAN);
      call.check(
          C.mln_resource_request_set_cancel_callback(
              id(),
              Codecs.writeResourceRequestCancelHandler(call, handler),
              out0,
              call.diagnostic.segment()));
      if (!out0.get(JAVA_BOOLEAN, 0)) call.accept(this);
      return out0.get(JAVA_BOOLEAN, 0);
    }
  }
}
