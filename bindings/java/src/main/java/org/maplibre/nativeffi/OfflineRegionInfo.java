// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Region data delivered by an offline completion.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_offline_region_info</a>
 */
public record OfflineRegionInfo(long id, OfflineRegionDefinition definition, byte[] metadata) {
  @Override
  public byte[] metadata() {
    return metadata.clone();
  }

  public OfflineRegionInfo {
    metadata = metadata.clone();
  }

  public OfflineRegionInfo(OfflineRegionDefinition definition) {
    this(0L, definition, new byte[0]);
  }

  public OfflineRegionInfo withId(long replacement) {
    return new OfflineRegionInfo(replacement, this.definition, this.metadata);
  }

  public OfflineRegionInfo withDefinition(OfflineRegionDefinition replacement) {
    return new OfflineRegionInfo(this.id, replacement, this.metadata);
  }

  public OfflineRegionInfo withMetadata(byte[] replacement) {
    return new OfflineRegionInfo(this.id, this.definition, replacement);
  }

  @Override
  public boolean equals(Object other) {
    return other instanceof OfflineRegionInfo value
        && java.util.Arrays.deepEquals(
            new Object[] {this.id, this.definition, this.metadata},
            new Object[] {value.id, value.definition, value.metadata});
  }

  @Override
  public int hashCode() {
    return java.util.Arrays.deepHashCode(new Object[] {id, definition, metadata});
  }
}
