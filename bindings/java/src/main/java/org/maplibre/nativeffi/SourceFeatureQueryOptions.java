// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Options for source feature queries.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/query_8h.html">mln_source_feature_query_options</a>
 */
public record SourceFeatureQueryOptions(java.util.List<String> sourceLayerIds, String filter) {
  public SourceFeatureQueryOptions {
    sourceLayerIds = sourceLayerIds == null ? null : java.util.List.copyOf(sourceLayerIds);
  }

  public SourceFeatureQueryOptions() {
    this(null, "");
  }

  public SourceFeatureQueryOptions withSourceLayerIds(java.util.List<String> replacement) {
    return new SourceFeatureQueryOptions(replacement, this.filter);
  }

  public SourceFeatureQueryOptions withFilter(String replacement) {
    return new SourceFeatureQueryOptions(this.sourceLayerIds, replacement);
  }
}
