// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Driver and target capabilities fixed for one attached render session.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__target_8h.html">mln_render_session_capabilities</a>
 */
public record RenderSessionCapabilities(
    RenderDriverKind driver, int textureRingDepth, RenderSessionCapabilityFlag flags) {
  public RenderSessionCapabilities(RenderDriverKind driver) {
    this(driver, 0, new RenderSessionCapabilityFlag(0));
  }

  public RenderSessionCapabilities withDriver(RenderDriverKind replacement) {
    return new RenderSessionCapabilities(replacement, this.textureRingDepth, this.flags);
  }

  public RenderSessionCapabilities withTextureRingDepth(int replacement) {
    return new RenderSessionCapabilities(this.driver, replacement, this.flags);
  }

  public RenderSessionCapabilities withFlags(RenderSessionCapabilityFlag replacement) {
    return new RenderSessionCapabilities(this.driver, this.textureRingDepth, replacement);
  }
}
