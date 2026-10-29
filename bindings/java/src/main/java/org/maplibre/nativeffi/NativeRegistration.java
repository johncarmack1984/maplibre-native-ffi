package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.ADDRESS;

import java.lang.foreign.*;
import java.util.concurrent.atomic.AtomicBoolean;

final class NativeRegistration {
  private final NativePointer[] callbacks;
  private final NativePointer userData;
  private final NativePointer releaseUserData;
  private final AtomicBoolean consumed = new AtomicBoolean();

  NativeRegistration(
      NativePointer[] callbacks, NativePointer userData, NativePointer releaseUserData) {
    this.callbacks = callbacks;
    this.userData = userData;
    this.releaseUserData = releaseUserData;
  }

  void consume() {
    if (!consumed.compareAndSet(false, true))
      throw new IllegalStateException("Native registration already consumed");
  }

  MemorySegment callback(int index) {
    return MemorySegment.ofAddress(callbacks[index].address());
  }

  MemorySegment userData() {
    return MemorySegment.ofAddress(userData.address());
  }

  MemorySegment releaseUserData() {
    return MemorySegment.ofAddress(releaseUserData.address());
  }

  void release() {
    if (releaseUserData.isNull()) return;
    try {
      Linker.nativeLinker()
          .downcallHandle(releaseUserData(), FunctionDescriptor.ofVoid(ADDRESS))
          .invokeExact(userData());
    } catch (Throwable failure) {
      Roots.report(failure);
    }
  }
}
