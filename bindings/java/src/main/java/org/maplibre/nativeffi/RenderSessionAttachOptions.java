// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Common attachment policy copied before an attach call returns.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__target_8h.html">mln_render_session_attach_options</a>
 */
public record RenderSessionAttachOptions(
    RenderDriverKind driver,
    int requestedTextureRingDepth,
    GpuSyncKind producerSyncKind,
    Wake frameWake,
    Wake driverWorkWake,
    QueueLock queueLock) {
  public RenderSessionAttachOptions(RenderDriverKind driver) {
    this(driver, 0, new GpuSyncKind(0), new Wake(), new Wake(), new QueueLock());
  }

  public RenderSessionAttachOptions withDriver(RenderDriverKind replacement) {
    return new RenderSessionAttachOptions(
        replacement,
        this.requestedTextureRingDepth,
        this.producerSyncKind,
        this.frameWake,
        this.driverWorkWake,
        this.queueLock);
  }

  public RenderSessionAttachOptions withRequestedTextureRingDepth(int replacement) {
    return new RenderSessionAttachOptions(
        this.driver,
        replacement,
        this.producerSyncKind,
        this.frameWake,
        this.driverWorkWake,
        this.queueLock);
  }

  public RenderSessionAttachOptions withProducerSyncKind(GpuSyncKind replacement) {
    return new RenderSessionAttachOptions(
        this.driver,
        this.requestedTextureRingDepth,
        replacement,
        this.frameWake,
        this.driverWorkWake,
        this.queueLock);
  }

  public RenderSessionAttachOptions withFrameWake(Wake replacement) {
    return new RenderSessionAttachOptions(
        this.driver,
        this.requestedTextureRingDepth,
        this.producerSyncKind,
        replacement,
        this.driverWorkWake,
        this.queueLock);
  }

  public RenderSessionAttachOptions withDriverWorkWake(Wake replacement) {
    return new RenderSessionAttachOptions(
        this.driver,
        this.requestedTextureRingDepth,
        this.producerSyncKind,
        this.frameWake,
        replacement,
        this.queueLock);
  }

  public RenderSessionAttachOptions withQueueLock(QueueLock replacement) {
    return new RenderSessionAttachOptions(
        this.driver,
        this.requestedTextureRingDepth,
        this.producerSyncKind,
        this.frameWake,
        this.driverWorkWake,
        replacement);
  }
}
