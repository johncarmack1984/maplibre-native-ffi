package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.foreign.*;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import org.junit.jupiter.api.Test;
import org.maplibre.nativeffi.internal.c.C;
import org.maplibre.nativeffi.internal.c.Completion;
import org.maplibre.nativeffi.internal.c.CompletionResult;

class RuntimeTest {
  private static final Linker LINKER = Linker.nativeLinker();

  private static void invoke(
      MemorySegment callback, FunctionDescriptor descriptor, Object... args) {
    try {
      LINKER.downcallHandle(callback, descriptor).invokeWithArguments(args);
    } catch (Throwable failure) {
      throw new AssertionError(failure);
    }
  }

  private static void complete(Completion completion, CompletionResult result) {
    invoke(
        completion.callback(),
        org.maplibre.nativeffi.internal.c.CompletionCallback.DESCRIPTOR,
        completion.user_data(),
        result.segment());
    invoke(
        completion.release_user_data(),
        org.maplibre.nativeffi.internal.c.UserDataRelease.DESCRIPTOR,
        completion.user_data());
  }

  private static int pendingCount() throws Exception {
    var field = Completions.class.getDeclaredField("PENDING");
    field.setAccessible(true);
    return ((Map<?, ?>) field.get(null)).size();
  }

  @Test
  void inlineCompletionAndRejectedSubmission() throws Exception {
    int before = pendingCount();
    try (var arena = Arena.ofConfined()) {
      var result = CompletionResult.allocate(arena);
      result.generation(42);
      var future =
          Completions.command(
              (address, diagnostic) -> {
                complete(new Completion(address), result);
                return C.MLN_STATUS_OK;
              });
      assertEquals(42, future.join().generation());
      assertEquals(before, pendingCount());
      var error =
          assertThrows(
              MaplibreException.class,
              () -> Completions.run((address, diagnostic) -> C.MLN_STATUS_BUSY));
      assertEquals(Status.BUSY, error.status());
      assertEquals(before, pendingCount());
      var thrown = new IllegalArgumentException("decoder");
      var failed =
          Completions.submit(
              (address, diagnostic) -> {
                complete(new Completion(address), result);
                return C.MLN_STATUS_OK;
              },
              value -> {
                throw thrown;
              });
      assertSame(thrown, assertThrows(CompletionException.class, failed::join).getCause());
    }
  }

  @Test
  void cancellationKeepsNativeStateAndDisposesUnobservedOwners() throws Exception {
    int before = pendingCount();
    var disposed = new AtomicBoolean();
    try (var arena = Arena.ofConfined()) {
      var saved = Completion.allocate(arena);
      var future =
          Completions.submit(
              (address, diagnostic) -> {
                MemorySegment.copy(address, 0, saved.segment(), 0, Completion.LAYOUT.byteSize());
                return C.MLN_STATUS_OK;
              },
              result -> new Owner("test", 123, null, id -> disposed.set(true)) {});
      assertTrue(future.cancel(false));
      assertEquals(before + 1, pendingCount());
      complete(saved, CompletionResult.allocate(arena));
      assertTrue(disposed.get());
      assertEquals(before, pendingCount());
      assertTrue(future.isCancelled());
    }
  }

  @Test
  void commandFailurePreservesUnknownStatusDiagnosticAndGeneration() {
    try (var arena = Arena.ofConfined()) {
      var result = CompletionResult.allocate(arena);
      result.status(0xfedcba98);
      result.generation(-1L);
      var message = arena.allocateFrom("native diagnostic");
      result.diagnostic().data(message);
      result.diagnostic().size(message.byteSize() - 1);
      var failed =
          Completions.command(
              (address, diagnostic) -> {
                complete(new Completion(address), result);
                return C.MLN_STATUS_OK;
              });
      var error =
          (MaplibreException) assertThrows(CompletionException.class, failed::join).getCause();
      assertEquals(0xfedcba98, error.status().rawValue());
      assertEquals(-1L, error.generation());
      assertEquals("native diagnostic", error.getMessage());
    }
  }

