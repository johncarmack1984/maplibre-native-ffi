// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Payload for {@code MLN_RUNTIME_EVENT_MAP_GLYPHS_REQUESTED}, {@code
 * MLN_RUNTIME_EVENT_MAP_GLYPHS_LOADED}, and {@code MLN_RUNTIME_EVENT_MAP_GLYPHS_ERROR}.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_event_glyphs</a>
 */
public record RuntimeEventGlyphs(
    java.util.List<String> fontStack, int first, int last, boolean fontFace) {
  public RuntimeEventGlyphs {
    fontStack = java.util.List.copyOf(fontStack);
  }

  public RuntimeEventGlyphs() {
    this(java.util.List.of(), 0, 0, false);
  }

  public RuntimeEventGlyphs withFontStack(java.util.List<String> replacement) {
    return new RuntimeEventGlyphs(replacement, this.first, this.last, this.fontFace);
  }

  public RuntimeEventGlyphs withFirst(int replacement) {
    return new RuntimeEventGlyphs(this.fontStack, replacement, this.last, this.fontFace);
  }

  public RuntimeEventGlyphs withLast(int replacement) {
    return new RuntimeEventGlyphs(this.fontStack, this.first, replacement, this.fontFace);
  }

  public RuntimeEventGlyphs withFontFace(boolean replacement) {
    return new RuntimeEventGlyphs(this.fontStack, this.first, this.last, replacement);
  }
}
