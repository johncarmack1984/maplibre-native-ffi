// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Options for rendered feature queries.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/query_8h.html">mln_rendered_feature_query_options</a>
 */
public record RenderedFeatureQueryOptions(java.util.List<String> layerIds, String filter) {
  public RenderedFeatureQueryOptions {
    layerIds = layerIds == null ? null : java.util.List.copyOf(layerIds);
  }

  public RenderedFeatureQueryOptions() {
    this(null, "");
  }

  public RenderedFeatureQueryOptions withLayerIds(java.util.List<String> replacement) {
    return new RenderedFeatureQueryOptions(replacement, this.filter);
  }

  public RenderedFeatureQueryOptions withFilter(String replacement) {
    return new RenderedFeatureQueryOptions(this.layerIds, replacement);
  }
}
