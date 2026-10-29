// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * A resource provider&#x27;s answer to one request.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_response</a>
 */
public record ResourceResponse(
    ResourceResponseStatus status,
    ResourceErrorReason errorReason,
    byte[] bytes,
    String errorMessage,
    boolean mustRevalidate,
    Long modifiedUnixMs,
    Long expiresUnixMs,
    String etag,
    Long retryAfterUnixMs) {
  @Override
  public byte[] bytes() {
    return bytes.clone();
  }

  public ResourceResponse {
    bytes = bytes.clone();
  }

  public ResourceResponse() {
    this(
        new ResourceResponseStatus(0),
        new ResourceErrorReason(0),
        new byte[0],
        "",
        false,
        null,
        null,
        "",
        null);
  }

  public ResourceResponse withStatus(ResourceResponseStatus replacement) {
    return new ResourceResponse(
        replacement,
        this.errorReason,
        this.bytes,
        this.errorMessage,
        this.mustRevalidate,
        this.modifiedUnixMs,
        this.expiresUnixMs,
        this.etag,
        this.retryAfterUnixMs);
  }

  public ResourceResponse withErrorReason(ResourceErrorReason replacement) {
    return new ResourceResponse(
        this.status,
        replacement,
        this.bytes,
        this.errorMessage,
        this.mustRevalidate,
        this.modifiedUnixMs,
        this.expiresUnixMs,
        this.etag,
        this.retryAfterUnixMs);
  }

  public ResourceResponse withBytes(byte[] replacement) {
    return new ResourceResponse(
        this.status,
        this.errorReason,
        replacement,
        this.errorMessage,
        this.mustRevalidate,
        this.modifiedUnixMs,
        this.expiresUnixMs,
        this.etag,
        this.retryAfterUnixMs);
  }

  public ResourceResponse withErrorMessage(String replacement) {
    return new ResourceResponse(
        this.status,
        this.errorReason,
        this.bytes,
        replacement,
        this.mustRevalidate,
        this.modifiedUnixMs,
        this.expiresUnixMs,
        this.etag,
        this.retryAfterUnixMs);
  }

  public ResourceResponse withMustRevalidate(boolean replacement) {
    return new ResourceResponse(
        this.status,
        this.errorReason,
        this.bytes,
        this.errorMessage,
        replacement,
        this.modifiedUnixMs,
        this.expiresUnixMs,
        this.etag,
        this.retryAfterUnixMs);
  }

  public ResourceResponse withModifiedUnixMs(Long replacement) {
    return new ResourceResponse(
        this.status,
        this.errorReason,
        this.bytes,
        this.errorMessage,
        this.mustRevalidate,
        replacement,
        this.expiresUnixMs,
        this.etag,
        this.retryAfterUnixMs);
  }

  public ResourceResponse withExpiresUnixMs(Long replacement) {
    return new ResourceResponse(
        this.status,
        this.errorReason,
        this.bytes,
        this.errorMessage,
        this.mustRevalidate,
        this.modifiedUnixMs,
        replacement,
        this.etag,
        this.retryAfterUnixMs);
  }

  public ResourceResponse withEtag(String replacement) {
    return new ResourceResponse(
        this.status,
        this.errorReason,
        this.bytes,
        this.errorMessage,
        this.mustRevalidate,
        this.modifiedUnixMs,
        this.expiresUnixMs,
        replacement,
        this.retryAfterUnixMs);
  }

  public ResourceResponse withRetryAfterUnixMs(Long replacement) {
    return new ResourceResponse(
        this.status,
        this.errorReason,
        this.bytes,
        this.errorMessage,
        this.mustRevalidate,
        this.modifiedUnixMs,
        this.expiresUnixMs,
        this.etag,
        replacement);
  }

  @Override
  public boolean equals(Object other) {
    return other instanceof ResourceResponse value
        && java.util.Arrays.deepEquals(
            new Object[] {
              this.status,
              this.errorReason,
              this.bytes,
              this.errorMessage,
              this.mustRevalidate,
              this.modifiedUnixMs,
              this.expiresUnixMs,
              this.etag,
              this.retryAfterUnixMs
            },
            new Object[] {
              value.status,
              value.errorReason,
              value.bytes,
              value.errorMessage,
              value.mustRevalidate,
              value.modifiedUnixMs,
              value.expiresUnixMs,
              value.etag,
              value.retryAfterUnixMs
            });
  }

  @Override
  public int hashCode() {
    return java.util.Arrays.deepHashCode(
        new Object[] {
          status,
          errorReason,
          bytes,
          errorMessage,
          mustRevalidate,
          modifiedUnixMs,
          expiresUnixMs,
          etag,
          retryAfterUnixMs
        });
  }
}
