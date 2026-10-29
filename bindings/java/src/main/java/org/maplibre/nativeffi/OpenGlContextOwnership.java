// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * How a session&#x27;s OpenGL context relates to its driver thread and host graphics state.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__target_8h.html">mln_open_gl_context_ownership</a>
 */
public record OpenGlContextOwnership(int rawValue) {
  public static final OpenGlContextOwnership SHARED = new OpenGlContextOwnership(0);
  public static final OpenGlContextOwnership DEDICATED = new OpenGlContextOwnership(1);
}
