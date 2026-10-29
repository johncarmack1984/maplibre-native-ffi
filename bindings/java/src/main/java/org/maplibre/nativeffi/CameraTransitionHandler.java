// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Callback that one camera command copies to report the end of its transitions.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_camera_transition_handler</a>
 */
public final class CameraTransitionHandler {
  private final NativeRegistration nativeRegistration;
  private final CameraTransitionEndCallback callback;

  public CameraTransitionHandler(CameraTransitionEndCallback callback) {
    this(callback, null);
  }

  CameraTransitionHandler(
      CameraTransitionEndCallback callback, NativeRegistration nativeRegistration) {
    this.nativeRegistration = nativeRegistration;
    this.callback = callback;
  }

  public CameraTransitionEndCallback callback() {
    return callback;
  }

  public CameraTransitionHandler() {
    this(null);
  }

  NativeRegistration nativeRegistration() {
    return nativeRegistration;
  }

  public static CameraTransitionHandler nativeRegistration(
      NativePointer callback, NativePointer userData, NativePointer releaseUserData) {
    return new CameraTransitionHandler(
        null, new NativeRegistration(new NativePointer[] {callback}, userData, releaseUserData));
  }

  public CameraTransitionHandler withCallback(CameraTransitionEndCallback replacement) {
    return new CameraTransitionHandler(replacement, null);
  }
}
