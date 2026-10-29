// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Payload for {@code MLN_RUNTIME_EVENT_OFFLINE_REGION_TILE_COUNT_LIMIT_EXCEEDED}.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_event_offline_region_tile_count_limit</a>
 */
public record RuntimeEventOfflineRegionTileCountLimit(long regionId, long limit) {
  public RuntimeEventOfflineRegionTileCountLimit() {
    this(0L, 0L);
  }

  public RuntimeEventOfflineRegionTileCountLimit withRegionId(long replacement) {
    return new RuntimeEventOfflineRegionTileCountLimit(replacement, this.limit);
  }

  public RuntimeEventOfflineRegionTileCountLimit withLimit(long replacement) {
    return new RuntimeEventOfflineRegionTileCountLimit(this.regionId, replacement);
  }
}
