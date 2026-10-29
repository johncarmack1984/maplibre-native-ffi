// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Payload for {@code MLN_RUNTIME_EVENT_OFFLINE_REGION_RESPONSE_ERROR}.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_event_offline_region_response_error</a>
 */
public record RuntimeEventOfflineRegionResponseError(long regionId, ResourceErrorReason reason) {
  public RuntimeEventOfflineRegionResponseError() {
    this(0L, new ResourceErrorReason(0));
  }

  public RuntimeEventOfflineRegionResponseError withRegionId(long replacement) {
    return new RuntimeEventOfflineRegionResponseError(replacement, this.reason);
  }

  public RuntimeEventOfflineRegionResponseError withReason(ResourceErrorReason replacement) {
    return new RuntimeEventOfflineRegionResponseError(this.regionId, replacement);
  }
}
