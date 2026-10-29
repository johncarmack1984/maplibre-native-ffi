// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * OpenGL attachment options for a native surface.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/surface_8h.html">mln_open_gl_surface_descriptor</a>
 */
public record OpenGlSurfaceDescriptor(
    LogicalExtent extent, OpenGlContextDescriptor context, NativePointer surface) {
  public OpenGlSurfaceDescriptor(LogicalExtent extent, OpenGlContextDescriptor context) {
    this(extent, context, NativePointer.NULL);
  }

  public OpenGlSurfaceDescriptor withExtent(LogicalExtent replacement) {
    return new OpenGlSurfaceDescriptor(replacement, this.context, this.surface);
  }

  public OpenGlSurfaceDescriptor withContext(OpenGlContextDescriptor replacement) {
    return new OpenGlSurfaceDescriptor(this.extent, replacement, this.surface);
  }

  public OpenGlSurfaceDescriptor withSurface(NativePointer replacement) {
    return new OpenGlSurfaceDescriptor(this.extent, this.context, replacement);
  }
}
