// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Screen-space query geometry data.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/query_8h.html">mln_rendered_query_geometry_data</a>
 */
public sealed interface RenderedQueryGeometryData {
  record Point(ScreenPoint value) implements RenderedQueryGeometryData {}

  record Box(ScreenBox value) implements RenderedQueryGeometryData {}

  record LineString(ScreenLineString value) implements RenderedQueryGeometryData {}

  record Unknown(int rawTag, byte[] bytes) implements RenderedQueryGeometryData {
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
