// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Rendering statistics of one finished frame.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_rendering_stats</a>
 */
public record RenderingStats(
    double encodingTime,
    double renderingTime,
    long frameCount,
    long drawCallCount,
    long totalDrawCallCount) {
  public RenderingStats() {
    this(0.0, 0.0, 0L, 0L, 0L);
  }

  public RenderingStats withEncodingTime(double replacement) {
    return new RenderingStats(
        replacement,
        this.renderingTime,
        this.frameCount,
        this.drawCallCount,
        this.totalDrawCallCount);
  }

  public RenderingStats withRenderingTime(double replacement) {
    return new RenderingStats(
        this.encodingTime,
        replacement,
        this.frameCount,
        this.drawCallCount,
        this.totalDrawCallCount);
  }

  public RenderingStats withFrameCount(long replacement) {
    return new RenderingStats(
        this.encodingTime,
        this.renderingTime,
        replacement,
        this.drawCallCount,
        this.totalDrawCallCount);
  }

  public RenderingStats withDrawCallCount(long replacement) {
    return new RenderingStats(
        this.encodingTime,
        this.renderingTime,
        this.frameCount,
        replacement,
        this.totalDrawCallCount);
  }

  public RenderingStats withTotalDrawCallCount(long replacement) {
    return new RenderingStats(
        this.encodingTime, this.renderingTime, this.frameCount, this.drawCallCount, replacement);
  }
}
