// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Render backend support flags reported by this native library build.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/base_8h.html">mln_render_backend_flag</a>
 */
public record RenderBackendFlag(int rawValue) {
  public static final RenderBackendFlag METAL = new RenderBackendFlag(1);
  public static final RenderBackendFlag VULKAN = new RenderBackendFlag(2);
  public static final RenderBackendFlag OPEN_GL = new RenderBackendFlag(4);
  public static final RenderBackendFlag WEB_GPU = new RenderBackendFlag(8);

  public RenderBackendFlag or(RenderBackendFlag other) {
    return new RenderBackendFlag(rawValue | other.rawValue);
  }

  public boolean contains(RenderBackendFlag other) {
    return (rawValue & other.rawValue) == other.rawValue;
  }
}
