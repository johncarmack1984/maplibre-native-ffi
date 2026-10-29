// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Receiver wake callback copied by a successful owning call. The callback schedules service by the
 * receiver and returns without waiting for another thread.
 *
 * @see <a href="https://maplibre.org/maplibre-native-ffi/reference/c/wake_8h.html">mln_wake</a>
 */
public final class Wake {
  private final NativeRegistration nativeRegistration;
  private final WakeCallback callback;

  public Wake(WakeCallback callback) {
    this(callback, null);
  }

  Wake(WakeCallback callback, NativeRegistration nativeRegistration) {
    this.nativeRegistration = nativeRegistration;
    this.callback = callback;
  }

  public WakeCallback callback() {
    return callback;
  }

  public Wake() {
    this(null);
  }

  NativeRegistration nativeRegistration() {
    return nativeRegistration;
  }

  public static Wake nativeRegistration(
      NativePointer callback, NativePointer userData, NativePointer releaseUserData) {
    return new Wake(
        null, new NativeRegistration(new NativePointer[] {callback}, userData, releaseUserData));
  }

  public Wake withCallback(WakeCallback replacement) {
    return new Wake(replacement, null);
  }
}
