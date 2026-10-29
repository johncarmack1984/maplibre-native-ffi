// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * What abandon did with a session&#x27;s graphics resources.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_abandon_disposition</a>
 */
public record RenderAbandonDisposition(int rawValue) {
  public static final RenderAbandonDisposition CLEAN = new RenderAbandonDisposition(0);
  public static final RenderAbandonDisposition QUARANTINED = new RenderAbandonDisposition(1);
}
