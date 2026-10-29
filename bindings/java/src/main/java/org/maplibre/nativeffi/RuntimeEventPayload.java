// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Typed event payload carried inline by every event.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_event_payload</a>
 */
public sealed interface RuntimeEventPayload {
  record RenderFrame(RuntimeEventRenderFrame value) implements RuntimeEventPayload {}

  record RenderMap(RuntimeEventRenderMap value) implements RuntimeEventPayload {}

  record TileAction(RuntimeEventTileAction value) implements RuntimeEventPayload {}

  record OfflineRegionStatus(RuntimeEventOfflineRegionStatus value)
      implements RuntimeEventPayload {}

  record OfflineRegionResponseError(RuntimeEventOfflineRegionResponseError value)
      implements RuntimeEventPayload {}

  record OfflineRegionTileCountLimit(RuntimeEventOfflineRegionTileCountLimit value)
      implements RuntimeEventPayload {}

  record Glyphs(RuntimeEventGlyphs value) implements RuntimeEventPayload {}

  record Sprite(RuntimeEventSprite value) implements RuntimeEventPayload {}

  record Empty() implements RuntimeEventPayload {}

  record Unknown(int rawTag, byte[] bytes) implements RuntimeEventPayload {
    public Unknown {
      bytes = bytes.clone();
    }

    @Override
    public byte[] bytes() {
      return bytes.clone();
    }

    @Override
    public boolean equals(Object other) {
      return other instanceof Unknown value
          && rawTag == value.rawTag
          && java.util.Arrays.equals(bytes, value.bytes);
    }

    @Override
    public int hashCode() {
      return 31 * rawTag + java.util.Arrays.hashCode(bytes);
    }
  }
}
