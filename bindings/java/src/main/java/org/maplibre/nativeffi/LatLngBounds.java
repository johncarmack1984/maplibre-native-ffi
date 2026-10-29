// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Geographic bounds in degrees.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_lat_lng_bounds</a>
 */
public record LatLngBounds(LatLng southwest, LatLng northeast) {
  public LatLngBounds() {
    this(new LatLng(), new LatLng());
  }

  public LatLngBounds withSouthwest(LatLng replacement) {
    return new LatLngBounds(replacement, this.northeast);
  }

  public LatLngBounds withNortheast(LatLng replacement) {
    return new LatLngBounds(this.southwest, replacement);
  }
}
