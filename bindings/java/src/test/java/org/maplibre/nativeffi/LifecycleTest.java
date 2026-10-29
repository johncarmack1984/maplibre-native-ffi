package org.maplibre.nativeffi;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.ref.WeakReference;
import java.util.concurrent.*;
import org.junit.jupiter.api.Test;

class LifecycleTest {
  @Test
  void refusedReleaseParentsAndEventSources() throws Exception {
    var events = new LinkedBlockingQueue<RuntimeEvent>();
    var runtime = RuntimeHandle.create(new RuntimeOptions());
    var weak = new WeakReference<>(runtime);
    runtime.setEventHandler(new RuntimeEventHandler(events::addAll)).get(10, TimeUnit.SECONDS);
    var created = runtime.createMap(new MapOptions(new LogicalExtent(16, 16, 1)));
    var map = created.handle();
    created.ready().get(10, TimeUnit.SECONDS);
    assertThrows(MaplibreException.class, runtime::release);
    assertFalse(runtime.isClosed());
    runtime.getEventMask();
    runtime = null;
    System.gc();
    assertNotNull(weak.get());
    map.setEventMask(RuntimeEventFlag.MAP_STYLE_LOADED).get(10, TimeUnit.SECONDS);
    map.setStyleJson("{\"version\":8,\"sources\":{},\"layers\":[]}").get(10, TimeUnit.SECONDS);
    long deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(10);
    RuntimeEvent event;
    do {
      event = events.poll(Math.max(1, deadline - System.nanoTime()), TimeUnit.NANOSECONDS);
      assertNotNull(event);
    } while (event.source() != map.id());
    long id = map.id();
    map.release().get(10, TimeUnit.SECONDS);
    assertEquals(id, map.id());
    map.close();
    map.close();
    weak.get().release().get(10, TimeUnit.SECONDS);
  }

  @Test
  void cancelRegistrationAcceptanceAndRejection() throws Exception {
    var received = new LinkedBlockingQueue<ResourceRequestHandle>();
    var runtime = RuntimeHandle.create(new RuntimeOptions());
    runtime
        .setResourceProvider(new ResourceProvider((info, request) -> received.add(request)))
        .get(10, TimeUnit.SECONDS);
    var created = runtime.createMap(new MapOptions(new LogicalExtent(16, 16, 1)));
    var map = created.handle();
    created.ready().get(10, TimeUnit.SECONDS);
    map.setStyleUrl("http://127.0.0.1/unresolved.json").get(10, TimeUnit.SECONDS);
    var request = received.poll(10, TimeUnit.SECONDS);
    assertNotNull(request);
    assertFalse(request.setCancelCallback(new ResourceRequestCancelHandler(() -> {})));
    assertEquals(1, request.callbacks.size());
    assertThrows(
        MaplibreException.class,
        () -> request.setCancelCallback(new ResourceRequestCancelHandler(() -> {})));
    assertEquals(1, request.callbacks.size());
    runtime.clearResourceProvider().get(10, TimeUnit.SECONDS);
    request.close();
    assertTrue(request.callbacks.isEmpty());
    runtime
        .setResourceProvider(new ResourceProvider((info, handle) -> received.add(handle)))
        .get(10, TimeUnit.SECONDS);
    map.setStyleUrl("http://127.0.0.1/other.json").get(10, TimeUnit.SECONDS);
    var cancelled = received.poll(10, TimeUnit.SECONDS);
    assertNotNull(cancelled);
    map.release().get(10, TimeUnit.SECONDS);
    runtime.release().get(10, TimeUnit.SECONDS);
    assertTrue(cancelled.setCancelCallback(new ResourceRequestCancelHandler(() -> {})));
    assertTrue(cancelled.callbacks.isEmpty());
    cancelled.close();
  }

