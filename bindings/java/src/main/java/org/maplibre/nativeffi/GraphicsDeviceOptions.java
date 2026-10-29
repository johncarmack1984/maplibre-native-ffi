// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Options for creating a graphics device.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/graphics__device_8h.html">mln_graphics_device_options</a>
 */
public record GraphicsDeviceOptions(Integer adapterIndex, Boolean singleContext) {
  public GraphicsDeviceOptions() {
    this(null, null);
  }

  public GraphicsDeviceOptions withAdapterIndex(Integer replacement) {
    return new GraphicsDeviceOptions(replacement, this.singleContext);
  }

  public GraphicsDeviceOptions withSingleContext(Boolean replacement) {
    return new GraphicsDeviceOptions(this.adapterIndex, replacement);
  }
}
