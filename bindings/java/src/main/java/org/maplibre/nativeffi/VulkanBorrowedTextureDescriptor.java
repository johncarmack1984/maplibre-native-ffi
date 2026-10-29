// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Vulkan attachment options for a borrowed texture target.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_vulkan_borrowed_texture_descriptor</a>
 */
public record VulkanBorrowedTextureDescriptor(
    LogicalExtent extent,
    int physicalWidth,
    int physicalHeight,
    VulkanContextDescriptor context,
    java.util.List<VulkanBorrowedTexture> textures,
    int format,
    int initialLayout,
    int finalLayout) {
  public VulkanBorrowedTextureDescriptor {
    textures = java.util.List.copyOf(textures);
  }

  public VulkanBorrowedTextureDescriptor(
      LogicalExtent extent,
      int physicalWidth,
      int physicalHeight,
      VulkanContextDescriptor context,
      java.util.List<VulkanBorrowedTexture> textures,
      int format,
      int finalLayout) {
    this(extent, physicalWidth, physicalHeight, context, textures, format, 0, finalLayout);
  }

  public VulkanBorrowedTextureDescriptor withExtent(LogicalExtent replacement) {
    return new VulkanBorrowedTextureDescriptor(
        replacement,
        this.physicalWidth,
        this.physicalHeight,
        this.context,
        this.textures,
        this.format,
        this.initialLayout,
        this.finalLayout);
  }

  public VulkanBorrowedTextureDescriptor withPhysicalWidth(int replacement) {
    return new VulkanBorrowedTextureDescriptor(
        this.extent,
        replacement,
        this.physicalHeight,
        this.context,
        this.textures,
        this.format,
        this.initialLayout,
        this.finalLayout);
  }

  public VulkanBorrowedTextureDescriptor withPhysicalHeight(int replacement) {
    return new VulkanBorrowedTextureDescriptor(
        this.extent,
        this.physicalWidth,
        replacement,
        this.context,
        this.textures,
        this.format,
        this.initialLayout,
        this.finalLayout);
  }

  public VulkanBorrowedTextureDescriptor withContext(VulkanContextDescriptor replacement) {
    return new VulkanBorrowedTextureDescriptor(
        this.extent,
        this.physicalWidth,
        this.physicalHeight,
        replacement,
        this.textures,
        this.format,
        this.initialLayout,
        this.finalLayout);
  }

  public VulkanBorrowedTextureDescriptor withTextures(
      java.util.List<VulkanBorrowedTexture> replacement) {
    return new VulkanBorrowedTextureDescriptor(
        this.extent,
        this.physicalWidth,
        this.physicalHeight,
        this.context,
        replacement,
        this.format,
        this.initialLayout,
        this.finalLayout);
  }

  public VulkanBorrowedTextureDescriptor withFormat(int replacement) {
    return new VulkanBorrowedTextureDescriptor(
        this.extent,
        this.physicalWidth,
        this.physicalHeight,
        this.context,
        this.textures,
        replacement,
        this.initialLayout,
        this.finalLayout);
  }

  public VulkanBorrowedTextureDescriptor withInitialLayout(int replacement) {
    return new VulkanBorrowedTextureDescriptor(
        this.extent,
        this.physicalWidth,
        this.physicalHeight,
        this.context,
        this.textures,
        this.format,
        replacement,
        this.finalLayout);
  }

  public VulkanBorrowedTextureDescriptor withFinalLayout(int replacement) {
    return new VulkanBorrowedTextureDescriptor(
        this.extent,
        this.physicalWidth,
        this.physicalHeight,
        this.context,
        this.textures,
        this.format,
        this.initialLayout,
        replacement);
  }
}