  @Test
  void nestedCommandRegistrationAndGlobalReplacement() throws Exception {
    Maplibre.setLogCallback(new LogHandler((severity, event, code, message) -> false));
    int first = rootCount();
    Maplibre.setLogCallback(new LogHandler((severity, event, code, message) -> false));
    assertEquals(first, rootCount());
    Maplibre.clearLogCallback();
    assertEquals(first - 1, rootCount());
    try (var runtime = RuntimeHandle.create(new RuntimeOptions())) {
      var created = runtime.createMap(new MapOptions(new LogicalExtent(16, 16, 1)));
      try (var map = created.handle()) {
        created.ready().get(10, TimeUnit.SECONDS);
        int base = map.callbacks.size();
        var ended = new CompletableFuture<CameraTransitionEnd>();
        var animation =
            new AnimationOptions()
                .withDurationMs(60000.0)
                .withTransitionId(-1L)
                .withEndHandler(new CameraTransitionHandler(ended::complete));
        map.updateCamera(
                new CameraUpdate()
                    .withMode(CameraUpdateMode.EASE)
                    .withCamera(new CameraOptions().withZoom(4.0))
                    .withAnimation(animation))
            .get(10, TimeUnit.SECONDS);
        assertEquals(base + 1, map.callbacks.size());
        map.cancelCameraTransition(-1L).get(10, TimeUnit.SECONDS);
        assertEquals(CameraTransitionOutcome.CANCELLED, ended.get(10, TimeUnit.SECONDS).outcome());
        map.requestRepaint().get(10, TimeUnit.SECONDS);
        assertEquals(base, map.callbacks.size());
        assertThrows(
            MaplibreException.class,
            () -> map.applyCameraDelta(new CameraDelta().withScale(-1.0).withAnimation(animation)));
        assertEquals(base, map.callbacks.size());
        map.release().get(10, TimeUnit.SECONDS);
      }
      runtime.release().get(10, TimeUnit.SECONDS);
    }
  }

  private record Retirement(
      CompletableFuture<Void> ready,
      WeakReference<MapHandle> owner,
      WeakReference<CameraTransitionHandler> handler,
      CompletableFuture<CameraTransitionEnd> ended) {}

  private static Retirement queueRetirement(
      RuntimeHandle runtime,
      CountDownLatch blocked,
      CountDownLatch resume,
      java.lang.ref.ReferenceQueue<MapHandle> collected)
      throws Exception {
    var created = runtime.createMap(new MapOptions(new LogicalExtent(16, 16, 1)));
    var map = created.handle();
    created.ready().get(10, TimeUnit.SECONDS);
    var ended = new CompletableFuture<CameraTransitionEnd>();
    var handler = new CameraTransitionHandler(ended::complete);
    map.updateCamera(
            new CameraUpdate()
                .withMode(CameraUpdateMode.EASE)
                .withCamera(new CameraOptions().withZoom(4.0))
                .withAnimation(
                    new AnimationOptions().withDurationMs(60000.0).withEndHandler(handler)))
        .get(10, TimeUnit.SECONDS);
    Completions.submit(
        (completion, diagnostic) ->
            org.maplibre.nativeffi.internal.c.C.mln_map_get_camera(
                map.id(), completion, diagnostic),
        result -> {
          blocked.countDown();
          try {
            if (!resume.await(10, TimeUnit.SECONDS))
              throw new AssertionError("retirement gate timed out");
          } catch (InterruptedException error) {
            throw new AssertionError(error);
          }
          return null;
        });
    assertTrue(blocked.await(10, TimeUnit.SECONDS));
    return new Retirement(
        map.release(), new WeakReference<>(map, collected), new WeakReference<>(handler), ended);
  }

  @Test
  void callbacksSurviveOwnerCollectionDuringRetirement() throws Exception {
    try (var runtime = RuntimeHandle.create(new RuntimeOptions())) {
      var blocked = new CountDownLatch(1);
      var resume = new CountDownLatch(1);
      var collected = new java.lang.ref.ReferenceQueue<MapHandle>();
      Retirement retirement = null;
      try {
        retirement = queueRetirement(runtime, blocked, resume, collected);
        System.gc();
        assertSame(retirement.owner(), collected.remove(5000));
        assertNotNull(
            retirement.handler().get(), "native still owns the callback until retirement");
      } finally {
        resume.countDown();
      }
      retirement.ready().get(10, TimeUnit.SECONDS);
      assertEquals(
          CameraTransitionOutcome.CLOSED, retirement.ended().get(10, TimeUnit.SECONDS).outcome());
      runtime.release().get(10, TimeUnit.SECONDS);
    }
  }

  private static int rootCount() throws Exception {
    var field = Roots.class.getDeclaredField("ROOTS");
    field.setAccessible(true);
    return ((java.util.Map<?, ?>) field.get(null)).size();
  }
}
