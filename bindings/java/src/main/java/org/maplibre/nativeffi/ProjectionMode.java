// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * MapLibre axonometric rendering options used for snapshots and commands.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_projection_mode</a>
 */
public record ProjectionMode(Boolean axonometric, Double xSkew, Double ySkew) {
  public ProjectionMode() {
    this(null, null, null);
  }

  public ProjectionMode withAxonometric(Boolean replacement) {
    return new ProjectionMode(replacement, this.xSkew, this.ySkew);
  }

  public ProjectionMode withXSkew(Double replacement) {
    return new ProjectionMode(this.axonometric, replacement, this.ySkew);
  }

  public ProjectionMode withYSkew(Double replacement) {
    return new ProjectionMode(this.axonometric, this.xSkew, replacement);
  }
}
