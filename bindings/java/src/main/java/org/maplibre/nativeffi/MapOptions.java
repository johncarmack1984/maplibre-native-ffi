// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Options used when creating a map.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_options</a>
 */
public record MapOptions(
    LogicalExtent initialExtent,
    MapMode mapMode,
    boolean fastPforEnabled,
    RuntimeEventFlag eventMask) {
  public MapOptions(LogicalExtent initialExtent) {
    this(initialExtent, new MapMode(0), false, null);
  }

  public MapOptions withInitialExtent(LogicalExtent replacement) {
    return new MapOptions(replacement, this.mapMode, this.fastPforEnabled, this.eventMask);
  }

  public MapOptions withMapMode(MapMode replacement) {
    return new MapOptions(this.initialExtent, replacement, this.fastPforEnabled, this.eventMask);
  }

  public MapOptions withFastPforEnabled(boolean replacement) {
    return new MapOptions(this.initialExtent, this.mapMode, replacement, this.eventMask);
  }

  public MapOptions withEventMask(RuntimeEventFlag replacement) {
    return new MapOptions(this.initialExtent, this.mapMode, this.fastPforEnabled, replacement);
  }
}
