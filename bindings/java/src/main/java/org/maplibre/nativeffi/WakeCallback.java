// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Schedules service by the receiver that owns a queue or driver.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/wake_8h.html">mln_wake_callback</a>
 */
@FunctionalInterface
public interface WakeCallback {
  void invoke();
}
