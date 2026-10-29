// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Backend-specific OpenGL context data.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__target_8h.html">mln_open_gl_context_descriptor_data</a>
 */
public sealed interface OpenGlContextDescriptorData {
  record Wgl(WglContextDescriptor value) implements OpenGlContextDescriptorData {}

  record Egl(EglContextDescriptor value) implements OpenGlContextDescriptorData {}

  record WebGl(WebGlContextDescriptor value) implements OpenGlContextDescriptorData {}

  record Unknown(int rawTag, byte[] bytes) implements OpenGlContextDescriptorData {
    public Unknown {
      bytes = bytes.clone();
    }

    @Override
    public byte[] bytes() {
      return bytes.clone();
    }

    @Override
    public boolean equals(Object other) {
      return other instanceof Unknown value
          && rawTag == value.rawTag
          && java.util.Arrays.equals(bytes, value.bytes);
    }

    @Override
    public int hashCode() {
      return 31 * rawTag + java.util.Arrays.hashCode(bytes);
    }
  }
}
