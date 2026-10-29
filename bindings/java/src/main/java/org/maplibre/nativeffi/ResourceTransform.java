// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Resource transform state.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_transform</a>
 */
public final class ResourceTransform {
  private final NativeRegistration nativeRegistration;
  private final ResourceTransformCallback callback;

  public ResourceTransform(ResourceTransformCallback callback) {
    this(callback, null);
  }

  ResourceTransform(ResourceTransformCallback callback, NativeRegistration nativeRegistration) {
    this.nativeRegistration = nativeRegistration;
    this.callback = callback;
  }

  public ResourceTransformCallback callback() {
    return callback;
  }

  NativeRegistration nativeRegistration() {
    return nativeRegistration;
  }

  public static ResourceTransform nativeRegistration(
      NativePointer callback, NativePointer userData, NativePointer releaseUserData) {
    return new ResourceTransform(
        null, new NativeRegistration(new NativePointer[] {callback}, userData, releaseUserData));
  }

  public ResourceTransform withCallback(ResourceTransformCallback replacement) {
    return new ResourceTransform(replacement, null);
  }
}
