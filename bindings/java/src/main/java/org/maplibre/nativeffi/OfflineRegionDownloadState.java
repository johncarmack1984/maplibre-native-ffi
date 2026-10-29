// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_offline_region_download_state</a>
 */
public record OfflineRegionDownloadState(int rawValue) {
  public static final OfflineRegionDownloadState INACTIVE = new OfflineRegionDownloadState(0);
  public static final OfflineRegionDownloadState ACTIVE = new OfflineRegionDownloadState(1);
}
