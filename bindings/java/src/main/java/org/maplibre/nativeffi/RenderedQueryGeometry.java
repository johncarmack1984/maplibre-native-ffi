// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Rendered feature query geometry descriptor.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/query_8h.html">mln_rendered_query_geometry</a>
 */
public record RenderedQueryGeometry(RenderedQueryGeometryData data) {
  public RenderedQueryGeometry withData(RenderedQueryGeometryData replacement) {
    return new RenderedQueryGeometry(replacement);
  }
}
