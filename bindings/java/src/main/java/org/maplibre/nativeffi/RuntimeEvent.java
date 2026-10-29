// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * One delivered runtime event.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_event</a>
 */
public record RuntimeEvent(
    RuntimeEventType type,
    RuntimeEventSourceType sourceType,
    long source,
    long generation,
    int code,
    String message,
    RuntimeEventPayload payload) {
  public RuntimeEvent(RuntimeEventType type, RuntimeEventPayload payload) {
    this(type, new RuntimeEventSourceType(0), 0L, 0L, 0, "", payload);
  }

  public RuntimeEvent withType(RuntimeEventType replacement) {
    return new RuntimeEvent(
        replacement,
        this.sourceType,
        this.source,
        this.generation,
        this.code,
        this.message,
        this.payload);
  }

  public RuntimeEvent withSourceType(RuntimeEventSourceType replacement) {
    return new RuntimeEvent(
        this.type,
        replacement,
        this.source,
        this.generation,
        this.code,
        this.message,
        this.payload);
  }

  public RuntimeEvent withSource(long replacement) {
    return new RuntimeEvent(
        this.type,
        this.sourceType,
        replacement,
        this.generation,
        this.code,
        this.message,
        this.payload);
  }

  public RuntimeEvent withGeneration(long replacement) {
    return new RuntimeEvent(
        this.type,
        this.sourceType,
        this.source,
        replacement,
        this.code,
        this.message,
        this.payload);
  }

  public RuntimeEvent withCode(int replacement) {
    return new RuntimeEvent(
        this.type,
        this.sourceType,
        this.source,
        this.generation,
        replacement,
        this.message,
        this.payload);
  }

  public RuntimeEvent withMessage(String replacement) {
    return new RuntimeEvent(
        this.type,
        this.sourceType,
        this.source,
        this.generation,
        this.code,
        replacement,
        this.payload);
  }

  public RuntimeEvent withPayload(RuntimeEventPayload replacement) {
    return new RuntimeEvent(
        this.type,
        this.sourceType,
        this.source,
        this.generation,
        this.code,
        this.message,
        replacement);
  }
}
