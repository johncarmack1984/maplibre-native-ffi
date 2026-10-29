package org.maplibre.nativeffi;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.maplibre.nativeffi.internal.c.UserDataRelease;

final class Roots {
  private static final AtomicLong NEXT = new AtomicLong();
  private static final ConcurrentHashMap<Long, Root> ROOTS = new ConcurrentHashMap<>();
  static final MemorySegment RELEASE = ((UserDataRelease) Roots::release).stub(Arena.global());

  private Roots() {}

  static long retain(Object value) {
    long id = NEXT.incrementAndGet();
    ROOTS.put(id, new Root(value));
    return id;
  }

  static Object get(long id) {
    Root root = ROOTS.get(id);
    return root == null ? null : root.value();
  }

  static void accept(long id, Owner owner) {
    Root root = ROOTS.get(id);
    if (root != null) root.accept(id, owner);
  }

  static void retire(Owner owner) {
    owner.state.closed.set(true);
    for (long id : owner.callbacks.keySet()) {
      Root root = ROOTS.get(id);
      if (root != null) root.retire();
    }
  }

  static void release(MemorySegment context) {
    release(context.address());
  }

  static void release(long id) {
    Root root = ROOTS.remove(id);
    if (root != null) root.release(id);
  }

  static void report(Throwable error) {
    try {
      Thread thread = Thread.currentThread();
      thread.getUncaughtExceptionHandler().uncaughtException(thread, error);
    } catch (Throwable ignored) {
    }
  }

  private static final class Root {
    Object strong;
    WeakReference<Object> weak;
    WeakReference<Owner> owner;
    boolean released;

    Root(Object value) {
      strong = value;
    }

    synchronized Object value() {
      return strong != null ? strong : weak == null ? null : weak.get();
    }

    synchronized void accept(long id, Owner receiver) {
      if (released || receiver == null) return;
      receiver.callbacks.put(id, strong);
      weak = new WeakReference<>(strong);
      owner = new WeakReference<>(receiver);
      // Insert before reading closed: a concurrent retirement either sees this
      // entry or has already closed the owner, in which case it stays strong.
      if (!receiver.isClosed()) strong = null;
    }

    synchronized void retire() {
      if (!released && strong == null) strong = weak.get();
    }

    synchronized void release(long id) {
      released = true;
      if (owner != null) {
        Owner receiver = owner.get();
        if (receiver != null) receiver.callbacks.remove(id);
      }
      strong = null;
      weak = null;
    }
  }
}
