// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Any-thread render-session snapshot.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_snapshot</a>
 */
public record RenderSessionSnapshot(
    RenderSessionState state,
    LogicalExtent extent,
    long generation,
    long mapUpdateGeneration,
    long renderedUpdateGeneration,
    long frameGeneration,
    int acquiredFrameCount) {
  public RenderSessionSnapshot(RenderSessionState state) {
    this(state, new LogicalExtent(), 0L, 0L, 0L, 0L, 0);
  }

  public RenderSessionSnapshot withState(RenderSessionState replacement) {
    return new RenderSessionSnapshot(
        replacement,
        this.extent,
        this.generation,
        this.mapUpdateGeneration,
        this.renderedUpdateGeneration,
        this.frameGeneration,
        this.acquiredFrameCount);
  }

  public RenderSessionSnapshot withExtent(LogicalExtent replacement) {
    return new RenderSessionSnapshot(
        this.state,
        replacement,
        this.generation,
        this.mapUpdateGeneration,
        this.renderedUpdateGeneration,
        this.frameGeneration,
        this.acquiredFrameCount);
  }

  public RenderSessionSnapshot withGeneration(long replacement) {
    return new RenderSessionSnapshot(
        this.state,
        this.extent,
        replacement,
        this.mapUpdateGeneration,
        this.renderedUpdateGeneration,
        this.frameGeneration,
        this.acquiredFrameCount);
  }

  public RenderSessionSnapshot withMapUpdateGeneration(long replacement) {
    return new RenderSessionSnapshot(
        this.state,
        this.extent,
        this.generation,
        replacement,
        this.renderedUpdateGeneration,
        this.frameGeneration,
        this.acquiredFrameCount);
  }

  public RenderSessionSnapshot withRenderedUpdateGeneration(long replacement) {
    return new RenderSessionSnapshot(
        this.state,
        this.extent,
        this.generation,
        this.mapUpdateGeneration,
        replacement,
        this.frameGeneration,
        this.acquiredFrameCount);
  }

  public RenderSessionSnapshot withFrameGeneration(long replacement) {
    return new RenderSessionSnapshot(
        this.state,
        this.extent,
        this.generation,
        this.mapUpdateGeneration,
        this.renderedUpdateGeneration,
        replacement,
        this.acquiredFrameCount);
  }

  public RenderSessionSnapshot withAcquiredFrameCount(int replacement) {
    return new RenderSessionSnapshot(
        this.state,
        this.extent,
        this.generation,
        this.mapUpdateGeneration,
        this.renderedUpdateGeneration,
        this.frameGeneration,
        replacement);
  }
}
