// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Feature-state source, feature, and key selector.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_feature_state_selector</a>
 */
public record FeatureStateSelector(
    String sourceId, String sourceLayerId, String featureId, String stateKey) {
  public FeatureStateSelector(String sourceId) {
    this(sourceId, "", null, "");
  }

  public FeatureStateSelector withSourceId(String replacement) {
    return new FeatureStateSelector(replacement, this.sourceLayerId, this.featureId, this.stateKey);
  }

  public FeatureStateSelector withSourceLayerId(String replacement) {
    return new FeatureStateSelector(this.sourceId, replacement, this.featureId, this.stateKey);
  }

  public FeatureStateSelector withFeatureId(String replacement) {
    return new FeatureStateSelector(this.sourceId, this.sourceLayerId, replacement, this.stateKey);
  }

  public FeatureStateSelector withStateKey(String replacement) {
    return new FeatureStateSelector(this.sourceId, this.sourceLayerId, this.featureId, replacement);
  }
}
