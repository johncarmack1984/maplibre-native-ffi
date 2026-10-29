// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Offline region definition data.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_offline_region_definition_data</a>
 */
public sealed interface OfflineRegionDefinitionData {
  record TilePyramid(OfflineTilePyramidRegionDefinition value)
      implements OfflineRegionDefinitionData {}

  record Geometry(OfflineGeometryRegionDefinition value) implements OfflineRegionDefinitionData {}

  record Unknown(int rawTag, byte[] bytes) implements OfflineRegionDefinitionData {
    public Unknown {
      bytes = bytes.clone();
    }

    @Override
    public byte[] bytes() {
      return bytes.clone();
    }

    @Override
    public boolean equals(Object other) {
      return other instanceof Unknown value
          && rawTag == value.rawTag
          && java.util.Arrays.equals(bytes, value.bytes);
    }

    @Override
    public int hashCode() {
      return 31 * rawTag + java.util.Arrays.hashCode(bytes);
    }
  }
}
