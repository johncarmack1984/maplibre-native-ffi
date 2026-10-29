package org.maplibre.nativeffi.consumer;

import java.util.concurrent.TimeUnit;
import org.maplibre.nativeffi.*;

public final class JavaApiTest {
  private static void check(boolean condition, String message) {
    if (!condition) throw new AssertionError(message);
  }

  @org.junit.jupiter.api.Test
  public void lifecycle() throws Exception {
    NativeLibrary.load();
    var coordinate = Maplibre.latLngForProjectedMeters(new ProjectedMeters());
    check(coordinate.equals(new LatLng()), "by-value record ABI");
    try (var runtime = RuntimeHandle.create(new RuntimeOptions())) {
      var pending = runtime.createMap(new MapOptions(new LogicalExtent(64, 64, 1)));
      try (var map = pending.handle()) {
        pending.ready().get(10, TimeUnit.SECONDS);
        var completion =
            map.setStyleJson("{\"version\":8,\"sources\":{},\"layers\":[]}")
                .get(10, TimeUnit.SECONDS);
        check(completion.generation() != 0, "command generation");
        var camera = map.getCamera().get(10, TimeUnit.SECONDS);
        check(camera != null, "copied camera query");
        map.release().get(10, TimeUnit.SECONDS);
      }
      runtime.release().get(10, TimeUnit.SECONDS);
    }
    System.out.println(
        "Managed Java handles, copied values, command/query futures, and release passed");
  }

  private static final String RED =
      "{\"version\":8,\"sources\":{},\"layers\":[{\"id\":\"background\",\"type\":\"background\",\"paint\":{\"background-color\":\"#ff0000\"}}]}";

  @org.junit.jupiter.api.Test
  public void renderReadbackAndBorrow() throws Exception {
    try (var runtime = RuntimeHandle.create(new RuntimeOptions());
        var graphics = new TestGraphics()) {
      var created =
          runtime.createMap(
              new MapOptions(new LogicalExtent(32, 16, 1)).withMapMode(MapMode.STATIC));
      try (var map = created.handle()) {
        created.ready().get(10, TimeUnit.SECONDS);
        var frames = new java.util.concurrent.Semaphore(0);
        var attached =
            graphics.attach(
                map,
                new LogicalExtent(32, 16, 1),
                new RenderSessionAttachOptions(RenderDriverKind.CORE_WORKER)
                    .withRequestedTextureRingDepth(2)
                    .withFrameWake(new Wake(frames::release)));
        try (var session = attached.handle()) {
          attached.ready().get(10, TimeUnit.SECONDS);
          check(session.drainFrameResults().isEmpty(), "empty drain");
          check(session.acquireFrame() == null, "absent frame");
          map.setStyleJson(RED).get(10, TimeUnit.SECONDS);
          var still = map.requestStillImage();
          session.requestFrame(
              new FrameDemand(FrameDemandFlag.FORCE.or(FrameDemandFlag.PRESENT), 1));
          long deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(10);
          while (session.drainFrameResults().stream()
              .noneMatch(r -> r.disposition().equals(RenderResult.RENDERED))) {
            long remaining = deadline - System.nanoTime();
            check(
                remaining > 0 && frames.tryAcquire(remaining, TimeUnit.NANOSECONDS),
                "frame wake timeout");
          }
          still.get(10, TimeUnit.SECONDS);
          var readback = session.readTexture().get(10, TimeUnit.SECONDS);
          check(
              readback.info().width() == 32 && readback.info().height() == 16,
              "readback dimensions");
          byte[] pixels = readback.data();
          int center = 8 * readback.info().stride() + 16 * 4;
          check(
              (pixels[center] & 255) == 255
                  && pixels[center + 1] == 0
                  && pixels[center + 2] == 0
                  && (pixels[center + 3] & 255) == 255,
              "copied red pixels");
          var frame = session.acquireFrame();
          check(frame != null, "acquired frame");
          try {
            var escaped =
                frame.withProducerSync(
                    sync -> {
                      org.junit.jupiter.api.Assertions.assertThrows(
                          IllegalStateException.class, () -> frame.release(null));
                      return sync;
                    });
            escaped.kind();
            org.junit.jupiter.api.Assertions.assertThrows(
                IllegalStateException.class, escaped::handle);
          } finally {
            frame.release(null);
          }
          session.detach().get(10, TimeUnit.SECONDS);
          session.release().get(10, TimeUnit.SECONDS);
        }
        map.release().get(10, TimeUnit.SECONDS);
      }
      runtime.release().get(10, TimeUnit.SECONDS);
    }
  }

