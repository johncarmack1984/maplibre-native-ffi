// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Payload for {@code MLN_RUNTIME_EVENT_MAP_TILE_ACTION}.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_event_tile_action</a>
 */
public record RuntimeEventTileAction(TileOperation operation, TileId tileId) {
  public RuntimeEventTileAction() {
    this(new TileOperation(0), new TileId());
  }

  public RuntimeEventTileAction withOperation(TileOperation replacement) {
    return new RuntimeEventTileAction(replacement, this.tileId);
  }

  public RuntimeEventTileAction withTileId(TileId replacement) {
    return new RuntimeEventTileAction(this.operation, replacement);
  }
}
