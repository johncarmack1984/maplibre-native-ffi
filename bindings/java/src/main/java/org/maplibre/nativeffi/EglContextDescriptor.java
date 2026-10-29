// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * EGL context fields shared by OpenGL render targets.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__target_8h.html">mln_egl_context_descriptor</a>
 */
public record EglContextDescriptor(
    NativePointer display,
    NativePointer config,
    NativePointer shareContext,
    OpenGlClientApi clientApi,
    NativePointer getProcAddress) {
  public EglContextDescriptor(NativePointer display, NativePointer config) {
    this(display, config, NativePointer.NULL, new OpenGlClientApi(0), NativePointer.NULL);
  }

  public EglContextDescriptor withDisplay(NativePointer replacement) {
    return new EglContextDescriptor(
        replacement, this.config, this.shareContext, this.clientApi, this.getProcAddress);
  }

  public EglContextDescriptor withConfig(NativePointer replacement) {
    return new EglContextDescriptor(
        this.display, replacement, this.shareContext, this.clientApi, this.getProcAddress);
  }

  public EglContextDescriptor withShareContext(NativePointer replacement) {
    return new EglContextDescriptor(
        this.display, this.config, replacement, this.clientApi, this.getProcAddress);
  }

  public EglContextDescriptor withClientApi(OpenGlClientApi replacement) {
    return new EglContextDescriptor(
        this.display, this.config, this.shareContext, replacement, this.getProcAddress);
  }

  public EglContextDescriptor withGetProcAddress(NativePointer replacement) {
    return new EglContextDescriptor(
        this.display, this.config, this.shareContext, this.clientApi, replacement);
  }
}
