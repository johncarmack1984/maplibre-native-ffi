// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Takes or returns the host&#x27;s lock on the queue that a session shares with it. Native code
 * relies on the lock being held or released when the call returns.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__target_8h.html">mln_queue_lock_callback</a>
 */
@FunctionalInterface
public interface QueueLockCallback {
  void invoke();
}
