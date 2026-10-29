// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import org.maplibre.nativeffi.internal.c.C;

/**
 * A standalone projection of one map view.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/base_8h.html">mln_map_projection</a>
 */
public final class MapProjectionHandle extends Owner implements AutoCloseable {
  MapProjectionHandle(long id, Object parent) {
    super("MapProjectionHandle", id, parent, MapProjectionHandle::disposeNative);
  }

  static MapProjectionHandle adopt(long id, Object parent) {
    try {
      return new MapProjectionHandle(id, parent);
    } catch (Throwable failure) {
      try {
        disposeNative(id);
      } catch (Throwable cleanup) {
        failure.addSuppressed(cleanup);
      }
      throw failure;
    }
  }

  private static void disposeNative(long id) {
    try (var call = new Call(null, 0)) {
      C.mln_map_projection_release(id);
    }
  }

  /**
   * Copies the projection camera.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/projection_8h.html">mln_map_projection_get_camera</a>
   */
  public CameraOptions getCamera() {
    try (var call = new Call(this, 1, false)) {
      var out0 = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.CameraOptions);
      out0.asSlice(0)
          .set(
              JAVA_INT,
              0,
              (int) org.maplibre.nativeffi.internal.c.Layouts.CameraOptions.byteSize());
      call.check(C.mln_map_projection_get_camera(id(), out0, call.diagnostic.segment()));
      call.accept(this);
      return Codecs.readCameraOptions(out0, null);
    }
  }

  /**
   * Converts a screen point to a geographic coordinate.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/projection_8h.html">mln_map_projection_lat_lng_for_pixel</a>
   */
  public LatLng latLngForPixel(ScreenPoint point) {
    try (var call = new Call(this, 1, false)) {
      var out0 = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.LatLng);
      call.check(
          C.mln_map_projection_lat_lng_for_pixel(
              id(), Codecs.writeScreenPoint(call, point), out0, call.diagnostic.segment()));
      call.accept(this);
      return Codecs.readLatLng(out0, null);
    }
  }

  /**
   * Converts a screen point to an unwrapped geographic coordinate.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/projection_8h.html">mln_map_projection_lat_lng_for_pixel_unwrapped</a>
   */
  public LatLng latLngForPixelUnwrapped(ScreenPoint point) {
    try (var call = new Call(this, 1, false)) {
      var out0 = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.LatLng);
      call.check(
          C.mln_map_projection_lat_lng_for_pixel_unwrapped(
              id(), Codecs.writeScreenPoint(call, point), out0, call.diagnostic.segment()));
      call.accept(this);
      return Codecs.readLatLng(out0, null);
    }
  }

  /**
   * Converts screen points to geographic coordinates.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/projection_8h.html">mln_map_projection_lat_lngs_for_pixels</a>
   */
  public java.util.List<LatLng> latLngsForPixels(java.util.List<ScreenPoint> points) {
    try (var call = new Call(this, 1, false)) {
      var out0 =
          call.arena.allocate(
              Math.multiplyExact(
                  points.size(), org.maplibre.nativeffi.internal.c.Layouts.LatLng.byteSize()),
              org.maplibre.nativeffi.internal.c.Layouts.LatLng.byteAlignment());
      for (int index = 0; index < points.size(); index++) {}
      call.check(
          C.mln_map_projection_lat_lngs_for_pixels(
              id(),
              call.array(
                  points,
                  org.maplibre.nativeffi.internal.c.Layouts.ScreenPoint,
                  (elementTarget, elementValue) -> {
                    MemorySegment.copy(
                        Codecs.writeScreenPoint(call, elementValue),
                        0,
                        elementTarget,
                        0,
                        org.maplibre.nativeffi.internal.c.Layouts.ScreenPoint.byteSize());
                  }),
              (long) Call.length(points),
              out0,
              call.diagnostic.segment()));
      call.accept(this);
      return Memory.array(
          call.pointer(out0).get(ADDRESS, 0),
          points.size(),
          org.maplibre.nativeffi.internal.c.Layouts.LatLng.byteSize(),
          org.maplibre.nativeffi.internal.c.Layouts.LatLng.byteSize(),
          item -> Codecs.readLatLng(item, null));
    }
  }

  /**
   * Converts screen points to unwrapped geographic coordinates.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/projection_8h.html">mln_map_projection_lat_lngs_for_pixels_unwrapped</a>
   */
  public java.util.List<LatLng> latLngsForPixelsUnwrapped(java.util.List<ScreenPoint> points) {
    try (var call = new Call(this, 1, false)) {
      var out0 =
          call.arena.allocate(
              Math.multiplyExact(
                  points.size(), org.maplibre.nativeffi.internal.c.Layouts.LatLng.byteSize()),
              org.maplibre.nativeffi.internal.c.Layouts.LatLng.byteAlignment());
      for (int index = 0; index < points.size(); index++) {}
      call.check(
          C.mln_map_projection_lat_lngs_for_pixels_unwrapped(
              id(),
              call.array(
                  points,
                  org.maplibre.nativeffi.internal.c.Layouts.ScreenPoint,
                  (elementTarget, elementValue) -> {
                    MemorySegment.copy(
                        Codecs.writeScreenPoint(call, elementValue),
                        0,
                        elementTarget,
                        0,
                        org.maplibre.nativeffi.internal.c.Layouts.ScreenPoint.byteSize());
                  }),
              (long) Call.length(points),
              out0,
              call.diagnostic.segment()));
      call.accept(this);
      return Memory.array(
          call.pointer(out0).get(ADDRESS, 0),
          points.size(),
          org.maplibre.nativeffi.internal.c.Layouts.LatLng.byteSize(),
          org.maplibre.nativeffi.internal.c.Layouts.LatLng.byteSize(),
          item -> Codecs.readLatLng(item, null));
    }
  }

  /**
   * Reads the ground distance covered by one logical map pixel at a latitude for the helper camera
   * zoom.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/projection_8h.html">mln_map_projection_meters_per_pixel_at_latitude</a>
   */
  public double metersPerPixelAtLatitude(double latitude) {
    try (var call = new Call(this, 1, false)) {
      var out0 = call.arena.allocate(JAVA_DOUBLE);
      call.check(
          C.mln_map_projection_meters_per_pixel_at_latitude(
              id(), latitude, out0, call.diagnostic.segment()));
      call.accept(this);
      return out0.get(JAVA_DOUBLE, 0);
    }
  }

  /**
   * Converts a geographic coordinate to a screen point.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/projection_8h.html">mln_map_projection_pixel_for_lat_lng</a>
   */
  public ScreenPoint pixelForLatLng(LatLng coordinate) {
    try (var call = new Call(this, 1, false)) {
      var out0 = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.ScreenPoint);
      call.check(
          C.mln_map_projection_pixel_for_lat_lng(
              id(), Codecs.writeLatLng(call, coordinate), out0, call.diagnostic.segment()));
      call.accept(this);
      return Codecs.readScreenPoint(out0, null);
    }
  }

  /**
   * Converts geographic coordinates to screen points.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/projection_8h.html">mln_map_projection_pixels_for_lat_lngs</a>
   */
  public java.util.List<ScreenPoint> pixelsForLatLngs(java.util.List<LatLng> coordinates) {
    try (var call = new Call(this, 1, false)) {
      var out0 =
          call.arena.allocate(
              Math.multiplyExact(
                  coordinates.size(),
                  org.maplibre.nativeffi.internal.c.Layouts.ScreenPoint.byteSize()),
              org.maplibre.nativeffi.internal.c.Layouts.ScreenPoint.byteAlignment());
      for (int index = 0; index < coordinates.size(); index++) {}
      call.check(
          C.mln_map_projection_pixels_for_lat_lngs(
              id(),
              call.array(
                  coordinates,
                  org.maplibre.nativeffi.internal.c.Layouts.LatLng,
                  (elementTarget, elementValue) -> {
                    MemorySegment.copy(
                        Codecs.writeLatLng(call, elementValue),
                        0,
                        elementTarget,
                        0,
                        org.maplibre.nativeffi.internal.c.Layouts.LatLng.byteSize());
                  }),
              (long) Call.length(coordinates),
              out0,
              call.diagnostic.segment()));
      call.accept(this);
      return Memory.array(
          call.pointer(out0).get(ADDRESS, 0),
          coordinates.size(),
          org.maplibre.nativeffi.internal.c.Layouts.ScreenPoint.byteSize(),
          org.maplibre.nativeffi.internal.c.Layouts.ScreenPoint.byteSize(),
          item -> Codecs.readScreenPoint(item, null));
    }
  }

  /**
   * Releases a standalone projection.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/projection_8h.html">mln_map_projection_release</a>
   */
  public void close() {
    if (isClosed()) return;
    try (var call = new Call(this, 2, false)) {
      C.mln_map_projection_release(id());
      call.accept(this);
    }
  }

  /**
   * Applies a camera update to a standalone projection.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/projection_8h.html">mln_map_projection_set_camera</a>
   */
  public void setCamera(CameraOptions camera) {
    try (var call = new Call(this, 0, false)) {
      call.check(
          C.mln_map_projection_set_camera(
              id(), Codecs.writeCameraOptions(call, camera), call.diagnostic.segment()));
      call.accept(this);
    }
  }

  /**
   * Creates a standalone projection of a view, such as the view of a rendered frame or of a map
   * snapshot.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/projection_8h.html">mln_map_projection_create</a>
   */
  public static MapProjectionHandle create(MapView view) {
    try (var call = new Call(null, 0, false)) {
      var out0 = call.arena.allocate(JAVA_LONG);
      call.check(
          C.mln_map_projection_create(
              Codecs.writeMapView(call, view), out0, call.diagnostic.segment()));
      var adopted = MapProjectionHandle.adopt(out0.get(JAVA_LONG, 0), null);
      call.accept(adopted);
      return adopted;
    }
  }
}
