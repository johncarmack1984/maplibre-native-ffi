// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Receives selected events after their snapshots have been published.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_event_callback</a>
 */
@FunctionalInterface
public interface RuntimeEventCallback {
  void invoke(java.util.List<RuntimeEvent> events);
}
