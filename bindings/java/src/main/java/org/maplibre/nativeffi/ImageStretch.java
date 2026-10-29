// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * One stretchable interval along an image axis, in image pixels.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_image_stretch</a>
 */
public record ImageStretch(float from, float to) {
  public ImageStretch() {
    this(0f, 0f);
  }

  public ImageStretch withFrom(float replacement) {
    return new ImageStretch(replacement, this.to);
  }

  public ImageStretch withTo(float replacement) {
    return new ImageStretch(this.from, replacement);
  }
}
