// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Render modes reported by render observer events and frame results.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_render_mode</a>
 */
public record RenderMode(int rawValue) {
  public static final RenderMode PARTIAL = new RenderMode(0);
  public static final RenderMode FULL = new RenderMode(1);
}
