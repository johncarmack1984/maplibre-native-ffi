// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Tagged offline region definition.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_offline_region_definition</a>
 */
public record OfflineRegionDefinition(OfflineRegionDefinitionData data) {
  public OfflineRegionDefinition withData(OfflineRegionDefinitionData replacement) {
    return new OfflineRegionDefinition(replacement);
  }
}
