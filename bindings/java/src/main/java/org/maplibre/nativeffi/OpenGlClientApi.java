// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * OpenGL client API a dedicated EGL session creates its context for.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__target_8h.html">mln_open_gl_client_api</a>
 */
public record OpenGlClientApi(int rawValue) {
  public static final OpenGlClientApi UNSPECIFIED = new OpenGlClientApi(0);
  public static final OpenGlClientApi GL = new OpenGlClientApi(1);
  public static final OpenGlClientApi GLES = new OpenGlClientApi(2);
}
