// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Metal attachment options for a borrowed texture target.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_metal_borrowed_texture_descriptor</a>
 */
public record MetalBorrowedTextureDescriptor(
    LogicalExtent extent,
    int physicalWidth,
    int physicalHeight,
    java.util.List<MetalBorrowedTexture> textures) {
  public MetalBorrowedTextureDescriptor {
    textures = java.util.List.copyOf(textures);
  }

  public MetalBorrowedTextureDescriptor withExtent(LogicalExtent replacement) {
    return new MetalBorrowedTextureDescriptor(
        replacement, this.physicalWidth, this.physicalHeight, this.textures);
  }

  public MetalBorrowedTextureDescriptor withPhysicalWidth(int replacement) {
    return new MetalBorrowedTextureDescriptor(
        this.extent, replacement, this.physicalHeight, this.textures);
  }

  public MetalBorrowedTextureDescriptor withPhysicalHeight(int replacement) {
    return new MetalBorrowedTextureDescriptor(
        this.extent, this.physicalWidth, replacement, this.textures);
  }

  public MetalBorrowedTextureDescriptor withTextures(
      java.util.List<MetalBorrowedTexture> replacement) {
    return new MetalBorrowedTextureDescriptor(
        this.extent, this.physicalWidth, this.physicalHeight, replacement);
  }
}
