// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Lower-level Spherical Mercator projected-meter coordinate.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_projected_meters</a>
 */
public record ProjectedMeters(double northing, double easting) {
  public ProjectedMeters() {
    this(0.0, 0.0);
  }

  public ProjectedMeters withNorthing(double replacement) {
    return new ProjectedMeters(replacement, this.easting);
  }

  public ProjectedMeters withEasting(double replacement) {
    return new ProjectedMeters(this.northing, replacement);
  }
}
