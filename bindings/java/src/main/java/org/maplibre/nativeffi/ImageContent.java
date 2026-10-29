// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Content-box insets in image pixels, measured from the image&#x27;s top-left.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_image_content</a>
 */
public record ImageContent(float left, float top, float right, float bottom) {
  public ImageContent() {
    this(0f, 0f, 0f, 0f);
  }

  public ImageContent withLeft(float replacement) {
    return new ImageContent(replacement, this.top, this.right, this.bottom);
  }

  public ImageContent withTop(float replacement) {
    return new ImageContent(this.left, replacement, this.right, this.bottom);
  }

  public ImageContent withRight(float replacement) {
    return new ImageContent(this.left, this.top, replacement, this.bottom);
  }

  public ImageContent withBottom(float replacement) {
    return new ImageContent(this.left, this.top, this.right, replacement);
  }
}
