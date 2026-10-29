// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * One caller-owned Vulkan image of a borrowed texture ring.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_vulkan_borrowed_texture</a>
 */
public record VulkanBorrowedTexture(long image, long imageView) {
  public VulkanBorrowedTexture withImage(long replacement) {
    return new VulkanBorrowedTexture(replacement, this.imageView);
  }

  public VulkanBorrowedTexture withImageView(long replacement) {
    return new VulkanBorrowedTexture(this.image, replacement);
  }
}
