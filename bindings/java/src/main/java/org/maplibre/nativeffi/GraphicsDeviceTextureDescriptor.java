// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Attachment options for a graphics device texture target.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/graphics__device_8h.html">mln_graphics_device_texture_descriptor</a>
 */
public record GraphicsDeviceTextureDescriptor(LogicalExtent extent) {
  public GraphicsDeviceTextureDescriptor withExtent(LogicalExtent replacement) {
    return new GraphicsDeviceTextureDescriptor(replacement);
  }
}
