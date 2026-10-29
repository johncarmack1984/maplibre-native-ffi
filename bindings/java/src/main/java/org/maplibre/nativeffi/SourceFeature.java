// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * One source-feature query hit.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/query_8h.html">mln_source_feature</a>
 */
public record SourceFeature(String feature, String sourceLayerId) {
  public SourceFeature() {
    this("", "");
  }

  public SourceFeature withFeature(String replacement) {
    return new SourceFeature(replacement, this.sourceLayerId);
  }

  public SourceFeature withSourceLayerId(String replacement) {
    return new SourceFeature(this.feature, replacement);
  }
}
