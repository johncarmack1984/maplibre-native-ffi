// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Payload for {@code MLN_RUNTIME_EVENT_MAP_RENDER_FRAME_FINISHED}.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_event_render_frame</a>
 */
public record RuntimeEventRenderFrame(
    RenderMode mode, boolean needsRepaint, boolean placementChanged, RenderingStats stats) {
  public RuntimeEventRenderFrame() {
    this(new RenderMode(0), false, false, new RenderingStats());
  }

  public RuntimeEventRenderFrame withMode(RenderMode replacement) {
    return new RuntimeEventRenderFrame(
        replacement, this.needsRepaint, this.placementChanged, this.stats);
  }

  public RuntimeEventRenderFrame withNeedsRepaint(boolean replacement) {
    return new RuntimeEventRenderFrame(this.mode, replacement, this.placementChanged, this.stats);
  }

  public RuntimeEventRenderFrame withPlacementChanged(boolean replacement) {
    return new RuntimeEventRenderFrame(this.mode, this.needsRepaint, replacement, this.stats);
  }

  public RuntimeEventRenderFrame withStats(RenderingStats replacement) {
    return new RuntimeEventRenderFrame(
        this.mode, this.needsRepaint, this.placementChanged, replacement);
  }
}
