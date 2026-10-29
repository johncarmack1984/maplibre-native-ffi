package org.maplibre.nativeffi;

import java.util.concurrent.CompletableFuture;

/** An immediately owned handle paired with the future that reports its readiness. */
public record Pending<T>(T handle, CompletableFuture<Void> ready) {}
