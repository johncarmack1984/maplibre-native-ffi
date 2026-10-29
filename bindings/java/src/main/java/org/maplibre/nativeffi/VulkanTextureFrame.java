// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Vulkan frame acquired from a texture ring.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_vulkan_texture_frame</a>
 */
public final class VulkanTextureFrame {
  private final Scope scope;
  private final long generation;
  private final int width;
  private final int height;
  private final double scaleFactor;
  private final long frameId;
  private final int slot;
  private final long image;
  private final long imageView;
  private final NativePointer device;
  private final int format;
  private final int layout;

  public VulkanTextureFrame(
      long generation,
      int width,
      int height,
      double scaleFactor,
      long frameId,
      int slot,
      long image,
      long imageView,
      NativePointer device,
      int format,
      int layout) {
    this(
        generation,
        width,
        height,
        scaleFactor,
        frameId,
        slot,
        image,
        imageView,
        device,
        format,
        layout,
        null);
  }

  VulkanTextureFrame(
      long generation,
      int width,
      int height,
      double scaleFactor,
      long frameId,
      int slot,
      long image,
      long imageView,
      NativePointer device,
      int format,
      int layout,
      Scope scope) {
    this.scope = scope;
    this.generation = generation;
    this.width = width;
    this.height = height;
    this.scaleFactor = scaleFactor;
    this.frameId = frameId;
    this.slot = slot;
    this.image = image;
    this.imageView = imageView;
    this.device = device;
    this.format = format;
    this.layout = layout;
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

  public long image() {
    if (scope != null) scope.check();
    return image;
  }

  public long imageView() {
    if (scope != null) scope.check();
    return imageView;
  }

  public NativePointer device() {
    if (scope != null) scope.check();
    return device;
  }

  public int format() {
    return format;
  }

  public int layout() {
    return layout;
  }

  public VulkanTextureFrame() {
    this(0L, 0, 0, 0.0, 0L, 0, 0L, 0L, NativePointer.NULL, 0, 0);
  }
}
