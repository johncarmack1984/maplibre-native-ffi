// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Caller-owned premultiplied RGBA8 image pixels.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_premultiplied_rgba8_image</a>
 */
public record PremultipliedRgba8Image(int width, int height, int stride, byte[] pixels) {
  @Override
  public byte[] pixels() {
    return pixels.clone();
  }

  public PremultipliedRgba8Image {
    pixels = pixels.clone();
  }

  public PremultipliedRgba8Image withWidth(int replacement) {
    return new PremultipliedRgba8Image(replacement, this.height, this.stride, this.pixels);
  }

  public PremultipliedRgba8Image withHeight(int replacement) {
    return new PremultipliedRgba8Image(this.width, replacement, this.stride, this.pixels);
  }

  public PremultipliedRgba8Image withStride(int replacement) {
    return new PremultipliedRgba8Image(this.width, this.height, replacement, this.pixels);
  }

  public PremultipliedRgba8Image withPixels(byte[] replacement) {
    return new PremultipliedRgba8Image(this.width, this.height, this.stride, replacement);
  }

  @Override
  public boolean equals(Object other) {
    return other instanceof PremultipliedRgba8Image value
        && java.util.Arrays.deepEquals(
            new Object[] {this.width, this.height, this.stride, this.pixels},
            new Object[] {value.width, value.height, value.stride, value.pixels});
  }

  @Override
  public int hashCode() {
    return java.util.Arrays.deepHashCode(new Object[] {width, height, stride, pixels});
  }
}
