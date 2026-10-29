// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Style source type values returned by source metadata queries.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_style_source_type</a>
 */
public record StyleSourceType(int rawValue) {
  public static final StyleSourceType UNKNOWN = new StyleSourceType(0);
  public static final StyleSourceType VECTOR = new StyleSourceType(1);
  public static final StyleSourceType RASTER = new StyleSourceType(2);
  public static final StyleSourceType RASTER_DEM = new StyleSourceType(3);
  public static final StyleSourceType GEO_JSON = new StyleSourceType(4);
  public static final StyleSourceType IMAGE = new StyleSourceType(5);
  public static final StyleSourceType VIDEO = new StyleSourceType(6);
  public static final StyleSourceType ANNOTATIONS = new StyleSourceType(7);
  public static final StyleSourceType CUSTOM_GEOMETRY = new StyleSourceType(8);
  public static final StyleSourceType CUSTOM_VECTOR = new StyleSourceType(9);
}
