// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Payload for {@code MLN_RUNTIME_EVENT_OFFLINE_REGION_STATUS_CHANGED}.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_event_offline_region_status</a>
 */
public record RuntimeEventOfflineRegionStatus(long regionId, OfflineRegionStatus status) {
  public RuntimeEventOfflineRegionStatus() {
    this(0L, new OfflineRegionStatus());
  }

  public RuntimeEventOfflineRegionStatus withRegionId(long replacement) {
    return new RuntimeEventOfflineRegionStatus(replacement, this.status);
  }

  public RuntimeEventOfflineRegionStatus withStatus(OfflineRegionStatus replacement) {
    return new RuntimeEventOfflineRegionStatus(this.regionId, replacement);
  }
}
