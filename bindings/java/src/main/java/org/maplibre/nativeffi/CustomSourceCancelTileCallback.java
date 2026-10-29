// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Cancels a request for one tile of a custom geometry or custom vector source, best effort.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_custom_source_cancel_tile_callback</a>
 */
@FunctionalInterface
public interface CustomSourceCancelTileCallback {
  void invoke(CanonicalTileId tileId);
}
