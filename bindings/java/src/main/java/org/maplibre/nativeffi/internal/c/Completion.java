// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi.internal.c;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Callback state for one asynchronous submission. The completion may run, or be queued, before the
 * submitting call returns.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/completion_8h.html">mln_completion</a>
 */
public record Completion(MemorySegment segment) {
  public static final GroupLayout LAYOUT =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.paddingLayout(4),
          ADDRESS.withName("callback"),
          ADDRESS.withName("user_data"),
          ADDRESS.withName("release_user_data"),
          JAVA_LONG.withName("queue"));

  public Completion {
    segment = segment.asSlice(0, LAYOUT);
  }

  /** Allocates zeroed native storage in the supplied arena. */
  public static Completion allocate(Arena arena) {
    var value = new Completion(arena.allocate(LAYOUT));
    value.size((int) LAYOUT.byteSize());
    return value;
  }

  /**
   * @see <a href="https://maplibre.org/maplibre-native-ffi/reference/c/completion_8h.html">size</a>
   */
  public int size() {
    return segment.get(JAVA_INT, 0);
  }

  public void size(int value) {
    segment.set(JAVA_INT, 0, value);
  }

  /**
   * Receives the terminal result.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/completion_8h.html">callback</a>
   */
  public MemorySegment callback() {
    return segment.get(ADDRESS, 8);
  }

  public void callback(MemorySegment value) {
    segment.set(ADDRESS, 8, value);
  }

  /**
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/completion_8h.html">user_data</a>
   */
  public MemorySegment user_data() {
    return segment.get(ADDRESS, 16);
  }

  public void user_data(MemorySegment value) {
    segment.set(ADDRESS, 16, value);
  }

  /**
   * Optional. Releases user_data on the completing thread after the completion returns.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/completion_8h.html">release_user_data</a>
   */
  public MemorySegment release_user_data() {
    return segment.get(ADDRESS, 24);
  }

  public void release_user_data(MemorySegment value) {
    segment.set(ADDRESS, 24, value);
  }

  /**
   * Optional. The completion and its release run in {@code mln_delivery_queue_dispatch()}. The call
   * may be queued before the submission returns. A rejected submission queues nothing and needs no
   * cleanup. A submission rejects an invalid queue handle with {@code MLN_STATUS_INVALID_ARGUMENT}
   * and a released queue with {@code MLN_STATUS_INVALID_STATE}.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/completion_8h.html">queue</a>
   */
  public long queue() {
    return segment.get(JAVA_LONG, 32);
  }

  public void queue(long value) {
    segment.set(JAVA_LONG, 32, value);
  }
}
