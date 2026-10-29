// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * DEM raster encoding values.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_style_raster_dem_encoding</a>
 */
public record StyleRasterDemEncoding(int rawValue) {
  public static final StyleRasterDemEncoding MAPBOX = new StyleRasterDemEncoding(0);
  public static final StyleRasterDemEncoding TERRARIUM = new StyleRasterDemEncoding(1);
}
