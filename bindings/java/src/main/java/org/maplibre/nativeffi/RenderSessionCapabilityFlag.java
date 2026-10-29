// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Optional render-session capabilities.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__target_8h.html">mln_render_session_capability_flag</a>
 */
public record RenderSessionCapabilityFlag(int rawValue) {
  public static final RenderSessionCapabilityFlag FRAME_ACQUISITION =
      new RenderSessionCapabilityFlag(1);
  public static final RenderSessionCapabilityFlag READBACK = new RenderSessionCapabilityFlag(2);
  public static final RenderSessionCapabilityFlag CONSUMER_SYNC =
      new RenderSessionCapabilityFlag(4);
  public static final RenderSessionCapabilityFlag PRESENTATION = new RenderSessionCapabilityFlag(8);

  public RenderSessionCapabilityFlag or(RenderSessionCapabilityFlag other) {
    return new RenderSessionCapabilityFlag(rawValue | other.rawValue);
  }

  public boolean contains(RenderSessionCapabilityFlag other) {
    return (rawValue & other.rawValue) == other.rawValue;
  }
}
