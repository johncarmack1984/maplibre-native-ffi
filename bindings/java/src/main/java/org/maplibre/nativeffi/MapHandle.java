// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import java.util.concurrent.CompletableFuture;
import org.maplibre.nativeffi.internal.c.C;

/**
 * A map, which holds map state independent of any render target.
 *
 * @see <a href="https://maplibre.org/maplibre-native-ffi/reference/c/base_8h.html">mln_map</a>
 */
public final class MapHandle extends Owner implements AutoCloseable {
  MapHandle(long id, Object parent) {
    super("MapHandle", id, parent, MapHandle::disposeNative);
  }

  static MapHandle adopt(long id, Object parent) {
    try {
      return new MapHandle(id, parent);
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
      call.check(C.mln_map_dispose(id, call.diagnostic.segment()));
    }
  }

  /**
   * Adds a custom geometry source.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_add_custom_geometry_source</a>
   */
  public CompletableFuture<CommandCompletion> addCustomGeometrySource(
      String sourceId, CustomGeometrySourceOptions options) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_add_custom_geometry_source(
                      id(),
                      call.view(call.text(sourceId)),
                      Codecs.writeCustomGeometrySourceOptions(call, options),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Adds a custom vector source.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_add_custom_vector_source</a>
   */
  public CompletableFuture<CommandCompletion> addCustomVectorSource(
      String sourceId, CustomVectorSourceOptions options) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_add_custom_vector_source(
                      id(),
                      call.view(call.text(sourceId)),
                      Codecs.writeCustomVectorSourceOptions(call, options),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Adds a GeoJSON source with prepared inline data.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_add_geo_json_source_data</a>
   */
  public CompletableFuture<CommandCompletion> addGeoJsonSourceData(
      String sourceId, GeoJsonSourceDataHandle data) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_add_geo_json_source_data(
                      id(),
                      call.view(call.text(sourceId)),
                      call.handle(data),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Adds a GeoJSON source with URL data.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_add_geo_json_source_url</a>
   */
  public CompletableFuture<CommandCompletion> addGeoJsonSourceUrl(
      String sourceId, String url, GeoJsonSourceOptions options) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_add_geo_json_source_url(
                      id(),
                      call.view(call.text(sourceId)),
                      call.view(call.text(url)),
                      (options == null
                          ? MemorySegment.NULL
                          : Codecs.writeGeoJsonSourceOptions(call, options)),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Adds an image source with inline image pixels.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_add_image_source_image</a>
   */
  public CompletableFuture<CommandCompletion> addImageSourceImage(
      String sourceId, java.util.List<LatLng> coordinates, PremultipliedRgba8Image image) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_add_image_source_image(
                      id(),
                      call.view(call.text(sourceId)),
                      call.array(
                          coordinates,
                          org.maplibre.nativeffi.internal.c.Layouts.LatLng,
                          (elementTarget, elementValue) -> {
                            MemorySegment.copy(
                                Codecs.writeLatLng(call, elementValue),
                                0,
                                elementTarget,
                                0,
                                org.maplibre.nativeffi.internal.c.Layouts.LatLng.byteSize());
                          }),
                      (long) Call.length(coordinates),
                      Codecs.writePremultipliedRgba8Image(call, image),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Adds an image source that loads its image from a URL.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_add_image_source_url</a>
   */
  public CompletableFuture<CommandCompletion> addImageSourceUrl(
      String sourceId, java.util.List<LatLng> coordinates, String url) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_add_image_source_url(
                      id(),
                      call.view(call.text(sourceId)),
                      call.array(
                          coordinates,
                          org.maplibre.nativeffi.internal.c.Layouts.LatLng,
                          (elementTarget, elementValue) -> {
                            MemorySegment.copy(
                                Codecs.writeLatLng(call, elementValue),
                                0,
                                elementTarget,
                                0,
                                org.maplibre.nativeffi.internal.c.Layouts.LatLng.byteSize());
                          }),
                      (long) Call.length(coordinates),
                      call.view(call.text(url)),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Adds one style layer from a full style-spec layer JSON object.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_add_style_layer_json</a>
   */
  public CompletableFuture<CommandCompletion> addStyleLayerJson(
      String layerJson, String beforeLayerId) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_add_style_layer_json(
                      id(),
                      call.view(call.text(layerJson)),
                      call.view(call.text(beforeLayerId)),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Adds one style source from a style-spec source JSON object.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_add_style_source_json</a>
   */
  public CompletableFuture<CommandCompletion> addStyleSourceJson(
      String sourceId, String sourceJson) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_add_style_source_json(
                      id(),
                      call.view(call.text(sourceId)),
                      call.view(call.text(sourceJson)),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Submits one atomic relative camera update.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_apply_camera_delta</a>
   */
  public CompletableFuture<CommandCompletion> applyCameraDelta(CameraDelta delta) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_apply_camera_delta(
                      id(), Codecs.writeCameraDelta(call, delta), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts attachment of a texture target that renders on a graphics device.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/graphics__device_8h.html">mln_map_attach_graphics_device_texture</a>
   */
  public Pending<RenderSessionHandle> attachGraphicsDeviceTexture(
      GraphicsDeviceHandle device,
      GraphicsDeviceTextureDescriptor descriptor,
      RenderSessionAttachOptions options) {
    try (var call = new Call(this, 0, false)) {
      var out0 = call.arena.allocate(JAVA_LONG);
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_attach_graphics_device_texture(
                      id(),
                      call.handle(device),
                      Codecs.writeGraphicsDeviceTextureDescriptor(call, descriptor),
                      Codecs.writeRenderSessionAttachOptions(call, options),
                      out0,
                      completion,
                      diagnostic),
              result -> null);
      var adopted = new Pending<>(RenderSessionHandle.adopt(out0.get(JAVA_LONG, 0), this), ready);
      call.accept(adopted.handle());
      return adopted;
    }
  }

  /**
   * Starts attachment of a ring of caller-owned Metal textures.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_map_attach_metal_borrowed_texture</a>
   */
  public Pending<RenderSessionHandle> attachMetalBorrowedTexture(
      MetalBorrowedTextureDescriptor descriptor, RenderSessionAttachOptions options) {
    try (var call = new Call(this, 0, false)) {
      var out0 = call.arena.allocate(JAVA_LONG);
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_attach_metal_borrowed_texture(
                      id(),
                      Codecs.writeMetalBorrowedTextureDescriptor(call, descriptor),
                      Codecs.writeRenderSessionAttachOptions(call, options),
                      out0,
                      completion,
                      diagnostic),
              result -> null);
      var adopted = new Pending<>(RenderSessionHandle.adopt(out0.get(JAVA_LONG, 0), this), ready);
      call.accept(adopted.handle());
      return adopted;
    }
  }

  /**
   * Starts attachment of a session-owned Metal texture ring.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_map_attach_metal_owned_texture</a>
   */
  public Pending<RenderSessionHandle> attachMetalOwnedTexture(
      MetalOwnedTextureDescriptor descriptor, RenderSessionAttachOptions options) {
    try (var call = new Call(this, 0, false)) {
      var out0 = call.arena.allocate(JAVA_LONG);
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_attach_metal_owned_texture(
                      id(),
                      Codecs.writeMetalOwnedTextureDescriptor(call, descriptor),
                      Codecs.writeRenderSessionAttachOptions(call, options),
                      out0,
                      completion,
                      diagnostic),
              result -> null);
      var adopted = new Pending<>(RenderSessionHandle.adopt(out0.get(JAVA_LONG, 0), this), ready);
      call.accept(adopted.handle());
      return adopted;
    }
  }

  /**
   * Starts attachment of a Metal surface target.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/surface_8h.html">mln_map_attach_metal_surface</a>
   */
  public Pending<RenderSessionHandle> attachMetalSurface(
      MetalSurfaceDescriptor descriptor, RenderSessionAttachOptions options) {
    try (var call = new Call(this, 0, false)) {
      var out0 = call.arena.allocate(JAVA_LONG);
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_attach_metal_surface(
                      id(),
                      Codecs.writeMetalSurfaceDescriptor(call, descriptor),
                      Codecs.writeRenderSessionAttachOptions(call, options),
                      out0,
                      completion,
                      diagnostic),
              result -> null);
      var adopted = new Pending<>(RenderSessionHandle.adopt(out0.get(JAVA_LONG, 0), this), ready);
      call.accept(adopted.handle());
      return adopted;
    }
  }

  /**
   * Starts attachment of a ring of caller-owned OpenGL textures.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_map_attach_open_gl_borrowed_texture</a>
   */
  public Pending<RenderSessionHandle> attachOpenGlBorrowedTexture(
      OpenGlBorrowedTextureDescriptor descriptor, RenderSessionAttachOptions options) {
    try (var call = new Call(this, 0, false)) {
      var out0 = call.arena.allocate(JAVA_LONG);
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_attach_open_gl_borrowed_texture(
                      id(),
                      Codecs.writeOpenGlBorrowedTextureDescriptor(call, descriptor),
                      Codecs.writeRenderSessionAttachOptions(call, options),
                      out0,
                      completion,
                      diagnostic),
              result -> null);
      var adopted = new Pending<>(RenderSessionHandle.adopt(out0.get(JAVA_LONG, 0), this), ready);
      call.accept(adopted.handle());
      return adopted;
    }
  }

  /**
   * Starts attachment of a session-owned OpenGL texture ring.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_map_attach_open_gl_owned_texture</a>
   */
  public Pending<RenderSessionHandle> attachOpenGlOwnedTexture(
      OpenGlOwnedTextureDescriptor descriptor, RenderSessionAttachOptions options) {
    try (var call = new Call(this, 0, false)) {
      var out0 = call.arena.allocate(JAVA_LONG);
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_attach_open_gl_owned_texture(
                      id(),
                      Codecs.writeOpenGlOwnedTextureDescriptor(call, descriptor),
                      Codecs.writeRenderSessionAttachOptions(call, options),
                      out0,
                      completion,
                      diagnostic),
              result -> null);
      var adopted = new Pending<>(RenderSessionHandle.adopt(out0.get(JAVA_LONG, 0), this), ready);
      call.accept(adopted.handle());
      return adopted;
    }
  }

  /**
   * Starts attachment of an OpenGL surface target.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/surface_8h.html">mln_map_attach_open_gl_surface</a>
   */
  public Pending<RenderSessionHandle> attachOpenGlSurface(
      OpenGlSurfaceDescriptor descriptor, RenderSessionAttachOptions options) {
    try (var call = new Call(this, 0, false)) {
      var out0 = call.arena.allocate(JAVA_LONG);
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_attach_open_gl_surface(
                      id(),
                      Codecs.writeOpenGlSurfaceDescriptor(call, descriptor),
                      Codecs.writeRenderSessionAttachOptions(call, options),
                      out0,
                      completion,
                      diagnostic),
              result -> null);
      var adopted = new Pending<>(RenderSessionHandle.adopt(out0.get(JAVA_LONG, 0), this), ready);
      call.accept(adopted.handle());
      return adopted;
    }
  }

  /**
   * Starts attachment of a ring of caller-owned Vulkan images.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_map_attach_vulkan_borrowed_texture</a>
   */
  public Pending<RenderSessionHandle> attachVulkanBorrowedTexture(
      VulkanBorrowedTextureDescriptor descriptor, RenderSessionAttachOptions options) {
    try (var call = new Call(this, 0, false)) {
      var out0 = call.arena.allocate(JAVA_LONG);
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_attach_vulkan_borrowed_texture(
                      id(),
                      Codecs.writeVulkanBorrowedTextureDescriptor(call, descriptor),
                      Codecs.writeRenderSessionAttachOptions(call, options),
                      out0,
                      completion,
                      diagnostic),
              result -> null);
      var adopted = new Pending<>(RenderSessionHandle.adopt(out0.get(JAVA_LONG, 0), this), ready);
      call.accept(adopted.handle());
      return adopted;
    }
  }

  /**
   * Starts attachment of a session-owned Vulkan texture ring.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_map_attach_vulkan_owned_texture</a>
   */
  public Pending<RenderSessionHandle> attachVulkanOwnedTexture(
      VulkanOwnedTextureDescriptor descriptor, RenderSessionAttachOptions options) {
    try (var call = new Call(this, 0, false)) {
      var out0 = call.arena.allocate(JAVA_LONG);
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_attach_vulkan_owned_texture(
                      id(),
                      Codecs.writeVulkanOwnedTextureDescriptor(call, descriptor),
                      Codecs.writeRenderSessionAttachOptions(call, options),
                      out0,
                      completion,
                      diagnostic),
              result -> null);
      var adopted = new Pending<>(RenderSessionHandle.adopt(out0.get(JAVA_LONG, 0), this), ready);
      call.accept(adopted.handle());
      return adopted;
    }
  }

