// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Global style transition options.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_style_transition_options</a>
 */
public record StyleTransitionOptions(
    Double durationMs, Double delayMs, Boolean enablePlacementTransitions) {
  public StyleTransitionOptions() {
    this(null, null, null);
  }

  public StyleTransitionOptions withDurationMs(Double replacement) {
    return new StyleTransitionOptions(replacement, this.delayMs, this.enablePlacementTransitions);
  }

  public StyleTransitionOptions withDelayMs(Double replacement) {
    return new StyleTransitionOptions(
        this.durationMs, replacement, this.enablePlacementTransitions);
  }

  public StyleTransitionOptions withEnablePlacementTransitions(Boolean replacement) {
    return new StyleTransitionOptions(this.durationMs, this.delayMs, replacement);
  }
}
