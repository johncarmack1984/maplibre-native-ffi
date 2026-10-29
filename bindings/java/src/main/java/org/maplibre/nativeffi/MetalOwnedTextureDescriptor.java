// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Metal attachment options for an owned texture target.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_metal_owned_texture_descriptor</a>
 */
public record MetalOwnedTextureDescriptor(
    LogicalExtent extent, MetalContextDescriptor context, long pixelFormat) {
  public MetalOwnedTextureDescriptor(LogicalExtent extent, long pixelFormat) {
    this(extent, new MetalContextDescriptor(), pixelFormat);
  }

  public MetalOwnedTextureDescriptor withExtent(LogicalExtent replacement) {
    return new MetalOwnedTextureDescriptor(replacement, this.context, this.pixelFormat);
  }

  public MetalOwnedTextureDescriptor withContext(MetalContextDescriptor replacement) {
    return new MetalOwnedTextureDescriptor(this.extent, replacement, this.pixelFormat);
  }

  public MetalOwnedTextureDescriptor withPixelFormat(long replacement) {
    return new MetalOwnedTextureDescriptor(this.extent, this.context, replacement);
  }
}
