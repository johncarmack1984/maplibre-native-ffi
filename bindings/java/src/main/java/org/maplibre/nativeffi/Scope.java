package org.maplibre.nativeffi;

final class Scope implements AutoCloseable {
  private final Thread thread = Thread.currentThread();
  private volatile boolean active = true;

  void check() {
    if (!active || thread != Thread.currentThread())
      throw new IllegalStateException("Borrowed value is outside its scope or thread");
  }

  public void close() {
    active = false;
  }
}
