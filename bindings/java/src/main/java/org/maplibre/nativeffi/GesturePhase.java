// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Gesture boundary carried atomically with a camera update or delta.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_gesture_phase</a>
 */
public record GesturePhase(int rawValue) {
  public static final GesturePhase NONE = new GesturePhase(0);
  public static final GesturePhase BEGIN = new GesturePhase(1);
  public static final GesturePhase UPDATE = new GesturePhase(2);
  public static final GesturePhase END = new GesturePhase(3);
  public static final GesturePhase CANCEL = new GesturePhase(4);
}
