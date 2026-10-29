// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Offline region status snapshot.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_offline_region_status</a>
 */
public record OfflineRegionStatus(
    OfflineRegionDownloadState downloadState,
    long completedResourceCount,
    long completedResourceSize,
    long completedTileCount,
    long requiredTileCount,
    long completedTileSize,
    long requiredResourceCount,
    boolean requiredResourceCountIsPrecise,
    boolean complete) {
  public OfflineRegionStatus() {
    this(new OfflineRegionDownloadState(0), 0L, 0L, 0L, 0L, 0L, 0L, false, false);
  }

  public OfflineRegionStatus withDownloadState(OfflineRegionDownloadState replacement) {
    return new OfflineRegionStatus(
        replacement,
        this.completedResourceCount,
        this.completedResourceSize,
        this.completedTileCount,
        this.requiredTileCount,
        this.completedTileSize,
        this.requiredResourceCount,
        this.requiredResourceCountIsPrecise,
        this.complete);
  }

  public OfflineRegionStatus withCompletedResourceCount(long replacement) {
    return new OfflineRegionStatus(
        this.downloadState,
        replacement,
        this.completedResourceSize,
        this.completedTileCount,
        this.requiredTileCount,
        this.completedTileSize,
        this.requiredResourceCount,
        this.requiredResourceCountIsPrecise,
        this.complete);
  }

  public OfflineRegionStatus withCompletedResourceSize(long replacement) {
    return new OfflineRegionStatus(
        this.downloadState,
        this.completedResourceCount,
        replacement,
        this.completedTileCount,
        this.requiredTileCount,
        this.completedTileSize,
        this.requiredResourceCount,
        this.requiredResourceCountIsPrecise,
        this.complete);
  }

  public OfflineRegionStatus withCompletedTileCount(long replacement) {
    return new OfflineRegionStatus(
        this.downloadState,
        this.completedResourceCount,
        this.completedResourceSize,
        replacement,
        this.requiredTileCount,
        this.completedTileSize,
        this.requiredResourceCount,
        this.requiredResourceCountIsPrecise,
        this.complete);
  }

  public OfflineRegionStatus withRequiredTileCount(long replacement) {
    return new OfflineRegionStatus(
        this.downloadState,
        this.completedResourceCount,
        this.completedResourceSize,
        this.completedTileCount,
        replacement,
        this.completedTileSize,
        this.requiredResourceCount,
        this.requiredResourceCountIsPrecise,
        this.complete);
  }

  public OfflineRegionStatus withCompletedTileSize(long replacement) {
    return new OfflineRegionStatus(
        this.downloadState,
        this.completedResourceCount,
        this.completedResourceSize,
        this.completedTileCount,
        this.requiredTileCount,
        replacement,
        this.requiredResourceCount,
        this.requiredResourceCountIsPrecise,
        this.complete);
  }

  public OfflineRegionStatus withRequiredResourceCount(long replacement) {
    return new OfflineRegionStatus(
        this.downloadState,
        this.completedResourceCount,
        this.completedResourceSize,
        this.completedTileCount,
        this.requiredTileCount,
        this.completedTileSize,
        replacement,
        this.requiredResourceCountIsPrecise,
        this.complete);
  }

  public OfflineRegionStatus withRequiredResourceCountIsPrecise(boolean replacement) {
    return new OfflineRegionStatus(
        this.downloadState,
        this.completedResourceCount,
        this.completedResourceSize,
        this.completedTileCount,
        this.requiredTileCount,
        this.completedTileSize,
        this.requiredResourceCount,
        replacement,
        this.complete);
  }

  public OfflineRegionStatus withComplete(boolean replacement) {
    return new OfflineRegionStatus(
        this.downloadState,
        this.completedResourceCount,
        this.completedResourceSize,
        this.completedTileCount,
        this.requiredTileCount,
        this.completedTileSize,
        this.requiredResourceCount,
        this.requiredResourceCountIsPrecise,
        replacement);
  }
}
