// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Vulkan attachment options for a native surface.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/surface_8h.html">mln_vulkan_surface_descriptor</a>
 */
public record VulkanSurfaceDescriptor(
    LogicalExtent extent, VulkanContextDescriptor context, long surface) {
  public VulkanSurfaceDescriptor withExtent(LogicalExtent replacement) {
    return new VulkanSurfaceDescriptor(replacement, this.context, this.surface);
  }

  public VulkanSurfaceDescriptor withContext(VulkanContextDescriptor replacement) {
    return new VulkanSurfaceDescriptor(this.extent, replacement, this.surface);
  }

  public VulkanSurfaceDescriptor withSurface(long replacement) {
    return new VulkanSurfaceDescriptor(this.extent, this.context, replacement);
  }
}
