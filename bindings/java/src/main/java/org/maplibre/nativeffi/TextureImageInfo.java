// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * CPU image readback metadata for a texture target frame.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_texture_image_info</a>
 */
public record TextureImageInfo(int width, int height, int stride, long byteLength) {
  public TextureImageInfo() {
    this(0, 0, 0, 0L);
  }

  public TextureImageInfo withWidth(int replacement) {
    return new TextureImageInfo(replacement, this.height, this.stride, this.byteLength);
  }

  public TextureImageInfo withHeight(int replacement) {
    return new TextureImageInfo(this.width, replacement, this.stride, this.byteLength);
  }

  public TextureImageInfo withStride(int replacement) {
    return new TextureImageInfo(this.width, this.height, replacement, this.byteLength);
  }

  public TextureImageInfo withByteLength(long replacement) {
    return new TextureImageInfo(this.width, this.height, this.stride, replacement);
  }
}
