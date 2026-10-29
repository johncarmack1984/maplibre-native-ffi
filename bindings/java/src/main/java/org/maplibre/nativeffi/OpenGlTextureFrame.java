// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * OpenGL frame acquired from a texture ring.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_open_gl_texture_frame</a>
 */
public final class OpenGlTextureFrame {
  private final Scope scope;
  private final long generation;
  private final int width;
  private final int height;
  private final double scaleFactor;
  private final long frameId;
  private final int slot;
  private final int texture;
  private final int target;
  private final int internalFormat;
  private final int format;
  private final int type;

  public OpenGlTextureFrame(
      long generation,
      int width,
      int height,
      double scaleFactor,
      long frameId,
      int slot,
      int texture,
      int target,
      int internalFormat,
      int format,
      int type) {
    this(
        generation,
        width,
        height,
        scaleFactor,
        frameId,
        slot,
        texture,
        target,
        internalFormat,
        format,
        type,
        null);
  }

  OpenGlTextureFrame(
      long generation,
      int width,
      int height,
      double scaleFactor,
      long frameId,
      int slot,
      int texture,
      int target,
      int internalFormat,
      int format,
      int type,
      Scope scope) {
    this.scope = scope;
    this.generation = generation;
    this.width = width;
    this.height = height;
    this.scaleFactor = scaleFactor;
    this.frameId = frameId;
    this.slot = slot;
    this.texture = texture;
    this.target = target;
    this.internalFormat = internalFormat;
    this.format = format;
    this.type = type;
  }

  public long generation() {
    return generation;
  }

  public int width() {
    return width;
  }

  public int height() {
    return height;
  }

  public double scaleFactor() {
    return scaleFactor;
  }

  public long frameId() {
    return frameId;
  }

  public int slot() {
    return slot;
  }

  public int texture() {
    if (scope != null) scope.check();
    return texture;
  }

  public int target() {
    return target;
  }

  public int internalFormat() {
    return internalFormat;
  }

  public int format() {
    return format;
  }

  public int type() {
    return type;
  }

  public OpenGlTextureFrame() {
    this(0L, 0, 0, 0.0, 0L, 0, 0, 0, 0, 0, 0);
  }
}
