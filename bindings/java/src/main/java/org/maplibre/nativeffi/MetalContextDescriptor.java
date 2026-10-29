// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Metal backend context fields shared by Metal render targets.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__target_8h.html">mln_metal_context_descriptor</a>
 */
public record MetalContextDescriptor(NativePointer device) {
  public MetalContextDescriptor() {
    this(NativePointer.NULL);
  }

  public MetalContextDescriptor withDevice(NativePointer replacement) {
    return new MetalContextDescriptor(replacement);
  }
}
