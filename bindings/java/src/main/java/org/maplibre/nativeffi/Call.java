package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import java.lang.ref.Reference;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import org.maplibre.nativeffi.internal.c.C;
import org.maplibre.nativeffi.internal.c.Diagnostic;

final class Call implements AutoCloseable {
  final Arena arena = Arena.ofConfined();
  final Diagnostic diagnostic = Diagnostic.allocate(arena);
  final Owner owner;
  final boolean release;
  final boolean guarded;
  final ArrayList<Object> arguments = new ArrayList<>();
  final ArrayList<Long> registrations = new ArrayList<>();
  final ArrayList<NativeRegistration> nativeRegistrations = new ArrayList<>();
  boolean accepted;

  Call(Owner owner, int mode) {
    this(owner, mode, false);
  }

  Call(Owner owner, int mode, boolean unchecked) {
    this.owner = owner;
    this.release = mode == 2;
    this.guarded = owner != null && mode != 0;
    try {
      if (!unchecked) NativeLibrary.ensureLoaded();
      if (guarded) owner.state.enter(release);
    } catch (Throwable failure) {
      arena.close();
      throw failure;
    }
  }

  long handle(Owner value) {
    arguments.add(value);
    return value.id();
  }

  long register(Object value) {
    long id = Roots.retain(value);
    registrations.add(id);
    return id;
  }

  NativeRegistration nativeRegistration(NativeRegistration value) {
    value.consume();
    nativeRegistrations.add(value);
    return value;
  }

  void accept(Owner receiver) {
    accepted = true;
    for (long id : registrations) Roots.accept(id, receiver);
    if (release && owner != null) Roots.retire(owner);
  }

  void check(int status) {
    if (status != C.MLN_STATUS_OK)
      throw new MaplibreException(status, diagnostic.message().getString(0), 0);
  }

  MemorySegment text(String value) {
    return bytes(value.getBytes(StandardCharsets.UTF_8));
  }

  MemorySegment bytes(byte[] value) {
    var data = arena.allocate(value.length + 1L, 1);
    MemorySegment.copy(value, 0, data, JAVA_BYTE, 0, value.length);
    return data.asSlice(0, value.length);
  }

  MemorySegment view(MemorySegment data) {
    var view = arena.allocate(org.maplibre.nativeffi.internal.c.BufferView.LAYOUT);
    view.set(ADDRESS, 0, data);
    view.set(JAVA_LONG, 8, data.byteSize());
    return view;
  }

  MemorySegment pointer(MemorySegment value) {
    var pointer = arena.allocate(ADDRESS);
    pointer.set(ADDRESS, 0, value);
    return pointer;
  }

  static long length(Object value) {
    if (value == null) return 0;
    if (value instanceof String text) return text.getBytes(StandardCharsets.UTF_8).length;
    if (value instanceof byte[] bytes) return bytes.length;
    return ((List<?>) value).size();
  }

  <T> MemorySegment array(List<T> values, MemoryLayout layout, BiConsumer<MemorySegment, T> write) {
    var data =
        arena.allocate(
            Math.multiplyExact(values.size(), layout.byteSize()), layout.byteAlignment());
    for (int i = 0; i < values.size(); i++)
      write.accept(data.asSlice(i * layout.byteSize(), layout), values.get(i));
    return data;
  }

  public void close() {
    try {
      if (!accepted) {
        for (long id : registrations) Roots.release(id);
        for (var value : nativeRegistrations) value.release();
      }
    } finally {
      if (guarded) owner.state.leave(release);
      arena.close();
      Reference.reachabilityFence(owner);
      for (Object value : arguments) Reference.reachabilityFence(value);
    }
  }
}
