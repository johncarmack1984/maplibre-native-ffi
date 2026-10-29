// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Synchronization payload kind for acquired texture frames.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__target_8h.html">mln_gpu_sync_kind</a>
 */
public record GpuSyncKind(int rawValue) {
  public static final GpuSyncKind CPU_COMPLETE = new GpuSyncKind(0);
  public static final GpuSyncKind OPEN_GL_FENCE = new GpuSyncKind(1);
}
