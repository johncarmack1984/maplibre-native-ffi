// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Metal attachment options for a native surface.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/surface_8h.html">mln_metal_surface_descriptor</a>
 */
public record MetalSurfaceDescriptor(
    LogicalExtent extent, MetalContextDescriptor context, NativePointer layer) {
  public MetalSurfaceDescriptor(LogicalExtent extent, NativePointer layer) {
    this(extent, new MetalContextDescriptor(), layer);
  }

  public MetalSurfaceDescriptor withExtent(LogicalExtent replacement) {
    return new MetalSurfaceDescriptor(replacement, this.context, this.layer);
  }

  public MetalSurfaceDescriptor withContext(MetalContextDescriptor replacement) {
    return new MetalSurfaceDescriptor(this.extent, replacement, this.layer);
  }

  public MetalSurfaceDescriptor withLayer(NativePointer replacement) {
    return new MetalSurfaceDescriptor(this.extent, this.context, replacement);
  }
}
