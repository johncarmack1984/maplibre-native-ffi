// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_abandon_result</a>
 */
public record RenderAbandonResult(
    RenderAbandonDisposition disposition, int quarantinedResourceCount) {
  public RenderAbandonResult() {
    this(new RenderAbandonDisposition(0), 0);
  }

  public RenderAbandonResult withDisposition(RenderAbandonDisposition replacement) {
    return new RenderAbandonResult(replacement, this.quarantinedResourceCount);
  }

  public RenderAbandonResult withQuarantinedResourceCount(int replacement) {
    return new RenderAbandonResult(this.disposition, replacement);
  }
}
