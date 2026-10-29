// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Texture readback.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_texture_readback_result</a>
 */
public record TextureReadbackResult(byte[] data, TextureImageInfo info) {
  @Override
  public byte[] data() {
    return data.clone();
  }

  public TextureReadbackResult {
    data = data.clone();
  }

  public TextureReadbackResult() {
    this(new byte[0], new TextureImageInfo());
  }

  public TextureReadbackResult withData(byte[] replacement) {
    return new TextureReadbackResult(replacement, this.info);
  }

  public TextureReadbackResult withInfo(TextureImageInfo replacement) {
    return new TextureReadbackResult(this.data, replacement);
  }

  @Override
  public boolean equals(Object other) {
    return other instanceof TextureReadbackResult value
        && java.util.Arrays.deepEquals(
            new Object[] {this.data, this.info}, new Object[] {value.data, value.info});
  }

  @Override
  public int hashCode() {
    return java.util.Arrays.deepHashCode(new Object[] {data, info});
  }
}