  @org.junit.jupiter.api.Test
  public void providerAndTransformAnswerOnJavaExecutor() throws Exception {
    try (var runtime = RuntimeHandle.create(new RuntimeOptions());
        var executor = java.util.concurrent.Executors.newSingleThreadExecutor()) {
      var transforms =
          new java.util.concurrent.LinkedBlockingQueue<ResourceTransformRequestHandle>();
      var requests = new java.util.concurrent.LinkedBlockingQueue<ResourceRequestHandle>();
      var infos = new java.util.concurrent.LinkedBlockingQueue<ResourceRequestInfo>();
      runtime
          .setResourceTransform(
              new ResourceTransform((kind, url, request) -> transforms.add(request)))
          .get(10, TimeUnit.SECONDS);
      var routes =
          new java.util.ArrayList<>(
              java.util.List.of(new ResourceRoute().withUrl("http://127.0.0.1/original.json")));
      runtime
          .setResourceProvider(
              new ResourceProvider(
                  (info, handle) -> {
                    infos.add(info);
                    requests.add(handle);
                  },
                  routes))
          .get(10, TimeUnit.SECONDS);
      routes.clear();
      var created = runtime.createMap(new MapOptions(new LogicalExtent(16, 16, 1)));
      try (var map = created.handle()) {
        created.ready().get(10, TimeUnit.SECONDS);
        map.setStyleUrl("http://127.0.0.1/original.json").get(10, TimeUnit.SECONDS);
        var request = requests.poll(10, TimeUnit.SECONDS);
        check(request != null, "retained provider request");
        check(
            infos.remove().resolvedUrl().equals("http://127.0.0.1/original.json"), "copied route");
        executor
            .submit(
                () ->
                    request.complete(
                        new ResourceResponse()
                            .withBytes(RED.getBytes(java.nio.charset.StandardCharsets.UTF_8))))
            .get(10, TimeUnit.SECONDS);
        check(request.isClosed(), "consumed provider owner");
        runtime.clearResourceProvider().get(10, TimeUnit.SECONDS);
        map.setStyleUrl("http://127.0.0.1/other.json").get(10, TimeUnit.SECONDS);
        var transform = transforms.poll(10, TimeUnit.SECONDS);
        check(transform != null, "retained transform request");
        executor
            .submit(() -> transform.complete("unsupported://rewritten"))
            .get(10, TimeUnit.SECONDS);
        check(transform.isClosed(), "consumed transform owner");
        map.release().get(10, TimeUnit.SECONDS);
      }
      runtime.clearResourceProvider().get(10, TimeUnit.SECONDS);
      runtime.clearResourceTransform().get(10, TimeUnit.SECONDS);
      runtime.release().get(10, TimeUnit.SECONDS);
    }
  }

  @org.junit.jupiter.api.Test
  public void discardedCommandsFenceAndReject() throws Exception {
    try (var runtime = RuntimeHandle.create(new RuntimeOptions())) {
      var created = runtime.createMap(new MapOptions(new LogicalExtent(16, 16, 1)));
      try (var map = created.handle()) {
        created.ready().get(10, TimeUnit.SECONDS);
        map.discarding().setStyleJson(RED);
        map.updateCamera(new CameraUpdate().withCamera(new CameraOptions().withZoom(3.5)))
            .get(10, TimeUnit.SECONDS);
        check(map.getCamera().get(10, TimeUnit.SECONDS).camera().zoom() == 3.5, "command fence");
        map.release().get(10, TimeUnit.SECONDS);
        org.junit.jupiter.api.Assertions.assertThrows(
            MaplibreException.class, () -> map.discarding().setStyleJson(RED));
      }
      runtime.release().get(10, TimeUnit.SECONDS);
    }
  }

