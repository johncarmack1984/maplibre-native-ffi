// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import org.maplibre.nativeffi.internal.c.C;

/**
 * A rendered frame that a render session lends until its release.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/base_8h.html">mln_acquired_frame</a>
 */
public final class AcquiredFrameHandle extends Owner {
  AcquiredFrameHandle(long id, Object parent) {
    super("AcquiredFrameHandle", id, parent, AcquiredFrameHandle::disposeNative);
  }

  static AcquiredFrameHandle adopt(long id, Object parent) {
    try {
      return new AcquiredFrameHandle(id, parent);
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
      call.check(C.mln_acquired_frame_discard(id, call.diagnostic.segment()));
    }
  }

  /**
   * Consumes an acquired frame without consumer GPU synchronization, so it quarantines the
   * frame&#x27;s slot of the texture ring.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_acquired_frame_discard</a>
   */
  public void discard() {
    if (isClosed()) return;
    try (var call = new Call(this, 2, false)) {
      call.check(C.mln_acquired_frame_discard(id(), call.diagnostic.segment()));
      call.accept(this);
    }
  }

  /**
   * Copies Metal-native metadata from an acquired frame.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_acquired_frame_get_metal_texture</a>
   */
  public <R> R withMetalTexture(java.util.function.Function<MetalTextureFrame, R> block) {
    try (var call = new Call(this, 1, false)) {
      var token = call.arena.allocate(ADDRESS);
      call.check(C.mln_acquired_frame_view_begin(id(), token, call.diagnostic.segment()));
      try (var scope = new Scope()) {
        try {
          var out0 =
              call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.MetalTextureFrame);
          out0.asSlice(0)
              .set(
                  JAVA_INT,
                  0,
                  (int) org.maplibre.nativeffi.internal.c.Layouts.MetalTextureFrame.byteSize());
          call.check(C.mln_acquired_frame_get_metal_texture(id(), out0, call.diagnostic.segment()));
          call.accept(this);
          return block.apply(Codecs.readMetalTextureFrame(out0, scope));
        } finally {
          C.mln_acquired_frame_view_end(token.get(ADDRESS, 0));
        }
      }
    }
  }

  /**
   * Copies OpenGL-native metadata from an acquired frame.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_acquired_frame_get_open_gl_texture</a>
   */
  public <R> R withOpenGlTexture(java.util.function.Function<OpenGlTextureFrame, R> block) {
    try (var call = new Call(this, 1, false)) {
      var token = call.arena.allocate(ADDRESS);
      call.check(C.mln_acquired_frame_view_begin(id(), token, call.diagnostic.segment()));
      try (var scope = new Scope()) {
        try {
          var out0 =
              call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.OpenGlTextureFrame);
          out0.asSlice(0)
              .set(
                  JAVA_INT,
                  0,
                  (int) org.maplibre.nativeffi.internal.c.Layouts.OpenGlTextureFrame.byteSize());
          call.check(
              C.mln_acquired_frame_get_open_gl_texture(id(), out0, call.diagnostic.segment()));
          call.accept(this);
          return block.apply(Codecs.readOpenGlTextureFrame(out0, scope));
        } finally {
          C.mln_acquired_frame_view_end(token.get(ADDRESS, 0));
        }
      }
    }
  }

  /**
   * Copies the producer synchronization for an acquired texture frame.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_acquired_frame_get_producer_sync</a>
   */
  public <R> R withProducerSync(java.util.function.Function<GpuSync, R> block) {
    try (var call = new Call(this, 1, false)) {
      var token = call.arena.allocate(ADDRESS);
      call.check(C.mln_acquired_frame_view_begin(id(), token, call.diagnostic.segment()));
      try (var scope = new Scope()) {
        try {
          var out0 = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.GpuSync);
          out0.asSlice(0)
              .set(JAVA_INT, 0, (int) org.maplibre.nativeffi.internal.c.Layouts.GpuSync.byteSize());
          call.check(C.mln_acquired_frame_get_producer_sync(id(), out0, call.diagnostic.segment()));
          call.accept(this);
          return block.apply(Codecs.readGpuSync(out0, scope));
        } finally {
          C.mln_acquired_frame_view_end(token.get(ADDRESS, 0));
        }
      }
    }
  }

  /**
   * Copies common metadata for an acquired frame.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_acquired_frame_get_result</a>
   */
  public RenderFrameResult getResult() {
    try (var call = new Call(this, 1, false)) {
      var out0 = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.RenderFrameResult);
      out0.asSlice(0)
          .set(
              JAVA_INT,
              0,
              (int) org.maplibre.nativeffi.internal.c.Layouts.RenderFrameResult.byteSize());
      call.check(C.mln_acquired_frame_get_result(id(), out0, call.diagnostic.segment()));
      call.accept(this);
      return Codecs.readRenderFrameResult(out0, null);
    }
  }

  /**
   * Copies Vulkan-native metadata from an acquired frame.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_acquired_frame_get_vulkan_texture</a>
   */
  public <R> R withVulkanTexture(java.util.function.Function<VulkanTextureFrame, R> block) {
    try (var call = new Call(this, 1, false)) {
      var token = call.arena.allocate(ADDRESS);
      call.check(C.mln_acquired_frame_view_begin(id(), token, call.diagnostic.segment()));
      try (var scope = new Scope()) {
        try {
          var out0 =
              call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.VulkanTextureFrame);
          out0.asSlice(0)
              .set(
                  JAVA_INT,
                  0,
                  (int) org.maplibre.nativeffi.internal.c.Layouts.VulkanTextureFrame.byteSize());
          call.check(
              C.mln_acquired_frame_get_vulkan_texture(id(), out0, call.diagnostic.segment()));
          call.accept(this);
          return block.apply(Codecs.readVulkanTextureFrame(out0, scope));
        } finally {
          C.mln_acquired_frame_view_end(token.get(ADDRESS, 0));
        }
      }
    }
  }

  /**
   * Releases an acquired frame after the host&#x27;s GPU work that reads it.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_acquired_frame_release</a>
   */
  public void release(GpuSync consumerCompletion) {
    try (var call = new Call(this, 2, false)) {
      call.check(
          C.mln_acquired_frame_release(
              id(),
              (consumerCompletion == null
                  ? MemorySegment.NULL
                  : Codecs.writeGpuSync(call, consumerCompletion)),
              call.diagnostic.segment()));
      call.accept(this);
    }
  }
}
