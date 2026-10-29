// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * One caller-owned Metal texture of a borrowed texture ring.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_metal_borrowed_texture</a>
 */
public record MetalBorrowedTexture(NativePointer texture) {
  public MetalBorrowedTexture withTexture(NativePointer replacement) {
    return new MetalBorrowedTexture(replacement);
  }
}
