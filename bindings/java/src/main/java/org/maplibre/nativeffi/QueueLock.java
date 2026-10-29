// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Host lock on the graphics queue that a session shares with its host, copied by a successful
 * attach.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__target_8h.html">mln_queue_lock</a>
 */
public final class QueueLock {
  private final NativeRegistration nativeRegistration;
  private final QueueLockCallback lock;
  private final QueueLockCallback unlock;

  public QueueLock(QueueLockCallback lock, QueueLockCallback unlock) {
    this(lock, unlock, null);
  }

  QueueLock(
      QueueLockCallback lock, QueueLockCallback unlock, NativeRegistration nativeRegistration) {
    this.nativeRegistration = nativeRegistration;
    this.lock = lock;
    this.unlock = unlock;
  }

  public QueueLockCallback lock() {
    return lock;
  }

  public QueueLockCallback unlock() {
    return unlock;
  }

  public QueueLock() {
    this(null, null);
  }

  NativeRegistration nativeRegistration() {
    return nativeRegistration;
  }

  public static QueueLock nativeRegistration(
      NativePointer lock,
      NativePointer unlock,
      NativePointer userData,
      NativePointer releaseUserData) {
    return new QueueLock(
        null,
        null,
        new NativeRegistration(new NativePointer[] {lock, unlock}, userData, releaseUserData));
  }

  public QueueLock withLock(QueueLockCallback replacement) {
    return new QueueLock(replacement, this.unlock, null);
  }

  public QueueLock withUnlock(QueueLockCallback replacement) {
    return new QueueLock(this.lock, replacement, null);
  }
}
