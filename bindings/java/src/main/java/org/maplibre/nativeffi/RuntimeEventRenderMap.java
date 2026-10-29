// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Payload for {@code MLN_RUNTIME_EVENT_MAP_RENDER_MAP_FINISHED}.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_event_render_map</a>
 */
public record RuntimeEventRenderMap(RenderMode mode) {
  public RuntimeEventRenderMap() {
    this(new RenderMode(0));
  }

  public RuntimeEventRenderMap withMode(RenderMode replacement) {
    return new RuntimeEventRenderMap(replacement);
  }
}
