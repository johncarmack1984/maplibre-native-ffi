// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Execution placement for one render session.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__target_8h.html">mln_render_driver_kind</a>
 */
public record RenderDriverKind(int rawValue) {
  public static final RenderDriverKind CORE_WORKER = new RenderDriverKind(1);
  public static final RenderDriverKind CALLER_GRAPHICS_THREAD = new RenderDriverKind(2);
}
