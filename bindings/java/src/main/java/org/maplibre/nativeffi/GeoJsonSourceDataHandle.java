// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import org.maplibre.nativeffi.internal.c.C;

/**
 * Prepared GeoJSON data that sources retain independently of its handle.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/base_8h.html">mln_geo_json_source_data</a>
 */
public final class GeoJsonSourceDataHandle extends Owner implements AutoCloseable {
  GeoJsonSourceDataHandle(long id, Object parent) {
    super("GeoJsonSourceDataHandle", id, parent, GeoJsonSourceDataHandle::disposeNative);
  }

  static GeoJsonSourceDataHandle adopt(long id, Object parent) {
    try {
      return new GeoJsonSourceDataHandle(id, parent);
    } catch (Throwable failure) {
      try {
        disposeNative(id);
      } catch (Throwable cleanup) {
        failure.addSuppressed(cleanup);
      }
      throw failure;
    }
  }

  private static void disposeNative(long id) {
    try (var call = new Call(null, 0)) {
      C.mln_geo_json_source_data_release(id);
    }
  }

  /**
   * Releases prepared GeoJSON source data.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_geo_json_source_data_release</a>
   */
  public void close() {
    if (isClosed()) return;
    try (var call = new Call(this, 2, false)) {
      C.mln_geo_json_source_data_release(id());
      call.accept(this);
    }
  }

  /**
   * Prepares GeoJSON source data for installation on a map.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_geo_json_source_data_create</a>
   */
  public static GeoJsonSourceDataHandle create(String data, GeoJsonSourceOptions options) {
    try (var call = new Call(null, 0, false)) {
      var out0 = call.arena.allocate(JAVA_LONG);
      call.check(
          C.mln_geo_json_source_data_create(
              call.view(call.text(data)),
              (options == null
                  ? MemorySegment.NULL
                  : Codecs.writeGeoJsonSourceOptions(call, options)),
              out0,
              call.diagnostic.segment()));
      var adopted = GeoJsonSourceDataHandle.adopt(out0.get(JAVA_LONG, 0), null);
      call.accept(adopted);
      return adopted;
    }
  }
}
