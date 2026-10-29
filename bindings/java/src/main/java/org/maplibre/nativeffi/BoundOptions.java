// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Optional map camera constraint fields.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_bound_options</a>
 */
public record BoundOptions(
    LatLngBounds bounds,
    Double minZoom,
    Double maxZoom,
    Double minPitch,
    Double maxPitch,
    boolean unbounded) {
  public BoundOptions() {
    this(null, null, null, null, null, false);
  }

  public BoundOptions withBounds(LatLngBounds replacement) {
    return new BoundOptions(
        replacement, this.minZoom, this.maxZoom, this.minPitch, this.maxPitch, this.unbounded);
  }

  public BoundOptions withMinZoom(Double replacement) {
    return new BoundOptions(
        this.bounds, replacement, this.maxZoom, this.minPitch, this.maxPitch, this.unbounded);
  }

  public BoundOptions withMaxZoom(Double replacement) {
    return new BoundOptions(
        this.bounds, this.minZoom, replacement, this.minPitch, this.maxPitch, this.unbounded);
  }

  public BoundOptions withMinPitch(Double replacement) {
    return new BoundOptions(
        this.bounds, this.minZoom, this.maxZoom, replacement, this.maxPitch, this.unbounded);
  }

  public BoundOptions withMaxPitch(Double replacement) {
    return new BoundOptions(
        this.bounds, this.minZoom, this.maxZoom, this.minPitch, replacement, this.unbounded);
  }

  public BoundOptions withUnbounded(boolean replacement) {
    return new BoundOptions(
        this.bounds, this.minZoom, this.maxZoom, this.minPitch, this.maxPitch, replacement);
  }
}
