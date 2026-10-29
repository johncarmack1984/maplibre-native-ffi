// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Options used when creating a runtime.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_options</a>
 */
public record RuntimeOptions(String assetPath, String cachePath) {
  public RuntimeOptions() {
    this("", "");
  }

  public RuntimeOptions withAssetPath(String replacement) {
    return new RuntimeOptions(replacement, this.cachePath);
  }

  public RuntimeOptions withCachePath(String replacement) {
    return new RuntimeOptions(this.assetPath, replacement);
  }
}
