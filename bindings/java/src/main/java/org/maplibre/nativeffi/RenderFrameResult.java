// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Terminal result of one frame demand, held by an owned frame-result batch and copied by {@code
 * mln_acquired_frame_get_result()}.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_frame_result</a>
 */
public record RenderFrameResult(
    RenderResult disposition,
    long token,
    long mapUpdateGeneration,
    long generation,
    long frameGeneration,
    boolean needsRepaint,
    MapView view,
    RenderMode mode) {
  public RenderFrameResult() {
    this(new RenderResult(0), 0L, 0L, 0L, 0L, false, new MapView(), new RenderMode(0));
  }

  public RenderFrameResult withDisposition(RenderResult replacement) {
    return new RenderFrameResult(
        replacement,
        this.token,
        this.mapUpdateGeneration,
        this.generation,
        this.frameGeneration,
        this.needsRepaint,
        this.view,
        this.mode);
  }

  public RenderFrameResult withToken(long replacement) {
    return new RenderFrameResult(
        this.disposition,
        replacement,
        this.mapUpdateGeneration,
        this.generation,
        this.frameGeneration,
        this.needsRepaint,
        this.view,
        this.mode);
  }

  public RenderFrameResult withMapUpdateGeneration(long replacement) {
    return new RenderFrameResult(
        this.disposition,
        this.token,
        replacement,
        this.generation,
        this.frameGeneration,
        this.needsRepaint,
        this.view,
        this.mode);
  }

  public RenderFrameResult withGeneration(long replacement) {
    return new RenderFrameResult(
        this.disposition,
        this.token,
        this.mapUpdateGeneration,
        replacement,
        this.frameGeneration,
        this.needsRepaint,
        this.view,
        this.mode);
  }

  public RenderFrameResult withFrameGeneration(long replacement) {
    return new RenderFrameResult(
        this.disposition,
        this.token,
        this.mapUpdateGeneration,
        this.generation,
        replacement,
        this.needsRepaint,
        this.view,
        this.mode);
  }

  public RenderFrameResult withNeedsRepaint(boolean replacement) {
    return new RenderFrameResult(
        this.disposition,
        this.token,
        this.mapUpdateGeneration,
        this.generation,
        this.frameGeneration,
        replacement,
        this.view,
        this.mode);
  }

  public RenderFrameResult withView(MapView replacement) {
    return new RenderFrameResult(
        this.disposition,
        this.token,
        this.mapUpdateGeneration,
        this.generation,
        this.frameGeneration,
        this.needsRepaint,
        replacement,
        this.mode);
  }

  public RenderFrameResult withMode(RenderMode replacement) {
    return new RenderFrameResult(
        this.disposition,
        this.token,
        this.mapUpdateGeneration,
        this.generation,
        this.frameGeneration,
        this.needsRepaint,
        this.view,
        replacement);
  }
}
