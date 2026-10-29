// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Screen-space box in logical map pixels.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/query_8h.html">mln_screen_box</a>
 */
public record ScreenBox(ScreenPoint min, ScreenPoint max) {
  public ScreenBox() {
    this(new ScreenPoint(), new ScreenPoint());
  }

  public ScreenBox withMin(ScreenPoint replacement) {
    return new ScreenBox(replacement, this.max);
  }

  public ScreenBox withMax(ScreenPoint replacement) {
    return new ScreenBox(this.min, replacement);
  }
}
