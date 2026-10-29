// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Immutable map state copied from the latest published generation.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_snapshot</a>
 */
public record MapSnapshot(
    MapDebugFlag debugOptions,
    long generation,
    boolean fullyLoaded,
    boolean renderingStatsViewEnabled,
    boolean gestureInProgress,
    boolean transitionInProgress,
    RuntimeEventFlag eventMask,
    long latestRenderUpdateGeneration,
    MapTileOptions tile,
    BoundOptions bounds,
    FreeCameraOptions freeCamera,
    MapView view) {
  public MapSnapshot() {
    this(
        new MapDebugFlag(0),
        0L,
        false,
        false,
        false,
        false,
        new RuntimeEventFlag(0L),
        0L,
        new MapTileOptions(),
        new BoundOptions(),
        new FreeCameraOptions(),
        new MapView());
  }

  public MapSnapshot withDebugOptions(MapDebugFlag replacement) {
    return new MapSnapshot(
        replacement,
        this.generation,
        this.fullyLoaded,
        this.renderingStatsViewEnabled,
        this.gestureInProgress,
        this.transitionInProgress,
        this.eventMask,
        this.latestRenderUpdateGeneration,
        this.tile,
        this.bounds,
        this.freeCamera,
        this.view);
  }

  public MapSnapshot withGeneration(long replacement) {
    return new MapSnapshot(
        this.debugOptions,
        replacement,
        this.fullyLoaded,
        this.renderingStatsViewEnabled,
        this.gestureInProgress,
        this.transitionInProgress,
        this.eventMask,
        this.latestRenderUpdateGeneration,
        this.tile,
        this.bounds,
        this.freeCamera,
        this.view);
  }

  public MapSnapshot withFullyLoaded(boolean replacement) {
    return new MapSnapshot(
        this.debugOptions,
        this.generation,
        replacement,
        this.renderingStatsViewEnabled,
        this.gestureInProgress,
        this.transitionInProgress,
        this.eventMask,
        this.latestRenderUpdateGeneration,
        this.tile,
        this.bounds,
        this.freeCamera,
        this.view);
  }

  public MapSnapshot withRenderingStatsViewEnabled(boolean replacement) {
    return new MapSnapshot(
        this.debugOptions,
        this.generation,
        this.fullyLoaded,
        replacement,
        this.gestureInProgress,
        this.transitionInProgress,
        this.eventMask,
        this.latestRenderUpdateGeneration,
        this.tile,
        this.bounds,
        this.freeCamera,
        this.view);
  }

  public MapSnapshot withGestureInProgress(boolean replacement) {
    return new MapSnapshot(
        this.debugOptions,
        this.generation,
        this.fullyLoaded,
        this.renderingStatsViewEnabled,
        replacement,
        this.transitionInProgress,
        this.eventMask,
        this.latestRenderUpdateGeneration,
        this.tile,
        this.bounds,
        this.freeCamera,
        this.view);
  }

  public MapSnapshot withTransitionInProgress(boolean replacement) {
    return new MapSnapshot(
        this.debugOptions,
        this.generation,
        this.fullyLoaded,
        this.renderingStatsViewEnabled,
        this.gestureInProgress,
        replacement,
        this.eventMask,
        this.latestRenderUpdateGeneration,
        this.tile,
        this.bounds,
        this.freeCamera,
        this.view);
  }

  public MapSnapshot withEventMask(RuntimeEventFlag replacement) {
    return new MapSnapshot(
        this.debugOptions,
        this.generation,
        this.fullyLoaded,
        this.renderingStatsViewEnabled,
        this.gestureInProgress,
        this.transitionInProgress,
        replacement,
        this.latestRenderUpdateGeneration,
        this.tile,
        this.bounds,
        this.freeCamera,
        this.view);
  }

  public MapSnapshot withLatestRenderUpdateGeneration(long replacement) {
    return new MapSnapshot(
        this.debugOptions,
        this.generation,
        this.fullyLoaded,
        this.renderingStatsViewEnabled,
        this.gestureInProgress,
        this.transitionInProgress,
        this.eventMask,
        replacement,
        this.tile,
        this.bounds,
        this.freeCamera,
        this.view);
  }

  public MapSnapshot withTile(MapTileOptions replacement) {
    return new MapSnapshot(
        this.debugOptions,
        this.generation,
        this.fullyLoaded,
        this.renderingStatsViewEnabled,
        this.gestureInProgress,
        this.transitionInProgress,
        this.eventMask,
        this.latestRenderUpdateGeneration,
        replacement,
        this.bounds,
        this.freeCamera,
        this.view);
  }

  public MapSnapshot withBounds(BoundOptions replacement) {
    return new MapSnapshot(
        this.debugOptions,
        this.generation,
        this.fullyLoaded,
        this.renderingStatsViewEnabled,
        this.gestureInProgress,
        this.transitionInProgress,
        this.eventMask,
        this.latestRenderUpdateGeneration,
        this.tile,
        replacement,
        this.freeCamera,
        this.view);
  }

  public MapSnapshot withFreeCamera(FreeCameraOptions replacement) {
    return new MapSnapshot(
        this.debugOptions,
        this.generation,
        this.fullyLoaded,
        this.renderingStatsViewEnabled,
        this.gestureInProgress,
        this.transitionInProgress,
        this.eventMask,
        this.latestRenderUpdateGeneration,
        this.tile,
        this.bounds,
        replacement,
        this.view);
  }

  public MapSnapshot withView(MapView replacement) {
    return new MapSnapshot(
        this.debugOptions,
        this.generation,
        this.fullyLoaded,
        this.renderingStatsViewEnabled,
        this.gestureInProgress,
        this.transitionInProgress,
        this.eventMask,
        this.latestRenderUpdateGeneration,
        this.tile,
        this.bounds,
        this.freeCamera,
        replacement);
  }
}
