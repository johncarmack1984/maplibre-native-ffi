// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Overscaled tile identity reported in tile observer events.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_tile_id</a>
 */
public record TileId(int overscaledZ, int wrap, int canonicalZ, int canonicalX, int canonicalY) {
  public TileId() {
    this(0, 0, 0, 0, 0);
  }

  public TileId withOverscaledZ(int replacement) {
    return new TileId(replacement, this.wrap, this.canonicalZ, this.canonicalX, this.canonicalY);
  }

  public TileId withWrap(int replacement) {
    return new TileId(
        this.overscaledZ, replacement, this.canonicalZ, this.canonicalX, this.canonicalY);
  }

  public TileId withCanonicalZ(int replacement) {
    return new TileId(this.overscaledZ, this.wrap, replacement, this.canonicalX, this.canonicalY);
  }

  public TileId withCanonicalX(int replacement) {
    return new TileId(this.overscaledZ, this.wrap, this.canonicalZ, replacement, this.canonicalY);
  }

  public TileId withCanonicalY(int replacement) {
    return new TileId(this.overscaledZ, this.wrap, this.canonicalZ, this.canonicalX, replacement);
  }
}
