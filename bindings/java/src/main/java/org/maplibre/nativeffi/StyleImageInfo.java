// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * One complete runtime style image.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_style_image_info</a>
 */
public record StyleImageInfo(
    int width,
    int height,
    byte[] pixels,
    java.util.List<ImageStretch> stretchX,
    java.util.List<ImageStretch> stretchY,
    ImageContent content,
    StyleImageTextFit textFitWidth,
    StyleImageTextFit textFitHeight,
    float pixelRatio,
    boolean sdf,
    boolean keepUnused) {
  @Override
  public byte[] pixels() {
    return pixels.clone();
  }

  public StyleImageInfo {
    pixels = pixels.clone();
    stretchX = java.util.List.copyOf(stretchX);
    stretchY = java.util.List.copyOf(stretchY);
  }

  public StyleImageInfo() {
    this(
        0,
        0,
        new byte[0],
        java.util.List.of(),
        java.util.List.of(),
        null,
        null,
        null,
        0f,
        false,
        false);
  }

  public StyleImageInfo withWidth(int replacement) {
    return new StyleImageInfo(
        replacement,
        this.height,
        this.pixels,
        this.stretchX,
        this.stretchY,
        this.content,
        this.textFitWidth,
        this.textFitHeight,
        this.pixelRatio,
        this.sdf,
        this.keepUnused);
  }

  public StyleImageInfo withHeight(int replacement) {
    return new StyleImageInfo(
        this.width,
        replacement,
        this.pixels,
        this.stretchX,
        this.stretchY,
        this.content,
        this.textFitWidth,
        this.textFitHeight,
        this.pixelRatio,
        this.sdf,
        this.keepUnused);
  }

  public StyleImageInfo withPixels(byte[] replacement) {
    return new StyleImageInfo(
        this.width,
        this.height,
        replacement,
        this.stretchX,
        this.stretchY,
        this.content,
        this.textFitWidth,
        this.textFitHeight,
        this.pixelRatio,
        this.sdf,
        this.keepUnused);
  }

  public StyleImageInfo withStretchX(java.util.List<ImageStretch> replacement) {
    return new StyleImageInfo(
        this.width,
        this.height,
        this.pixels,
        replacement,
        this.stretchY,
        this.content,
        this.textFitWidth,
        this.textFitHeight,
        this.pixelRatio,
        this.sdf,
        this.keepUnused);
  }

  public StyleImageInfo withStretchY(java.util.List<ImageStretch> replacement) {
    return new StyleImageInfo(
        this.width,
        this.height,
        this.pixels,
        this.stretchX,
        replacement,
        this.content,
        this.textFitWidth,
        this.textFitHeight,
        this.pixelRatio,
        this.sdf,
        this.keepUnused);
  }

  public StyleImageInfo withContent(ImageContent replacement) {
    return new StyleImageInfo(
        this.width,
        this.height,
        this.pixels,
        this.stretchX,
        this.stretchY,
        replacement,
        this.textFitWidth,
        this.textFitHeight,
        this.pixelRatio,
        this.sdf,
        this.keepUnused);
  }

  public StyleImageInfo withTextFitWidth(StyleImageTextFit replacement) {
    return new StyleImageInfo(
        this.width,
        this.height,
        this.pixels,
        this.stretchX,
        this.stretchY,
        this.content,
        replacement,
        this.textFitHeight,
        this.pixelRatio,
        this.sdf,
        this.keepUnused);
  }

  public StyleImageInfo withTextFitHeight(StyleImageTextFit replacement) {
    return new StyleImageInfo(
        this.width,
        this.height,
        this.pixels,
        this.stretchX,
        this.stretchY,
        this.content,
        this.textFitWidth,
        replacement,
        this.pixelRatio,
        this.sdf,
        this.keepUnused);
  }

  public StyleImageInfo withPixelRatio(float replacement) {
    return new StyleImageInfo(
        this.width,
        this.height,
        this.pixels,
        this.stretchX,
        this.stretchY,
        this.content,
        this.textFitWidth,
        this.textFitHeight,
        replacement,
        this.sdf,
        this.keepUnused);
  }

  public StyleImageInfo withSdf(boolean replacement) {
    return new StyleImageInfo(
        this.width,
        this.height,
        this.pixels,
        this.stretchX,
        this.stretchY,
        this.content,
        this.textFitWidth,
        this.textFitHeight,
        this.pixelRatio,
        replacement,
        this.keepUnused);
  }

  public StyleImageInfo withKeepUnused(boolean replacement) {
    return new StyleImageInfo(
        this.width,
        this.height,
        this.pixels,
        this.stretchX,
        this.stretchY,
        this.content,
        this.textFitWidth,
        this.textFitHeight,
        this.pixelRatio,
        this.sdf,
        replacement);
  }

  @Override
  public boolean equals(Object other) {
    return other instanceof StyleImageInfo value
        && java.util.Arrays.deepEquals(
            new Object[] {
              this.width,
              this.height,
              this.pixels,
              this.stretchX,
              this.stretchY,
              this.content,
              this.textFitWidth,
              this.textFitHeight,
              this.pixelRatio,
              this.sdf,
              this.keepUnused
            },
            new Object[] {
              value.width,
              value.height,
              value.pixels,
              value.stretchX,
              value.stretchY,
              value.content,
              value.textFitWidth,
              value.textFitHeight,
              value.pixelRatio,
              value.sdf,
              value.keepUnused
            });
  }

  @Override
  public int hashCode() {
    return java.util.Arrays.deepHashCode(
        new Object[] {
          width,
          height,
          pixels,
          stretchX,
          stretchY,
          content,
          textFitWidth,
          textFitHeight,
          pixelRatio,
          sdf,
          keepUnused
        });
  }
}
