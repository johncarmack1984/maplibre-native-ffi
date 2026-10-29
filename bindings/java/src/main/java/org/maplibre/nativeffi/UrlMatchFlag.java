// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * How a rule or route compares its url against a request URL.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_url_match_flag</a>
 */
public record UrlMatchFlag(int rawValue) {
  public static final UrlMatchFlag EXACT = new UrlMatchFlag(0);
  public static final UrlMatchFlag GLOB = new UrlMatchFlag(1);

  public UrlMatchFlag or(UrlMatchFlag other) {
    return new UrlMatchFlag(rawValue | other.rawValue);
  }

  public boolean contains(UrlMatchFlag other) {
    return (rawValue & other.rawValue) == other.rawValue;
  }
}
