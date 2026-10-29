// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Requests one tile of a custom geometry or custom vector source.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_custom_source_fetch_tile_callback</a>
 */
@FunctionalInterface
public interface CustomSourceFetchTileCallback {
  void invoke(CanonicalTileId tileId);
}
