// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * One rendered-feature query hit.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/query_8h.html">mln_rendered_feature</a>
 */
public record RenderedFeature(
    String feature, String layerId, String sourceId, String sourceLayerId, String state) {
  public RenderedFeature() {
    this("", "", "", "", "");
  }

  public RenderedFeature withFeature(String replacement) {
    return new RenderedFeature(
        replacement, this.layerId, this.sourceId, this.sourceLayerId, this.state);
  }

  public RenderedFeature withLayerId(String replacement) {
    return new RenderedFeature(
        this.feature, replacement, this.sourceId, this.sourceLayerId, this.state);
  }

  public RenderedFeature withSourceId(String replacement) {
    return new RenderedFeature(
        this.feature, this.layerId, replacement, this.sourceLayerId, this.state);
  }

  public RenderedFeature withSourceLayerId(String replacement) {
    return new RenderedFeature(this.feature, this.layerId, this.sourceId, replacement, this.state);
  }

  public RenderedFeature withState(String replacement) {
    return new RenderedFeature(
        this.feature, this.layerId, this.sourceId, this.sourceLayerId, replacement);
  }
}
