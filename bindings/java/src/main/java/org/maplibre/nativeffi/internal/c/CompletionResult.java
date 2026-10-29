// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi.internal.c;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Borrowed terminal result for one accepted asynchronous submission.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/completion_8h.html">mln_completion_result</a>
 */
public record CompletionResult(MemorySegment segment) {
  public static final GroupLayout LAYOUT =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("status"),
          JAVA_INT.withName("disposition"),
          JAVA_INT.withName("value_size"),
          JAVA_LONG.withName("generation"),
          JAVA_LONG.withName("render_update_generation"),
          Layouts.BufferView.withName("diagnostic"),
          ADDRESS.withName("value"),
          JAVA_LONG.withName("value_count"));

  public CompletionResult {
    segment = segment.asSlice(0, LAYOUT);
  }

  /** Allocates zeroed native storage in the supplied arena. */
  public static CompletionResult allocate(Arena arena) {
    var value = new CompletionResult(arena.allocate(LAYOUT));
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
   * Terminal status, one of {@code mln_status}.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/completion_8h.html">status</a>
   */
  public int status() {
    return segment.get(JAVA_INT, 4);
  }

  public void status(int value) {
    segment.set(JAVA_INT, 4, value);
  }

  /**
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/completion_8h.html">disposition</a>
   */
  public int disposition() {
    return segment.get(JAVA_INT, 8);
  }

  public void disposition(int value) {
    segment.set(JAVA_INT, 8, value);
  }

  /**
   * Byte stride of one element of value: sizeof the result record in the native build, at least
   * sizeof in the caller&#x27;s header. Zero when value is null. Index array results with this
   * value.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/completion_8h.html">value_size</a>
   */
  public int value_size() {
    return segment.get(JAVA_INT, 12);
  }

  public void value_size(int value) {
    segment.set(JAVA_INT, 12, value);
  }

  /**
   * Map snapshot generation published after a map command ran, whether it committed or failed; zero
   * when the command never ran or the function is not a map command.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/completion_8h.html">generation</a>
   */
  public long generation() {
    return segment.get(JAVA_LONG, 16);
  }

  public void generation(long value) {
    segment.set(JAVA_LONG, 16, value);
  }

  /**
   * Generation of the first map render update that includes the command. A frame result with
   * disposition {@code MLN_RENDER_RESULT_RENDERED} and a map_update_generation at or past this
   * value was rendered from map state that includes the command. Inside a command group, this is
   * the update that the outermost group end publishes. Zero when generation is zero.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/completion_8h.html">render_update_generation</a>
   */
  public long render_update_generation() {
    return segment.get(JAVA_LONG, 24);
  }

  public void render_update_generation(long value) {
    segment.set(JAVA_LONG, 24, value);
  }

  /**
   * Borrowed diagnostic bytes, empty on success.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/completion_8h.html">diagnostic</a>
   */
  public BufferView diagnostic() {
    return new BufferView(segment.asSlice(32, BufferView.LAYOUT));
  }

  public void diagnostic(BufferView value) {
    MemorySegment.copy(value.segment(), 0, segment, 32, BufferView.LAYOUT.byteSize());
  }

  /**
   * Borrowed function-specific result, or null when the function has none.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/completion_8h.html">value</a>
   */
  public MemorySegment value() {
    return segment.get(ADDRESS, 48);
  }

  public void value(MemorySegment value) {
    segment.set(ADDRESS, 48, value);
  }

  /**
   * Function-specific element count for value.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/completion_8h.html">value_count</a>
   */
  public long value_count() {
    return segment.get(JAVA_LONG, 56);
  }

  public void value_count(long value) {
    segment.set(JAVA_LONG, 56, value);
  }
}
