// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Payload for {@code MLN_RUNTIME_EVENT_MAP_SPRITE_REQUESTED}, {@code
 * MLN_RUNTIME_EVENT_MAP_SPRITE_LOADED}, and {@code MLN_RUNTIME_EVENT_MAP_SPRITE_ERROR}.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_event_sprite</a>
 */
public record RuntimeEventSprite(String id, String url) {
  public RuntimeEventSprite() {
    this("", "");
  }

  public RuntimeEventSprite withId(String replacement) {
    return new RuntimeEventSprite(replacement, this.url);
  }

  public RuntimeEventSprite withUrl(String replacement) {
    return new RuntimeEventSprite(this.id, replacement);
  }
}