  @org.junit.jupiter.api.Test
  public void callerSizedTextAndProjectionArrays() throws Exception {
    String text = "x".repeat(1200);
    try (var expression =
        StyleExpressionHandle.create(
            "[\"literal\",\"" + text + "\"]", new StyleExpressionOptions())) {
      check(
          expression.evaluate(new StyleExpressionInputs()).equals("\"" + text + "\""),
          "caller-sized UTF8 JSON");
    }
    try (var runtime = RuntimeHandle.create(new RuntimeOptions())) {
      var created = runtime.createMap(new MapOptions(new LogicalExtent(64, 64, 1)));
      try (var map = created.handle()) {
        created.ready().get(10, TimeUnit.SECONDS);
        try (var projection = MapProjectionHandle.create(map.getSnapshot().view())) {
          var coordinates = java.util.List.of(new LatLng(0, 0), new LatLng(10, 20));
          var points = projection.pixelsForLatLngs(coordinates);
          check(points.size() == 2, "caller-sized array count");
          for (int i = 0; i < points.size(); i++)
            check(
                points.get(i).equals(projection.pixelForLatLng(coordinates.get(i))),
                "caller-sized array order");
        }
        map.release().get(10, TimeUnit.SECONDS);
      }
      runtime.release().get(10, TimeUnit.SECONDS);
    }
  }

  @org.junit.jupiter.api.Test
  public void callerDrivenSessionUsesJavaExecutor() throws Exception {
    try (var runtime = RuntimeHandle.create(new RuntimeOptions());
        var graphics = new TestGraphics();
        var executor = java.util.concurrent.Executors.newSingleThreadExecutor()) {
      var created =
          runtime.createMap(
              new MapOptions(new LogicalExtent(16, 16, 1)).withMapMode(MapMode.STATIC));
      try (var map = created.handle()) {
        created.ready().get(10, TimeUnit.SECONDS);
        var wake = new java.util.concurrent.Semaphore(0);
        var attached =
            graphics.attach(
                map,
                new LogicalExtent(16, 16, 1),
                new RenderSessionAttachOptions(RenderDriverKind.CALLER_GRAPHICS_THREAD)
                    .withRequestedTextureRingDepth(2)
                    .withDriverWorkWake(new Wake(wake::release)));
        try (var session = attached.handle()) {
          var running = new java.util.concurrent.atomic.AtomicBoolean(true);
          var driver =
              executor.submit(
                  () -> {
                    try {
                      while (running.get()) {
                        wake.acquire();
                        if (running.get()) session.serviceDriverWork();
                      }
                    } catch (InterruptedException error) {
                      throw new AssertionError(error);
                    }
                  });
          try {
            wake.release();
            attached.ready().get(10, TimeUnit.SECONDS);
            map.setStyleJson(RED).get(10, TimeUnit.SECONDS);
            var still = map.requestStillImage();
            session.requestFrame(
                new FrameDemand(FrameDemandFlag.FORCE.or(FrameDemandFlag.PRESENT), 1));
            still.get(10, TimeUnit.SECONDS);
            check(
                session.readTexture().get(10, TimeUnit.SECONDS).data().length > 0,
                "caller-driven readback");
            var wrongThread =
                org.junit.jupiter.api.Assertions.assertThrows(
                    MaplibreException.class, session::serviceDriverWork);
            check(wrongThread.status().equals(Status.WRONG_THREAD), "driver thread affinity");
            session.detach().get(10, TimeUnit.SECONDS);
            session.release().get(10, TimeUnit.SECONDS);
          } finally {
            running.set(false);
            wake.release();
            driver.get(10, TimeUnit.SECONDS);
          }
        }
        map.release().get(10, TimeUnit.SECONDS);
      }
      runtime.release().get(10, TimeUnit.SECONDS);
    }
  }
}
