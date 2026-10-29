// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import org.maplibre.nativeffi.internal.c.C;

/**
 * A parsed style expression, immutable and independent of any map.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/base_8h.html">mln_style_expression</a>
 */
public final class StyleExpressionHandle extends Owner implements AutoCloseable {
  StyleExpressionHandle(long id, Object parent) {
    super("StyleExpressionHandle", id, parent, StyleExpressionHandle::disposeNative);
  }

  static StyleExpressionHandle adopt(long id, Object parent) {
    try {
      return new StyleExpressionHandle(id, parent);
    } catch (Throwable failure) {
      try {
        disposeNative(id);
      } catch (Throwable cleanup) {
        failure.addSuppressed(cleanup);
      }
      throw failure;
    }
  }

  private static void disposeNative(long id) {
    try (var call = new Call(null, 0)) {
      C.mln_style_expression_release(id);
    }
  }

  /**
   * Evaluates a parsed expression and writes its result as UTF-8 JSON.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style__expression_8h.html">mln_style_expression_evaluate</a>
   */
  public String evaluate(StyleExpressionInputs inputs) {
    try (var call = new Call(this, 1)) {
      long capacity = 256;
      while (true) {
        var buffer = call.arena.allocate(capacity);
        var length = call.arena.allocate(JAVA_LONG);
        int status =
            C.mln_style_expression_evaluate(
                id(),
                (inputs == null
                    ? MemorySegment.NULL
                    : Codecs.writeStyleExpressionInputs(call, inputs)),
                buffer,
                capacity,
                length,
                call.diagnostic.segment());
        long needed = length.get(JAVA_LONG, 0);
        if (needed >= capacity) {
          capacity = Math.addExact(needed, 1);
          continue;
        }
        call.check(status);
        return Memory.text(buffer, needed);
      }
    }
  }

  /**
   * Copies what a parsed expression depends on.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style__expression_8h.html">mln_style_expression_get_info</a>
   */
  public StyleExpressionInfo getInfo() {
    try (var call = new Call(this, 1, false)) {
      var out0 = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.StyleExpressionInfo);
      out0.asSlice(0)
          .set(
              JAVA_INT,
              0,
              (int) org.maplibre.nativeffi.internal.c.Layouts.StyleExpressionInfo.byteSize());
      call.check(C.mln_style_expression_get_info(id(), out0, call.diagnostic.segment()));
      call.accept(this);
      return Codecs.readStyleExpressionInfo(out0, null);
    }
  }

  /**
   * Releases a style expression.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style__expression_8h.html">mln_style_expression_release</a>
   */
  public void close() {
    if (isClosed()) return;
    try (var call = new Call(this, 2, false)) {
      C.mln_style_expression_release(id());
      call.accept(this);
    }
  }

  /**
   * Parses a style expression.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style__expression_8h.html">mln_style_expression_create</a>
   */
  public static StyleExpressionHandle create(String expression, StyleExpressionOptions options) {
    try (var call = new Call(null, 0, false)) {
      var out0 = call.arena.allocate(JAVA_LONG);
      call.check(
          C.mln_style_expression_create(
              call.view(call.text(expression)),
              (options == null
                  ? MemorySegment.NULL
                  : Codecs.writeStyleExpressionOptions(call, options)),
              out0,
              call.diagnostic.segment()));
      var adopted = StyleExpressionHandle.adopt(out0.get(JAVA_LONG, 0), null);
      call.accept(adopted);
      return adopted;
    }
  }
}
