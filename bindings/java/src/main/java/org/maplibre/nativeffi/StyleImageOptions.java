// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Options for runtime style images.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_style_image_options</a>
 */
public record StyleImageOptions(
    java.util.List<ImageStretch> stretchX,
    java.util.List<ImageStretch> stretchY,
    ImageContent content,
    StyleImageTextFit textFitWidth,
    StyleImageTextFit textFitHeight,
    Float pixelRatio,
    Boolean sdf,
    Boolean keepUnused) {
  public StyleImageOptions {
    stretchX = stretchX == null ? null : java.util.List.copyOf(stretchX);
    stretchY = stretchY == null ? null : java.util.List.copyOf(stretchY);
  }

  public StyleImageOptions() {
    this(null, null, null, null, null, null, null, null);
  }

  public StyleImageOptions withStretchX(java.util.List<ImageStretch> replacement) {
    return new StyleImageOptions(
        replacement,
        this.stretchY,
        this.content,
        this.textFitWidth,
        this.textFitHeight,
        this.pixelRatio,
        this.sdf,
        this.keepUnused);
  }

  public StyleImageOptions withStretchY(java.util.List<ImageStretch> replacement) {
    return new StyleImageOptions(
        this.stretchX,
        replacement,
        this.content,
        this.textFitWidth,
        this.textFitHeight,
        this.pixelRatio,
        this.sdf,
        this.keepUnused);
  }

  public StyleImageOptions withContent(ImageContent replacement) {
    return new StyleImageOptions(
        this.stretchX,
        this.stretchY,
        replacement,
        this.textFitWidth,
        this.textFitHeight,
        this.pixelRatio,
        this.sdf,
        this.keepUnused);
  }

  public StyleImageOptions withTextFitWidth(StyleImageTextFit replacement) {
    return new StyleImageOptions(
        this.stretchX,
        this.stretchY,
        this.content,
        replacement,
        this.textFitHeight,
        this.pixelRatio,
        this.sdf,
        this.keepUnused);
  }

  public StyleImageOptions withTextFitHeight(StyleImageTextFit replacement) {
    return new StyleImageOptions(
        this.stretchX,
        this.stretchY,
        this.content,
        this.textFitWidth,
        replacement,
        this.pixelRatio,
        this.sdf,
        this.keepUnused);
  }

  public StyleImageOptions withPixelRatio(Float replacement) {
    return new StyleImageOptions(
        this.stretchX,
        this.stretchY,
        this.content,
        this.textFitWidth,
        this.textFitHeight,
        replacement,
        this.sdf,
        this.keepUnused);
  }

  public StyleImageOptions withSdf(Boolean replacement) {
    return new StyleImageOptions(
        this.stretchX,
        this.stretchY,
        this.content,
        this.textFitWidth,
        this.textFitHeight,
        this.pixelRatio,
        replacement,
        this.keepUnused);
  }

  public StyleImageOptions withKeepUnused(Boolean replacement) {
    return new StyleImageOptions(
        this.stretchX,
        this.stretchY,
        this.content,
        this.textFitWidth,
        this.textFitHeight,
        this.pixelRatio,
        this.sdf,
        replacement);
  }
}
