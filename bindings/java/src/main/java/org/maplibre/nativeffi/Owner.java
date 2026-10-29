package org.maplibre.nativeffi;

import java.lang.ref.Cleaner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.LongConsumer;

abstract class Owner {
  private static final Cleaner CLEANER = Cleaner.create();
  final State state;
  final ConcurrentHashMap<Long, Object> callbacks = new ConcurrentHashMap<>();
  private final Object parent;
  private final Cleaner.Cleanable cleanable;

  Owner(String type, long id, Object parent, LongConsumer dispose) {
    this.parent = parent;
    state = new State(type, id, dispose);
    cleanable = CLEANER.register(this, state);
  }

  /** Native handle bit pattern, readable after release for matching event sources. */
  public final long id() {
    return state.id;
  }

  /** Whether native accepted a release, dispose, or consuming operation. */
  public final boolean isClosed() {
    return state.closed.get();
  }

  static final class State implements Runnable {
    final String type;
    final long id;
    final LongConsumer dispose;
    final AtomicBoolean closed = new AtomicBoolean();
    final AtomicInteger gate = new AtomicInteger();

    State(String type, long id, LongConsumer dispose) {
      this.type = type;
      this.id = id;
      this.dispose = dispose;
    }

    void enter(boolean release) {
      while (true) {
        int previous = gate.get();
        if (release ? previous != 0 : previous < 0)
          throw new IllegalStateException(type + " is in use or releasing");
        if (gate.compareAndSet(previous, previous + (release ? -1 : 1))) return;
      }
    }

    void leave(boolean release) {
      gate.addAndGet(release ? 1 : -1);
    }

    public void run() {
      if (!closed.compareAndSet(false, true)) return;
      Throwable failure = null;
      try {
        dispose.accept(id);
      } catch (Throwable error) {
        failure = error;
      }
      Roots.report(
          new IllegalStateException(
              "Leaked "
                  + type
                  + " native handle 0x"
                  + Long.toHexString(id)
                  + "; close it explicitly",
              failure));
    }
  }
}
