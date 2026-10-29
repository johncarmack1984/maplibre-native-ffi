// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import java.util.concurrent.CompletableFuture;
import org.maplibre.nativeffi.internal.c.C;

/**
 * A runtime: the native scheduler thread and event store for its maps.
 *
 * @see <a href="https://maplibre.org/maplibre-native-ffi/reference/c/base_8h.html">mln_runtime</a>
 */
public final class RuntimeHandle extends Owner implements AutoCloseable, AsyncReleasable {
  RuntimeHandle(long id, Object parent) {
    super("RuntimeHandle", id, parent, RuntimeHandle::disposeNative);
  }

  static RuntimeHandle adopt(long id, Object parent) {
    try {
      return new RuntimeHandle(id, parent);
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
      call.check(C.mln_runtime_dispose(id, call.diagnostic.segment()));
    }
  }

  /**
   * Stops event delivery and retires the previous handler.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_clear_event_handler</a>
   */
  public CompletableFuture<CommandCompletion> clearEventHandler() {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_runtime_clear_event_handler(id(), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Clears the runtime-scoped outgoing HTTP header transform.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_clear_http_header_transform</a>
   */
  public CompletableFuture<CommandCompletion> clearHttpHeaderTransform() {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_runtime_clear_http_header_transform(id(), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Clears the runtime-scoped network resource provider.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_clear_resource_provider</a>
   */
  public CompletableFuture<CommandCompletion> clearResourceProvider() {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_runtime_clear_resource_provider(id(), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Clears the runtime-scoped URL transform for network resources.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_clear_resource_transform</a>
   */
  public CompletableFuture<CommandCompletion> clearResourceTransform() {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_runtime_clear_resource_transform(id(), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts creation of a map on the runtime.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_runtime_create_map</a>
   */
  public Pending<MapHandle> createMap(MapOptions options) {
    try (var call = new Call(this, 0, false)) {
      var out0 = call.arena.allocate(JAVA_LONG);
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_runtime_create_map(
                      id(), Codecs.writeMapOptions(call, options), out0, completion, diagnostic),
              result -> null);
      var adopted = new Pending<>(MapHandle.adopt(out0.get(JAVA_LONG, 0), this), ready);
      call.accept(adopted.handle());
      return adopted;
    }
  }

  /**
   * Starts creating an offline region.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_runtime_create_offline_region</a>
   */
  public CompletableFuture<OfflineRegionInfo> createOfflineRegion(
      OfflineRegionDefinition definition, byte[] metadata) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<OfflineRegionInfo> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_runtime_create_offline_region(
                      id(),
                      Codecs.writeOfflineRegionDefinition(call, definition),
                      call.bytes(metadata),
                      (long) Call.length(metadata),
                      completion,
                      diagnostic),
              result ->
                  Codecs.readOfflineRegionInfo(
                      result
                          .value()
                          .reinterpret(
                              org.maplibre.nativeffi.internal.c.Layouts.OfflineRegionInfo
                                  .byteSize()),
                      null));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Deletes an offline region.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_runtime_delete_offline_region</a>
   */
  public CompletableFuture<Void> deleteOfflineRegion(long regionId) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_runtime_delete_offline_region(id(), regionId, completion, diagnostic),
              result -> null);
      call.accept(this);
      return ready;
    }
  }

  /**
   * Reports which runtime-scoped event types this runtime queues.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_get_event_mask</a>
   */
  public RuntimeEventFlag getEventMask() {
    try (var call = new Call(this, 1, false)) {
      var out0 = call.arena.allocate(JAVA_LONG);
      call.check(C.mln_runtime_get_event_mask(id(), out0, call.diagnostic.segment()));
      call.accept(this);
      return new RuntimeEventFlag(out0.get(JAVA_LONG, 0));
    }
  }

  /**
   * Starts getting one offline region by ID.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_runtime_get_offline_region</a>
   */
  public CompletableFuture<OfflineRegionInfo> getOfflineRegion(long regionId) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<OfflineRegionInfo> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_runtime_get_offline_region(id(), regionId, completion, diagnostic),
              result ->
                  (result.value_count() == 0
                      ? null
                      : Codecs.readOfflineRegionInfo(
                          result
                              .value()
                              .reinterpret(
                                  org.maplibre.nativeffi.internal.c.Layouts.OfflineRegionInfo
                                      .byteSize()),
                          null)));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts getting the current download status for an offline region.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_runtime_get_offline_region_status</a>
   */
  public CompletableFuture<OfflineRegionStatus> getOfflineRegionStatus(long regionId) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<OfflineRegionStatus> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_runtime_get_offline_region_status(id(), regionId, completion, diagnostic),
              result ->
                  Codecs.readOfflineRegionStatus(
                      result
                          .value()
                          .reinterpret(
                              org.maplibre.nativeffi.internal.c.Layouts.OfflineRegionStatus
                                  .byteSize()),
                      null));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Invalidates cached resources for an offline region.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_runtime_invalidate_offline_region</a>
   */
  public CompletableFuture<Void> invalidateOfflineRegion(long regionId) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_runtime_invalidate_offline_region(id(), regionId, completion, diagnostic),
              result -> null);
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts listing the offline regions in the runtime database.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_runtime_list_offline_regions</a>
   */
  public CompletableFuture<java.util.List<OfflineRegionInfo>> listOfflineRegions() {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<java.util.List<OfflineRegionInfo>> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_runtime_list_offline_regions(id(), completion, diagnostic),
              result ->
                  Memory.array(
                      result.segment().asSlice(48).get(ADDRESS, 0),
                      result.value_count(),
                      Integer.toUnsignedLong(result.value_size()),
                      org.maplibre.nativeffi.internal.c.Layouts.OfflineRegionInfo.byteSize(),
                      item -> Codecs.readOfflineRegionInfo(item, null)));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts merging offline regions from another MapLibre offline database.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_runtime_merge_offline_regions</a>
   */
  public CompletableFuture<java.util.List<OfflineRegionInfo>> mergeOfflineRegions(
      String sideDatabasePath) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<java.util.List<OfflineRegionInfo>> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_runtime_merge_offline_regions(
                      id(), call.view(call.text(sideDatabasePath)), completion, diagnostic),
              result ->
                  Memory.array(
                      result.segment().asSlice(48).get(ADDRESS, 0),
                      result.value_count(),
                      Integer.toUnsignedLong(result.value_size()),
                      org.maplibre.nativeffi.internal.c.Layouts.OfflineRegionInfo.byteSize(),
                      item -> Codecs.readOfflineRegionInfo(item, null)));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts release of a runtime after checking its children.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_release</a>
   */
  public CompletableFuture<Void> release() {
    try (var call = new Call(this, 2, false)) {
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) -> C.mln_runtime_release(id(), completion, diagnostic),
              result -> null);
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts a MapLibre ambient cache maintenance operation for this runtime.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_run_ambient_cache_operation</a>
   */
  public CompletableFuture<Void> runAmbientCacheOperation(AmbientCacheOperation operation) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_runtime_run_ambient_cache_operation(
                      id(), operation.rawValue(), completion, diagnostic),
              result -> null);
      call.accept(this);
      return ready;
    }
  }

  /**
   * Selects how runtime and map events reach the host.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_set_event_handler</a>
   */
  public CompletableFuture<CommandCompletion> setEventHandler(RuntimeEventHandler handler) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_runtime_set_event_handler(
                      id(), Codecs.writeRuntimeEventHandler(call, handler), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Selects which runtime-scoped event types this runtime queues.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_set_event_mask</a>
   */
  public void setEventMask(RuntimeEventFlag mask) {
    try (var call = new Call(this, 0, false)) {
      call.check(C.mln_runtime_set_event_mask(id(), mask.rawValue(), call.diagnostic.segment()));
      call.accept(this);
    }
  }

  /**
   * Registers or replaces the runtime-scoped outgoing HTTP header transform.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_set_http_header_transform</a>
   */
  public CompletableFuture<CommandCompletion> setHttpHeaderTransform(
      HttpHeaderTransform transform) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_runtime_set_http_header_transform(
                      id(),
                      Codecs.writeHttpHeaderTransform(call, transform),
                      completion,
                      diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts a change to this runtime&#x27;s maximum ambient cache size.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_set_maximum_ambient_cache_size</a>
   */
  public CompletableFuture<Void> setMaximumAmbientCacheSize(long size) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_runtime_set_maximum_ambient_cache_size(id(), size, completion, diagnostic),
              result -> null);
      call.accept(this);
      return ready;
    }
  }

  /**
   * Sets an offline region&#x27;s native download state.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_runtime_set_offline_region_download_state</a>
   */
  public CompletableFuture<Void> setOfflineRegionDownloadState(
      long regionId, OfflineRegionDownloadState state) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_runtime_set_offline_region_download_state(
                      id(), regionId, state.rawValue(), completion, diagnostic),
              result -> null);
      call.accept(this);
      return ready;
    }
  }

  /**
   * Enables or disables runtime events for an offline region.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_runtime_set_offline_region_observed</a>
   */
  public CompletableFuture<Void> setOfflineRegionObserved(long regionId, boolean observed) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<Void> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_runtime_set_offline_region_observed(
                      id(), regionId, observed, completion, diagnostic),
              result -> null);
      call.accept(this);
      return ready;
    }
  }

  /**
   * Registers or replaces a runtime-scoped network resource provider.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_set_resource_provider</a>
   */
  public CompletableFuture<CommandCompletion> setResourceProvider(ResourceProvider provider) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_runtime_set_resource_provider(
                      id(), Codecs.writeResourceProvider(call, provider), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Registers or updates a runtime-scoped URL transform for network resources.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_set_resource_transform</a>
   */
  public CompletableFuture<CommandCompletion> setResourceTransform(ResourceTransform transform) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<CommandCompletion> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_runtime_set_resource_transform(
                      id(), Codecs.writeResourceTransform(call, transform), completion, diagnostic),
              result ->
                  new CommandCompletion(result.generation(), result.render_update_generation()));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Starts updating opaque binary metadata for an offline region.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_runtime_update_offline_region_metadata</a>
   */
  public CompletableFuture<OfflineRegionInfo> updateOfflineRegionMetadata(
      long regionId, byte[] metadata) {
    try (var call = new Call(this, 0, false)) {
      CompletableFuture<OfflineRegionInfo> ready =
          Completions.submit(
              (completion, diagnostic) ->
                  C.mln_runtime_update_offline_region_metadata(
                      id(),
                      regionId,
                      call.bytes(metadata),
                      (long) Call.length(metadata),
                      completion,
                      diagnostic),
              result ->
                  Codecs.readOfflineRegionInfo(
                      result
                          .value()
                          .reinterpret(
                              org.maplibre.nativeffi.internal.c.Layouts.OfflineRegionInfo
                                  .byteSize()),
                      null));
      call.accept(this);
      return ready;
    }
  }

  /**
   * Creates a runtime.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_create</a>
   */
  public static RuntimeHandle create(RuntimeOptions options) {
    try (var call = new Call(null, 0, false)) {
      var out0 = call.arena.allocate(JAVA_LONG);
      call.check(
          C.mln_runtime_create(
              Codecs.writeRuntimeOptions(call, options), out0, call.diagnostic.segment()));
      var adopted = RuntimeHandle.adopt(out0.get(JAVA_LONG, 0), null);
      call.accept(adopted);
      return adopted;
    }
  }

  /** Ordered commands that discard their asynchronous outcomes. */
  public Discarding discarding() {
    return new Discarding();
  }

  public final class Discarding {
    private Discarding() {}

    /**
     * Stops event delivery and retires the previous handler.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_clear_event_handler</a>
     */
    public void clearEventHandler() {
      try (var call = new Call(RuntimeHandle.this, 0, false)) {
        call.check(
            C.mln_runtime_clear_event_handler(id(), MemorySegment.NULL, call.diagnostic.segment()));
        call.accept(RuntimeHandle.this);
      }
    }

    /**
     * Clears the runtime-scoped outgoing HTTP header transform.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_clear_http_header_transform</a>
     */
    public void clearHttpHeaderTransform() {
      try (var call = new Call(RuntimeHandle.this, 0, false)) {
        call.check(
            C.mln_runtime_clear_http_header_transform(
                id(), MemorySegment.NULL, call.diagnostic.segment()));
        call.accept(RuntimeHandle.this);
      }
    }

    /**
     * Clears the runtime-scoped network resource provider.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_clear_resource_provider</a>
     */
    public void clearResourceProvider() {
      try (var call = new Call(RuntimeHandle.this, 0, false)) {
        call.check(
            C.mln_runtime_clear_resource_provider(
                id(), MemorySegment.NULL, call.diagnostic.segment()));
        call.accept(RuntimeHandle.this);
      }
    }

    /**
     * Clears the runtime-scoped URL transform for network resources.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_clear_resource_transform</a>
     */
    public void clearResourceTransform() {
      try (var call = new Call(RuntimeHandle.this, 0, false)) {
        call.check(
            C.mln_runtime_clear_resource_transform(
                id(), MemorySegment.NULL, call.diagnostic.segment()));
        call.accept(RuntimeHandle.this);
      }
    }

    /**
     * Selects how runtime and map events reach the host.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_set_event_handler</a>
     */
    public void setEventHandler(RuntimeEventHandler handler) {
      try (var call = new Call(RuntimeHandle.this, 0, false)) {
        call.check(
            C.mln_runtime_set_event_handler(
                id(),
                Codecs.writeRuntimeEventHandler(call, handler),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(RuntimeHandle.this);
      }
    }

    /**
     * Registers or replaces the runtime-scoped outgoing HTTP header transform.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_set_http_header_transform</a>
     */
    public void setHttpHeaderTransform(HttpHeaderTransform transform) {
      try (var call = new Call(RuntimeHandle.this, 0, false)) {
        call.check(
            C.mln_runtime_set_http_header_transform(
                id(),
                Codecs.writeHttpHeaderTransform(call, transform),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(RuntimeHandle.this);
      }
    }

    /**
     * Registers or replaces a runtime-scoped network resource provider.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_set_resource_provider</a>
     */
    public void setResourceProvider(ResourceProvider provider) {
      try (var call = new Call(RuntimeHandle.this, 0, false)) {
        call.check(
            C.mln_runtime_set_resource_provider(
                id(),
                Codecs.writeResourceProvider(call, provider),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(RuntimeHandle.this);
      }
    }

    /**
     * Registers or updates a runtime-scoped URL transform for network resources.
     *
     * @see <a
     *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_set_resource_transform</a>
     */
    public void setResourceTransform(ResourceTransform transform) {
      try (var call = new Call(RuntimeHandle.this, 0, false)) {
        call.check(
            C.mln_runtime_set_resource_transform(
                id(),
                Codecs.writeResourceTransform(call, transform),
                MemorySegment.NULL,
                call.diagnostic.segment()));
        call.accept(RuntimeHandle.this);
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