  /**
   * Starts attachment of a Vulkan surface target.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/surface_8h.html">mln_map_attach_vulkan_surface</a>
   */
  public Pending<RenderSessionHandle> attachVulkanSurface(
      VulkanSurfaceDescriptor descriptor, RenderSessionAttachOptions options) {
    try (var call = new Call(this, 0, false)) {
      var out0 = call.arena.allocate(JAVA_LONG);
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_attach_vulkan_surface(
                      id(),
                      Codecs.writeVulkanSurfaceDescriptor(call, descriptor),
                      Codecs.writeRenderSessionAttachOptions(call, options),
                      out0,
                      completion,
                      diagnostic),
              result -> null);
      var adopted = new Pending<>(RenderSessionHandle.adopt(out0.get(JAVA_LONG, 0), this), ready);
      call.accept(adopted.handle());
      return adopted;
    }
  }

  /**
   * Begins a command group, which holds this map&#x27;s render updates until the group ends.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_begin_command_group</a>
   */
  public CompletableFuture<CommandCompletion> beginCommandGroup() {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_begin_command_group(id(), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts an ordered query for a camera that fits a GeoJSON geometry.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_camera_for_geometry</a>
   */
  public CompletableFuture<CameraOptions> cameraForGeometry(
      String geometry, CameraFitOptions fitOptions) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CameraOptions> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_camera_for_geometry(
                      id(),
                      call.view(call.text(geometry)),
                      (fitOptions == null
                          ? MemorySegment.NULL
                          : Codecs.writeCameraFitOptions(call, fitOptions)),
                      completion,
                      diagnostic),
              result ->
                  Codecs.readCameraOptions(
                      result
                          .value()
                          .reinterpret(
                              org.maplibre.nativeffi.internal.c.Layouts.CameraOptions.byteSize()),
                      null));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts an ordered query for a camera that fits geographic bounds.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_camera_for_lat_lng_bounds</a>
   */
  public CompletableFuture<CameraOptions> cameraForLatLngBounds(
      LatLngBounds bounds, CameraFitOptions fitOptions) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CameraOptions> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_camera_for_lat_lng_bounds(
                      id(),
                      Codecs.writeLatLngBounds(call, bounds),
                      (fitOptions == null
                          ? MemorySegment.NULL
                          : Codecs.writeCameraFitOptions(call, fitOptions)),
                      completion,
                      diagnostic),
              result ->
                  Codecs.readCameraOptions(
                      result
                          .value()
                          .reinterpret(
                              org.maplibre.nativeffi.internal.c.Layouts.CameraOptions.byteSize()),
                      null));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts an ordered query for a camera that fits geographic coordinates.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_camera_for_lat_lngs</a>
   */
  public CompletableFuture<CameraOptions> cameraForLatLngs(
      java.util.List<LatLng> coordinates, CameraFitOptions fitOptions) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CameraOptions> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_camera_for_lat_lngs(
                      id(),
                      call.array(
                          coordinates,
                          org.maplibre.nativeffi.internal.c.Layouts.LatLng,
                          (elementTarget, elementValue) -> {
                            MemorySegment.copy(
                                Codecs.writeLatLng(call, elementValue),
                                0,
                                elementTarget,
                                0,
                                org.maplibre.nativeffi.internal.c.Layouts.LatLng.byteSize());
                          }),
                      (long) Call.length(coordinates),
                      (fitOptions == null
                          ? MemorySegment.NULL
                          : Codecs.writeCameraFitOptions(call, fitOptions)),
                      completion,
                      diagnostic),
              result ->
                  Codecs.readCameraOptions(
                      result
                          .value()
                          .reinterpret(
                              org.maplibre.nativeffi.internal.c.Layouts.CameraOptions.byteSize()),
                      null));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Cancels the camera transitions of the commands whose animation carried transition_id, and
   * leaves every other transition running.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_cancel_camera_transition</a>
   */
  public CompletableFuture<CommandCompletion> cancelCameraTransition(long transitionId) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_cancel_camera_transition(id(), transitionId, completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Cancels the camera transitions running when this command commits.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_cancel_transitions</a>
   */
  public CompletableFuture<CommandCompletion> cancelTransitions() {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_cancel_transitions(id(), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Submits an ordered debug-log command.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_dump_debug_logs</a>
   */
  public CompletableFuture<CommandCompletion> dumpDebugLogs() {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) -> C.mln_map_dump_debug_logs(id(), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Ends the innermost command group that {@code mln_map_begin_command_group()} began.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_end_command_group</a>
   */
  public CompletableFuture<CommandCompletion> endCommandGroup() {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) -> C.mln_map_end_command_group(id(), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts an ordered camera read.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_get_camera</a>
   */
  public CompletableFuture<CameraQueryResult> getCamera() {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CameraQueryResult> ready =
          Completions.submit(
              (completion, diagnostic) -> C.mln_map_get_camera(id(), completion, diagnostic),
              result ->
                  Codecs.readCameraQueryResult(
                      result
                          .value()
                          .reinterpret(
                              org.maplibre.nativeffi.internal.c.Layouts.CameraQueryResult
                                  .byteSize()),
                      null));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts an ordered read of per-feature state from this map.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_get_feature_state</a>
   */
  public CompletableFuture<String> getFeatureState(FeatureStateSelector selector) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<String> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_get_feature_state(
                      id(),
                      Codecs.writeFeatureStateSelector(call, selector),
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
   * Queries the global-state JSON object, including style defaults.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_get_global_state</a>
   */
  public CompletableFuture<String> getGlobalState() {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<String> ready =
          Completions.submit(
              (completion, diagnostic) -> C.mln_map_get_global_state(id(), completion, diagnostic),
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
   * Copies image source coordinates.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_get_image_source_coordinates</a>
   */
  public CompletableFuture<java.util.List<LatLng>> getImageSourceCoordinates(String sourceId) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<java.util.List<LatLng>> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_get_image_source_coordinates(
                      id(), call.view(call.text(sourceId)), completion, diagnostic),
              result ->
                  Memory.array(
                      result.segment().asSlice(48).get(ADDRESS, 0),
                      result.value_count(),
                      Integer.toUnsignedLong(result.value_size()),
                      org.maplibre.nativeffi.internal.c.Layouts.LatLng.byteSize(),
                      item -> Codecs.readLatLng(item, null)));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts an ordered copy of the last successfully parsed style document.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_get_loaded_style_json</a>
   */
  public CompletableFuture<String> getLoadedStyleJson() {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<String> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_get_loaded_style_json(id(), completion, diagnostic),
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
   * Copies the map&#x27;s latest published snapshot.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_get_snapshot</a>
   */
  public MapSnapshot getSnapshot() {
    try (var call = new Call(this, 1, false)) {
      var out0 = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.MapSnapshot);
      out0.asSlice(0)
          .set(JAVA_INT, 0, (int) org.maplibre.nativeffi.internal.c.Layouts.MapSnapshot.byteSize());
      call.check(C.mln_map_get_snapshot(id(), out0, call.diagnostic.segment()));
      call.accept(this);
      return Codecs.readMapSnapshot(out0, null);
    }
  }

  /**
   * Copies one complete runtime style image.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_get_style_image</a>
   */
  public CompletableFuture<StyleImageInfo> getStyleImage(String imageId) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<StyleImageInfo> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_get_style_image(
                      id(), call.view(call.text(imageId)), completion, diagnostic),
              result ->
                  (result.value_count() == 0
                      ? null
                      : Codecs.readStyleImageInfo(
                          result
                              .value()
                              .reinterpret(
                                  org.maplibre.nativeffi.internal.c.Layouts.StyleImageInfo
                                      .byteSize()),
                          null)));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Copies the complete metadata of one style layer.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_get_style_layer</a>
   */
  public CompletableFuture<StyleLayerInfo> getStyleLayer(String layerId) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<StyleLayerInfo> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_get_style_layer(
                      id(), call.view(call.text(layerId)), completion, diagnostic),
              result ->
                  (result.value_count() == 0
                      ? null
                      : Codecs.readStyleLayerInfo(
                          result
                              .value()
                              .reinterpret(
                                  org.maplibre.nativeffi.internal.c.Layouts.StyleLayerInfo
                                      .byteSize()),
                          null)));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Serializes one style layer as a full style-spec layer JSON object.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_get_style_layer_json</a>
   */
  public CompletableFuture<String> getStyleLayerJson(String layerId) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<String> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_get_style_layer_json(
                      id(), call.view(call.text(layerId)), completion, diagnostic),
              result ->
                  (result.value_count() == 0
                      ? null
                      : Memory.textView(
                          result
                              .value()
                              .reinterpret(
                                  org.maplibre.nativeffi.internal.c.Layouts.BufferView
                                      .byteSize()))));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Serializes one layer property as a style-spec JSON value.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_get_style_layer_property</a>
   */
  public CompletableFuture<String> getStyleLayerProperty(String layerId, String propertyName) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<String> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_get_style_layer_property(
                      id(),
                      call.view(call.text(layerId)),
                      call.view(call.text(propertyName)),
                      completion,
                      diagnostic),
              result ->
                  (result.value_count() == 0
                      ? null
                      : Memory.textView(
                          result
                              .value()
                              .reinterpret(
                                  org.maplibre.nativeffi.internal.c.Layouts.BufferView
                                      .byteSize()))));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Serializes one style light property as a style-spec JSON value.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_get_style_light_property</a>
   */
  public CompletableFuture<String> getStyleLightProperty(String propertyName) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<String> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_get_style_light_property(
                      id(), call.view(call.text(propertyName)), completion, diagnostic),
              result ->
                  (result.value_count() == 0
                      ? null
                      : Memory.textView(
                          result
                              .value()
                              .reinterpret(
                                  org.maplibre.nativeffi.internal.c.Layouts.BufferView
                                      .byteSize()))));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Copies the complete metadata of one style source.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_get_style_source</a>
   */
  public CompletableFuture<StyleSourceInfo> getStyleSource(String sourceId) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<StyleSourceInfo> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_get_style_source(
                      id(), call.view(call.text(sourceId)), completion, diagnostic),
              result ->
                  (result.value_count() == 0
                      ? null
                      : Codecs.readStyleSourceInfo(
                          result
                              .value()
                              .reinterpret(
                                  org.maplibre.nativeffi.internal.c.Layouts.StyleSourceInfo
                                      .byteSize()),
                          null)));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Reads the style&#x27;s global transition options.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_get_style_transition_options</a>
   */
  public CompletableFuture<StyleTransitionOptions> getStyleTransitionOptions() {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<StyleTransitionOptions> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_get_style_transition_options(id(), completion, diagnostic),
              result ->
                  Codecs.readStyleTransitionOptions(
                      result
                          .value()
                          .reinterpret(
                              org.maplibre.nativeffi.internal.c.Layouts.StyleTransitionOptions
                                  .byteSize()),
                      null));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts an ordered copy of the last requested style URL.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_get_style_url</a>
   */
  public CompletableFuture<String> getStyleUrl() {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<String> ready =
          Completions.submit(
              (completion, diagnostic) -> C.mln_map_get_style_url(id(), completion, diagnostic),
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
   * Invalidates custom geometry source data inside one geographic region.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_invalidate_custom_geometry_source_region</a>
   */
  public CompletableFuture<CommandCompletion> invalidateCustomGeometrySourceRegion(
      String sourceId, LatLngBounds bounds) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_invalidate_custom_geometry_source_region(
                      id(),
                      call.view(call.text(sourceId)),
                      Codecs.writeLatLngBounds(call, bounds),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Invalidates custom geometry source data for one canonical tile.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_invalidate_custom_geometry_source_tile</a>
   */
  public CompletableFuture<CommandCompletion> invalidateCustomGeometrySourceTile(
      String sourceId, CanonicalTileId tileId) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_invalidate_custom_geometry_source_tile(
                      id(),
                      call.view(call.text(sourceId)),
                      Codecs.writeCanonicalTileId(call, tileId),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Invalidates custom vector source data for one canonical tile.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_invalidate_custom_vector_source_tile</a>
   */
  public CompletableFuture<CommandCompletion> invalidateCustomVectorSourceTile(
      String sourceId, CanonicalTileId tileId) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_invalidate_custom_vector_source_tile(
                      id(),
                      call.view(call.text(sourceId)),
                      Codecs.writeCanonicalTileId(call, tileId),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts an ordered wrapped-bounds query for a copied camera.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_lat_lng_bounds_for_camera</a>
   */
  public CompletableFuture<LatLngBounds> latLngBoundsForCamera(CameraOptions camera) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<LatLngBounds> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_lat_lng_bounds_for_camera(
                      id(), Codecs.writeCameraOptions(call, camera), completion, diagnostic),
              result ->
                  Codecs.readLatLngBounds(
                      result
                          .value()
                          .reinterpret(
                              org.maplibre.nativeffi.internal.c.Layouts.LatLngBounds.byteSize()),
                      null));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts an ordered unwrapped-bounds query for a copied camera.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_lat_lng_bounds_for_camera_unwrapped</a>
   */
  public CompletableFuture<LatLngBounds> latLngBoundsForCameraUnwrapped(CameraOptions camera) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<LatLngBounds> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_lat_lng_bounds_for_camera_unwrapped(
                      id(), Codecs.writeCameraOptions(call, camera), completion, diagnostic),
              result ->
                  Codecs.readLatLngBounds(
                      result
                          .value()
                          .reinterpret(
                              org.maplibre.nativeffi.internal.c.Layouts.LatLngBounds.byteSize()),
                      null));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts an ordered query of every style layer in style order.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_list_style_layers</a>
   */
  public CompletableFuture<java.util.List<StyleLayerInfo>> listStyleLayers() {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<java.util.List<StyleLayerInfo>> ready =
          Completions.submit(
              (completion, diagnostic) -> C.mln_map_list_style_layers(id(), completion, diagnostic),
              result ->
                  Memory.array(
                      result.segment().asSlice(48).get(ADDRESS, 0),
                      result.value_count(),
                      Integer.toUnsignedLong(result.value_size()),
                      org.maplibre.nativeffi.internal.c.Layouts.StyleLayerInfo.byteSize(),
                      item -> Codecs.readStyleLayerInfo(item, null)));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Lists every style source in style order.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_list_style_sources</a>
   */
  public CompletableFuture<java.util.List<StyleSourceInfo>> listStyleSources() {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<java.util.List<StyleSourceInfo>> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_list_style_sources(id(), completion, diagnostic),
              result ->
                  Memory.array(
                      result.segment().asSlice(48).get(ADDRESS, 0),
                      result.value_count(),
                      Integer.toUnsignedLong(result.value_size()),
                      org.maplibre.nativeffi.internal.c.Layouts.StyleSourceInfo.byteSize(),
                      item -> Codecs.readStyleSourceInfo(item, null)));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Moves one style layer before another layer or to the top.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_move_style_layer</a>
   */
  public CompletableFuture<CommandCompletion> moveStyleLayer(String layerId, String beforeLayerId) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_move_style_layer(
                      id(),
                      call.view(call.text(layerId)),
                      call.view(call.text(beforeLayerId)),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Releases a map asynchronously.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_release</a>
   */
  public CompletableFuture<Void> release() {
    try (var call = new Call(this, 2, false)) {
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) -> C.mln_map_release(id(), completion, diagnostic),
              result -> null);
      call.accept(this);
      return ready;
    }
  }

  /**
   * Removes per-feature state from this map.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_remove_feature_state</a>
   */
  public CompletableFuture<CommandCompletion> removeFeatureState(FeatureStateSelector selector) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_remove_feature_state(
                      id(),
                      Codecs.writeFeatureStateSelector(call, selector),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Removes one runtime style image by ID.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_remove_style_image</a>
   */
  public CompletableFuture<CommandCompletion> removeStyleImage(String imageId) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_remove_style_image(
                      id(), call.view(call.text(imageId)), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Removes one style layer by ID.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_remove_style_layer</a>
   */
  public CompletableFuture<CommandCompletion> removeStyleLayer(String layerId) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_remove_style_layer(
                      id(), call.view(call.text(layerId)), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Removes one style source by ID.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_remove_style_source</a>
   */
  public CompletableFuture<CommandCompletion> removeStyleSource(String sourceId) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_remove_style_source(
                      id(), call.view(call.text(sourceId)), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Requests a repaint for a continuous map.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_request_repaint</a>
   */
  public CompletableFuture<CommandCompletion> requestRepaint() {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) -> C.mln_map_request_repaint(id(), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Requests one still image for a static or tile map, which renders itself.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_request_still_image</a>
   */
  public CompletableFuture<Void> requestStillImage() {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_request_still_image(id(), completion, diagnostic),
              result -> null);
      call.accept(this);
      return ready;
    }
  }

  /**
   * Submits the sole post-creation logical extent update.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_resize</a>
   */
  public CompletableFuture<CommandCompletion> resize(LogicalExtent extent) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_resize(
                      id(), Codecs.writeLogicalExtent(call, extent), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Submits a copied camera-constraint command.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_set_bounds</a>
   */
  public CompletableFuture<CommandCompletion> setBounds(BoundOptions options) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_set_bounds(
                      id(), Codecs.writeBoundOptions(call, options), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Sets custom geometry source data for one canonical tile.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_custom_geometry_source_tile_data</a>
   */
  public CompletableFuture<CommandCompletion> setCustomGeometrySourceTileData(
      String sourceId, CanonicalTileId tileId, String data) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_set_custom_geometry_source_tile_data(
                      id(),
                      call.view(call.text(sourceId)),
                      Codecs.writeCanonicalTileId(call, tileId),
                      call.view(call.text(data)),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Reports a custom geometry source error for one canonical tile.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_custom_geometry_source_tile_error</a>
   */
  public CompletableFuture<CommandCompletion> setCustomGeometrySourceTileError(
      String sourceId, CanonicalTileId tileId, String message) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_set_custom_geometry_source_tile_error(
                      id(),
                      call.view(call.text(sourceId)),
                      Codecs.writeCanonicalTileId(call, tileId),
                      call.view(call.text(message)),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Sets custom vector source data for one canonical tile.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_custom_vector_source_tile_data</a>
   */
  public CompletableFuture<CommandCompletion> setCustomVectorSourceTileData(
      String sourceId, CanonicalTileId tileId, StyleVectorTileEncoding encoding, byte[] data) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_set_custom_vector_source_tile_data(
                      id(),
                      call.view(call.text(sourceId)),
                      Codecs.writeCanonicalTileId(call, tileId),
                      encoding.rawValue(),
                      call.view(call.bytes(data)),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Reports a custom vector source error for one canonical tile.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_custom_vector_source_tile_error</a>
   */
  public CompletableFuture<CommandCompletion> setCustomVectorSourceTileError(
      String sourceId, CanonicalTileId tileId, String message) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_set_custom_vector_source_tile_error(
                      id(),
                      call.view(call.text(sourceId)),
                      Codecs.writeCanonicalTileId(call, tileId),
                      call.view(call.text(message)),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Submits a debug-overlay command.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_set_debug_options</a>
   */
  public CompletableFuture<CommandCompletion> setDebugOptions(MapDebugFlag options) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_set_debug_options(id(), options.rawValue(), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Selects which map-originated event types this map queues.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_set_event_mask</a>
   */
  public CompletableFuture<CommandCompletion> setEventMask(RuntimeEventFlag mask) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_set_event_mask(id(), mask.rawValue(), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Submits a copied per-feature-state command.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_set_feature_state</a>
   */
  public CompletableFuture<CommandCompletion> setFeatureState(
      FeatureStateSelector selector, String state) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_set_feature_state(
                      id(),
                      Codecs.writeFeatureStateSelector(call, selector),
                      call.view(call.text(state)),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Submits a copied free-camera command.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_set_free_camera_options</a>
   */
  public CompletableFuture<CommandCompletion> setFreeCameraOptions(FreeCameraOptions options) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_set_free_camera_options(
                      id(), Codecs.writeFreeCameraOptions(call, options), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Updates one GeoJSON source with prepared inline data.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_geo_json_source_data</a>
   */
  public CompletableFuture<CommandCompletion> setGeoJsonSourceData(
      String sourceId, GeoJsonSourceDataHandle data) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_set_geo_json_source_data(
                      id(),
                      call.view(call.text(sourceId)),
                      call.handle(data),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Overrides one GeoJSON source&#x27;s synchronous tiling at runtime.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_geo_json_source_synchronous_tiling</a>
   */
  public CompletableFuture<CommandCompletion> setGeoJsonSourceSynchronousTiling(
      String sourceId, boolean enabled) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_set_geo_json_source_synchronous_tiling(
                      id(), call.view(call.text(sourceId)), enabled, completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Updates one GeoJSON source to load data from a URL.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_geo_json_source_url</a>
   */
  public CompletableFuture<CommandCompletion> setGeoJsonSourceUrl(String sourceId, String url) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_set_geo_json_source_url(
                      id(),
                      call.view(call.text(sourceId)),
                      call.view(call.text(url)),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Submits a global-state JSON value. JSON null restores the style default.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_global_state_property</a>
   */
  public CompletableFuture<CommandCompletion> setGlobalStateProperty(
      String propertyName, String value$) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_set_global_state_property(
                      id(),
                      call.view(call.text(propertyName)),
                      call.view(call.text(value$)),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Updates image source coordinates.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_image_source_coordinates</a>
   */
  public CompletableFuture<CommandCompletion> setImageSourceCoordinates(
      String sourceId, java.util.List<LatLng> coordinates) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_set_image_source_coordinates(
                      id(),
                      call.view(call.text(sourceId)),
                      call.array(
                          coordinates,
                          org.maplibre.nativeffi.internal.c.Layouts.LatLng,
                          (elementTarget, elementValue) -> {
                            MemorySegment.copy(
                                Codecs.writeLatLng(call, elementValue),
                                0,
                                elementTarget,
                                0,
                                org.maplibre.nativeffi.internal.c.Layouts.LatLng.byteSize());
                          }),
                      (long) Call.length(coordinates),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Updates an image source with inline image pixels.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_image_source_image</a>
   */
  public CompletableFuture<CommandCompletion> setImageSourceImage(
      String sourceId, PremultipliedRgba8Image image) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_set_image_source_image(
                      id(),
                      call.view(call.text(sourceId)),
                      Codecs.writePremultipliedRgba8Image(call, image),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Updates an image source to load its image from a URL.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_image_source_url</a>
   */
  public CompletableFuture<CommandCompletion> setImageSourceUrl(String sourceId, String url) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_set_image_source_url(
                      id(),
                      call.view(call.text(sourceId)),
                      call.view(call.text(url)),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Submits axonometric rendering options.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_set_projection_mode</a>
   */
  public CompletableFuture<CommandCompletion> setProjectionMode(ProjectionMode mode) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_set_projection_mode(
                      id(), Codecs.writeProjectionMode(call, mode), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Submits a rendering-stats visibility command.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_set_rendering_stats_view_enabled</a>
   */
  public CompletableFuture<CommandCompletion> setRenderingStatsViewEnabled(boolean enabled) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_set_rendering_stats_view_enabled(id(), enabled, completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Sets one runtime style image.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_style_image</a>
   */
  public CompletableFuture<CommandCompletion> setStyleImage(
      String imageId, PremultipliedRgba8Image image, StyleImageOptions options) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_set_style_image(
                      id(),
                      call.view(call.text(imageId)),
                      Codecs.writePremultipliedRgba8Image(call, image),
                      (options == null
                          ? MemorySegment.NULL
                          : Codecs.writeStyleImageOptions(call, options)),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Queues an inline style JSON command. A committed command means the map applied the JSON, not
   * that the style loaded: style loading events report the resource and parse results that follow.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_set_style_json</a>
   */
  public CompletableFuture<CommandCompletion> setStyleJson(String json) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_set_style_json(
                      id(), call.view(call.text(json)), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Sets one layer property using its MapLibre style-spec property name.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_style_layer_property</a>
   */
  public CompletableFuture<CommandCompletion> setStyleLayerProperty(
      String layerId, String propertyName, String value$) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_set_style_layer_property(
                      id(),
                      call.view(call.text(layerId)),
                      call.view(call.text(propertyName)),
                      call.view(call.text(value$)),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Sets the style light from a style-spec light JSON object.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_style_light_json</a>
   */
  public CompletableFuture<CommandCompletion> setStyleLightJson(String lightJson) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_set_style_light_json(
                      id(), call.view(call.text(lightJson)), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Sets one style light property using its MapLibre style-spec property name.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_style_light_property</a>
   */
  public CompletableFuture<CommandCompletion> setStyleLightProperty(
      String propertyName, String value$) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_set_style_light_property(
                      id(),
                      call.view(call.text(propertyName)),
                      call.view(call.text(value$)),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Sets whether one style source stores fetched tiles in the persistent cache.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_style_source_volatile</a>
   */
  public CompletableFuture<CommandCompletion> setStyleSourceVolatile(
      String sourceId, boolean isVolatile) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_set_style_source_volatile(
                      id(), call.view(call.text(sourceId)), isVolatile, completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Sets the style&#x27;s global transition options.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_style_transition_options</a>
   */
  public CompletableFuture<CommandCompletion> setStyleTransitionOptions(
      StyleTransitionOptions options) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_set_style_transition_options(
                      id(),
                      Codecs.writeStyleTransitionOptions(call, options),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Queues a style URL command. A committed command means the map accepted the URL, not that the
   * style loaded: style loading events report the network, decode, and parse results that follow.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_set_style_url</a>
   */
  public CompletableFuture<CommandCompletion> setStyleUrl(String url) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_set_style_url(id(), call.view(call.text(url)), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Submits a copied tile-options command.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_set_tile_options</a>
   */
  public CompletableFuture<CommandCompletion> setTileOptions(MapTileOptions options) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_set_tile_options(
                      id(), Codecs.writeMapTileOptions(call, options), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Submits a copied viewport-options command.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_set_viewport_options</a>
   */
  public CompletableFuture<CommandCompletion> setViewportOptions(MapViewportOptions options) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_set_viewport_options(
                      id(), Codecs.writeMapViewportOptions(call, options), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Submits one atomic camera update.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_update_camera</a>
   */
  public CompletableFuture<CommandCompletion> updateCamera(CameraUpdate update) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_map_update_camera(
                      id(), Codecs.writeCameraUpdate(call, update), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
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
     * Adds a custom geometry source.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_add_custom_geometry_source</a>
     */
    public void addCustomGeometrySource(String sourceId, CustomGeometrySourceOptions options) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_add_custom_geometry_source(
                id(),
                call.view(call.text(sourceId)),
                Codecs.writeCustomGeometrySourceOptions(call, options),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Adds a custom vector source.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_add_custom_vector_source</a>
     */
    public void addCustomVectorSource(String sourceId, CustomVectorSourceOptions options) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_add_custom_vector_source(
                id(),
                call.view(call.text(sourceId)),
                Codecs.writeCustomVectorSourceOptions(call, options),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Adds a GeoJSON source with prepared inline data.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_add_geo_json_source_data</a>
     */
    public void addGeoJsonSourceData(String sourceId, GeoJsonSourceDataHandle data) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_add_geo_json_source_data(
                id(),
                call.view(call.text(sourceId)),
                call.handle(data),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Adds a GeoJSON source with URL data.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_add_geo_json_source_url</a>
     */
    public void addGeoJsonSourceUrl(String sourceId, String url, GeoJsonSourceOptions options) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_add_geo_json_source_url(
                id(),
                call.view(call.text(sourceId)),
                call.view(call.text(url)),
                (options == null
                    ? MemorySegment.NULL
                    : Codecs.writeGeoJsonSourceOptions(call, options)),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Adds an image source with inline image pixels.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_add_image_source_image</a>
     */
    public void addImageSourceImage(
        String sourceId, java.util.List<LatLng> coordinates, PremultipliedRgba8Image image) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_add_image_source_image(
                id(),
                call.view(call.text(sourceId)),
                call.array(
                    coordinates,
                    org.maplibre.nativeffi.internal.c.Layouts.LatLng,
                    (elementTarget, elementValue) -> {
                      MemorySegment.copy(
                          Codecs.writeLatLng(call, elementValue),
                          0,
                          elementTarget,
                          0,
                          org.maplibre.nativeffi.internal.c.Layouts.LatLng.byteSize());
                    }),
                (long) Call.length(coordinates),
                Codecs.writePremultipliedRgba8Image(call, image),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Adds an image source that loads its image from a URL.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_add_image_source_url</a>
     */
    public void addImageSourceUrl(String sourceId, java.util.List<LatLng> coordinates, String url) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_add_image_source_url(
                id(),
                call.view(call.text(sourceId)),
                call.array(
                    coordinates,
                    org.maplibre.nativeffi.internal.c.Layouts.LatLng,
                    (elementTarget, elementValue) -> {
                      MemorySegment.copy(
                          Codecs.writeLatLng(call, elementValue),
                          0,
                          elementTarget,
                          0,
                          org.maplibre.nativeffi.internal.c.Layouts.LatLng.byteSize());
                    }),
                (long) Call.length(coordinates),
                call.view(call.text(url)),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Adds one style layer from a full style-spec layer JSON object.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_add_style_layer_json</a>
     */
    public void addStyleLayerJson(String layerJson, String beforeLayerId) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_add_style_layer_json(
                id(),
                call.view(call.text(layerJson)),
                call.view(call.text(beforeLayerId)),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Adds one style source from a style-spec source JSON object.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_add_style_source_json</a>
     */
    public void addStyleSourceJson(String sourceId, String sourceJson) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_add_style_source_json(
                id(),
                call.view(call.text(sourceId)),
                call.view(call.text(sourceJson)),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Submits one atomic relative camera update.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_apply_camera_delta</a>
     */
    public void applyCameraDelta(CameraDelta delta) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_apply_camera_delta(
                id(),
                Codecs.writeCameraDelta(call, delta),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Begins a command group, which holds this map&#x27;s render updates until the group ends.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_begin_command_group</a>
     */
    public void beginCommandGroup() {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_begin_command_group(id(), MemorySegment.NULL, call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Cancels the camera transitions of the commands whose animation carried transition_id, and
     * leaves every other transition running.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_cancel_camera_transition</a>
     */
    public void cancelCameraTransition(long transitionId) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_cancel_camera_transition(
                id(), transitionId, MemorySegment.NULL, call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Cancels the camera transitions running when this command commits.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_cancel_transitions</a>
     */
    public void cancelTransitions() {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_cancel_transitions(id(), MemorySegment.NULL, call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Submits an ordered debug-log command.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_dump_debug_logs</a>
     */
    public void dumpDebugLogs() {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(C.mln_map_dump_debug_logs(id(), MemorySegment.NULL, call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Ends the innermost command group that {@code mln_map_begin_command_group()} began.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_end_command_group</a>
     */
    public void endCommandGroup() {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_end_command_group(id(), MemorySegment.NULL, call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Invalidates custom geometry source data inside one geographic region.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_invalidate_custom_geometry_source_region</a>
     */
    public void invalidateCustomGeometrySourceRegion(String sourceId, LatLngBounds bounds) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_invalidate_custom_geometry_source_region(
                id(),
                call.view(call.text(sourceId)),
                Codecs.writeLatLngBounds(call, bounds),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Invalidates custom geometry source data for one canonical tile.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_invalidate_custom_geometry_source_tile</a>
     */
    public void invalidateCustomGeometrySourceTile(String sourceId, CanonicalTileId tileId) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_invalidate_custom_geometry_source_tile(
                id(),
                call.view(call.text(sourceId)),
                Codecs.writeCanonicalTileId(call, tileId),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Invalidates custom vector source data for one canonical tile.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_invalidate_custom_vector_source_tile</a>
     */
    public void invalidateCustomVectorSourceTile(String sourceId, CanonicalTileId tileId) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_invalidate_custom_vector_source_tile(
                id(),
                call.view(call.text(sourceId)),
                Codecs.writeCanonicalTileId(call, tileId),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Moves one style layer before another layer or to the top.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_move_style_layer</a>
     */
    public void moveStyleLayer(String layerId, String beforeLayerId) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_move_style_layer(
                id(),
                call.view(call.text(layerId)),
                call.view(call.text(beforeLayerId)),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Removes per-feature state from this map.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_remove_feature_state</a>
     */
    public void removeFeatureState(FeatureStateSelector selector) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_remove_feature_state(
                id(),
                Codecs.writeFeatureStateSelector(call, selector),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Removes one runtime style image by ID.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_remove_style_image</a>
     */
    public void removeStyleImage(String imageId) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_remove_style_image(
                id(),
                call.view(call.text(imageId)),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Removes one style layer by ID.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_remove_style_layer</a>
     */
    public void removeStyleLayer(String layerId) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_remove_style_layer(
                id(),
                call.view(call.text(layerId)),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Removes one style source by ID.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_remove_style_source</a>
     */
    public void removeStyleSource(String sourceId) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_remove_style_source(
                id(),
                call.view(call.text(sourceId)),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Requests a repaint for a continuous map.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_request_repaint</a>
     */
    public void requestRepaint() {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(C.mln_map_request_repaint(id(), MemorySegment.NULL, call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Submits the sole post-creation logical extent update.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_resize</a>
     */
    public void resize(LogicalExtent extent) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_resize(
                id(),
                Codecs.writeLogicalExtent(call, extent),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Submits a copied camera-constraint command.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_set_bounds</a>
     */
    public void setBounds(BoundOptions options) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_set_bounds(
                id(),
                Codecs.writeBoundOptions(call, options),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Sets custom geometry source data for one canonical tile.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_custom_geometry_source_tile_data</a>
     */
    public void setCustomGeometrySourceTileData(
        String sourceId, CanonicalTileId tileId, String data) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_set_custom_geometry_source_tile_data(
                id(),
                call.view(call.text(sourceId)),
                Codecs.writeCanonicalTileId(call, tileId),
                call.view(call.text(data)),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Reports a custom geometry source error for one canonical tile.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_custom_geometry_source_tile_error</a>
     */
    public void setCustomGeometrySourceTileError(
        String sourceId, CanonicalTileId tileId, String message) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_set_custom_geometry_source_tile_error(
                id(),
                call.view(call.text(sourceId)),
                Codecs.writeCanonicalTileId(call, tileId),
                call.view(call.text(message)),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Sets custom vector source data for one canonical tile.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_custom_vector_source_tile_data</a>
     */
    public void setCustomVectorSourceTileData(
        String sourceId, CanonicalTileId tileId, StyleVectorTileEncoding encoding, byte[] data) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_set_custom_vector_source_tile_data(
                id(),
                call.view(call.text(sourceId)),
                Codecs.writeCanonicalTileId(call, tileId),
                encoding.rawValue(),
                call.view(call.bytes(data)),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Reports a custom vector source error for one canonical tile.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_custom_vector_source_tile_error</a>
     */
    public void setCustomVectorSourceTileError(
        String sourceId, CanonicalTileId tileId, String message) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_set_custom_vector_source_tile_error(
                id(),
                call.view(call.text(sourceId)),
                Codecs.writeCanonicalTileId(call, tileId),
                call.view(call.text(message)),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Submits a debug-overlay command.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_set_debug_options</a>
     */
    public void setDebugOptions(MapDebugFlag options) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_set_debug_options(
                id(), options.rawValue(), MemorySegment.NULL, call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Selects which map-originated event types this map queues.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_set_event_mask</a>
     */
    public void setEventMask(RuntimeEventFlag mask) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_set_event_mask(
                id(), mask.rawValue(), MemorySegment.NULL, call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Submits a copied per-feature-state command.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_set_feature_state</a>
     */
    public void setFeatureState(FeatureStateSelector selector, String state) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_set_feature_state(
                id(),
                Codecs.writeFeatureStateSelector(call, selector),
                call.view(call.text(state)),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Submits a copied free-camera command.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_set_free_camera_options</a>
     */
    public void setFreeCameraOptions(FreeCameraOptions options) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_set_free_camera_options(
                id(),
                Codecs.writeFreeCameraOptions(call, options),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Updates one GeoJSON source with prepared inline data.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_geo_json_source_data</a>
     */
    public void setGeoJsonSourceData(String sourceId, GeoJsonSourceDataHandle data) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_set_geo_json_source_data(
                id(),
                call.view(call.text(sourceId)),
                call.handle(data),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Overrides one GeoJSON source&#x27;s synchronous tiling at runtime.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_geo_json_source_synchronous_tiling</a>
     */
    public void setGeoJsonSourceSynchronousTiling(String sourceId, boolean enabled) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_set_geo_json_source_synchronous_tiling(
                id(),
                call.view(call.text(sourceId)),
                enabled,
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Updates one GeoJSON source to load data from a URL.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_geo_json_source_url</a>
     */
    public void setGeoJsonSourceUrl(String sourceId, String url) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_set_geo_json_source_url(
                id(),
                call.view(call.text(sourceId)),
                call.view(call.text(url)),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Submits a global-state JSON value. JSON null restores the style default.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_global_state_property</a>
     */
    public void setGlobalStateProperty(String propertyName, String value$) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_set_global_state_property(
                id(),
                call.view(call.text(propertyName)),
                call.view(call.text(value$)),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Updates image source coordinates.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_image_source_coordinates</a>
     */
    public void setImageSourceCoordinates(String sourceId, java.util.List<LatLng> coordinates) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_set_image_source_coordinates(
                id(),
                call.view(call.text(sourceId)),
                call.array(
                    coordinates,
                    org.maplibre.nativeffi.internal.c.Layouts.LatLng,
                    (elementTarget, elementValue) -> {
                      MemorySegment.copy(
                          Codecs.writeLatLng(call, elementValue),
                          0,
                          elementTarget,
                          0,
                          org.maplibre.nativeffi.internal.c.Layouts.LatLng.byteSize());
                    }),
                (long) Call.length(coordinates),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Updates an image source with inline image pixels.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_image_source_image</a>
     */
    public void setImageSourceImage(String sourceId, PremultipliedRgba8Image image) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_set_image_source_image(
                id(),
                call.view(call.text(sourceId)),
                Codecs.writePremultipliedRgba8Image(call, image),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Updates an image source to load its image from a URL.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_image_source_url</a>
     */
    public void setImageSourceUrl(String sourceId, String url) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_set_image_source_url(
                id(),
                call.view(call.text(sourceId)),
                call.view(call.text(url)),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Submits axonometric rendering options.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_set_projection_mode</a>
     */
    public void setProjectionMode(ProjectionMode mode) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_set_projection_mode(
                id(),
                Codecs.writeProjectionMode(call, mode),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Submits a rendering-stats visibility command.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_set_rendering_stats_view_enabled</a>
     */
    public void setRenderingStatsViewEnabled(boolean enabled) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_set_rendering_stats_view_enabled(
                id(), enabled, MemorySegment.NULL, call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Sets one runtime style image.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_style_image</a>
     */
    public void setStyleImage(
        String imageId, PremultipliedRgba8Image image, StyleImageOptions options) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_set_style_image(
                id(),
                call.view(call.text(imageId)),
                Codecs.writePremultipliedRgba8Image(call, image),
                (options == null
                    ? MemorySegment.NULL
                    : Codecs.writeStyleImageOptions(call, options)),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Queues an inline style JSON command. A committed command means the map applied the JSON, not
     * that the style loaded: style loading events report the resource and parse results that
     * follow.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_set_style_json</a>
     */
    public void setStyleJson(String json) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_set_style_json(
                id(), call.view(call.text(json)), MemorySegment.NULL, call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Sets one layer property using its MapLibre style-spec property name.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_style_layer_property</a>
     */
    public void setStyleLayerProperty(String layerId, String propertyName, String value$) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_set_style_layer_property(
                id(),
                call.view(call.text(layerId)),
                call.view(call.text(propertyName)),
                call.view(call.text(value$)),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Sets the style light from a style-spec light JSON object.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_style_light_json</a>
     */
    public void setStyleLightJson(String lightJson) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_set_style_light_json(
                id(),
                call.view(call.text(lightJson)),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Sets one style light property using its MapLibre style-spec property name.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_style_light_property</a>
     */
    public void setStyleLightProperty(String propertyName, String value$) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_set_style_light_property(
                id(),
                call.view(call.text(propertyName)),
                call.view(call.text(value$)),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Sets whether one style source stores fetched tiles in the persistent cache.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_style_source_volatile</a>
     */
    public void setStyleSourceVolatile(String sourceId, boolean isVolatile) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_set_style_source_volatile(
                id(),
                call.view(call.text(sourceId)),
                isVolatile,
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Sets the style&#x27;s global transition options.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_style_transition_options</a>
     */
    public void setStyleTransitionOptions(StyleTransitionOptions options) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_set_style_transition_options(
                id(),
                Codecs.writeStyleTransitionOptions(call, options),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Queues a style URL command. A committed command means the map accepted the URL, not that the
     * style loaded: style loading events report the network, decode, and parse results that follow.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_set_style_url</a>
     */
    public void setStyleUrl(String url) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_set_style_url(
                id(), call.view(call.text(url)), MemorySegment.NULL, call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Submits a copied tile-options command.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_set_tile_options</a>
     */
    public void setTileOptions(MapTileOptions options) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_set_tile_options(
                id(),
                Codecs.writeMapTileOptions(call, options),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Submits a copied viewport-options command.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_set_viewport_options</a>
     */
    public void setViewportOptions(MapViewportOptions options) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_set_viewport_options(
                id(),
                Codecs.writeMapViewportOptions(call, options),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
      }
    }

    /**
     * Submits one atomic camera update.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_update_camera</a>
     */
    public void updateCamera(CameraUpdate update) {
      try (var call = new Call(MapHandle.this, 0, false)) {
        call.check(
            C.mln_map_update_camera(
                id(),
                Codecs.writeCameraUpdate(call, update),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(MapHandle.this);
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
