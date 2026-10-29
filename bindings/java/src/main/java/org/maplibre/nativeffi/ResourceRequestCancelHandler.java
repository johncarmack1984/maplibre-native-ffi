// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Cancel callback for one handled resource request.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_request_cancel_handler</a>
 */
public final class ResourceRequestCancelHandler {
  private final NativeRegistration nativeRegistration;
  private final ResourceRequestCancelCallback callback;

  public ResourceRequestCancelHandler(ResourceRequestCancelCallback callback) {
    this(callback, null);
  }

  ResourceRequestCancelHandler(
      ResourceRequestCancelCallback callback, NativeRegistration nativeRegistration) {
    this.nativeRegistration = nativeRegistration;
    this.callback = callback;
  }

  public ResourceRequestCancelCallback callback() {
    return callback;
  }

  NativeRegistration nativeRegistration() {
    return nativeRegistration;
  }

  public static ResourceRequestCancelHandler nativeRegistration(
      NativePointer callback, NativePointer userData, NativePointer releaseUserData) {
    return new ResourceRequestCancelHandler(
        null, new NativeRegistration(new NativePointer[] {callback}, userData, releaseUserData));
  }

  public ResourceRequestCancelHandler withCallback(ResourceRequestCancelCallback replacement) {
    return new ResourceRequestCancelHandler(replacement, null);
  }
}
