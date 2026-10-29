// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * One nonblocking request for a frame.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_frame_demand</a>
 */
public record FrameDemand(FrameDemandFlag flags, long token) {
  public FrameDemand() {
    this(new FrameDemandFlag(0), 0L);
  }

  public FrameDemand withFlags(FrameDemandFlag replacement) {
    return new FrameDemand(replacement, this.token);
  }

  public FrameDemand withToken(long replacement) {
    return new FrameDemand(this.flags, replacement);
  }
}
