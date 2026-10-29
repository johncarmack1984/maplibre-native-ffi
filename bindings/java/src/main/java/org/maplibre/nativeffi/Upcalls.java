// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import org.maplibre.nativeffi.internal.c.C;

final class Upcalls {
  private Upcalls() {}

  static final MemorySegment LogHandler_callback =
      ((org.maplibre.nativeffi.internal.c.LogCallback)
              (userData, severity, event, code, message) -> {
                var value = (LogHandler) Roots.get(userData.address());
                if (value == null) {
                  return false;
                }
                try (var scope = new Scope()) {
                  return value
                      .callback()
                      .invoke(
                          new LogSeverity(severity),
                          new LogEvent(event),
                          code,
                          Memory.textView(message));
                } catch (Throwable failure) {
                  Roots.report(failure);
                  return false;
                }
              })
          .stub(Arena.global());
  static final MemorySegment CustomGeometrySourceOptions_fetchTile =
      ((org.maplibre.nativeffi.internal.c.CustomSourceFetchTileCallback)
              (userData, tileId) -> {
                var value = (CustomGeometrySourceOptions) Roots.get(userData.address());
                if (value == null) {
                  return;
                }
                try (var scope = new Scope()) {
                  value.fetchTile().invoke(Codecs.readCanonicalTileId(tileId, scope));
                } catch (Throwable failure) {
                  Roots.report(failure);
                  return;
                }
              })
          .stub(Arena.global());
  static final MemorySegment CustomGeometrySourceOptions_cancelTile =
      ((org.maplibre.nativeffi.internal.c.CustomSourceCancelTileCallback)
              (userData, tileId) -> {
                var value = (CustomGeometrySourceOptions) Roots.get(userData.address());
                if (value == null) {
                  return;
                }
                try (var scope = new Scope()) {
                  value.cancelTile().invoke(Codecs.readCanonicalTileId(tileId, scope));
                } catch (Throwable failure) {
                  Roots.report(failure);
                  return;
                }
              })
          .stub(Arena.global());
  static final MemorySegment CustomVectorSourceOptions_fetchTile =
      ((org.maplibre.nativeffi.internal.c.CustomSourceFetchTileCallback)
              (userData, tileId) -> {
                var value = (CustomVectorSourceOptions) Roots.get(userData.address());
                if (value == null) {
                  return;
                }
                try (var scope = new Scope()) {
                  value.fetchTile().invoke(Codecs.readCanonicalTileId(tileId, scope));
                } catch (Throwable failure) {
                  Roots.report(failure);
                  return;
                }
              })
          .stub(Arena.global());
  static final MemorySegment CustomVectorSourceOptions_cancelTile =
      ((org.maplibre.nativeffi.internal.c.CustomSourceCancelTileCallback)
              (userData, tileId) -> {
                var value = (CustomVectorSourceOptions) Roots.get(userData.address());
                if (value == null) {
                  return;
                }
                try (var scope = new Scope()) {
                  value.cancelTile().invoke(Codecs.readCanonicalTileId(tileId, scope));
                } catch (Throwable failure) {
                  Roots.report(failure);
                  return;
                }
              })
          .stub(Arena.global());
  static final MemorySegment CameraTransitionHandler_callback =
      ((org.maplibre.nativeffi.internal.c.CameraTransitionEndCallback)
              (userData, end) -> {
                var value = (CameraTransitionHandler) Roots.get(userData.address());
                if (value == null) {
                  return;
                }
                try (var scope = new Scope()) {
                  value
                      .callback()
                      .invoke(
                          Codecs.readCameraTransitionEnd(
                              end.reinterpret(
                                  org.maplibre.nativeffi.internal.c.Layouts.CameraTransitionEnd
                                      .byteSize()),
                              scope));
                } catch (Throwable failure) {
                  Roots.report(failure);
                  return;
                }
              })
          .stub(Arena.global());
  static final MemorySegment Wake_callback =
      ((org.maplibre.nativeffi.internal.c.WakeCallback)
              (userData) -> {
                var value = (Wake) Roots.get(userData.address());
                if (value == null) {
                  return;
                }
                try (var scope = new Scope()) {
                  value.callback().invoke();
                } catch (Throwable failure) {
                  Roots.report(failure);
                  return;
                }
              })
          .stub(Arena.global());
  static final MemorySegment QueueLock_lock =
      ((org.maplibre.nativeffi.internal.c.QueueLockCallback)
              (userData) -> {
                var value = (QueueLock) Roots.get(userData.address());
                if (value == null) {
                  return;
                }
                try (var scope = new Scope()) {
                  value.lock().invoke();
                } catch (Throwable failure) {
                  Roots.report(failure);
                  return;
                }
              })
          .stub(Arena.global());
  static final MemorySegment QueueLock_unlock =
      ((org.maplibre.nativeffi.internal.c.QueueLockCallback)
              (userData) -> {
                var value = (QueueLock) Roots.get(userData.address());
                if (value == null) {
                  return;
                }
                try (var scope = new Scope()) {
                  value.unlock().invoke();
                } catch (Throwable failure) {
                  Roots.report(failure);
                  return;
                }
              })
          .stub(Arena.global());
  static final MemorySegment ResourceRequestCancelHandler_callback =
      ((org.maplibre.nativeffi.internal.c.ResourceRequestCancelCallback)
              (userData, handle) -> {
                var value = (ResourceRequestCancelHandler) Roots.get(userData.address());
                if (value == null) {
                  return;
                }
                try (var scope = new Scope()) {
                  value.callback().invoke();
                } catch (Throwable failure) {
                  Roots.report(failure);
                  return;
                }
              })
          .stub(Arena.global());
  static final MemorySegment RuntimeEventHandler_callback =
      ((org.maplibre.nativeffi.internal.c.RuntimeEventCallback)
              (userData, events) -> {
                var value = (RuntimeEventHandler) Roots.get(userData.address());
                if (value == null) {
                  return;
                }
                try (var scope = new Scope()) {
                  value
                      .callback()
                      .invoke(
                          Codecs.readEventBatchView(
                              events.reinterpret(
                                  org.maplibre.nativeffi.internal.c.Layouts.EventBatchView
                                      .byteSize()),
                              scope));
                } catch (Throwable failure) {
                  Roots.report(failure);
                  return;
                }
              })
          .stub(Arena.global());
  static final MemorySegment HttpHeaderTransform_callback =
      ((org.maplibre.nativeffi.internal.c.HttpHeaderTransformCallback)
              (userData, kind, url, outResponse) -> {
                var value = (HttpHeaderTransform) Roots.get(userData.address());
                if (value == null) {
                  return C.MLN_STATUS_NATIVE_ERROR;
                }
                try (var scope = new Scope()) {
                  value
                      .callback()
                      .invoke(
                          new ResourceKind(kind),
                          Memory.textView(url),
                          new HttpHeaderTransformResponse(outResponse, scope));
                  return C.MLN_STATUS_OK;
                } catch (Throwable failure) {
                  if (failure instanceof MaplibreException error) return error.status().rawValue();
                  Roots.report(failure);
                  return C.MLN_STATUS_NATIVE_ERROR;
                }
              })
          .stub(Arena.global());
  static final MemorySegment ResourceProvider_callback =
      ((org.maplibre.nativeffi.internal.c.ResourceProviderCallback)
              (userData, request, handle) -> {
                var value = (ResourceProvider) Roots.get(userData.address());
                if (value == null) {
                  return;
                }
                try (var scope = new Scope()) {
                  value
                      .callback()
                      .invoke(
                          Codecs.readResourceRequestInfo(
                              request.reinterpret(
                                  org.maplibre.nativeffi.internal.c.Layouts.ResourceRequestInfo
                                      .byteSize()),
                              scope),
                          ResourceRequestHandle.adopt(handle, null));
                } catch (Throwable failure) {
                  Roots.report(failure);
                  return;
                }
              })
          .stub(Arena.global());
  static final MemorySegment ResourceTransform_callback =
      ((org.maplibre.nativeffi.internal.c.ResourceTransformCallback)
              (userData, kind, url, request) -> {
                var value = (ResourceTransform) Roots.get(userData.address());
                if (value == null) {
                  return;
                }
                try (var scope = new Scope()) {
                  value
                      .callback()
                      .invoke(
                          new ResourceKind(kind),
                          Memory.textView(url),
                          ResourceTransformRequestHandle.adopt(request, null));
                } catch (Throwable failure) {
                  Roots.report(failure);
                  return;
                }
              })
          .stub(Arena.global());
}
