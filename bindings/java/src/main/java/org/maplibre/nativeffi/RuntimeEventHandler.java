// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Runtime and map event callback.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_event_handler</a>
 */
public final class RuntimeEventHandler {
  private final NativeRegistration nativeRegistration;
  private final RuntimeEventCallback callback;

  public RuntimeEventHandler(RuntimeEventCallback callback) {
    this(callback, null);
  }

  RuntimeEventHandler(RuntimeEventCallback callback, NativeRegistration nativeRegistration) {
    this.nativeRegistration = nativeRegistration;
    this.callback = callback;
  }

  public RuntimeEventCallback callback() {
    return callback;
  }

  NativeRegistration nativeRegistration() {
    return nativeRegistration;
  }

  public static RuntimeEventHandler nativeRegistration(
      NativePointer callback, NativePointer userData, NativePointer releaseUserData) {
    return new RuntimeEventHandler(
        null, new NativeRegistration(new NativePointer[] {callback}, userData, releaseUserData));
  }

  public RuntimeEventHandler withCallback(RuntimeEventCallback replacement) {
    return new RuntimeEventHandler(replacement, null);
  }
}
