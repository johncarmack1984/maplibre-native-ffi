package org.maplibre.nativeffi.internal.c;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

final class Ffm {
  private static final Linker LINKER = Linker.nativeLinker();

  private static final class Library {
    static final SymbolLookup SYMBOLS = load();

    private static SymbolLookup load() {
      NativeLoading.load();
      return SymbolLookup.loaderLookup();
    }
  }

  private Ffm() {}

  static MethodHandle downcall(String name, FunctionDescriptor descriptor) {
    return LINKER.downcallHandle(Library.SYMBOLS.findOrThrow(name), descriptor);
  }

  static MemorySegment upcall(
      Object callback, Class<?> type, FunctionDescriptor descriptor, Arena arena) {
    if (!arena.allocate(0).isAccessibleBy(Thread.ofPlatform().unstarted(() -> {}))) {
      throw new IllegalArgumentException("Native callbacks require a shared arena");
    }
    try {
      MethodHandle target =
          MethodHandles.lookup()
              .findVirtual(type, "invokeSafely", descriptor.toMethodType())
              .bindTo(callback);
      return LINKER.upcallStub(target, descriptor, arena);
    } catch (ReflectiveOperationException failure) {
      throw new AssertionError(failure);
    }
  }

  static RuntimeException rethrow(Throwable failure) {
    if (failure instanceof RuntimeException exception) return exception;
    if (failure instanceof Error error) throw error;
    throw new AssertionError(failure);
  }

  static void callbackFailure(Throwable failure) {
    // Neither a host callback nor its error handler may unwind into native code.
    try {
      Thread current = Thread.currentThread();
      current.getUncaughtExceptionHandler().uncaughtException(current, failure);
    } catch (Throwable ignored) {
      // An FFM upcall that throws terminates the process.
    }
  }
}
