// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * OpenGL attachment options for a borrowed texture target.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_open_gl_borrowed_texture_descriptor</a>
 */
public record OpenGlBorrowedTextureDescriptor(
    LogicalExtent extent,
    int physicalWidth,
    int physicalHeight,
    OpenGlContextDescriptor context,
    java.util.List<OpenGlBorrowedTexture> textures,
    int target) {
  public OpenGlBorrowedTextureDescriptor {
    textures = java.util.List.copyOf(textures);
  }

  public OpenGlBorrowedTextureDescriptor withExtent(LogicalExtent replacement) {
    return new OpenGlBorrowedTextureDescriptor(
        replacement,
        this.physicalWidth,
        this.physicalHeight,
        this.context,
        this.textures,
        this.target);
  }

  public OpenGlBorrowedTextureDescriptor withPhysicalWidth(int replacement) {
    return new OpenGlBorrowedTextureDescriptor(
        this.extent, replacement, this.physicalHeight, this.context, this.textures, this.target);
  }

  public OpenGlBorrowedTextureDescriptor withPhysicalHeight(int replacement) {
    return new OpenGlBorrowedTextureDescriptor(
        this.extent, this.physicalWidth, replacement, this.context, this.textures, this.target);
  }

  public OpenGlBorrowedTextureDescriptor withContext(OpenGlContextDescriptor replacement) {
    return new OpenGlBorrowedTextureDescriptor(
        this.extent,
        this.physicalWidth,
        this.physicalHeight,
        replacement,
        this.textures,
        this.target);
  }

  public OpenGlBorrowedTextureDescriptor withTextures(
      java.util.List<OpenGlBorrowedTexture> replacement) {
    return new OpenGlBorrowedTextureDescriptor(
        this.extent,
        this.physicalWidth,
        this.physicalHeight,
        this.context,
        replacement,
        this.target);
  }

  public OpenGlBorrowedTextureDescriptor withTarget(int replacement) {
    return new OpenGlBorrowedTextureDescriptor(
        this.extent,
        this.physicalWidth,
        this.physicalHeight,
        this.context,
        this.textures,
        replacement);
  }
}
