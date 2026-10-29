// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Render-session lifecycle visible in snapshots.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_state</a>
 */
public record RenderSessionState(int rawValue) {
  public static final RenderSessionState ATTACHING = new RenderSessionState(1);
  public static final RenderSessionState ATTACHED = new RenderSessionState(2);
  public static final RenderSessionState DETACHING = new RenderSessionState(3);
  public static final RenderSessionState DETACHED = new RenderSessionState(4);
  public static final RenderSessionState TARGET_LOST = new RenderSessionState(5);
  public static final RenderSessionState ABANDONED = new RenderSessionState(6);
}
