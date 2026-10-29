// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Status values returned by status-returning functions.
 *
 * @see <a href="https://maplibre.org/maplibre-native-ffi/reference/c/base_8h.html">mln_status</a>
 */
public record Status(int rawValue) {
  public static final Status OK = new Status(0);
  public static final Status INVALID_ARGUMENT = new Status(-1);
  public static final Status INVALID_STATE = new Status(-2);
  public static final Status WRONG_THREAD = new Status(-3);
  public static final Status UNSUPPORTED = new Status(-4);
  public static final Status NATIVE_ERROR = new Status(-5);
  public static final Status CANCELLED = new Status(-6);
  public static final Status BUSY = new Status(-7);
  public static final Status TARGET_LOST = new Status(-8);
  public static final Status NOT_READY = new Status(-9);
  public static final Status NOT_FOUND = new Status(-10);
}
