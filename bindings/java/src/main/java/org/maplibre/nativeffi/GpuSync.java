// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Backend synchronization copied by frame access and release calls.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__target_8h.html">mln_gpu_sync</a>
 */
public final class GpuSync {
  private final Scope scope;
  private final GpuSyncKind kind;
  private final long handle;

  public GpuSync(GpuSyncKind kind, long handle) {
    this(kind, handle, null);
  }

  GpuSync(GpuSyncKind kind, long handle, Scope scope) {
    this.scope = scope;
    this.kind = kind;
    this.handle = handle;
  }

  public GpuSyncKind kind() {
    return kind;
  }

  public long handle() {
    if (scope != null) scope.check();
    return handle;
  }

  public GpuSync() {
    this(new GpuSyncKind(0), 0L);
  }
}
