// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_request_info</a>
 */
public record ResourceRequestInfo(
    String requestedUrl,
    String resolvedUrl,
    ResourceKind kind,
    ResourceLoadingMethod loadingMethod,
    ResourcePriority priority,
    ResourceUsage usage,
    ResourceStoragePolicy storagePolicy,
    ResourceRange range,
    Long priorModifiedUnixMs,
    Long priorExpiresUnixMs,
    String priorEtag,
    byte[] priorData) {
  @Override
  public byte[] priorData() {
    return priorData.clone();
  }

  public ResourceRequestInfo {
    priorData = priorData.clone();
  }

  public ResourceRequestInfo() {
    this(
        "",
        "",
        new ResourceKind(0),
        new ResourceLoadingMethod(0),
        new ResourcePriority(0),
        new ResourceUsage(0),
        new ResourceStoragePolicy(0),
        null,
        null,
        null,
        "",
        new byte[0]);
  }

  public ResourceRequestInfo withRequestedUrl(String replacement) {
    return new ResourceRequestInfo(
        replacement,
        this.resolvedUrl,
        this.kind,
        this.loadingMethod,
        this.priority,
        this.usage,
        this.storagePolicy,
        this.range,
        this.priorModifiedUnixMs,
        this.priorExpiresUnixMs,
        this.priorEtag,
        this.priorData);
  }

  public ResourceRequestInfo withResolvedUrl(String replacement) {
    return new ResourceRequestInfo(
        this.requestedUrl,
        replacement,
        this.kind,
        this.loadingMethod,
        this.priority,
        this.usage,
        this.storagePolicy,
        this.range,
        this.priorModifiedUnixMs,
        this.priorExpiresUnixMs,
        this.priorEtag,
        this.priorData);
  }

  public ResourceRequestInfo withKind(ResourceKind replacement) {
    return new ResourceRequestInfo(
        this.requestedUrl,
        this.resolvedUrl,
        replacement,
        this.loadingMethod,
        this.priority,
        this.usage,
        this.storagePolicy,
        this.range,
        this.priorModifiedUnixMs,
        this.priorExpiresUnixMs,
        this.priorEtag,
        this.priorData);
  }

  public ResourceRequestInfo withLoadingMethod(ResourceLoadingMethod replacement) {
    return new ResourceRequestInfo(
        this.requestedUrl,
        this.resolvedUrl,
        this.kind,
        replacement,
        this.priority,
        this.usage,
        this.storagePolicy,
        this.range,
        this.priorModifiedUnixMs,
        this.priorExpiresUnixMs,
        this.priorEtag,
        this.priorData);
  }

  public ResourceRequestInfo withPriority(ResourcePriority replacement) {
    return new ResourceRequestInfo(
        this.requestedUrl,
        this.resolvedUrl,
        this.kind,
        this.loadingMethod,
        replacement,
        this.usage,
        this.storagePolicy,
        this.range,
        this.priorModifiedUnixMs,
        this.priorExpiresUnixMs,
        this.priorEtag,
        this.priorData);
  }

  public ResourceRequestInfo withUsage(ResourceUsage replacement) {
    return new ResourceRequestInfo(
        this.requestedUrl,
        this.resolvedUrl,
        this.kind,
        this.loadingMethod,
        this.priority,
        replacement,
        this.storagePolicy,
        this.range,
        this.priorModifiedUnixMs,
        this.priorExpiresUnixMs,
        this.priorEtag,
        this.priorData);
  }

  public ResourceRequestInfo withStoragePolicy(ResourceStoragePolicy replacement) {
    return new ResourceRequestInfo(
        this.requestedUrl,
        this.resolvedUrl,
        this.kind,
        this.loadingMethod,
        this.priority,
        this.usage,
        replacement,
        this.range,
        this.priorModifiedUnixMs,
        this.priorExpiresUnixMs,
        this.priorEtag,
        this.priorData);
  }

  public ResourceRequestInfo withRange(ResourceRange replacement) {
    return new ResourceRequestInfo(
        this.requestedUrl,
        this.resolvedUrl,
        this.kind,
        this.loadingMethod,
        this.priority,
        this.usage,
        this.storagePolicy,
        replacement,
        this.priorModifiedUnixMs,
        this.priorExpiresUnixMs,
        this.priorEtag,
        this.priorData);
  }

  public ResourceRequestInfo withPriorModifiedUnixMs(Long replacement) {
    return new ResourceRequestInfo(
        this.requestedUrl,
        this.resolvedUrl,
        this.kind,
        this.loadingMethod,
        this.priority,
        this.usage,
        this.storagePolicy,
        this.range,
        replacement,
        this.priorExpiresUnixMs,
        this.priorEtag,
        this.priorData);
  }

  public ResourceRequestInfo withPriorExpiresUnixMs(Long replacement) {
    return new ResourceRequestInfo(
        this.requestedUrl,
        this.resolvedUrl,
        this.kind,
        this.loadingMethod,
        this.priority,
        this.usage,
        this.storagePolicy,
        this.range,
        this.priorModifiedUnixMs,
        replacement,
        this.priorEtag,
        this.priorData);
  }

  public ResourceRequestInfo withPriorEtag(String replacement) {
    return new ResourceRequestInfo(
        this.requestedUrl,
        this.resolvedUrl,
        this.kind,
        this.loadingMethod,
        this.priority,
        this.usage,
        this.storagePolicy,
        this.range,
        this.priorModifiedUnixMs,
        this.priorExpiresUnixMs,
        replacement,
        this.priorData);
  }

  public ResourceRequestInfo withPriorData(byte[] replacement) {
    return new ResourceRequestInfo(
        this.requestedUrl,
        this.resolvedUrl,
        this.kind,
        this.loadingMethod,
        this.priority,
        this.usage,
        this.storagePolicy,
        this.range,
        this.priorModifiedUnixMs,
        this.priorExpiresUnixMs,
        this.priorEtag,
        replacement);
  }

  @Override
  public boolean equals(Object other) {
    return other instanceof ResourceRequestInfo value
        && java.util.Arrays.deepEquals(
            new Object[] {
              this.requestedUrl,
              this.resolvedUrl,
              this.kind,
              this.loadingMethod,
              this.priority,
              this.usage,
              this.storagePolicy,
              this.range,
              this.priorModifiedUnixMs,
              this.priorExpiresUnixMs,
              this.priorEtag,
              this.priorData
            },
            new Object[] {
              value.requestedUrl,
              value.resolvedUrl,
              value.kind,
              value.loadingMethod,
              value.priority,
              value.usage,
              value.storagePolicy,
              value.range,
              value.priorModifiedUnixMs,
              value.priorExpiresUnixMs,
              value.priorEtag,
              value.priorData
            });
  }

  @Override
  public int hashCode() {
    return java.util.Arrays.deepHashCode(
        new Object[] {
          requestedUrl,
          resolvedUrl,
          kind,
          loadingMethod,
          priority,
          usage,
          storagePolicy,
          range,
          priorModifiedUnixMs,
          priorExpiresUnixMs,
          priorEtag,
          priorData
        });
  }
}
