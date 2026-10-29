// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Runtime event types carried by {@code mln_runtime_event.type}.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_event_type</a>
 */
public record RuntimeEventType(int rawValue) {
  public static final RuntimeEventType MAP_CAMERA_WILL_CHANGE = new RuntimeEventType(1);
  public static final RuntimeEventType MAP_CAMERA_IS_CHANGING = new RuntimeEventType(2);
  public static final RuntimeEventType MAP_CAMERA_DID_CHANGE = new RuntimeEventType(3);
  public static final RuntimeEventType MAP_STYLE_LOADED = new RuntimeEventType(4);
  public static final RuntimeEventType MAP_LOADING_STARTED = new RuntimeEventType(5);
  public static final RuntimeEventType MAP_LOADING_FINISHED = new RuntimeEventType(6);
  public static final RuntimeEventType MAP_LOADING_FAILED = new RuntimeEventType(7);
  public static final RuntimeEventType MAP_IDLE = new RuntimeEventType(8);
  public static final RuntimeEventType MAP_RENDER_ERROR = new RuntimeEventType(9);
  public static final RuntimeEventType MAP_RENDER_FRAME_STARTED = new RuntimeEventType(10);
  public static final RuntimeEventType MAP_RENDER_FRAME_FINISHED = new RuntimeEventType(11);
  public static final RuntimeEventType MAP_RENDER_MAP_STARTED = new RuntimeEventType(12);
  public static final RuntimeEventType MAP_RENDER_MAP_FINISHED = new RuntimeEventType(13);
  public static final RuntimeEventType MAP_STYLE_IMAGE_MISSING = new RuntimeEventType(14);
  public static final RuntimeEventType MAP_TILE_ACTION = new RuntimeEventType(15);
  public static final RuntimeEventType MAP_SOURCE_CHANGED = new RuntimeEventType(16);
  public static final RuntimeEventType OFFLINE_REGION_STATUS_CHANGED = new RuntimeEventType(17);
  public static final RuntimeEventType OFFLINE_REGION_RESPONSE_ERROR = new RuntimeEventType(18);
  public static final RuntimeEventType OFFLINE_REGION_TILE_COUNT_LIMIT_EXCEEDED =
      new RuntimeEventType(19);
  public static final RuntimeEventType MAP_GLYPHS_REQUESTED = new RuntimeEventType(20);
  public static final RuntimeEventType MAP_GLYPHS_LOADED = new RuntimeEventType(21);
  public static final RuntimeEventType MAP_GLYPHS_ERROR = new RuntimeEventType(22);
  public static final RuntimeEventType MAP_SPRITE_REQUESTED = new RuntimeEventType(23);
  public static final RuntimeEventType MAP_SPRITE_LOADED = new RuntimeEventType(24);
  public static final RuntimeEventType MAP_SPRITE_ERROR = new RuntimeEventType(25);
}
