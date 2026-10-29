// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * WebGL context fields shared by OpenGL render targets in the browser.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__target_8h.html">mln_web_gl_context_descriptor</a>
 */
public record WebGlContextDescriptor(WebGlContextKind kind, int context, String canvasSelector) {
  public WebGlContextDescriptor() {
    this(new WebGlContextKind(0), 0, "");
  }

  public WebGlContextDescriptor withKind(WebGlContextKind replacement) {
    return new WebGlContextDescriptor(replacement, this.context, this.canvasSelector);
  }

  public WebGlContextDescriptor withContext(int replacement) {
    return new WebGlContextDescriptor(this.kind, replacement, this.canvasSelector);
  }

  public WebGlContextDescriptor withCanvasSelector(String replacement) {
    return new WebGlContextDescriptor(this.kind, this.context, replacement);
  }
}
