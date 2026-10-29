// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Terminal disposition of one accepted frame demand.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_result</a>
 */
public record RenderResult(int rawValue) {
  public static final RenderResult RENDERED = new RenderResult(0);
  public static final RenderResult NO_UPDATE = new RenderResult(1);
  public static final RenderResult TARGET_NOT_READY = new RenderResult(2);
  public static final RenderResult SUPERSEDED = new RenderResult(3);
}
