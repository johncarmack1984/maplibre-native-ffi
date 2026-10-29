// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Bit values for the map and runtime event subscription masks.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_event_flag</a>
 */
public record RuntimeEventFlag(long rawValue) {
  public static final RuntimeEventFlag NONE = new RuntimeEventFlag(0L);
  public static final RuntimeEventFlag MAP_CAMERA_WILL_CHANGE = new RuntimeEventFlag(2L);
  public static final RuntimeEventFlag MAP_CAMERA_IS_CHANGING = new RuntimeEventFlag(4L);
  public static final RuntimeEventFlag MAP_CAMERA_DID_CHANGE = new RuntimeEventFlag(8L);
  public static final RuntimeEventFlag MAP_STYLE_LOADED = new RuntimeEventFlag(16L);
  public static final RuntimeEventFlag MAP_LOADING_STARTED = new RuntimeEventFlag(32L);
  public static final RuntimeEventFlag MAP_LOADING_FINISHED = new RuntimeEventFlag(64L);
  public static final RuntimeEventFlag MAP_LOADING_FAILED = new RuntimeEventFlag(128L);
  public static final RuntimeEventFlag MAP_IDLE = new RuntimeEventFlag(256L);
  public static final RuntimeEventFlag MAP_RENDER_ERROR = new RuntimeEventFlag(512L);
  public static final RuntimeEventFlag MAP_RENDER_FRAME_STARTED = new RuntimeEventFlag(1024L);
  public static final RuntimeEventFlag MAP_RENDER_FRAME_FINISHED = new RuntimeEventFlag(2048L);
  public static final RuntimeEventFlag MAP_RENDER_MAP_STARTED = new RuntimeEventFlag(4096L);
  public static final RuntimeEventFlag MAP_RENDER_MAP_FINISHED = new RuntimeEventFlag(8192L);
  public static final RuntimeEventFlag MAP_STYLE_IMAGE_MISSING = new RuntimeEventFlag(16384L);
  public static final RuntimeEventFlag MAP_TILE_ACTION = new RuntimeEventFlag(32768L);
  public static final RuntimeEventFlag MAP_SOURCE_CHANGED = new RuntimeEventFlag(65536L);
  public static final RuntimeEventFlag OFFLINE_REGION_STATUS_CHANGED =
      new RuntimeEventFlag(131072L);
  public static final RuntimeEventFlag OFFLINE_REGION_RESPONSE_ERROR =
      new RuntimeEventFlag(262144L);
  public static final RuntimeEventFlag OFFLINE_REGION_TILE_COUNT_LIMIT_EXCEEDED =
      new RuntimeEventFlag(524288L);
  public static final RuntimeEventFlag MAP_GLYPHS_REQUESTED = new RuntimeEventFlag(1048576L);
  public static final RuntimeEventFlag MAP_GLYPHS_LOADED = new RuntimeEventFlag(2097152L);
  public static final RuntimeEventFlag MAP_GLYPHS_ERROR = new RuntimeEventFlag(4194304L);
  public static final RuntimeEventFlag MAP_SPRITE_REQUESTED = new RuntimeEventFlag(8388608L);
  public static final RuntimeEventFlag MAP_SPRITE_LOADED = new RuntimeEventFlag(16777216L);
  public static final RuntimeEventFlag MAP_SPRITE_ERROR = new RuntimeEventFlag(33554432L);
  public static final RuntimeEventFlag ALL_MAP_EVENTS = new RuntimeEventFlag(66191358L);
  public static final RuntimeEventFlag ALL_RUNTIME_EVENTS = new RuntimeEventFlag(917504L);
  public static final RuntimeEventFlag ALL = new RuntimeEventFlag(67108862L);

  public RuntimeEventFlag or(RuntimeEventFlag other) {
    return new RuntimeEventFlag(rawValue | other.rawValue);
  }

  public boolean contains(RuntimeEventFlag other) {
    return (rawValue & other.rawValue) == other.rawValue;
  }
}
