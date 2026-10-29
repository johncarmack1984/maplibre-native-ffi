// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Geographic coordinate in degrees used by map and projection APIs.
 *
 * @see <a href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_lat_lng</a>
 */
public record LatLng(double latitude, double longitude) {
  public LatLng() {
    this(0.0, 0.0);
  }

  public LatLng withLatitude(double replacement) {
    return new LatLng(replacement, this.longitude);
  }

  public LatLng withLongitude(double replacement) {
    return new LatLng(this.latitude, replacement);
  }
}
