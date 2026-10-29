// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import org.maplibre.nativeffi.internal.c.C;

public final class Maplibre {
  private Maplibre() {}

  /**
   * Reports the C ABI contract version. The value is 0 while the ABI is unstable, and will
   * increment on each SemVer major release.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/base_8h.html">mln_c_version</a>
   */
  public static int cVersion() {
    try (var call = new Call(null, 0, true)) {
      var raw = C.mln_c_version();
      call.accept(null);
      return raw;
    }
  }

  /**
   * Converts spherical Mercator projected meters to a geographic coordinate.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/projection_8h.html">mln_lat_lng_for_projected_meters</a>
   */
  public static LatLng latLngForProjectedMeters(ProjectedMeters meters) {
    try (var call = new Call(null, 0, false)) {
      var out0 = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.LatLng);
      call.check(
          C.mln_lat_lng_for_projected_meters(
              Codecs.writeProjectedMeters(call, meters), out0, call.diagnostic.segment()));
      call.accept(null);
      return Codecs.readLatLng(out0, null);
    }
  }

  /**
   * Clears the process-global log callback.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/logging_8h.html">mln_log_clear_callback</a>
   */
  public static void clearLogCallback() {
    try (var call = new Call(null, 0, false)) {
      call.check(C.mln_log_clear_callback(call.diagnostic.segment()));
      call.accept(null);
    }
  }

  /**
   * Controls which log severities MapLibre Native may dispatch asynchronously.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/logging_8h.html">mln_log_set_async_severity_mask</a>
   */
  public static void setLogAsyncSeverityMask(LogSeverityFlag mask) {
    try (var call = new Call(null, 0, false)) {
      call.check(C.mln_log_set_async_severity_mask(mask.rawValue(), call.diagnostic.segment()));
      call.accept(null);
    }
  }

  /**
   * Installs a process-global MapLibre Native log callback.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/logging_8h.html">mln_log_set_callback</a>
   */
  public static void setLogCallback(LogHandler handler) {
    try (var call = new Call(null, 0, false)) {
      call.check(
          C.mln_log_set_callback(Codecs.writeLogHandler(call, handler), call.diagnostic.segment()));
      call.accept(null);
    }
  }

  /**
   * Computes the physical device-pixel size of a logical extent.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__target_8h.html">mln_logical_extent_physical_size</a>
   */
  public static LogicalExtentPhysicalSizeResult logicalExtentPhysicalSize(LogicalExtent extent) {
    try (var call = new Call(null, 0, false)) {
      var out0 = call.arena.allocate(JAVA_INT);
      var out1 = call.arena.allocate(JAVA_INT);
      call.check(
          C.mln_logical_extent_physical_size(
              Codecs.writeLogicalExtent(call, extent), out0, out1, call.diagnostic.segment()));
      call.accept(null);
      return new LogicalExtentPhysicalSizeResult(out0.get(JAVA_INT, 0), out1.get(JAVA_INT, 0));
    }
  }

  /**
   * Reads MapLibre Native&#x27;s process-global network status.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_network_get_status</a>
   */
  public static NetworkStatus getNetworkStatus() {
    try (var call = new Call(null, 0, false)) {
      var out0 = call.arena.allocate(JAVA_INT);
      call.check(C.mln_network_get_status(out0, call.diagnostic.segment()));
      call.accept(null);
      return new NetworkStatus(out0.get(JAVA_INT, 0));
    }
  }

  /**
   * Sets MapLibre Native&#x27;s process-global network status.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_network_set_status</a>
   */
  public static void setNetworkStatus(NetworkStatus status$) {
    try (var call = new Call(null, 0, false)) {
      call.check(C.mln_network_set_status(status$.rawValue(), call.diagnostic.segment()));
      call.accept(null);
    }
  }

  /**
   * Returns OpenGL context providers supported by this build.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__target_8h.html">mln_open_gl_supported_context_provider_mask</a>
   */
  public static OpenGlContextProviderFlag openGlSupportedContextProviderMask() {
    try (var call = new Call(null, 0, false)) {
      var raw = C.mln_open_gl_supported_context_provider_mask();
      call.accept(null);
      return new OpenGlContextProviderFlag(raw);
    }
  }

  /**
   * Returns the process-wide plugin registration entry point; never null.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/plugin_8h.html">mln_plugin_get_register_function_v1</a>
   */
  public static NativePointer getPluginRegisterFunctionV1() {
    try (var call = new Call(null, 0, false)) {
      var raw = C.mln_plugin_get_register_function_v1();
      call.accept(null);
      return NativePointer.ofAddress(raw.address());
    }
  }

  /**
   * Converts a geographic coordinate to spherical Mercator projected meters.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/projection_8h.html">mln_projected_meters_for_lat_lng</a>
   */
  public static ProjectedMeters projectedMetersForLatLng(LatLng coordinate) {
    try (var call = new Call(null, 0, false)) {
      var out0 = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.ProjectedMeters);
      call.check(
          C.mln_projected_meters_for_lat_lng(
              Codecs.writeLatLng(call, coordinate), out0, call.diagnostic.segment()));
      call.accept(null);
      return Codecs.readProjectedMeters(out0, null);
    }
  }

  /**
   * Reports the render backends available in this native library build.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/base_8h.html">mln_supported_render_backend_mask</a>
   */
  public static RenderBackendFlag supportedRenderBackendMask() {
    try (var call = new Call(null, 0, false)) {
      var raw = C.mln_supported_render_backend_mask();
      call.accept(null);
      return new RenderBackendFlag(raw);
    }
  }
}
