// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import java.util.concurrent.CompletableFuture;
import org.maplibre.nativeffi.internal.c.C;

/**
 * A render session, which renders one map to one render target.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/base_8h.html">mln_render_session</a>
 */
public final class RenderSessionHandle extends Owner implements AutoCloseable {
  RenderSessionHandle(long id, Object parent) {
    super("RenderSessionHandle", id, parent, RenderSessionHandle::disposeNative);
    Shutdown.enroll(
        state,
        value -> {
          try (var call = new Call(null, 0)) {
            var out =
                call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.RenderAbandonResult);
            out.asSlice(0)
                .set(
                    JAVA_INT,
                    0,
                    (int) org.maplibre.nativeffi.internal.c.Layouts.RenderAbandonResult.byteSize());
            C.mln_render_session_abandon(value, out, call.diagnostic.segment());
          }
        });
  }

  static RenderSessionHandle adopt(long id, Object parent) {
    try {
      return new RenderSessionHandle(id, parent);
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
      call.check(C.mln_render_session_dispose(id, MemorySegment.NULL, call.diagnostic.segment()));
    }
  }

  /**
   * Irreversibly ends session work and destroys the session&#x27;s graphics objects where that is
   * safe.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_abandon</a>
   */
  public RenderAbandonResult abandon() {
    try (var call = new Call(this, 1, false)) {
      var out0 = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.RenderAbandonResult);
      out0.asSlice(0)
          .set(
              JAVA_INT,
              0,
              (int) org.maplibre.nativeffi.internal.c.Layouts.RenderAbandonResult.byteSize());
      call.check(C.mln_render_session_abandon(id(), out0, call.diagnostic.segment()));
      call.accept(this);
      return Codecs.readRenderAbandonResult(out0, null);
    }
  }

  /**
   * Acquires the oldest rendered frame that is not already acquired. The frame owns its slot until
   * release. The call is nonblocking.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_acquire_frame</a>
   */
  public AcquiredFrameHandle acquireFrame() {
    try (var call = new Call(this, 1, false)) {
      var out0 = call.arena.allocate(JAVA_LONG);
      int status = C.mln_render_session_acquire_frame(id(), out0, call.diagnostic.segment());
      if (status == -9) return null;
      call.check(status);
      var adopted = AcquiredFrameHandle.adopt(out0.get(JAVA_LONG, 0), this);
      call.accept(adopted);
      return adopted;
    }
  }

  /**
   * Ends every frame demand that has not started with {@code MLN_RENDER_RESULT_NO_UPDATE} and
   * completes after earlier driver work has finished. A running demand finishes its attempt and
   * ends any wait for a map update or a free slot. After completion, a new frame demand is required
   * to render again, except that a pending still image submits its next demand itself; see {@code
   * mln_map_request_still_image()}.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_barrier</a>
   */
  public CompletableFuture<Void> barrier() {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_render_session_barrier(id(), completion, diagnostic),
              result -> null);
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts asynchronous renderer-data clearing.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_clear_data</a>
   */
  public CompletableFuture<Void> clearData() {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_render_session_clear_data(id(), completion, diagnostic),
              result -> null);
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts normal graphics-owner teardown and map detachment.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_detach</a>
   */
  public CompletableFuture<Void> detach() {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) -> C.mln_render_session_detach(id(), completion, diagnostic),
              result -> null);
      call.accept(this);
      return ready;
    }
  }

  /**
   * Consumes a session in any state and retires it, then runs completion, if given, once the host
   * may destroy the target&#x27;s graphics objects.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_dispose</a>
   */
  public CompletableFuture<Void> release() {
    try (var call = new Call(this, 2, false)) {
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_render_session_dispose(id(), completion, diagnostic),
              result -> null);
      call.accept(this);
      return ready;
    }
  }

  /**
   * Drains every currently queued terminal frame result.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_drain_frame_results</a>
   */
  public java.util.List<RenderFrameResult> drainFrameResults() {
    try (var call = new Call(this, 1, false)) {
      var out0 = call.arena.allocate(JAVA_LONG);
      var out1 =
          call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.RenderFrameBatchView);
      out1.asSlice(0)
          .set(
              JAVA_INT,
              0,
              (int) org.maplibre.nativeffi.internal.c.Layouts.RenderFrameBatchView.byteSize());
      int status =
          C.mln_render_session_drain_frame_results(id(), out0, out1, call.diagnostic.segment());
      if (status == -9) return java.util.List.of();
      call.check(status);
      call.accept(this);
      try {
        return Codecs.readRenderFrameBatchView(out1, null);
      } finally {
        C.mln_render_frame_batch_release(out0.get(JAVA_LONG, 0));
      }
    }
  }

  /**
   * Starts asynchronous renderer diagnostic-log emission.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_dump_debug_logs</a>
   */
  public CompletableFuture<Void> dumpDebugLogs() {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_render_session_dump_debug_logs(id(), completion, diagnostic),
              result -> null);
      call.accept(this);
      return ready;
    }
  }

  /**
   * Returns the immutable capabilities fixed during attachment.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_get_capabilities</a>
   */
  public RenderSessionCapabilities getCapabilities() {
    try (var call = new Call(this, 1, false)) {
      var out0 =
          call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.RenderSessionCapabilities);
      out0.asSlice(0)
          .set(
              JAVA_INT,
              0,
              (int) org.maplibre.nativeffi.internal.c.Layouts.RenderSessionCapabilities.byteSize());
      call.check(C.mln_render_session_get_capabilities(id(), out0, call.diagnostic.segment()));
      call.accept(this);
      return Codecs.readRenderSessionCapabilities(out0, null);
    }
  }

  /**
   * Copies the latest render-session snapshot from any native thread.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_get_snapshot</a>
   */
  public RenderSessionSnapshot getSnapshot() {
    try (var call = new Call(this, 1, false)) {
      var out0 =
          call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.RenderSessionSnapshot);
      out0.asSlice(0)
          .set(
              JAVA_INT,
              0,
              (int) org.maplibre.nativeffi.internal.c.Layouts.RenderSessionSnapshot.byteSize());
      call.check(C.mln_render_session_get_snapshot(id(), out0, call.diagnostic.segment()));
      call.accept(this);
      return Codecs.readRenderSessionSnapshot(out0, null);
    }
  }

  /**
   * Starts a feature-extension query against the latest driver state.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/query_8h.html">mln_render_session_query_feature_extensions</a>
   */
  public CompletableFuture<String> queryFeatureExtensions(
      String sourceId, String feature, String extension, String extensionField, String arguments) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<String> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_render_session_query_feature_extensions(
                      id(),
                      call.view(call.text(sourceId)),
                      call.view(call.text(feature)),
                      call.view(call.text(extension)),
                      call.view(call.text(extensionField)),
                      call.view(call.text(arguments)),
                      completion,
                      diagnostic),
              result ->
                  Memory.textView(
                      result
                          .value()
                          .reinterpret(
                              org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize())));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts a rendered-feature query against the last frame that the session rendered, so render
   * after a camera or style change for a result that matches it.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/query_8h.html">mln_render_session_query_rendered_features</a>
   */
  public CompletableFuture<java.util.List<RenderedFeature>> queryRenderedFeatures(
      RenderedQueryGeometry geometry, RenderedFeatureQueryOptions options) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<java.util.List<RenderedFeature>> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_render_session_query_rendered_features(
                      id(),
                      Codecs.writeRenderedQueryGeometry(call, geometry),
                      (options == null
                          ? MemorySegment.NULL
                          : Codecs.writeRenderedFeatureQueryOptions(call, options)),
                      completion,
                      diagnostic),
              result ->
                  Memory.array(
                      result.segment().asSlice(48).get(ADDRESS, 0),
                      result.value_count(),
                      Integer.toUnsignedLong(result.value_size()),
                      org.maplibre.nativeffi.internal.c.Layouts.RenderedFeature.byteSize(),
                      item -> Codecs.readRenderedFeature(item, null)));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts a source-feature query against the tiles that the source loaded for rendering, which it
   * loads only while a visible layer uses it.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/query_8h.html">mln_render_session_query_source_features</a>
   */
  public CompletableFuture<java.util.List<SourceFeature>> querySourceFeatures(
      String sourceId, SourceFeatureQueryOptions options) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<java.util.List<SourceFeature>> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_render_session_query_source_features(
                      id(),
                      call.view(call.text(sourceId)),
                      (options == null
                          ? MemorySegment.NULL
                          : Codecs.writeSourceFeatureQueryOptions(call, options)),
                      completion,
                      diagnostic),
              result ->
                  Memory.array(
                      result.segment().asSlice(48).get(ADDRESS, 0),
                      result.value_count(),
                      Integer.toUnsignedLong(result.value_size()),
                      org.maplibre.nativeffi.internal.c.Layouts.SourceFeature.byteSize(),
                      item -> Codecs.readSourceFeature(item, null)));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Reads back the latest frame of the session&#x27;s owned texture as premultiplied RGBA8.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_render_session_read_texture</a>
   */
  public CompletableFuture<TextureReadbackResult> readTexture() {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<TextureReadbackResult> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_render_session_read_texture(id(), completion, diagnostic),
              result ->
                  Codecs.readTextureReadbackResult(
                      result
                          .value()
                          .reinterpret(
                              org.maplibre.nativeffi.internal.c.Layouts.TextureReadbackResult
                                  .byteSize()),
                      null));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts best-effort release of renderer caches.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_reduce_memory_use</a>
   */
  public CompletableFuture<Void> reduceMemoryUse() {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_render_session_reduce_memory_use(id(), completion, diagnostic),
              result -> null);
      call.accept(this);
      return ready;
    }
  }

  /**
   * Requests a frame without waiting. Every accepted demand produces one terminal result record.
   * Caller-driver sessions require service on the graphics thread. Core-worker sessions need no
   * host service.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_request_frame</a>
   */
  public void requestFrame(FrameDemand demand) {
    try (var call = new Call(this, 0, false)) {
      call.check(
          C.mln_render_session_request_frame(
              id(), Codecs.writeFrameDemand(call, demand), call.diagnostic.segment()));
      call.accept(this);
    }
  }

  /**
   * Starts an ordered logical resize of the driver and the map. The driver applies the extent in
   * order with its other work, and later driver work does not wait for the map. The completion runs
   * after both have applied it and the map has published its snapshot. Frames render once a map
   * update matches the applied extent; static and tile maps publish that update for their next
   * still image.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_resize</a>
   */
  public CompletableFuture<CommandCompletion> resize(LogicalExtent extent) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_render_session_resize(
                      id(), Codecs.writeLogicalExtent(call, extent), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Services every queued item for a caller-graphics-thread driver. The first successful service
   * call fixes the session&#x27;s graphics-thread identity; later calls from another native thread
   * return {@code MLN_STATUS_WRONG_THREAD}. The target context must be current. Core-worker
   * sessions return {@code MLN_STATUS_INVALID_STATE}.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_service_driver_work</a>
   */
  public void serviceDriverWork() {
    try (var call = new Call(this, 0, false)) {
      call.check(C.mln_render_session_service_driver_work(id(), call.diagnostic.segment()));
      call.accept(this);
    }
  }

  /**
   * Starts an ordered replacement of every texture of a caller-owned Metal ring.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_render_session_set_metal_borrowed_texture_target</a>
   */
  public CompletableFuture<Void> setMetalBorrowedTextureTarget(
      MetalBorrowedTextureDescriptor descriptor) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_render_session_set_metal_borrowed_texture_target(
                      id(),
                      Codecs.writeMetalBorrowedTextureDescriptor(call, descriptor),
                      completion,
                      diagnostic),
              result -> null);
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts an ordered Metal surface replacement.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/surface_8h.html">mln_render_session_set_metal_surface_target</a>
   */
  public CompletableFuture<Void> setMetalSurfaceTarget(MetalSurfaceDescriptor descriptor) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_render_session_set_metal_surface_target(
                      id(),
                      Codecs.writeMetalSurfaceDescriptor(call, descriptor),
                      completion,
                      diagnostic),
              result -> null);
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts an ordered replacement of every texture of a caller-owned OpenGL ring.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_render_session_set_open_gl_borrowed_texture_target</a>
   */
  public CompletableFuture<Void> setOpenGlBorrowedTextureTarget(
      OpenGlBorrowedTextureDescriptor descriptor) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_render_session_set_open_gl_borrowed_texture_target(
                      id(),
                      Codecs.writeOpenGlBorrowedTextureDescriptor(call, descriptor),
                      completion,
                      diagnostic),
              result -> null);
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts an ordered OpenGL surface replacement.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/surface_8h.html">mln_render_session_set_open_gl_surface_target</a>
   */
  public CompletableFuture<Void> setOpenGlSurfaceTarget(OpenGlSurfaceDescriptor descriptor) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_render_session_set_open_gl_surface_target(
                      id(),
                      Codecs.writeOpenGlSurfaceDescriptor(call, descriptor),
                      completion,
                      diagnostic),
              result -> null);
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts an ordered replacement of every image of a caller-owned Vulkan ring.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_render_session_set_vulkan_borrowed_texture_target</a>
   */
  public CompletableFuture<Void> setVulkanBorrowedTextureTarget(
      VulkanBorrowedTextureDescriptor descriptor) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_render_session_set_vulkan_borrowed_texture_target(
                      id(),
                      Codecs.writeVulkanBorrowedTextureDescriptor(call, descriptor),
                      completion,
                      diagnostic),
              result -> null);
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts an ordered Vulkan surface replacement.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/surface_8h.html">mln_render_session_set_vulkan_surface_target</a>
   */
  public CompletableFuture<Void> setVulkanSurfaceTarget(VulkanSurfaceDescriptor descriptor) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_render_session_set_vulkan_surface_target(
                      id(),
                      Codecs.writeVulkanSurfaceDescriptor(call, descriptor),
                      completion,
                      diagnostic),
              result -> null);
      call.accept(this);
      return ready;
    }
  }

  /** Ordered commands that discard their asynchronous outcomes. */
  public Discarding discarding() {
    return new Discarding();
  }

  public final class Discarding {
    private Discarding() {}

    /**
     * Starts an ordered logical resize of the driver and the map. The driver applies the extent in
     * order with its other work, and later driver work does not wait for the map. The completion
     * runs after both have applied it and the map has published its snapshot. Frames render once a
     * map update matches the applied extent; static and tile maps publish that update for their
     * next still image.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_resize</a>
     */
    public void resize(LogicalExtent extent) {
      try (var call = new Call(RenderSessionHandle.this, 0, false)) {
        call.check(
            C.mln_render_session_resize(
                id(),
                Codecs.writeLogicalExtent(call, extent),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(RenderSessionHandle.this);
      }
    }
  }

  public void close() {
    if (isClosed()) return;
    try (var call = new Call(this, 2)) {
      disposeNative(id());
      call.accept(this);
    }
  }
}
