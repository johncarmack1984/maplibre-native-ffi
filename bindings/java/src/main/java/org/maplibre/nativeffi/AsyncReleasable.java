package org.maplibre.nativeffi;

import java.util.concurrent.CompletableFuture;

/** An owner whose native retirement can be observed asynchronously. */
public interface AsyncReleasable {
  /** Starts retirement. Synchronous refusal leaves the owner live so the host can retry. */
  CompletableFuture<Void> release();

  boolean isClosed();
}
