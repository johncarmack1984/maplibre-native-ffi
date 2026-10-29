// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Frame-demand policy bits.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_frame_demand_flag</a>
 */
public record FrameDemandFlag(int rawValue) {
  public static final FrameDemandFlag FORCE = new FrameDemandFlag(1);
  public static final FrameDemandFlag PRESENT = new FrameDemandFlag(2);
  public static final FrameDemandFlag WAIT_FOR_UPDATE = new FrameDemandFlag(4);

  public FrameDemandFlag or(FrameDemandFlag other) {
    return new FrameDemandFlag(rawValue | other.rawValue);
  }

  public boolean contains(FrameDemandFlag other) {
    return (rawValue & other.rawValue) == other.rawValue;
  }
}
