// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * WGL context fields shared by OpenGL render targets on Windows.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__target_8h.html">mln_wgl_context_descriptor</a>
 */
public record WglContextDescriptor(
    NativePointer deviceContext, NativePointer shareContext, NativePointer getProcAddress) {
  public WglContextDescriptor(NativePointer deviceContext) {
    this(deviceContext, NativePointer.NULL, NativePointer.NULL);
  }

  public WglContextDescriptor withDeviceContext(NativePointer replacement) {
    return new WglContextDescriptor(replacement, this.shareContext, this.getProcAddress);
  }

  public WglContextDescriptor withShareContext(NativePointer replacement) {
    return new WglContextDescriptor(this.deviceContext, replacement, this.getProcAddress);
  }

  public WglContextDescriptor withGetProcAddress(NativePointer replacement) {
    return new WglContextDescriptor(this.deviceContext, this.shareContext, replacement);
  }
}
