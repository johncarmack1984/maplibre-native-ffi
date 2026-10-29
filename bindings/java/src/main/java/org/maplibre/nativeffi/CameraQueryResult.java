// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Camera result of an ordered camera query.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_camera_query_result</a>
 */
public record CameraQueryResult(long generation, Camera camera) {
  public CameraQueryResult() {
    this(0L, new Camera());
  }

  public CameraQueryResult withGeneration(long replacement) {
    return new CameraQueryResult(replacement, this.camera);
  }

  public CameraQueryResult withCamera(Camera replacement) {
    return new CameraQueryResult(this.generation, replacement);
  }
}
