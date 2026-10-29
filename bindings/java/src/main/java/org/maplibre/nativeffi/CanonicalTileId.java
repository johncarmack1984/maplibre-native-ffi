// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Canonical tile identity used by custom geometry and custom vector source callbacks.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_canonical_tile_id</a>
 */
public record CanonicalTileId(int z, int x, int y) {
  public CanonicalTileId() {
    this(0, 0, 0);
  }

  public CanonicalTileId withZ(int replacement) {
    return new CanonicalTileId(replacement, this.x, this.y);
  }

  public CanonicalTileId withX(int replacement) {
    return new CanonicalTileId(this.z, replacement, this.y);
  }

  public CanonicalTileId withY(int replacement) {
    return new CanonicalTileId(this.z, this.x, replacement);
  }
}