  @Test
  void copiedValuesPresenceMasksUnionsAndStrides() {
    try (var call = new Call(null, 0)) {
      var options = new CameraOptions().withZoom(4.5).withCenter(new LatLng(12, 34));
      var encoded = Codecs.writeCameraOptions(call, options);
      assertEquals(options, Codecs.readCameraOptions(encoded, null));
      var bounds = new BoundOptions().withUnbounded(true);
      assertEquals(bounds, Codecs.readBoundOptions(Codecs.writeBoundOptions(call, bounds), null));
      var event = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.RuntimeEvent);
      long tagOffset =
          org.maplibre.nativeffi.internal.c.Layouts.RuntimeEvent.byteOffset(
              MemoryLayout.PathElement.groupElement("payload_type"));
      event.set(JAVA_INT, tagOffset, 0x76543210);
      var roundtrip = Codecs.readRuntimeEvent(event, null);
      assertEquals(0x76543210, ((RuntimeEventPayload.Unknown) roundtrip.payload()).rawTag());
      assertEquals(
          org.maplibre.nativeffi.internal.c.Layouts.RuntimeEventPayload.byteSize(),
          ((RuntimeEventPayload.Unknown) roundtrip.payload()).bytes().length);
      var infoLayout = org.maplibre.nativeffi.internal.c.Layouts.LatLng;
      var data = call.arena.allocate(infoLayout.byteSize() * 4, 8);
      data.set(JAVA_DOUBLE, 0, 1);
      data.set(JAVA_DOUBLE, 32, 2);
      assertEquals(
          2,
          Memory.array(data, 2, 32, infoLayout.byteSize(), item -> Codecs.readLatLng(item, null))
              .get(1)
              .latitude());
      assertThrows(
          IllegalArgumentException.class,
          () ->
              Memory.array(
                  data, 2, 8, infoLayout.byteSize(), item -> Codecs.readLatLng(item, null)));
      assertEquals(new MapMode(0xfedcba98), new MapMode(0xfedcba98));
      assertEquals(-1L, new RuntimeEventFlag(-1L).rawValue());
    }
  }

  @Test
  void scopedResponsesAndNativePointersRejectEscapeAndOtherThreads() throws Exception {
    try (var arena = Arena.ofConfined()) {
      var scope = new Scope();
      var sync = new GpuSync(new GpuSyncKind(0), 123, scope);
      var pointer = new NativePointer(42, scope);
      var response = new HttpHeaderTransformResponse(MemorySegment.NULL, scope);
      try (var executor = Executors.newSingleThreadExecutor()) {
        executor
            .submit(
                () -> {
                  assertThrows(IllegalStateException.class, sync::handle);
                  assertThrows(IllegalStateException.class, pointer::address);
                  assertThrows(
                      IllegalStateException.class, () -> response.setHeader("name", "value"));
                })
            .get(10, TimeUnit.SECONDS);
      }
      scope.close();
      assertThrows(IllegalStateException.class, sync::handle);
      assertThrows(IllegalStateException.class, pointer::address);
      assertThrows(IllegalStateException.class, () -> response.setHeader("name", "value"));
      assertEquals(new GpuSyncKind(0), sync.kind());
    }
  }

  @Test
  void callbackFailureIsContainedAndNativeRegistrationIsConsumedOnce() throws Exception {
    var errors = new LinkedBlockingQueue<Throwable>();
    Thread thread = Thread.currentThread();
    var previous = thread.getUncaughtExceptionHandler();
    thread.setUncaughtExceptionHandler((t, error) -> errors.add(error));
    try (var arena = Arena.ofShared()) {
      var failure = new IllegalStateException("host callback");
      try (var call = new Call(null, 0)) {
        var segment =
            Codecs.writeWake(
                call,
                new Wake(
                    () -> {
                      throw failure;
                    }));
        invoke(
            segment.get(ADDRESS, 0),
            org.maplibre.nativeffi.internal.c.WakeCallback.DESCRIPTOR,
            segment.get(ADDRESS, 8));
      }
      assertSame(failure, errors.poll(10, TimeUnit.SECONDS));
      var releases = new AtomicInteger();
      var release =
          ((org.maplibre.nativeffi.internal.c.UserDataRelease)
                  context -> releases.incrementAndGet())
              .stub(arena);
      var callback = ((org.maplibre.nativeffi.internal.c.WakeCallback) context -> {}).stub(arena);
      var wake =
          Wake.nativeRegistration(
              NativePointer.ofAddress(callback.address()),
              NativePointer.ofAddress(123),
              NativePointer.ofAddress(release.address()));
      try (var call = new Call(null, 0)) {
        var encoded = Codecs.writeWake(call, wake);
        assertEquals(callback.address(), encoded.get(ADDRESS, 0).address());
        assertEquals(123, encoded.get(ADDRESS, 8).address());
      }
      assertEquals(1, releases.get());
      try (var call = new Call(null, 0)) {
        assertThrows(IllegalStateException.class, () -> Codecs.writeWake(call, wake));
      }
      assertEquals(1, releases.get());
    } finally {
      thread.setUncaughtExceptionHandler(previous);
    }
  }

  @Test
  void registrationRootsRejectionAcceptanceAndRelease() {
    var owner = new Owner("test", 1, null, id -> {}) {};
    long token;
    var callback = new Wake(() -> {});
    try (var call = new Call(owner, 0)) {
      token = call.register(callback);
      assertSame(callback, Roots.get(token));
    }
    assertNull(Roots.get(token));
    try (var call = new Call(owner, 0)) {
      token = call.register(callback);
      call.accept(owner);
    }
    assertSame(callback, Roots.get(token));
    assertEquals(1, owner.callbacks.size());
    Roots.release(token);
    assertNull(Roots.get(token));
    assertTrue(owner.callbacks.isEmpty());
    // Native may release inline before the submitting call accepts it.
    try (var call = new Call(owner, 0)) {
      token = call.register(callback);
      Roots.release(token);
      call.accept(owner);
    }
    assertTrue(owner.callbacks.isEmpty());
    owner.state.closed.set(true);
  }

  @Test
  void borrowedOwnerRefusesConcurrentReleaseAndRecoversAfterFailure() throws Exception {
    var owner = new Owner("test", 1, null, id -> {}) {};
    try (var borrow = new Call(owner, 1);
        var executor = Executors.newSingleThreadExecutor()) {
      executor
          .submit(() -> assertThrows(IllegalStateException.class, () -> new Call(owner, 2)))
          .get(10, TimeUnit.SECONDS);
    }
    try (var rejected = new Call(owner, 2)) {
      /* Native refusal: no accept. */
    }
    assertFalse(owner.isClosed());
    try (var release = new Call(owner, 2)) {
      release.accept(owner);
    }
    assertTrue(owner.isClosed());
    assertEquals(1, owner.id());
  }

  private static java.lang.ref.WeakReference<Owner> abandonedCycle(CountDownLatch disposed) {
    var owner = new Owner("test", 1, null, id -> disposed.countDown()) {};
    Owner captured = owner;
    long token = Roots.retain(new Wake(() -> captured.id()));
    Roots.accept(token, owner);
    return new java.lang.ref.WeakReference<>(owner);
  }

  @Test
  void cleanerReclaimsCallbackCycleAndReportsLeak() throws Exception {
    var disposed = new CountDownLatch(1);
    var reports = new LinkedBlockingQueue<Throwable>();
    var previous = Thread.getDefaultUncaughtExceptionHandler();
    Thread.setDefaultUncaughtExceptionHandler((t, error) -> reports.add(error));
    try {
      var weak = abandonedCycle(disposed);
      long deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(10);
      while (disposed.getCount() != 0 && System.nanoTime() < deadline) {
        System.gc();
        disposed.await(25, TimeUnit.MILLISECONDS);
      }
      assertEquals(0, disposed.getCount());
      assertNull(weak.get());
      assertTrue(reports.poll(10, TimeUnit.SECONDS).getMessage().contains("Leaked test"));
    } finally {
      Thread.setDefaultUncaughtExceptionHandler(previous);
    }
  }

  @Test
  void copiedBytesAndExplicitLengthText() {
    byte[] data = {1, 2, 3};
    var value = new ResourceResponse().withBytes(data);
    data[0] = 9;
    assertEquals(1, value.bytes()[0]);
    value.bytes()[0] = 8;
    assertEquals(1, value.bytes()[0]);
    try (var call = new Call(null, 0)) {
      String text = "embedded\0unicode 🌍";
      var encoded = call.view(call.text(text));
      assertEquals(text, Memory.textView(encoded));
      var z = call.arena.allocateFrom("terminated 🌍");
      assertEquals("terminated 🌍", Memory.textZ(z));
    }
  }
}
