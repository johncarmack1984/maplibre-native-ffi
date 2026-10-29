// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * OpenGL backend context fields shared by OpenGL render targets.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__target_8h.html">mln_open_gl_context_descriptor</a>
 */
public record OpenGlContextDescriptor(
    OpenGlContextOwnership ownership, OpenGlContextDescriptorData data) {
  public OpenGlContextDescriptor(OpenGlContextDescriptorData data) {
    this(new OpenGlContextOwnership(0), data);
  }

  public OpenGlContextDescriptor withOwnership(OpenGlContextOwnership replacement) {
    return new OpenGlContextDescriptor(replacement, this.data);
  }

  public OpenGlContextDescriptor withData(OpenGlContextDescriptorData replacement) {
    return new OpenGlContextDescriptor(this.ownership, replacement);
  }
}
