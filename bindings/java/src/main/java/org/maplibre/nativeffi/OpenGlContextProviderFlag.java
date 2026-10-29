// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * OpenGL context providers supported by this build.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__target_8h.html">mln_open_gl_context_provider_flag</a>
 */
public record OpenGlContextProviderFlag(int rawValue) {
  public static final OpenGlContextProviderFlag WGL = new OpenGlContextProviderFlag(1);
  public static final OpenGlContextProviderFlag EGL = new OpenGlContextProviderFlag(2);
  public static final OpenGlContextProviderFlag WEB_GL = new OpenGlContextProviderFlag(4);

  public OpenGlContextProviderFlag or(OpenGlContextProviderFlag other) {
    return new OpenGlContextProviderFlag(rawValue | other.rawValue);
  }

  public boolean contains(OpenGlContextProviderFlag other) {
    return (rawValue & other.rawValue) == other.rawValue;
  }
}
