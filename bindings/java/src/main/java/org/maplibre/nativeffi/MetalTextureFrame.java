// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Metal frame acquired from a texture ring.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_metal_texture_frame</a>
 */
public final class MetalTextureFrame {
  private final Scope scope;
  private final long generation;
  private final int width;
  private final int height;
  private final double scaleFactor;
  private final long frameId;
  private final int slot;
  private final NativePointer texture;
  private final NativePointer device;
  private final long pixelFormat;

  public MetalTextureFrame(
      long generation,
      int width,
      int height,
      double scaleFactor,
      long frameId,
      int slot,
      NativePointer texture,
      NativePointer device,
      long pixelFormat) {
    this(generation, width, height, scaleFactor, frameId, slot, texture, device, pixelFormat, null);
  }

  MetalTextureFrame(
      long generation,
      int width,
      int height,
      double scaleFactor,
      long frameId,
      int slot,
      NativePointer texture,
      NativePointer device,
      long pixelFormat,
      Scope scope) {
    this.scope = scope;
    this.generation = generation;
    this.width = width;
    this.height = height;
    this.scaleFactor = scaleFactor;
    this.frameId = frameId;
    this.slot = slot;
    this.texture = texture;
    this.device = device;
    this.pixelFormat = pixelFormat;
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

  public NativePointer texture() {
    if (scope != null) scope.check();
    return texture;
  }

  public NativePointer device() {
    if (scope != null) scope.check();
    return device;
  }

  public long pixelFormat() {
    return pixelFormat;
  }

  public MetalTextureFrame() {
    this(0L, 0, 0, 0.0, 0L, 0, NativePointer.NULL, NativePointer.NULL, 0L);
  }
}
