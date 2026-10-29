package org.maplibre.nativeffi;

import java.util.ArrayList;
import java.util.function.LongConsumer;

// Keep state, never owners, so shutdown tracking does not defeat leak cleanup.
final class Shutdown {
  private record Entry(Owner.State state, LongConsumer abandon) {}

  private static final ArrayList<Entry> entries = new ArrayList<>();
  private static boolean exiting;

  static {
    Runtime.getRuntime().addShutdownHook(new Thread(Shutdown::run, "maplibre-java-exit"));
  }

  static synchronized void enroll(Owner.State state, LongConsumer abandon) {
    if (exiting) {
      abandon.accept(state.id);
      return;
    }
    entries.removeIf(entry -> entry.state.closed.get());
    entries.add(new Entry(state, abandon));
  }

  private static void run() {
    // System.exit inside an upcall waits for this hook. Abandon would wait for
    // that same callback, so hosts must end graphics before exiting in an upcall.
    for (var stack : Thread.getAllStackTraces().values()) {
      boolean exit = false;
      for (var frame : stack) {
        if (frame.getClassName().equals("java.lang.Runtime")
            && frame.getMethodName().equals("exit")) exit = true;
        if (exit && frame.getClassName().equals(Upcalls.class.getName())) return;
      }
    }
    ArrayList<Entry> pending;
    synchronized (Shutdown.class) {
      exiting = true;
      pending = new ArrayList<>(entries);
      entries.clear();
    }
    for (var entry : pending)
      if (!entry.state.closed.get()) {
        try {
          entry.abandon.accept(entry.state.id);
        } catch (Throwable error) {
          Roots.report(error);
        }
      }
  }
}
