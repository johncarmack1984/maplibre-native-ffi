// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * OpenGL attachment options for an owned texture target.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_open_gl_owned_texture_descriptor</a>
 */
public record OpenGlOwnedTextureDescriptor(LogicalExtent extent, OpenGlContextDescriptor context) {
  public OpenGlOwnedTextureDescriptor withExtent(LogicalExtent replacement) {
    return new OpenGlOwnedTextureDescriptor(replacement, this.context);
  }

  public OpenGlOwnedTextureDescriptor withContext(OpenGlContextDescriptor replacement) {
    return new OpenGlOwnedTextureDescriptor(this.extent, replacement);
  }
}
