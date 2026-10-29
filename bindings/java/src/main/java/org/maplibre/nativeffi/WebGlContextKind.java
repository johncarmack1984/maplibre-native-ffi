// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * WebGL context placement.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__target_8h.html">mln_web_gl_context_kind</a>
 */
public record WebGlContextKind(int rawValue) {
  public static final WebGlContextKind EXISTING = new WebGlContextKind(0);
  public static final WebGlContextKind TRANSFERRED_CANVAS = new WebGlContextKind(1);
}
