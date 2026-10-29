// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Vulkan attachment options for an owned texture target.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_vulkan_owned_texture_descriptor</a>
 */
public record VulkanOwnedTextureDescriptor(LogicalExtent extent, VulkanContextDescriptor context) {
  public VulkanOwnedTextureDescriptor withExtent(LogicalExtent replacement) {
    return new VulkanOwnedTextureDescriptor(replacement, this.context);
  }

  public VulkanOwnedTextureDescriptor withContext(VulkanContextDescriptor replacement) {
    return new VulkanOwnedTextureDescriptor(this.extent, replacement);
  }
}
