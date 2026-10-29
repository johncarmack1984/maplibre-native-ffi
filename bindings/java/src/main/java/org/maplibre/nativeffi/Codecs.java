// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import org.maplibre.nativeffi.internal.c.C;

final class Codecs {
  private Codecs() {}

  static MetalTextureFrame readMetalTextureFrame(MemorySegment source, Scope scope) {
    return new MetalTextureFrame(
        source.asSlice(8).get(JAVA_LONG, 0),
        source.asSlice(16).get(JAVA_INT, 0),
        source.asSlice(20).get(JAVA_INT, 0),
        source.asSlice(24).get(JAVA_DOUBLE, 0),
        source.asSlice(32).get(JAVA_LONG, 0),
        source.asSlice(40).get(JAVA_INT, 0),
        new NativePointer(source.asSlice(48).get(ADDRESS, 0).address(), scope),
        new NativePointer(source.asSlice(56).get(ADDRESS, 0).address(), scope),
        source.asSlice(64).get(JAVA_LONG, 0),
        scope);
  }

  static MemorySegment writeMetalTextureFrame(Call call, MetalTextureFrame value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.MetalTextureFrame);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.MetalTextureFrame.byteSize());
    target.asSlice(8).set(JAVA_LONG, 0, value.generation());
    target.asSlice(16).set(JAVA_INT, 0, value.width());
    target.asSlice(20).set(JAVA_INT, 0, value.height());
    target.asSlice(24).set(JAVA_DOUBLE, 0, value.scaleFactor());
    target.asSlice(32).set(JAVA_LONG, 0, value.frameId());
    target.asSlice(40).set(JAVA_INT, 0, value.slot());
    target.asSlice(48).set(ADDRESS, 0, MemorySegment.ofAddress(value.texture().address()));
    target.asSlice(56).set(ADDRESS, 0, MemorySegment.ofAddress(value.device().address()));
    target.asSlice(64).set(JAVA_LONG, 0, value.pixelFormat());
    return target;
  }

  static OpenGlTextureFrame readOpenGlTextureFrame(MemorySegment source, Scope scope) {
    return new OpenGlTextureFrame(
        source.asSlice(8).get(JAVA_LONG, 0),
        source.asSlice(16).get(JAVA_INT, 0),
        source.asSlice(20).get(JAVA_INT, 0),
        source.asSlice(24).get(JAVA_DOUBLE, 0),
        source.asSlice(32).get(JAVA_LONG, 0),
        source.asSlice(40).get(JAVA_INT, 0),
        source.asSlice(44).get(JAVA_INT, 0),
        source.asSlice(48).get(JAVA_INT, 0),
        source.asSlice(52).get(JAVA_INT, 0),
        source.asSlice(56).get(JAVA_INT, 0),
        source.asSlice(60).get(JAVA_INT, 0),
        scope);
  }

  static MemorySegment writeOpenGlTextureFrame(Call call, OpenGlTextureFrame value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.OpenGlTextureFrame);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.OpenGlTextureFrame.byteSize());
    target.asSlice(8).set(JAVA_LONG, 0, value.generation());
    target.asSlice(16).set(JAVA_INT, 0, value.width());
    target.asSlice(20).set(JAVA_INT, 0, value.height());
    target.asSlice(24).set(JAVA_DOUBLE, 0, value.scaleFactor());
    target.asSlice(32).set(JAVA_LONG, 0, value.frameId());
    target.asSlice(40).set(JAVA_INT, 0, value.slot());
    target.asSlice(44).set(JAVA_INT, 0, value.texture());
    target.asSlice(48).set(JAVA_INT, 0, value.target());
    target.asSlice(52).set(JAVA_INT, 0, value.internalFormat());
    target.asSlice(56).set(JAVA_INT, 0, value.format());
    target.asSlice(60).set(JAVA_INT, 0, value.type());
    return target;
  }

  static GpuSync readGpuSync(MemorySegment source, Scope scope) {
    return new GpuSync(
        new GpuSyncKind(source.asSlice(4).get(JAVA_INT, 0)),
        source.asSlice(8).get(JAVA_LONG, 0),
        scope);
  }

  static MemorySegment writeGpuSync(Call call, GpuSync value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.GpuSync);
    target
        .asSlice(0)
        .set(JAVA_INT, 0, (int) org.maplibre.nativeffi.internal.c.Layouts.GpuSync.byteSize());
    target.asSlice(4).set(JAVA_INT, 0, value.kind().rawValue());
    target.asSlice(8).set(JAVA_LONG, 0, value.handle());
    return target;
  }

  static RenderFrameResult readRenderFrameResult(MemorySegment source, Scope scope) {
    return new RenderFrameResult(
        new RenderResult(source.asSlice(4).get(JAVA_INT, 0)),
        source.asSlice(8).get(JAVA_LONG, 0),
        source.asSlice(16).get(JAVA_LONG, 0),
        source.asSlice(24).get(JAVA_LONG, 0),
        source.asSlice(32).get(JAVA_LONG, 0),
        source.asSlice(40).get(JAVA_BOOLEAN, 0),
        Codecs.readMapView(source.asSlice(48), scope),
        new RenderMode(source.asSlice(256).get(JAVA_INT, 0)));
  }

  static MemorySegment writeRenderFrameResult(Call call, RenderFrameResult value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.RenderFrameResult);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.RenderFrameResult.byteSize());
    target.asSlice(4).set(JAVA_INT, 0, value.disposition().rawValue());
    target.asSlice(8).set(JAVA_LONG, 0, value.token());
    target.asSlice(16).set(JAVA_LONG, 0, value.mapUpdateGeneration());
    target.asSlice(24).set(JAVA_LONG, 0, value.generation());
    target.asSlice(32).set(JAVA_LONG, 0, value.frameGeneration());
    target.asSlice(40).set(JAVA_BOOLEAN, 0, value.needsRepaint());
    MemorySegment.copy(
        Codecs.writeMapView(call, value.view()),
        0,
        target.asSlice(48),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.MapView.byteSize());
    target.asSlice(256).set(JAVA_INT, 0, value.mode().rawValue());
    return target;
  }

  static MapView readMapView(MemorySegment source, Scope scope) {
    return new MapView(
        Codecs.readCamera(source.asSlice(8), scope),
        Codecs.readLogicalExtent(source.asSlice(104), scope),
        Codecs.readProjectionMode(source.asSlice(120), scope),
        Codecs.readMapViewportOptions(source.asSlice(152), scope));
  }

  static MemorySegment writeMapView(Call call, MapView value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.MapView);
    target
        .asSlice(0)
        .set(JAVA_INT, 0, (int) org.maplibre.nativeffi.internal.c.Layouts.MapView.byteSize());
    MemorySegment.copy(
        Codecs.writeCamera(call, value.camera()),
        0,
        target.asSlice(8),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.Camera.byteSize());
    MemorySegment.copy(
        Codecs.writeLogicalExtent(call, value.extent()),
        0,
        target.asSlice(104),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.LogicalExtent.byteSize());
    MemorySegment.copy(
        Codecs.writeProjectionMode(call, value.projectionMode()),
        0,
        target.asSlice(120),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.ProjectionMode.byteSize());
    MemorySegment.copy(
        Codecs.writeMapViewportOptions(call, value.viewport()),
        0,
        target.asSlice(152),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.MapViewportOptions.byteSize());
    return target;
  }

  static Camera readCamera(MemorySegment source, Scope scope) {
    return new Camera(
        Codecs.readLatLng(source.asSlice(0), scope),
        source.asSlice(16).get(JAVA_DOUBLE, 0),
        Codecs.readEdgeInsets(source.asSlice(24), scope),
        source.asSlice(56).get(JAVA_DOUBLE, 0),
        source.asSlice(64).get(JAVA_DOUBLE, 0),
        source.asSlice(72).get(JAVA_DOUBLE, 0),
        source.asSlice(80).get(JAVA_DOUBLE, 0),
        source.asSlice(88).get(JAVA_DOUBLE, 0));
  }

  static MemorySegment writeCamera(Call call, Camera value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.Camera);
    MemorySegment.copy(
        Codecs.writeLatLng(call, value.center()),
        0,
        target.asSlice(0),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.LatLng.byteSize());
    target.asSlice(16).set(JAVA_DOUBLE, 0, value.centerAltitude());
    MemorySegment.copy(
        Codecs.writeEdgeInsets(call, value.padding()),
        0,
        target.asSlice(24),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.EdgeInsets.byteSize());
    target.asSlice(56).set(JAVA_DOUBLE, 0, value.zoom());
    target.asSlice(64).set(JAVA_DOUBLE, 0, value.bearing());
    target.asSlice(72).set(JAVA_DOUBLE, 0, value.pitch());
    target.asSlice(80).set(JAVA_DOUBLE, 0, value.roll());
    target.asSlice(88).set(JAVA_DOUBLE, 0, value.fieldOfView());
    return target;
  }

  static LatLng readLatLng(MemorySegment source, Scope scope) {
    return new LatLng(source.asSlice(0).get(JAVA_DOUBLE, 0), source.asSlice(8).get(JAVA_DOUBLE, 0));
  }

  static MemorySegment writeLatLng(Call call, LatLng value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.LatLng);
    target.asSlice(0).set(JAVA_DOUBLE, 0, value.latitude());
    target.asSlice(8).set(JAVA_DOUBLE, 0, value.longitude());
    return target;
  }

  static EdgeInsets readEdgeInsets(MemorySegment source, Scope scope) {
    return new EdgeInsets(
        source.asSlice(0).get(JAVA_DOUBLE, 0),
        source.asSlice(8).get(JAVA_DOUBLE, 0),
        source.asSlice(16).get(JAVA_DOUBLE, 0),
        source.asSlice(24).get(JAVA_DOUBLE, 0));
  }

  static MemorySegment writeEdgeInsets(Call call, EdgeInsets value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.EdgeInsets);
    target.asSlice(0).set(JAVA_DOUBLE, 0, value.top());
    target.asSlice(8).set(JAVA_DOUBLE, 0, value.left());
    target.asSlice(16).set(JAVA_DOUBLE, 0, value.bottom());
    target.asSlice(24).set(JAVA_DOUBLE, 0, value.right());
    return target;
  }

  static LogicalExtent readLogicalExtent(MemorySegment source, Scope scope) {
    return new LogicalExtent(
        source.asSlice(0).get(JAVA_INT, 0),
        source.asSlice(4).get(JAVA_INT, 0),
        source.asSlice(8).get(JAVA_DOUBLE, 0));
  }

  static MemorySegment writeLogicalExtent(Call call, LogicalExtent value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.LogicalExtent);
    target.asSlice(0).set(JAVA_INT, 0, value.width());
    target.asSlice(4).set(JAVA_INT, 0, value.height());
    target.asSlice(8).set(JAVA_DOUBLE, 0, value.scaleFactor());
    return target;
  }

  static ProjectionMode readProjectionMode(MemorySegment source, Scope scope) {
    return new ProjectionMode(
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_PROJECTION_MODE_AXONOMETRIC) == 0
            ? null
            : source.asSlice(8).get(JAVA_BOOLEAN, 0)),
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_PROJECTION_MODE_X_SKEW) == 0
            ? null
            : source.asSlice(16).get(JAVA_DOUBLE, 0)),
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_PROJECTION_MODE_Y_SKEW) == 0
            ? null
            : source.asSlice(24).get(JAVA_DOUBLE, 0)));
  }

  static MemorySegment writeProjectionMode(Call call, ProjectionMode value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.ProjectionMode);
    target
        .asSlice(0)
        .set(
            JAVA_INT, 0, (int) org.maplibre.nativeffi.internal.c.Layouts.ProjectionMode.byteSize());
    int fields = 0;
    if (value.axonometric() != null) {
      fields |= C.MLN_PROJECTION_MODE_AXONOMETRIC;
      target.asSlice(8).set(JAVA_BOOLEAN, 0, value.axonometric());
    }
    if (value.xSkew() != null) {
      fields |= C.MLN_PROJECTION_MODE_X_SKEW;
      target.asSlice(16).set(JAVA_DOUBLE, 0, value.xSkew());
    }
    if (value.ySkew() != null) {
      fields |= C.MLN_PROJECTION_MODE_Y_SKEW;
      target.asSlice(24).set(JAVA_DOUBLE, 0, value.ySkew());
    }
    target.asSlice(4).set(JAVA_INT, 0, fields);
    return target;
  }

  static MapViewportOptions readMapViewportOptions(MemorySegment source, Scope scope) {
    return new MapViewportOptions(
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_MAP_VIEWPORT_OPTION_NORTH_ORIENTATION) == 0
            ? null
            : new NorthOrientation(source.asSlice(8).get(JAVA_INT, 0))),
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_MAP_VIEWPORT_OPTION_CONSTRAIN_MODE) == 0
            ? null
            : new ConstrainMode(source.asSlice(12).get(JAVA_INT, 0))),
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_MAP_VIEWPORT_OPTION_VIEWPORT_MODE) == 0
            ? null
            : new ViewportMode(source.asSlice(16).get(JAVA_INT, 0))),
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_MAP_VIEWPORT_OPTION_FRUSTUM_OFFSET) == 0
            ? null
            : Codecs.readEdgeInsets(source.asSlice(24), scope)));
  }

  static MemorySegment writeMapViewportOptions(Call call, MapViewportOptions value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.MapViewportOptions);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.MapViewportOptions.byteSize());
    int fields = 0;
    if (value.northOrientation() != null) {
      fields |= C.MLN_MAP_VIEWPORT_OPTION_NORTH_ORIENTATION;
      target.asSlice(8).set(JAVA_INT, 0, value.northOrientation().rawValue());
    }
    if (value.constrainMode() != null) {
      fields |= C.MLN_MAP_VIEWPORT_OPTION_CONSTRAIN_MODE;
      target.asSlice(12).set(JAVA_INT, 0, value.constrainMode().rawValue());
    }
    if (value.viewportMode() != null) {
      fields |= C.MLN_MAP_VIEWPORT_OPTION_VIEWPORT_MODE;
      target.asSlice(16).set(JAVA_INT, 0, value.viewportMode().rawValue());
    }
    if (value.frustumOffset() != null) {
      fields |= C.MLN_MAP_VIEWPORT_OPTION_FRUSTUM_OFFSET;
      MemorySegment.copy(
          Codecs.writeEdgeInsets(call, value.frustumOffset()),
          0,
          target.asSlice(24),
          0,
          org.maplibre.nativeffi.internal.c.Layouts.EdgeInsets.byteSize());
    }
    target.asSlice(4).set(JAVA_INT, 0, fields);
    return target;
  }

  static VulkanTextureFrame readVulkanTextureFrame(MemorySegment source, Scope scope) {
    return new VulkanTextureFrame(
        source.asSlice(8).get(JAVA_LONG, 0),
        source.asSlice(16).get(JAVA_INT, 0),
        source.asSlice(20).get(JAVA_INT, 0),
        source.asSlice(24).get(JAVA_DOUBLE, 0),
        source.asSlice(32).get(JAVA_LONG, 0),
        source.asSlice(40).get(JAVA_INT, 0),
        source.asSlice(48).get(JAVA_LONG, 0),
        source.asSlice(56).get(JAVA_LONG, 0),
        new NativePointer(source.asSlice(64).get(ADDRESS, 0).address(), scope),
        source.asSlice(72).get(JAVA_INT, 0),
        source.asSlice(76).get(JAVA_INT, 0),
        scope);
  }

  static MemorySegment writeVulkanTextureFrame(Call call, VulkanTextureFrame value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.VulkanTextureFrame);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.VulkanTextureFrame.byteSize());
    target.asSlice(8).set(JAVA_LONG, 0, value.generation());
    target.asSlice(16).set(JAVA_INT, 0, value.width());
    target.asSlice(20).set(JAVA_INT, 0, value.height());
    target.asSlice(24).set(JAVA_DOUBLE, 0, value.scaleFactor());
    target.asSlice(32).set(JAVA_LONG, 0, value.frameId());
    target.asSlice(40).set(JAVA_INT, 0, value.slot());
    target.asSlice(48).set(JAVA_LONG, 0, value.image());
    target.asSlice(56).set(JAVA_LONG, 0, value.imageView());
    target.asSlice(64).set(ADDRESS, 0, MemorySegment.ofAddress(value.device().address()));
    target.asSlice(72).set(JAVA_INT, 0, value.format());
    target.asSlice(76).set(JAVA_INT, 0, value.layout());
    return target;
  }

  static MemorySegment writeGeoJsonSourceOptions(Call call, GeoJsonSourceOptions value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.GeoJsonSourceOptions);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.GeoJsonSourceOptions.byteSize());
    int fields = 0;
    if (value.minZoom() != null) {
      fields |= C.MLN_GEO_JSON_SOURCE_OPTION_MIN_ZOOM;
      target.asSlice(8).set(JAVA_DOUBLE, 0, value.minZoom());
    }
    if (value.maxZoom() != null) {
      fields |= C.MLN_GEO_JSON_SOURCE_OPTION_MAX_ZOOM;
      target.asSlice(16).set(JAVA_DOUBLE, 0, value.maxZoom());
    }
    if (value.tolerance() != null) {
      fields |= C.MLN_GEO_JSON_SOURCE_OPTION_TOLERANCE;
      target.asSlice(24).set(JAVA_DOUBLE, 0, value.tolerance());
    }
    if (value.clusterMaxZoom() != null) {
      fields |= C.MLN_GEO_JSON_SOURCE_OPTION_CLUSTER_MAX_ZOOM;
      target.asSlice(32).set(JAVA_DOUBLE, 0, value.clusterMaxZoom());
    }
    MemorySegment.copy(
        call.view(call.text(value.clusterProperties())),
        0,
        target.asSlice(40),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    if (value.buffer() != null) {
      fields |= C.MLN_GEO_JSON_SOURCE_OPTION_BUFFER;
      target.asSlice(56).set(JAVA_INT, 0, value.buffer());
    }
    if (value.clusterRadius() != null) {
      fields |= C.MLN_GEO_JSON_SOURCE_OPTION_CLUSTER_RADIUS;
      target.asSlice(60).set(JAVA_INT, 0, value.clusterRadius());
    }
    if (value.clusterMinPoints() != null) {
      fields |= C.MLN_GEO_JSON_SOURCE_OPTION_CLUSTER_MIN_POINTS;
      target.asSlice(64).set(JAVA_INT, 0, value.clusterMinPoints());
    }
    if (value.lineMetrics() != null) {
      fields |= C.MLN_GEO_JSON_SOURCE_OPTION_LINE_METRICS;
      target.asSlice(68).set(JAVA_BOOLEAN, 0, value.lineMetrics());
    }
    if (value.cluster() != null) {
      fields |= C.MLN_GEO_JSON_SOURCE_OPTION_CLUSTER;
      target.asSlice(69).set(JAVA_BOOLEAN, 0, value.cluster());
    }
    if (value.synchronousTiling() != null) {
      fields |= C.MLN_GEO_JSON_SOURCE_OPTION_SYNCHRONOUS_TILING;
      target.asSlice(70).set(JAVA_BOOLEAN, 0, value.synchronousTiling());
    }
    target.asSlice(4).set(JAVA_INT, 0, fields);
    return target;
  }

  static MemorySegment writeGraphicsDeviceOptions(Call call, GraphicsDeviceOptions value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.GraphicsDeviceOptions);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.GraphicsDeviceOptions.byteSize());
    int fields = 0;
    if (value.adapterIndex() != null) {
      fields |= C.MLN_GRAPHICS_DEVICE_OPTION_ADAPTER_INDEX;
      target.asSlice(8).set(JAVA_INT, 0, value.adapterIndex());
    }
    if (value.singleContext() != null) {
      fields |= C.MLN_GRAPHICS_DEVICE_OPTION_SINGLE_CONTEXT;
      target.asSlice(12).set(JAVA_BOOLEAN, 0, value.singleContext());
    }
    target.asSlice(4).set(JAVA_INT, 0, fields);
    return target;
  }

  static ProjectedMeters readProjectedMeters(MemorySegment source, Scope scope) {
    return new ProjectedMeters(
        source.asSlice(0).get(JAVA_DOUBLE, 0), source.asSlice(8).get(JAVA_DOUBLE, 0));
  }

  static MemorySegment writeProjectedMeters(Call call, ProjectedMeters value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.ProjectedMeters);
    target.asSlice(0).set(JAVA_DOUBLE, 0, value.northing());
    target.asSlice(8).set(JAVA_DOUBLE, 0, value.easting());
    return target;
  }

  static MemorySegment writeLogHandler(Call call, LogHandler value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.LogHandler);
    target
        .asSlice(0)
        .set(JAVA_INT, 0, (int) org.maplibre.nativeffi.internal.c.Layouts.LogHandler.byteSize());
    if (value.nativeRegistration() != null) {
      var registration = call.nativeRegistration(value.nativeRegistration());
      target.asSlice(16).set(ADDRESS, 0, registration.userData());
      target.asSlice(24).set(ADDRESS, 0, registration.releaseUserData());
      target.asSlice(8).set(ADDRESS, 0, registration.callback(0));
    } else if (value.callback() != null) {
      long token = call.register(value);
      target.asSlice(16).set(ADDRESS, 0, MemorySegment.ofAddress(token));
      target.asSlice(24).set(ADDRESS, 0, Roots.RELEASE);
      if (value.callback() != null) target.asSlice(8).set(ADDRESS, 0, Upcalls.LogHandler_callback);
    }
    return target;
  }

  static MemorySegment writeCustomGeometrySourceOptions(
      Call call, CustomGeometrySourceOptions value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.CustomGeometrySourceOptions);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.CustomGeometrySourceOptions.byteSize());
    if (value.nativeRegistration() != null) {
      var registration = call.nativeRegistration(value.nativeRegistration());
      target.asSlice(24).set(ADDRESS, 0, registration.userData());
      target.asSlice(72).set(ADDRESS, 0, registration.releaseUserData());
      target.asSlice(8).set(ADDRESS, 0, registration.callback(0));
      target.asSlice(16).set(ADDRESS, 0, registration.callback(1));
    } else if (value.fetchTile() != null || value.cancelTile() != null) {
      long token = call.register(value);
      target.asSlice(24).set(ADDRESS, 0, MemorySegment.ofAddress(token));
      target.asSlice(72).set(ADDRESS, 0, Roots.RELEASE);
      if (value.fetchTile() != null)
        target.asSlice(8).set(ADDRESS, 0, Upcalls.CustomGeometrySourceOptions_fetchTile);
      if (value.cancelTile() != null)
        target.asSlice(16).set(ADDRESS, 0, Upcalls.CustomGeometrySourceOptions_cancelTile);
    }
    int fields = 0;
    if (value.minZoom() != null) {
      fields |= C.MLN_CUSTOM_GEOMETRY_SOURCE_OPTION_MIN_ZOOM;
      target.asSlice(32).set(JAVA_DOUBLE, 0, value.minZoom());
    }
    if (value.maxZoom() != null) {
      fields |= C.MLN_CUSTOM_GEOMETRY_SOURCE_OPTION_MAX_ZOOM;
      target.asSlice(40).set(JAVA_DOUBLE, 0, value.maxZoom());
    }
    if (value.tolerance() != null) {
      fields |= C.MLN_CUSTOM_GEOMETRY_SOURCE_OPTION_TOLERANCE;
      target.asSlice(48).set(JAVA_DOUBLE, 0, value.tolerance());
    }
    if (value.tileSize() != null) {
      fields |= C.MLN_CUSTOM_GEOMETRY_SOURCE_OPTION_TILE_SIZE;
      target.asSlice(56).set(JAVA_INT, 0, value.tileSize());
    }
    if (value.buffer() != null) {
      fields |= C.MLN_CUSTOM_GEOMETRY_SOURCE_OPTION_BUFFER;
      target.asSlice(60).set(JAVA_INT, 0, value.buffer());
    }
    if (value.clip() != null) {
      fields |= C.MLN_CUSTOM_GEOMETRY_SOURCE_OPTION_CLIP;
      target.asSlice(64).set(JAVA_BOOLEAN, 0, value.clip());
    }
    if (value.wrap() != null) {
      fields |= C.MLN_CUSTOM_GEOMETRY_SOURCE_OPTION_WRAP;
      target.asSlice(65).set(JAVA_BOOLEAN, 0, value.wrap());
    }
    target.asSlice(4).set(JAVA_INT, 0, fields);
    return target;
  }

  static MemorySegment writeCustomVectorSourceOptions(Call call, CustomVectorSourceOptions value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.CustomVectorSourceOptions);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.CustomVectorSourceOptions.byteSize());
    if (value.nativeRegistration() != null) {
      var registration = call.nativeRegistration(value.nativeRegistration());
      target.asSlice(24).set(ADDRESS, 0, registration.userData());
      target.asSlice(48).set(ADDRESS, 0, registration.releaseUserData());
      target.asSlice(8).set(ADDRESS, 0, registration.callback(0));
      target.asSlice(16).set(ADDRESS, 0, registration.callback(1));
    } else if (value.fetchTile() != null || value.cancelTile() != null) {
      long token = call.register(value);
      target.asSlice(24).set(ADDRESS, 0, MemorySegment.ofAddress(token));
      target.asSlice(48).set(ADDRESS, 0, Roots.RELEASE);
      if (value.fetchTile() != null)
        target.asSlice(8).set(ADDRESS, 0, Upcalls.CustomVectorSourceOptions_fetchTile);
      if (value.cancelTile() != null)
        target.asSlice(16).set(ADDRESS, 0, Upcalls.CustomVectorSourceOptions_cancelTile);
    }
    int fields = 0;
    if (value.minZoom() != null) {
      fields |= C.MLN_CUSTOM_VECTOR_SOURCE_OPTION_MIN_ZOOM;
      target.asSlice(32).set(JAVA_DOUBLE, 0, value.minZoom());
    }
    if (value.maxZoom() != null) {
      fields |= C.MLN_CUSTOM_VECTOR_SOURCE_OPTION_MAX_ZOOM;
      target.asSlice(40).set(JAVA_DOUBLE, 0, value.maxZoom());
    }
    target.asSlice(4).set(JAVA_INT, 0, fields);
    return target;
  }

  static MemorySegment writePremultipliedRgba8Image(Call call, PremultipliedRgba8Image value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.PremultipliedRgba8Image);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.PremultipliedRgba8Image.byteSize());
    target.asSlice(4).set(JAVA_INT, 0, value.width());
    target.asSlice(8).set(JAVA_INT, 0, value.height());
    target.asSlice(12).set(JAVA_INT, 0, value.stride());
    target.asSlice(16).set(ADDRESS, 0, call.bytes(value.pixels()));
    target.asSlice(24).set(JAVA_LONG, 0, (long) Call.length(value.pixels()));
    return target;
  }

  static MemorySegment writeCameraDelta(Call call, CameraDelta value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.CameraDelta);
    target
        .asSlice(0)
        .set(JAVA_INT, 0, (int) org.maplibre.nativeffi.internal.c.Layouts.CameraDelta.byteSize());
    int fields = 0;
    if (value.offset() != null) {
      fields |= C.MLN_CAMERA_DELTA_OFFSET;
      MemorySegment.copy(
          Codecs.writeScreenPoint(call, value.offset()),
          0,
          target.asSlice(8),
          0,
          org.maplibre.nativeffi.internal.c.Layouts.ScreenPoint.byteSize());
    }
    if (value.scale() != null) {
      fields |= C.MLN_CAMERA_DELTA_SCALE;
      target.asSlice(24).set(JAVA_DOUBLE, 0, value.scale());
    }
    if (value.bearing() != null) {
      fields |= C.MLN_CAMERA_DELTA_BEARING;
      target.asSlice(32).set(JAVA_DOUBLE, 0, value.bearing());
    }
    if (value.pitch() != null) {
      fields |= C.MLN_CAMERA_DELTA_PITCH;
      target.asSlice(40).set(JAVA_DOUBLE, 0, value.pitch());
    }
    if (value.anchor() != null) {
      fields |= C.MLN_CAMERA_DELTA_ANCHOR;
      MemorySegment.copy(
          Codecs.writeScreenPoint(call, value.anchor()),
          0,
          target.asSlice(48),
          0,
          org.maplibre.nativeffi.internal.c.Layouts.ScreenPoint.byteSize());
    }
    MemorySegment.copy(
        Codecs.writeAnimationOptions(call, value.animation()),
        0,
        target.asSlice(64),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.AnimationOptions.byteSize());
    target.asSlice(168).set(JAVA_INT, 0, value.gesturePhase().rawValue());
    target.asSlice(4).set(JAVA_INT, 0, fields);
    return target;
  }

  static ScreenPoint readScreenPoint(MemorySegment source, Scope scope) {
    return new ScreenPoint(
        source.asSlice(0).get(JAVA_DOUBLE, 0), source.asSlice(8).get(JAVA_DOUBLE, 0));
  }

  static MemorySegment writeScreenPoint(Call call, ScreenPoint value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.ScreenPoint);
    target.asSlice(0).set(JAVA_DOUBLE, 0, value.x());
    target.asSlice(8).set(JAVA_DOUBLE, 0, value.y());
    return target;
  }

  static MemorySegment writeAnimationOptions(Call call, AnimationOptions value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.AnimationOptions);
    int fields = 0;
    if (value.durationMs() != null) {
      fields |= C.MLN_ANIMATION_OPTION_DURATION;
      target.asSlice(8).set(JAVA_DOUBLE, 0, value.durationMs());
    }
    if (value.velocity() != null) {
      fields |= C.MLN_ANIMATION_OPTION_VELOCITY;
      target.asSlice(16).set(JAVA_DOUBLE, 0, value.velocity());
    }
    if (value.minZoom() != null) {
      fields |= C.MLN_ANIMATION_OPTION_MIN_ZOOM;
      target.asSlice(24).set(JAVA_DOUBLE, 0, value.minZoom());
    }
    if (value.easing() != null) {
      fields |= C.MLN_ANIMATION_OPTION_EASING;
      MemorySegment.copy(
          Codecs.writeUnitBezier(call, value.easing()),
          0,
          target.asSlice(32),
          0,
          org.maplibre.nativeffi.internal.c.Layouts.UnitBezier.byteSize());
    }
    if (value.transitionId() != null) {
      fields |= C.MLN_ANIMATION_OPTION_TRANSITION_ID;
      target.asSlice(64).set(JAVA_LONG, 0, value.transitionId());
    }
    MemorySegment.copy(
        Codecs.writeCameraTransitionHandler(call, value.endHandler()),
        0,
        target.asSlice(72),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.CameraTransitionHandler.byteSize());
    target.asSlice(0).set(JAVA_INT, 0, fields);
    return target;
  }

  static MemorySegment writeUnitBezier(Call call, UnitBezier value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.UnitBezier);
    target.asSlice(0).set(JAVA_DOUBLE, 0, value.x1());
    target.asSlice(8).set(JAVA_DOUBLE, 0, value.y1());
    target.asSlice(16).set(JAVA_DOUBLE, 0, value.x2());
    target.asSlice(24).set(JAVA_DOUBLE, 0, value.y2());
    return target;
  }

  static MemorySegment writeCameraTransitionHandler(Call call, CameraTransitionHandler value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.CameraTransitionHandler);
    if (value.nativeRegistration() != null) {
      var registration = call.nativeRegistration(value.nativeRegistration());
      target.asSlice(8).set(ADDRESS, 0, registration.userData());
      target.asSlice(16).set(ADDRESS, 0, registration.releaseUserData());
      target.asSlice(0).set(ADDRESS, 0, registration.callback(0));
    } else if (value.callback() != null) {
      long token = call.register(value);
      target.asSlice(8).set(ADDRESS, 0, MemorySegment.ofAddress(token));
      target.asSlice(16).set(ADDRESS, 0, Roots.RELEASE);
      if (value.callback() != null)
        target.asSlice(0).set(ADDRESS, 0, Upcalls.CameraTransitionHandler_callback);
    }
    return target;
  }

  static MemorySegment writeGraphicsDeviceTextureDescriptor(
      Call call, GraphicsDeviceTextureDescriptor value) {
    var target =
        call.arena.allocate(
            org.maplibre.nativeffi.internal.c.Layouts.GraphicsDeviceTextureDescriptor);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int)
                org.maplibre.nativeffi.internal.c.Layouts.GraphicsDeviceTextureDescriptor
                    .byteSize());
    MemorySegment.copy(
        Codecs.writeLogicalExtent(call, value.extent()),
        0,
        target.asSlice(8),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.LogicalExtent.byteSize());
    return target;
  }

  static MemorySegment writeRenderSessionAttachOptions(
      Call call, RenderSessionAttachOptions value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.RenderSessionAttachOptions);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.RenderSessionAttachOptions.byteSize());
    target.asSlice(4).set(JAVA_INT, 0, value.driver().rawValue());
    target.asSlice(8).set(JAVA_INT, 0, value.requestedTextureRingDepth());
    target.asSlice(12).set(JAVA_INT, 0, value.producerSyncKind().rawValue());
    MemorySegment.copy(
        Codecs.writeWake(call, value.frameWake()),
        0,
        target.asSlice(16),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.Wake.byteSize());
    MemorySegment.copy(
        Codecs.writeWake(call, value.driverWorkWake()),
        0,
        target.asSlice(48),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.Wake.byteSize());
    MemorySegment.copy(
        Codecs.writeQueueLock(call, value.queueLock()),
        0,
        target.asSlice(80),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.QueueLock.byteSize());
    return target;
  }

  static MemorySegment writeWake(Call call, Wake value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.Wake);
    if (value.nativeRegistration() != null) {
      var registration = call.nativeRegistration(value.nativeRegistration());
      target.asSlice(8).set(ADDRESS, 0, registration.userData());
      target.asSlice(16).set(ADDRESS, 0, registration.releaseUserData());
      target.asSlice(0).set(ADDRESS, 0, registration.callback(0));
    } else if (value.callback() != null) {
      long token = call.register(value);
      target.asSlice(8).set(ADDRESS, 0, MemorySegment.ofAddress(token));
      target.asSlice(16).set(ADDRESS, 0, Roots.RELEASE);
      if (value.callback() != null) target.asSlice(0).set(ADDRESS, 0, Upcalls.Wake_callback);
    }
    return target;
  }

  static MemorySegment writeQueueLock(Call call, QueueLock value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.QueueLock);
    if (value.nativeRegistration() != null) {
      var registration = call.nativeRegistration(value.nativeRegistration());
      target.asSlice(16).set(ADDRESS, 0, registration.userData());
      target.asSlice(24).set(ADDRESS, 0, registration.releaseUserData());
      target.asSlice(0).set(ADDRESS, 0, registration.callback(0));
      target.asSlice(8).set(ADDRESS, 0, registration.callback(1));
    } else if (value.lock() != null || value.unlock() != null) {
      long token = call.register(value);
      target.asSlice(16).set(ADDRESS, 0, MemorySegment.ofAddress(token));
      target.asSlice(24).set(ADDRESS, 0, Roots.RELEASE);
      if (value.lock() != null) target.asSlice(0).set(ADDRESS, 0, Upcalls.QueueLock_lock);
      if (value.unlock() != null) target.asSlice(8).set(ADDRESS, 0, Upcalls.QueueLock_unlock);
    }
    return target;
  }

  static MemorySegment writeMetalBorrowedTextureDescriptor(
      Call call, MetalBorrowedTextureDescriptor value) {
    var target =
        call.arena.allocate(
            org.maplibre.nativeffi.internal.c.Layouts.MetalBorrowedTextureDescriptor);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int)
                org.maplibre.nativeffi.internal.c.Layouts.MetalBorrowedTextureDescriptor
                    .byteSize());
    MemorySegment.copy(
        Codecs.writeLogicalExtent(call, value.extent()),
        0,
        target.asSlice(8),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.LogicalExtent.byteSize());
    target.asSlice(24).set(JAVA_INT, 0, value.physicalWidth());
    target.asSlice(28).set(JAVA_INT, 0, value.physicalHeight());
    target
        .asSlice(32)
        .set(
            ADDRESS,
            0,
            call.array(
                value.textures(),
                org.maplibre.nativeffi.internal.c.Layouts.MetalBorrowedTexture,
                (elementTarget, elementValue) -> {
                  MemorySegment.copy(
                      Codecs.writeMetalBorrowedTexture(call, elementValue),
                      0,
                      elementTarget,
                      0,
                      org.maplibre.nativeffi.internal.c.Layouts.MetalBorrowedTexture.byteSize());
                }));
    target.asSlice(40).set(JAVA_LONG, 0, (long) Call.length(value.textures()));
    return target;
  }

  static MemorySegment writeMetalBorrowedTexture(Call call, MetalBorrowedTexture value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.MetalBorrowedTexture);
    target.asSlice(0).set(ADDRESS, 0, MemorySegment.ofAddress(value.texture().address()));
    return target;
  }

  static MemorySegment writeMetalOwnedTextureDescriptor(
      Call call, MetalOwnedTextureDescriptor value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.MetalOwnedTextureDescriptor);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.MetalOwnedTextureDescriptor.byteSize());
    MemorySegment.copy(
        Codecs.writeLogicalExtent(call, value.extent()),
        0,
        target.asSlice(8),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.LogicalExtent.byteSize());
    MemorySegment.copy(
        Codecs.writeMetalContextDescriptor(call, value.context()),
        0,
        target.asSlice(24),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.MetalContextDescriptor.byteSize());
    target.asSlice(32).set(JAVA_LONG, 0, value.pixelFormat());
    return target;
  }

  static MemorySegment writeMetalContextDescriptor(Call call, MetalContextDescriptor value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.MetalContextDescriptor);
    target.asSlice(0).set(ADDRESS, 0, MemorySegment.ofAddress(value.device().address()));
    return target;
  }

  static MemorySegment writeMetalSurfaceDescriptor(Call call, MetalSurfaceDescriptor value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.MetalSurfaceDescriptor);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.MetalSurfaceDescriptor.byteSize());
    MemorySegment.copy(
        Codecs.writeLogicalExtent(call, value.extent()),
        0,
        target.asSlice(8),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.LogicalExtent.byteSize());
    MemorySegment.copy(
        Codecs.writeMetalContextDescriptor(call, value.context()),
        0,
        target.asSlice(24),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.MetalContextDescriptor.byteSize());
    target.asSlice(32).set(ADDRESS, 0, MemorySegment.ofAddress(value.layer().address()));
    return target;
  }

  static MemorySegment writeOpenGlBorrowedTextureDescriptor(
      Call call, OpenGlBorrowedTextureDescriptor value) {
    var target =
        call.arena.allocate(
            org.maplibre.nativeffi.internal.c.Layouts.OpenGlBorrowedTextureDescriptor);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int)
                org.maplibre.nativeffi.internal.c.Layouts.OpenGlBorrowedTextureDescriptor
                    .byteSize());
    MemorySegment.copy(
        Codecs.writeLogicalExtent(call, value.extent()),
        0,
        target.asSlice(8),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.LogicalExtent.byteSize());
    target.asSlice(24).set(JAVA_INT, 0, value.physicalWidth());
    target.asSlice(28).set(JAVA_INT, 0, value.physicalHeight());
    MemorySegment.copy(
        Codecs.writeOpenGlContextDescriptor(call, value.context()),
        0,
        target.asSlice(32),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.OpenGlContextDescriptor.byteSize());
    target
        .asSlice(80)
        .set(
            ADDRESS,
            0,
            call.array(
                value.textures(),
                org.maplibre.nativeffi.internal.c.Layouts.OpenGlBorrowedTexture,
                (elementTarget, elementValue) -> {
                  MemorySegment.copy(
                      Codecs.writeOpenGlBorrowedTexture(call, elementValue),
                      0,
                      elementTarget,
                      0,
                      org.maplibre.nativeffi.internal.c.Layouts.OpenGlBorrowedTexture.byteSize());
                }));
    target.asSlice(88).set(JAVA_LONG, 0, (long) Call.length(value.textures()));
    target.asSlice(96).set(JAVA_INT, 0, value.target());
    return target;
  }

  static MemorySegment writeOpenGlContextDescriptor(Call call, OpenGlContextDescriptor value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.OpenGlContextDescriptor);
    target.asSlice(4).set(JAVA_INT, 0, value.ownership().rawValue());
    switch (value.data()) {
      case OpenGlContextDescriptorData.Wgl arm -> {
        target.asSlice(0).set(JAVA_INT, 0, C.MLN_OPEN_GL_CONTEXT_PLATFORM_WGL);
        MemorySegment.copy(
            Codecs.writeWglContextDescriptor(call, arm.value()),
            0,
            target.asSlice(8),
            0,
            org.maplibre.nativeffi.internal.c.Layouts.WglContextDescriptor.byteSize());
      }
      case OpenGlContextDescriptorData.Egl arm -> {
        target.asSlice(0).set(JAVA_INT, 0, C.MLN_OPEN_GL_CONTEXT_PLATFORM_EGL);
        MemorySegment.copy(
            Codecs.writeEglContextDescriptor(call, arm.value()),
            0,
            target.asSlice(8),
            0,
            org.maplibre.nativeffi.internal.c.Layouts.EglContextDescriptor.byteSize());
      }
      case OpenGlContextDescriptorData.WebGl arm -> {
        target.asSlice(0).set(JAVA_INT, 0, C.MLN_OPEN_GL_CONTEXT_PLATFORM_WEB_GL);
        MemorySegment.copy(
            Codecs.writeWebGlContextDescriptor(call, arm.value()),
            0,
            target.asSlice(8),
            0,
            org.maplibre.nativeffi.internal.c.Layouts.WebGlContextDescriptor.byteSize());
      }
      case OpenGlContextDescriptorData.Unknown arm -> {
        target.asSlice(0).set(JAVA_INT, 0, arm.rawTag());
        MemorySegment.copy(
            arm.bytes(),
            0,
            target.asSlice(8),
            JAVA_BYTE,
            0,
            Math.toIntExact(
                org.maplibre.nativeffi.internal.c.Layouts.OpenGlContextDescriptorData.byteSize()));
      }
    }
    return target;
  }

  static MemorySegment writeWglContextDescriptor(Call call, WglContextDescriptor value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.WglContextDescriptor);
    target.asSlice(0).set(ADDRESS, 0, MemorySegment.ofAddress(value.deviceContext().address()));
    target.asSlice(8).set(ADDRESS, 0, MemorySegment.ofAddress(value.shareContext().address()));
    target.asSlice(16).set(ADDRESS, 0, MemorySegment.ofAddress(value.getProcAddress().address()));
    return target;
  }

  static MemorySegment writeEglContextDescriptor(Call call, EglContextDescriptor value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.EglContextDescriptor);
    target.asSlice(0).set(ADDRESS, 0, MemorySegment.ofAddress(value.display().address()));
    target.asSlice(8).set(ADDRESS, 0, MemorySegment.ofAddress(value.config().address()));
    target.asSlice(16).set(ADDRESS, 0, MemorySegment.ofAddress(value.shareContext().address()));
    target.asSlice(24).set(JAVA_INT, 0, value.clientApi().rawValue());
    target.asSlice(32).set(ADDRESS, 0, MemorySegment.ofAddress(value.getProcAddress().address()));
    return target;
  }

  static MemorySegment writeWebGlContextDescriptor(Call call, WebGlContextDescriptor value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.WebGlContextDescriptor);
    target.asSlice(0).set(JAVA_INT, 0, value.kind().rawValue());
    target.asSlice(4).set(JAVA_INT, 0, value.context());
    MemorySegment.copy(
        call.view(call.text(value.canvasSelector())),
        0,
        target.asSlice(8),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    return target;
  }

  static MemorySegment writeOpenGlBorrowedTexture(Call call, OpenGlBorrowedTexture value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.OpenGlBorrowedTexture);
    target.asSlice(0).set(JAVA_INT, 0, value.texture());
    return target;
  }

  static MemorySegment writeOpenGlOwnedTextureDescriptor(
      Call call, OpenGlOwnedTextureDescriptor value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.OpenGlOwnedTextureDescriptor);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int)
                org.maplibre.nativeffi.internal.c.Layouts.OpenGlOwnedTextureDescriptor.byteSize());
    MemorySegment.copy(
        Codecs.writeLogicalExtent(call, value.extent()),
        0,
        target.asSlice(8),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.LogicalExtent.byteSize());
    MemorySegment.copy(
        Codecs.writeOpenGlContextDescriptor(call, value.context()),
        0,
        target.asSlice(24),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.OpenGlContextDescriptor.byteSize());
    return target;
  }

  static MemorySegment writeOpenGlSurfaceDescriptor(Call call, OpenGlSurfaceDescriptor value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.OpenGlSurfaceDescriptor);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.OpenGlSurfaceDescriptor.byteSize());
    MemorySegment.copy(
        Codecs.writeLogicalExtent(call, value.extent()),
        0,
        target.asSlice(8),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.LogicalExtent.byteSize());
    MemorySegment.copy(
        Codecs.writeOpenGlContextDescriptor(call, value.context()),
        0,
        target.asSlice(24),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.OpenGlContextDescriptor.byteSize());
    target.asSlice(72).set(ADDRESS, 0, MemorySegment.ofAddress(value.surface().address()));
    return target;
  }

  static MemorySegment writeVulkanBorrowedTextureDescriptor(
      Call call, VulkanBorrowedTextureDescriptor value) {
    var target =
        call.arena.allocate(
            org.maplibre.nativeffi.internal.c.Layouts.VulkanBorrowedTextureDescriptor);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int)
                org.maplibre.nativeffi.internal.c.Layouts.VulkanBorrowedTextureDescriptor
                    .byteSize());
    MemorySegment.copy(
        Codecs.writeLogicalExtent(call, value.extent()),
        0,
        target.asSlice(8),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.LogicalExtent.byteSize());
    target.asSlice(24).set(JAVA_INT, 0, value.physicalWidth());
    target.asSlice(28).set(JAVA_INT, 0, value.physicalHeight());
    MemorySegment.copy(
        Codecs.writeVulkanContextDescriptor(call, value.context()),
        0,
        target.asSlice(32),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.VulkanContextDescriptor.byteSize());
    target
        .asSlice(88)
        .set(
            ADDRESS,
            0,
            call.array(
                value.textures(),
                org.maplibre.nativeffi.internal.c.Layouts.VulkanBorrowedTexture,
                (elementTarget, elementValue) -> {
                  MemorySegment.copy(
                      Codecs.writeVulkanBorrowedTexture(call, elementValue),
                      0,
                      elementTarget,
                      0,
                      org.maplibre.nativeffi.internal.c.Layouts.VulkanBorrowedTexture.byteSize());
                }));
    target.asSlice(96).set(JAVA_LONG, 0, (long) Call.length(value.textures()));
    target.asSlice(104).set(JAVA_INT, 0, value.format());
    target.asSlice(108).set(JAVA_INT, 0, value.initialLayout());
    target.asSlice(112).set(JAVA_INT, 0, value.finalLayout());
    return target;
  }

  static MemorySegment writeVulkanContextDescriptor(Call call, VulkanContextDescriptor value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.VulkanContextDescriptor);
    target.asSlice(0).set(ADDRESS, 0, MemorySegment.ofAddress(value.instance().address()));
    target.asSlice(8).set(ADDRESS, 0, MemorySegment.ofAddress(value.physicalDevice().address()));
    target.asSlice(16).set(ADDRESS, 0, MemorySegment.ofAddress(value.device().address()));
    target.asSlice(24).set(ADDRESS, 0, MemorySegment.ofAddress(value.graphicsQueue().address()));
    target.asSlice(32).set(JAVA_INT, 0, value.graphicsQueueFamilyIndex());
    target
        .asSlice(40)
        .set(ADDRESS, 0, MemorySegment.ofAddress(value.getInstanceProcAddr().address()));
    target
        .asSlice(48)
        .set(ADDRESS, 0, MemorySegment.ofAddress(value.getDeviceProcAddr().address()));
    return target;
  }

  static MemorySegment writeVulkanBorrowedTexture(Call call, VulkanBorrowedTexture value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.VulkanBorrowedTexture);
    target.asSlice(0).set(JAVA_LONG, 0, value.image());
    target.asSlice(8).set(JAVA_LONG, 0, value.imageView());
    return target;
  }

  static MemorySegment writeVulkanOwnedTextureDescriptor(
      Call call, VulkanOwnedTextureDescriptor value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.VulkanOwnedTextureDescriptor);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int)
                org.maplibre.nativeffi.internal.c.Layouts.VulkanOwnedTextureDescriptor.byteSize());
    MemorySegment.copy(
        Codecs.writeLogicalExtent(call, value.extent()),
        0,
        target.asSlice(8),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.LogicalExtent.byteSize());
    MemorySegment.copy(
        Codecs.writeVulkanContextDescriptor(call, value.context()),
        0,
        target.asSlice(24),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.VulkanContextDescriptor.byteSize());
    return target;
  }

  static MemorySegment writeVulkanSurfaceDescriptor(Call call, VulkanSurfaceDescriptor value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.VulkanSurfaceDescriptor);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.VulkanSurfaceDescriptor.byteSize());
    MemorySegment.copy(
        Codecs.writeLogicalExtent(call, value.extent()),
        0,
        target.asSlice(8),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.LogicalExtent.byteSize());
    MemorySegment.copy(
        Codecs.writeVulkanContextDescriptor(call, value.context()),
        0,
        target.asSlice(24),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.VulkanContextDescriptor.byteSize());
    target.asSlice(80).set(JAVA_LONG, 0, value.surface());
    return target;
  }

  static MemorySegment writeCameraFitOptions(Call call, CameraFitOptions value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.CameraFitOptions);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.CameraFitOptions.byteSize());
    int fields = 0;
    if (value.padding() != null) {
      fields |= C.MLN_CAMERA_FIT_OPTION_PADDING;
      MemorySegment.copy(
          Codecs.writeEdgeInsets(call, value.padding()),
          0,
          target.asSlice(8),
          0,
          org.maplibre.nativeffi.internal.c.Layouts.EdgeInsets.byteSize());
    }
    if (value.bearing() != null) {
      fields |= C.MLN_CAMERA_FIT_OPTION_BEARING;
      target.asSlice(40).set(JAVA_DOUBLE, 0, value.bearing());
    }
    if (value.pitch() != null) {
      fields |= C.MLN_CAMERA_FIT_OPTION_PITCH;
      target.asSlice(48).set(JAVA_DOUBLE, 0, value.pitch());
    }
    target.asSlice(4).set(JAVA_INT, 0, fields);
    return target;
  }

  static CameraOptions readCameraOptions(MemorySegment source, Scope scope) {
    return new CameraOptions(
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_CAMERA_OPTION_CENTER) == 0
            ? null
            : Codecs.readLatLng(source.asSlice(8), scope)),
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_CAMERA_OPTION_CENTER_ALTITUDE) == 0
            ? null
            : source.asSlice(24).get(JAVA_DOUBLE, 0)),
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_CAMERA_OPTION_PADDING) == 0
            ? null
            : Codecs.readEdgeInsets(source.asSlice(32), scope)),
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_CAMERA_OPTION_ANCHOR) == 0
            ? null
            : Codecs.readScreenPoint(source.asSlice(64), scope)),
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_CAMERA_OPTION_ZOOM) == 0
            ? null
            : source.asSlice(80).get(JAVA_DOUBLE, 0)),
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_CAMERA_OPTION_BEARING) == 0
            ? null
            : source.asSlice(88).get(JAVA_DOUBLE, 0)),
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_CAMERA_OPTION_PITCH) == 0
            ? null
            : source.asSlice(96).get(JAVA_DOUBLE, 0)),
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_CAMERA_OPTION_ROLL) == 0
            ? null
            : source.asSlice(104).get(JAVA_DOUBLE, 0)),
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_CAMERA_OPTION_FOV) == 0
            ? null
            : source.asSlice(112).get(JAVA_DOUBLE, 0)));
  }

  static MemorySegment writeCameraOptions(Call call, CameraOptions value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.CameraOptions);
    target
        .asSlice(0)
        .set(JAVA_INT, 0, (int) org.maplibre.nativeffi.internal.c.Layouts.CameraOptions.byteSize());
    int fields = 0;
    if (value.center() != null) {
      fields |= C.MLN_CAMERA_OPTION_CENTER;
      MemorySegment.copy(
          Codecs.writeLatLng(call, value.center()),
          0,
          target.asSlice(8),
          0,
          org.maplibre.nativeffi.internal.c.Layouts.LatLng.byteSize());
    }
    if (value.centerAltitude() != null) {
      fields |= C.MLN_CAMERA_OPTION_CENTER_ALTITUDE;
      target.asSlice(24).set(JAVA_DOUBLE, 0, value.centerAltitude());
    }
    if (value.padding() != null) {
      fields |= C.MLN_CAMERA_OPTION_PADDING;
      MemorySegment.copy(
          Codecs.writeEdgeInsets(call, value.padding()),
          0,
          target.asSlice(32),
          0,
          org.maplibre.nativeffi.internal.c.Layouts.EdgeInsets.byteSize());
    }
    if (value.anchor() != null) {
      fields |= C.MLN_CAMERA_OPTION_ANCHOR;
      MemorySegment.copy(
          Codecs.writeScreenPoint(call, value.anchor()),
          0,
          target.asSlice(64),
          0,
          org.maplibre.nativeffi.internal.c.Layouts.ScreenPoint.byteSize());
    }
    if (value.zoom() != null) {
      fields |= C.MLN_CAMERA_OPTION_ZOOM;
      target.asSlice(80).set(JAVA_DOUBLE, 0, value.zoom());
    }
    if (value.bearing() != null) {
      fields |= C.MLN_CAMERA_OPTION_BEARING;
      target.asSlice(88).set(JAVA_DOUBLE, 0, value.bearing());
    }
    if (value.pitch() != null) {
      fields |= C.MLN_CAMERA_OPTION_PITCH;
      target.asSlice(96).set(JAVA_DOUBLE, 0, value.pitch());
    }
    if (value.roll() != null) {
      fields |= C.MLN_CAMERA_OPTION_ROLL;
      target.asSlice(104).set(JAVA_DOUBLE, 0, value.roll());
    }
    if (value.fieldOfView() != null) {
      fields |= C.MLN_CAMERA_OPTION_FOV;
      target.asSlice(112).set(JAVA_DOUBLE, 0, value.fieldOfView());
    }
    target.asSlice(4).set(JAVA_INT, 0, fields);
    return target;
  }

  static LatLngBounds readLatLngBounds(MemorySegment source, Scope scope) {
    return new LatLngBounds(
        Codecs.readLatLng(source.asSlice(0), scope), Codecs.readLatLng(source.asSlice(16), scope));
  }

  static MemorySegment writeLatLngBounds(Call call, LatLngBounds value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.LatLngBounds);
    MemorySegment.copy(
        Codecs.writeLatLng(call, value.southwest()),
        0,
        target.asSlice(0),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.LatLng.byteSize());
    MemorySegment.copy(
        Codecs.writeLatLng(call, value.northeast()),
        0,
        target.asSlice(16),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.LatLng.byteSize());
    return target;
  }

  static CameraQueryResult readCameraQueryResult(MemorySegment source, Scope scope) {
    return new CameraQueryResult(
        source.asSlice(0).get(JAVA_LONG, 0), Codecs.readCamera(source.asSlice(8), scope));
  }

  static MemorySegment writeCameraQueryResult(Call call, CameraQueryResult value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.CameraQueryResult);
    target.asSlice(0).set(JAVA_LONG, 0, value.generation());
    MemorySegment.copy(
        Codecs.writeCamera(call, value.camera()),
        0,
        target.asSlice(8),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.Camera.byteSize());
    return target;
  }

  static MemorySegment writeFeatureStateSelector(Call call, FeatureStateSelector value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.FeatureStateSelector);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.FeatureStateSelector.byteSize());
    int fields = 0;
    MemorySegment.copy(
        call.view(call.text(value.sourceId())),
        0,
        target.asSlice(8),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    MemorySegment.copy(
        call.view(call.text(value.sourceLayerId())),
        0,
        target.asSlice(24),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    if (value.featureId() != null) {
      fields |= C.MLN_FEATURE_STATE_SELECTOR_FEATURE_ID;
      MemorySegment.copy(
          call.view(call.text(value.featureId())),
          0,
          target.asSlice(40),
          0,
          org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    }
    MemorySegment.copy(
        call.view(call.text(value.stateKey())),
        0,
        target.asSlice(56),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    target.asSlice(4).set(JAVA_INT, 0, fields);
    return target;
  }

  static MapSnapshot readMapSnapshot(MemorySegment source, Scope scope) {
    return new MapSnapshot(
        new MapDebugFlag(source.asSlice(4).get(JAVA_INT, 0)),
        source.asSlice(8).get(JAVA_LONG, 0),
        source.asSlice(16).get(JAVA_BOOLEAN, 0),
        source.asSlice(17).get(JAVA_BOOLEAN, 0),
        source.asSlice(18).get(JAVA_BOOLEAN, 0),
        source.asSlice(19).get(JAVA_BOOLEAN, 0),
        new RuntimeEventFlag(source.asSlice(24).get(JAVA_LONG, 0)),
        source.asSlice(32).get(JAVA_LONG, 0),
        Codecs.readMapTileOptions(source.asSlice(40), scope),
        Codecs.readBoundOptions(source.asSlice(96), scope),
        Codecs.readFreeCameraOptions(source.asSlice(168), scope),
        Codecs.readMapView(source.asSlice(232), scope));
  }

  static MemorySegment writeMapSnapshot(Call call, MapSnapshot value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.MapSnapshot);
    target
        .asSlice(0)
        .set(JAVA_INT, 0, (int) org.maplibre.nativeffi.internal.c.Layouts.MapSnapshot.byteSize());
    target.asSlice(4).set(JAVA_INT, 0, value.debugOptions().rawValue());
    target.asSlice(8).set(JAVA_LONG, 0, value.generation());
    target.asSlice(16).set(JAVA_BOOLEAN, 0, value.fullyLoaded());
    target.asSlice(17).set(JAVA_BOOLEAN, 0, value.renderingStatsViewEnabled());
    target.asSlice(18).set(JAVA_BOOLEAN, 0, value.gestureInProgress());
    target.asSlice(19).set(JAVA_BOOLEAN, 0, value.transitionInProgress());
    target.asSlice(24).set(JAVA_LONG, 0, value.eventMask().rawValue());
    target.asSlice(32).set(JAVA_LONG, 0, value.latestRenderUpdateGeneration());
    MemorySegment.copy(
        Codecs.writeMapTileOptions(call, value.tile()),
        0,
        target.asSlice(40),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.MapTileOptions.byteSize());
    MemorySegment.copy(
        Codecs.writeBoundOptions(call, value.bounds()),
        0,
        target.asSlice(96),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BoundOptions.byteSize());
    MemorySegment.copy(
        Codecs.writeFreeCameraOptions(call, value.freeCamera()),
        0,
        target.asSlice(168),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.FreeCameraOptions.byteSize());
    MemorySegment.copy(
        Codecs.writeMapView(call, value.view()),
        0,
        target.asSlice(232),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.MapView.byteSize());
    return target;
  }

  static MapTileOptions readMapTileOptions(MemorySegment source, Scope scope) {
    return new MapTileOptions(
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_MAP_TILE_OPTION_PREFETCH_ZOOM_DELTA) == 0
            ? null
            : source.asSlice(8).get(JAVA_INT, 0)),
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_MAP_TILE_OPTION_LOD_MIN_RADIUS) == 0
            ? null
            : source.asSlice(16).get(JAVA_DOUBLE, 0)),
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_MAP_TILE_OPTION_LOD_SCALE) == 0
            ? null
            : source.asSlice(24).get(JAVA_DOUBLE, 0)),
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_MAP_TILE_OPTION_LOD_PITCH_THRESHOLD) == 0
            ? null
            : source.asSlice(32).get(JAVA_DOUBLE, 0)),
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_MAP_TILE_OPTION_LOD_ZOOM_SHIFT) == 0
            ? null
            : source.asSlice(40).get(JAVA_DOUBLE, 0)),
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_MAP_TILE_OPTION_LOD_MODE) == 0
            ? null
            : new TileLodMode(source.asSlice(48).get(JAVA_INT, 0))));
  }

  static MemorySegment writeMapTileOptions(Call call, MapTileOptions value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.MapTileOptions);
    target
        .asSlice(0)
        .set(
            JAVA_INT, 0, (int) org.maplibre.nativeffi.internal.c.Layouts.MapTileOptions.byteSize());
    int fields = 0;
    if (value.prefetchZoomDelta() != null) {
      fields |= C.MLN_MAP_TILE_OPTION_PREFETCH_ZOOM_DELTA;
      target.asSlice(8).set(JAVA_INT, 0, value.prefetchZoomDelta());
    }
    if (value.lodMinRadius() != null) {
      fields |= C.MLN_MAP_TILE_OPTION_LOD_MIN_RADIUS;
      target.asSlice(16).set(JAVA_DOUBLE, 0, value.lodMinRadius());
    }
    if (value.lodScale() != null) {
      fields |= C.MLN_MAP_TILE_OPTION_LOD_SCALE;
      target.asSlice(24).set(JAVA_DOUBLE, 0, value.lodScale());
    }
    if (value.lodPitchThreshold() != null) {
      fields |= C.MLN_MAP_TILE_OPTION_LOD_PITCH_THRESHOLD;
      target.asSlice(32).set(JAVA_DOUBLE, 0, value.lodPitchThreshold());
    }
    if (value.lodZoomShift() != null) {
      fields |= C.MLN_MAP_TILE_OPTION_LOD_ZOOM_SHIFT;
      target.asSlice(40).set(JAVA_DOUBLE, 0, value.lodZoomShift());
    }
    if (value.lodMode() != null) {
      fields |= C.MLN_MAP_TILE_OPTION_LOD_MODE;
      target.asSlice(48).set(JAVA_INT, 0, value.lodMode().rawValue());
    }
    target.asSlice(4).set(JAVA_INT, 0, fields);
    return target;
  }

  static BoundOptions readBoundOptions(MemorySegment source, Scope scope) {
    return new BoundOptions(
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_BOUND_OPTION_BOUNDS) == 0
            ? null
            : Codecs.readLatLngBounds(source.asSlice(8), scope)),
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_BOUND_OPTION_MIN_ZOOM) == 0
            ? null
            : source.asSlice(40).get(JAVA_DOUBLE, 0)),
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_BOUND_OPTION_MAX_ZOOM) == 0
            ? null
            : source.asSlice(48).get(JAVA_DOUBLE, 0)),
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_BOUND_OPTION_MIN_PITCH) == 0
            ? null
            : source.asSlice(56).get(JAVA_DOUBLE, 0)),
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_BOUND_OPTION_MAX_PITCH) == 0
            ? null
            : source.asSlice(64).get(JAVA_DOUBLE, 0)),
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_BOUND_OPTION_UNBOUNDED) != 0));
  }

  static MemorySegment writeBoundOptions(Call call, BoundOptions value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.BoundOptions);
    target
        .asSlice(0)
        .set(JAVA_INT, 0, (int) org.maplibre.nativeffi.internal.c.Layouts.BoundOptions.byteSize());
    int fields = 0;
    if (value.unbounded()) fields |= C.MLN_BOUND_OPTION_UNBOUNDED;
    if (value.bounds() != null) {
      fields |= C.MLN_BOUND_OPTION_BOUNDS;
      MemorySegment.copy(
          Codecs.writeLatLngBounds(call, value.bounds()),
          0,
          target.asSlice(8),
          0,
          org.maplibre.nativeffi.internal.c.Layouts.LatLngBounds.byteSize());
    }
    if (value.minZoom() != null) {
      fields |= C.MLN_BOUND_OPTION_MIN_ZOOM;
      target.asSlice(40).set(JAVA_DOUBLE, 0, value.minZoom());
    }
    if (value.maxZoom() != null) {
      fields |= C.MLN_BOUND_OPTION_MAX_ZOOM;
      target.asSlice(48).set(JAVA_DOUBLE, 0, value.maxZoom());
    }
    if (value.minPitch() != null) {
      fields |= C.MLN_BOUND_OPTION_MIN_PITCH;
      target.asSlice(56).set(JAVA_DOUBLE, 0, value.minPitch());
    }
    if (value.maxPitch() != null) {
      fields |= C.MLN_BOUND_OPTION_MAX_PITCH;
      target.asSlice(64).set(JAVA_DOUBLE, 0, value.maxPitch());
    }
    target.asSlice(4).set(JAVA_INT, 0, fields);
    return target;
  }

  static FreeCameraOptions readFreeCameraOptions(MemorySegment source, Scope scope) {
    return new FreeCameraOptions(
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_FREE_CAMERA_OPTION_POSITION) == 0
            ? null
            : Codecs.readVec3(source.asSlice(8), scope)),
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_FREE_CAMERA_OPTION_ORIENTATION) == 0
            ? null
            : Codecs.readQuaternion(source.asSlice(32), scope)));
  }

  static MemorySegment writeFreeCameraOptions(Call call, FreeCameraOptions value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.FreeCameraOptions);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.FreeCameraOptions.byteSize());
    int fields = 0;
    if (value.position() != null) {
      fields |= C.MLN_FREE_CAMERA_OPTION_POSITION;
      MemorySegment.copy(
          Codecs.writeVec3(call, value.position()),
          0,
          target.asSlice(8),
          0,
          org.maplibre.nativeffi.internal.c.Layouts.Vec3.byteSize());
    }
    if (value.orientation() != null) {
      fields |= C.MLN_FREE_CAMERA_OPTION_ORIENTATION;
      MemorySegment.copy(
          Codecs.writeQuaternion(call, value.orientation()),
          0,
          target.asSlice(32),
          0,
          org.maplibre.nativeffi.internal.c.Layouts.Quaternion.byteSize());
    }
    target.asSlice(4).set(JAVA_INT, 0, fields);
    return target;
  }

  static Vec3 readVec3(MemorySegment source, Scope scope) {
    return new Vec3(
        source.asSlice(0).get(JAVA_DOUBLE, 0),
        source.asSlice(8).get(JAVA_DOUBLE, 0),
        source.asSlice(16).get(JAVA_DOUBLE, 0));
  }

  static MemorySegment writeVec3(Call call, Vec3 value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.Vec3);
    target.asSlice(0).set(JAVA_DOUBLE, 0, value.x());
    target.asSlice(8).set(JAVA_DOUBLE, 0, value.y());
    target.asSlice(16).set(JAVA_DOUBLE, 0, value.z());
    return target;
  }

  static Quaternion readQuaternion(MemorySegment source, Scope scope) {
    return new Quaternion(
        source.asSlice(0).get(JAVA_DOUBLE, 0),
        source.asSlice(8).get(JAVA_DOUBLE, 0),
        source.asSlice(16).get(JAVA_DOUBLE, 0),
        source.asSlice(24).get(JAVA_DOUBLE, 0));
  }

  static MemorySegment writeQuaternion(Call call, Quaternion value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.Quaternion);
    target.asSlice(0).set(JAVA_DOUBLE, 0, value.x());
    target.asSlice(8).set(JAVA_DOUBLE, 0, value.y());
    target.asSlice(16).set(JAVA_DOUBLE, 0, value.z());
    target.asSlice(24).set(JAVA_DOUBLE, 0, value.w());
    return target;
  }

  static StyleImageInfo readStyleImageInfo(MemorySegment source, Scope scope) {
    return new StyleImageInfo(
        source.asSlice(0).get(JAVA_INT, 0),
        source.asSlice(4).get(JAVA_INT, 0),
        Memory.bytesView(source.asSlice(16)),
        Memory.array(
            source.asSlice(32).get(ADDRESS, 0),
            source.asSlice(40).get(JAVA_LONG, 0),
            org.maplibre.nativeffi.internal.c.Layouts.ImageStretch.byteSize(),
            org.maplibre.nativeffi.internal.c.Layouts.ImageStretch.byteSize(),
            item -> Codecs.readImageStretch(item, scope)),
        Memory.array(
            source.asSlice(48).get(ADDRESS, 0),
            source.asSlice(56).get(JAVA_LONG, 0),
            org.maplibre.nativeffi.internal.c.Layouts.ImageStretch.byteSize(),
            org.maplibre.nativeffi.internal.c.Layouts.ImageStretch.byteSize(),
            item -> Codecs.readImageStretch(item, scope)),
        ((source.asSlice(8).get(JAVA_INT, 0) & C.MLN_STYLE_IMAGE_INFO_CONTENT) == 0
            ? null
            : Codecs.readImageContent(source.asSlice(64), scope)),
        ((source.asSlice(8).get(JAVA_INT, 0) & C.MLN_STYLE_IMAGE_INFO_TEXT_FIT_WIDTH) == 0
            ? null
            : new StyleImageTextFit(source.asSlice(80).get(JAVA_INT, 0))),
        ((source.asSlice(8).get(JAVA_INT, 0) & C.MLN_STYLE_IMAGE_INFO_TEXT_FIT_HEIGHT) == 0
            ? null
            : new StyleImageTextFit(source.asSlice(84).get(JAVA_INT, 0))),
        source.asSlice(88).get(JAVA_FLOAT, 0),
        source.asSlice(92).get(JAVA_BOOLEAN, 0),
        source.asSlice(93).get(JAVA_BOOLEAN, 0));
  }

  static MemorySegment writeStyleImageInfo(Call call, StyleImageInfo value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.StyleImageInfo);
    int fields = 0;
    target.asSlice(0).set(JAVA_INT, 0, value.width());
    target.asSlice(4).set(JAVA_INT, 0, value.height());
    MemorySegment.copy(
        call.view(call.bytes(value.pixels())),
        0,
        target.asSlice(16),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    target
        .asSlice(32)
        .set(
            ADDRESS,
            0,
            call.array(
                value.stretchX(),
                org.maplibre.nativeffi.internal.c.Layouts.ImageStretch,
                (elementTarget, elementValue) -> {
                  MemorySegment.copy(
                      Codecs.writeImageStretch(call, elementValue),
                      0,
                      elementTarget,
                      0,
                      org.maplibre.nativeffi.internal.c.Layouts.ImageStretch.byteSize());
                }));
    target.asSlice(40).set(JAVA_LONG, 0, (long) Call.length(value.stretchX()));
    target
        .asSlice(48)
        .set(
            ADDRESS,
            0,
            call.array(
                value.stretchY(),
                org.maplibre.nativeffi.internal.c.Layouts.ImageStretch,
                (elementTarget, elementValue) -> {
                  MemorySegment.copy(
                      Codecs.writeImageStretch(call, elementValue),
                      0,
                      elementTarget,
                      0,
                      org.maplibre.nativeffi.internal.c.Layouts.ImageStretch.byteSize());
                }));
    target.asSlice(56).set(JAVA_LONG, 0, (long) Call.length(value.stretchY()));
    if (value.content() != null) {
      fields |= C.MLN_STYLE_IMAGE_INFO_CONTENT;
      MemorySegment.copy(
          Codecs.writeImageContent(call, value.content()),
          0,
          target.asSlice(64),
          0,
          org.maplibre.nativeffi.internal.c.Layouts.ImageContent.byteSize());
    }
    if (value.textFitWidth() != null) {
      fields |= C.MLN_STYLE_IMAGE_INFO_TEXT_FIT_WIDTH;
      target.asSlice(80).set(JAVA_INT, 0, value.textFitWidth().rawValue());
    }
    if (value.textFitHeight() != null) {
      fields |= C.MLN_STYLE_IMAGE_INFO_TEXT_FIT_HEIGHT;
      target.asSlice(84).set(JAVA_INT, 0, value.textFitHeight().rawValue());
    }
    target.asSlice(88).set(JAVA_FLOAT, 0, value.pixelRatio());
    target.asSlice(92).set(JAVA_BOOLEAN, 0, value.sdf());
    target.asSlice(93).set(JAVA_BOOLEAN, 0, value.keepUnused());
    target.asSlice(8).set(JAVA_INT, 0, fields);
    return target;
  }

  static ImageStretch readImageStretch(MemorySegment source, Scope scope) {
    return new ImageStretch(
        source.asSlice(0).get(JAVA_FLOAT, 0), source.asSlice(4).get(JAVA_FLOAT, 0));
  }

  static MemorySegment writeImageStretch(Call call, ImageStretch value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.ImageStretch);
    target.asSlice(0).set(JAVA_FLOAT, 0, value.from());
    target.asSlice(4).set(JAVA_FLOAT, 0, value.to());
    return target;
  }

  static ImageContent readImageContent(MemorySegment source, Scope scope) {
    return new ImageContent(
        source.asSlice(0).get(JAVA_FLOAT, 0),
        source.asSlice(4).get(JAVA_FLOAT, 0),
        source.asSlice(8).get(JAVA_FLOAT, 0),
        source.asSlice(12).get(JAVA_FLOAT, 0));
  }

  static MemorySegment writeImageContent(Call call, ImageContent value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.ImageContent);
    target.asSlice(0).set(JAVA_FLOAT, 0, value.left());
    target.asSlice(4).set(JAVA_FLOAT, 0, value.top());
    target.asSlice(8).set(JAVA_FLOAT, 0, value.right());
    target.asSlice(12).set(JAVA_FLOAT, 0, value.bottom());
    return target;
  }

  static StyleLayerInfo readStyleLayerInfo(MemorySegment source, Scope scope) {
    return new StyleLayerInfo(
        Memory.textView(source.asSlice(0)),
        Memory.textView(source.asSlice(16)),
        Memory.textView(source.asSlice(32)),
        Memory.textView(source.asSlice(48)),
        source.asSlice(64).get(JAVA_DOUBLE, 0),
        source.asSlice(72).get(JAVA_DOUBLE, 0),
        new StyleLayerVisibility(source.asSlice(80).get(JAVA_INT, 0)));
  }

  static MemorySegment writeStyleLayerInfo(Call call, StyleLayerInfo value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.StyleLayerInfo);
    MemorySegment.copy(
        call.view(call.text(value.id())),
        0,
        target.asSlice(0),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    MemorySegment.copy(
        call.view(call.text(value.type())),
        0,
        target.asSlice(16),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    MemorySegment.copy(
        call.view(call.text(value.sourceId())),
        0,
        target.asSlice(32),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    MemorySegment.copy(
        call.view(call.text(value.sourceLayer())),
        0,
        target.asSlice(48),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    target.asSlice(64).set(JAVA_DOUBLE, 0, value.minZoom());
    target.asSlice(72).set(JAVA_DOUBLE, 0, value.maxZoom());
    target.asSlice(80).set(JAVA_INT, 0, value.visibility().rawValue());
    return target;
  }

  static StyleSourceInfo readStyleSourceInfo(MemorySegment source, Scope scope) {
    return new StyleSourceInfo(
        Memory.textView(source.asSlice(0)),
        new StyleSourceType(source.asSlice(16).get(JAVA_INT, 0)),
        source.asSlice(24).get(JAVA_BOOLEAN, 0),
        Memory.textView(source.asSlice(32)),
        Memory.textView(source.asSlice(48)),
        ((source.asSlice(20).get(JAVA_INT, 0) & C.MLN_STYLE_SOURCE_INFO_TILE_JSON) == 0
            ? null
            : Codecs.readStyleSourceTileInfo(source.asSlice(64), scope)),
        ((source.asSlice(20).get(JAVA_INT, 0) & C.MLN_STYLE_SOURCE_INFO_BOUNDS) == 0
            ? null
            : Codecs.readLatLngBounds(source.asSlice(104), scope)),
        ((source.asSlice(20).get(JAVA_INT, 0) & C.MLN_STYLE_SOURCE_INFO_TILE_SIZE) == 0
            ? null
            : source.asSlice(136).get(JAVA_INT, 0)),
        ((source.asSlice(20).get(JAVA_INT, 0) & C.MLN_STYLE_SOURCE_INFO_VECTOR_ENCODING) == 0
            ? null
            : new StyleVectorTileEncoding(source.asSlice(140).get(JAVA_INT, 0))),
        ((source.asSlice(20).get(JAVA_INT, 0) & C.MLN_STYLE_SOURCE_INFO_RASTER_ENCODING) == 0
            ? null
            : new StyleRasterDemEncoding(source.asSlice(144).get(JAVA_INT, 0))));
  }

  static MemorySegment writeStyleSourceInfo(Call call, StyleSourceInfo value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.StyleSourceInfo);
    int fields = 0;
    MemorySegment.copy(
        call.view(call.text(value.id())),
        0,
        target.asSlice(0),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    target.asSlice(16).set(JAVA_INT, 0, value.type().rawValue());
    target.asSlice(24).set(JAVA_BOOLEAN, 0, value.isVolatile());
    MemorySegment.copy(
        call.view(call.text(value.attribution())),
        0,
        target.asSlice(32),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    MemorySegment.copy(
        call.view(call.text(value.url())),
        0,
        target.asSlice(48),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    if (value.tileJson() != null) {
      fields |= C.MLN_STYLE_SOURCE_INFO_TILE_JSON;
      MemorySegment.copy(
          Codecs.writeStyleSourceTileInfo(call, value.tileJson()),
          0,
          target.asSlice(64),
          0,
          org.maplibre.nativeffi.internal.c.Layouts.StyleSourceTileInfo.byteSize());
    }
    if (value.bounds() != null) {
      fields |= C.MLN_STYLE_SOURCE_INFO_BOUNDS;
      MemorySegment.copy(
          Codecs.writeLatLngBounds(call, value.bounds()),
          0,
          target.asSlice(104),
          0,
          org.maplibre.nativeffi.internal.c.Layouts.LatLngBounds.byteSize());
    }
    if (value.tileSize() != null) {
      fields |= C.MLN_STYLE_SOURCE_INFO_TILE_SIZE;
      target.asSlice(136).set(JAVA_INT, 0, value.tileSize());
    }
    if (value.vectorEncoding() != null) {
      fields |= C.MLN_STYLE_SOURCE_INFO_VECTOR_ENCODING;
      target.asSlice(140).set(JAVA_INT, 0, value.vectorEncoding().rawValue());
    }
    if (value.rasterEncoding() != null) {
      fields |= C.MLN_STYLE_SOURCE_INFO_RASTER_ENCODING;
      target.asSlice(144).set(JAVA_INT, 0, value.rasterEncoding().rawValue());
    }
    target.asSlice(20).set(JAVA_INT, 0, fields);
    return target;
  }

  static StyleSourceTileInfo readStyleSourceTileInfo(MemorySegment source, Scope scope) {
    return new StyleSourceTileInfo(
        Memory.array(
            source.asSlice(0).get(ADDRESS, 0),
            source.asSlice(8).get(JAVA_LONG, 0),
            org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize(),
            org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize(),
            item -> Memory.textView(item)),
        source.asSlice(16).get(JAVA_DOUBLE, 0),
        source.asSlice(24).get(JAVA_DOUBLE, 0),
        new StyleTileScheme(source.asSlice(32).get(JAVA_INT, 0)));
  }

  static MemorySegment writeStyleSourceTileInfo(Call call, StyleSourceTileInfo value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.StyleSourceTileInfo);
    target
        .asSlice(0)
        .set(
            ADDRESS,
            0,
            call.array(
                value.tileUrls(),
                org.maplibre.nativeffi.internal.c.Layouts.BufferView,
                (elementTarget, elementValue) -> {
                  MemorySegment.copy(
                      call.view(call.text(elementValue)),
                      0,
                      elementTarget,
                      0,
                      org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
                }));
    target.asSlice(8).set(JAVA_LONG, 0, (long) Call.length(value.tileUrls()));
    target.asSlice(16).set(JAVA_DOUBLE, 0, value.minZoom());
    target.asSlice(24).set(JAVA_DOUBLE, 0, value.maxZoom());
    target.asSlice(32).set(JAVA_INT, 0, value.scheme().rawValue());
    return target;
  }

  static StyleTransitionOptions readStyleTransitionOptions(MemorySegment source, Scope scope) {
    return new StyleTransitionOptions(
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_STYLE_TRANSITION_OPTION_DURATION) == 0
            ? null
            : source.asSlice(8).get(JAVA_DOUBLE, 0)),
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_STYLE_TRANSITION_OPTION_DELAY) == 0
            ? null
            : source.asSlice(16).get(JAVA_DOUBLE, 0)),
        ((source.asSlice(4).get(JAVA_INT, 0)
                    & C.MLN_STYLE_TRANSITION_OPTION_ENABLE_PLACEMENT_TRANSITIONS)
                == 0
            ? null
            : source.asSlice(24).get(JAVA_BOOLEAN, 0)));
  }

  static MemorySegment writeStyleTransitionOptions(Call call, StyleTransitionOptions value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.StyleTransitionOptions);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.StyleTransitionOptions.byteSize());
    int fields = 0;
    if (value.durationMs() != null) {
      fields |= C.MLN_STYLE_TRANSITION_OPTION_DURATION;
      target.asSlice(8).set(JAVA_DOUBLE, 0, value.durationMs());
    }
    if (value.delayMs() != null) {
      fields |= C.MLN_STYLE_TRANSITION_OPTION_DELAY;
      target.asSlice(16).set(JAVA_DOUBLE, 0, value.delayMs());
    }
    if (value.enablePlacementTransitions() != null) {
      fields |= C.MLN_STYLE_TRANSITION_OPTION_ENABLE_PLACEMENT_TRANSITIONS;
      target.asSlice(24).set(JAVA_BOOLEAN, 0, value.enablePlacementTransitions());
    }
    target.asSlice(4).set(JAVA_INT, 0, fields);
    return target;
  }

  static CanonicalTileId readCanonicalTileId(MemorySegment source, Scope scope) {
    return new CanonicalTileId(
        source.asSlice(0).get(JAVA_INT, 0),
        source.asSlice(4).get(JAVA_INT, 0),
        source.asSlice(8).get(JAVA_INT, 0));
  }

  static MemorySegment writeCanonicalTileId(Call call, CanonicalTileId value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.CanonicalTileId);
    target.asSlice(0).set(JAVA_INT, 0, value.z());
    target.asSlice(4).set(JAVA_INT, 0, value.x());
    target.asSlice(8).set(JAVA_INT, 0, value.y());
    return target;
  }

  static MemorySegment writeStyleImageOptions(Call call, StyleImageOptions value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.StyleImageOptions);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.StyleImageOptions.byteSize());
    int fields = 0;
    if (value.stretchX() != null) {
      fields |= C.MLN_STYLE_IMAGE_OPTION_STRETCH_X;
      target
          .asSlice(8)
          .set(
              ADDRESS,
              0,
              call.array(
                  value.stretchX(),
                  org.maplibre.nativeffi.internal.c.Layouts.ImageStretch,
                  (elementTarget, elementValue) -> {
                    MemorySegment.copy(
                        Codecs.writeImageStretch(call, elementValue),
                        0,
                        elementTarget,
                        0,
                        org.maplibre.nativeffi.internal.c.Layouts.ImageStretch.byteSize());
                  }));
      target.asSlice(16).set(JAVA_LONG, 0, (long) Call.length(value.stretchX()));
    }
    if (value.stretchY() != null) {
      fields |= C.MLN_STYLE_IMAGE_OPTION_STRETCH_Y;
      target
          .asSlice(24)
          .set(
              ADDRESS,
              0,
              call.array(
                  value.stretchY(),
                  org.maplibre.nativeffi.internal.c.Layouts.ImageStretch,
                  (elementTarget, elementValue) -> {
                    MemorySegment.copy(
                        Codecs.writeImageStretch(call, elementValue),
                        0,
                        elementTarget,
                        0,
                        org.maplibre.nativeffi.internal.c.Layouts.ImageStretch.byteSize());
                  }));
      target.asSlice(32).set(JAVA_LONG, 0, (long) Call.length(value.stretchY()));
    }
    if (value.content() != null) {
      fields |= C.MLN_STYLE_IMAGE_OPTION_CONTENT;
      MemorySegment.copy(
          Codecs.writeImageContent(call, value.content()),
          0,
          target.asSlice(40),
          0,
          org.maplibre.nativeffi.internal.c.Layouts.ImageContent.byteSize());
    }
    if (value.textFitWidth() != null) {
      fields |= C.MLN_STYLE_IMAGE_OPTION_TEXT_FIT_WIDTH;
      target.asSlice(56).set(JAVA_INT, 0, value.textFitWidth().rawValue());
    }
    if (value.textFitHeight() != null) {
      fields |= C.MLN_STYLE_IMAGE_OPTION_TEXT_FIT_HEIGHT;
      target.asSlice(60).set(JAVA_INT, 0, value.textFitHeight().rawValue());
    }
    if (value.pixelRatio() != null) {
      fields |= C.MLN_STYLE_IMAGE_OPTION_PIXEL_RATIO;
      target.asSlice(64).set(JAVA_FLOAT, 0, value.pixelRatio());
    }
    if (value.sdf() != null) {
      fields |= C.MLN_STYLE_IMAGE_OPTION_SDF;
      target.asSlice(68).set(JAVA_BOOLEAN, 0, value.sdf());
    }
    if (value.keepUnused() != null) {
      fields |= C.MLN_STYLE_IMAGE_OPTION_KEEP_UNUSED;
      target.asSlice(69).set(JAVA_BOOLEAN, 0, value.keepUnused());
    }
    target.asSlice(4).set(JAVA_INT, 0, fields);
    return target;
  }

  static MemorySegment writeCameraUpdate(Call call, CameraUpdate value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.CameraUpdate);
    target
        .asSlice(0)
        .set(JAVA_INT, 0, (int) org.maplibre.nativeffi.internal.c.Layouts.CameraUpdate.byteSize());
    target.asSlice(4).set(JAVA_INT, 0, value.mode().rawValue());
    MemorySegment.copy(
        Codecs.writeCameraOptions(call, value.camera()),
        0,
        target.asSlice(8),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.CameraOptions.byteSize());
    MemorySegment.copy(
        Codecs.writeAnimationOptions(call, value.animation()),
        0,
        target.asSlice(128),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.AnimationOptions.byteSize());
    target.asSlice(232).set(JAVA_INT, 0, value.gesturePhase().rawValue());
    return target;
  }

  static RenderAbandonResult readRenderAbandonResult(MemorySegment source, Scope scope) {
    return new RenderAbandonResult(
        new RenderAbandonDisposition(source.asSlice(4).get(JAVA_INT, 0)),
        source.asSlice(8).get(JAVA_INT, 0));
  }

  static MemorySegment writeRenderAbandonResult(Call call, RenderAbandonResult value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.RenderAbandonResult);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.RenderAbandonResult.byteSize());
    target.asSlice(4).set(JAVA_INT, 0, value.disposition().rawValue());
    target.asSlice(8).set(JAVA_INT, 0, value.quarantinedResourceCount());
    return target;
  }

  static java.util.List<RenderFrameResult> readRenderFrameBatchView(
      MemorySegment source, Scope scope) {
    return Memory.array(
        source.asSlice(8).get(ADDRESS, 0),
        source.asSlice(16).get(JAVA_LONG, 0),
        Integer.toUnsignedLong(source.asSlice(4).get(JAVA_INT, 0)),
        org.maplibre.nativeffi.internal.c.Layouts.RenderFrameResult.byteSize(),
        item -> Codecs.readRenderFrameResult(item, scope));
  }

  static RenderSessionCapabilities readRenderSessionCapabilities(
      MemorySegment source, Scope scope) {
    return new RenderSessionCapabilities(
        new RenderDriverKind(source.asSlice(4).get(JAVA_INT, 0)),
        source.asSlice(8).get(JAVA_INT, 0),
        new RenderSessionCapabilityFlag(source.asSlice(12).get(JAVA_INT, 0)));
  }

  static MemorySegment writeRenderSessionCapabilities(Call call, RenderSessionCapabilities value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.RenderSessionCapabilities);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.RenderSessionCapabilities.byteSize());
    target.asSlice(4).set(JAVA_INT, 0, value.driver().rawValue());
    target.asSlice(8).set(JAVA_INT, 0, value.textureRingDepth());
    target.asSlice(12).set(JAVA_INT, 0, value.flags().rawValue());
    return target;
  }

  static RenderSessionSnapshot readRenderSessionSnapshot(MemorySegment source, Scope scope) {
    return new RenderSessionSnapshot(
        new RenderSessionState(source.asSlice(4).get(JAVA_INT, 0)),
        Codecs.readLogicalExtent(source.asSlice(8), scope),
        source.asSlice(24).get(JAVA_LONG, 0),
        source.asSlice(32).get(JAVA_LONG, 0),
        source.asSlice(40).get(JAVA_LONG, 0),
        source.asSlice(48).get(JAVA_LONG, 0),
        source.asSlice(56).get(JAVA_INT, 0));
  }

  static MemorySegment writeRenderSessionSnapshot(Call call, RenderSessionSnapshot value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.RenderSessionSnapshot);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.RenderSessionSnapshot.byteSize());
    target.asSlice(4).set(JAVA_INT, 0, value.state().rawValue());
    MemorySegment.copy(
        Codecs.writeLogicalExtent(call, value.extent()),
        0,
        target.asSlice(8),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.LogicalExtent.byteSize());
    target.asSlice(24).set(JAVA_LONG, 0, value.generation());
    target.asSlice(32).set(JAVA_LONG, 0, value.mapUpdateGeneration());
    target.asSlice(40).set(JAVA_LONG, 0, value.renderedUpdateGeneration());
    target.asSlice(48).set(JAVA_LONG, 0, value.frameGeneration());
    target.asSlice(56).set(JAVA_INT, 0, value.acquiredFrameCount());
    return target;
  }

  static MemorySegment writeRenderedQueryGeometry(Call call, RenderedQueryGeometry value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.RenderedQueryGeometry);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.RenderedQueryGeometry.byteSize());
    switch (value.data()) {
      case RenderedQueryGeometryData.Point arm -> {
        target.asSlice(4).set(JAVA_INT, 0, C.MLN_RENDERED_QUERY_GEOMETRY_TYPE_POINT);
        MemorySegment.copy(
            Codecs.writeScreenPoint(call, arm.value()),
            0,
            target.asSlice(8),
            0,
            org.maplibre.nativeffi.internal.c.Layouts.ScreenPoint.byteSize());
      }
      case RenderedQueryGeometryData.Box arm -> {
        target.asSlice(4).set(JAVA_INT, 0, C.MLN_RENDERED_QUERY_GEOMETRY_TYPE_BOX);
        MemorySegment.copy(
            Codecs.writeScreenBox(call, arm.value()),
            0,
            target.asSlice(8),
            0,
            org.maplibre.nativeffi.internal.c.Layouts.ScreenBox.byteSize());
      }
      case RenderedQueryGeometryData.LineString arm -> {
        target.asSlice(4).set(JAVA_INT, 0, C.MLN_RENDERED_QUERY_GEOMETRY_TYPE_LINE_STRING);
        MemorySegment.copy(
            Codecs.writeScreenLineString(call, arm.value()),
            0,
            target.asSlice(8),
            0,
            org.maplibre.nativeffi.internal.c.Layouts.ScreenLineString.byteSize());
      }
      case RenderedQueryGeometryData.Unknown arm -> {
        target.asSlice(4).set(JAVA_INT, 0, arm.rawTag());
        MemorySegment.copy(
            arm.bytes(),
            0,
            target.asSlice(8),
            JAVA_BYTE,
            0,
            Math.toIntExact(
                org.maplibre.nativeffi.internal.c.Layouts.RenderedQueryGeometryData.byteSize()));
      }
    }
    return target;
  }

  static MemorySegment writeScreenBox(Call call, ScreenBox value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.ScreenBox);
    MemorySegment.copy(
        Codecs.writeScreenPoint(call, value.min()),
        0,
        target.asSlice(0),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.ScreenPoint.byteSize());
    MemorySegment.copy(
        Codecs.writeScreenPoint(call, value.max()),
        0,
        target.asSlice(16),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.ScreenPoint.byteSize());
    return target;
  }

  static MemorySegment writeScreenLineString(Call call, ScreenLineString value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.ScreenLineString);
    target
        .asSlice(0)
        .set(
            ADDRESS,
            0,
            call.array(
                value.points(),
                org.maplibre.nativeffi.internal.c.Layouts.ScreenPoint,
                (elementTarget, elementValue) -> {
                  MemorySegment.copy(
                      Codecs.writeScreenPoint(call, elementValue),
                      0,
                      elementTarget,
                      0,
                      org.maplibre.nativeffi.internal.c.Layouts.ScreenPoint.byteSize());
                }));
    target.asSlice(8).set(JAVA_LONG, 0, (long) Call.length(value.points()));
    return target;
  }

  static MemorySegment writeRenderedFeatureQueryOptions(
      Call call, RenderedFeatureQueryOptions value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.RenderedFeatureQueryOptions);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.RenderedFeatureQueryOptions.byteSize());
    int fields = 0;
    if (value.layerIds() != null) {
      fields |= C.MLN_RENDERED_FEATURE_QUERY_OPTION_LAYER_IDS;
      target
          .asSlice(8)
          .set(
              ADDRESS,
              0,
              call.array(
                  value.layerIds(),
                  org.maplibre.nativeffi.internal.c.Layouts.BufferView,
                  (elementTarget, elementValue) -> {
                    MemorySegment.copy(
                        call.view(call.text(elementValue)),
                        0,
                        elementTarget,
                        0,
                        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
                  }));
      target.asSlice(16).set(JAVA_LONG, 0, (long) Call.length(value.layerIds()));
    }
    MemorySegment.copy(
        call.view(call.text(value.filter())),
        0,
        target.asSlice(24),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    target.asSlice(4).set(JAVA_INT, 0, fields);
    return target;
  }

  static RenderedFeature readRenderedFeature(MemorySegment source, Scope scope) {
    return new RenderedFeature(
        Memory.textView(source.asSlice(0)),
        Memory.textView(source.asSlice(16)),
        Memory.textView(source.asSlice(32)),
        Memory.textView(source.asSlice(48)),
        Memory.textView(source.asSlice(64)));
  }

  static MemorySegment writeRenderedFeature(Call call, RenderedFeature value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.RenderedFeature);
    MemorySegment.copy(
        call.view(call.text(value.feature())),
        0,
        target.asSlice(0),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    MemorySegment.copy(
        call.view(call.text(value.layerId())),
        0,
        target.asSlice(16),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    MemorySegment.copy(
        call.view(call.text(value.sourceId())),
        0,
        target.asSlice(32),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    MemorySegment.copy(
        call.view(call.text(value.sourceLayerId())),
        0,
        target.asSlice(48),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    MemorySegment.copy(
        call.view(call.text(value.state())),
        0,
        target.asSlice(64),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    return target;
  }

  static MemorySegment writeSourceFeatureQueryOptions(Call call, SourceFeatureQueryOptions value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.SourceFeatureQueryOptions);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.SourceFeatureQueryOptions.byteSize());
    int fields = 0;
    if (value.sourceLayerIds() != null) {
      fields |= C.MLN_SOURCE_FEATURE_QUERY_OPTION_SOURCE_LAYER_IDS;
      target
          .asSlice(8)
          .set(
              ADDRESS,
              0,
              call.array(
                  value.sourceLayerIds(),
                  org.maplibre.nativeffi.internal.c.Layouts.BufferView,
                  (elementTarget, elementValue) -> {
                    MemorySegment.copy(
                        call.view(call.text(elementValue)),
                        0,
                        elementTarget,
                        0,
                        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
                  }));
      target.asSlice(16).set(JAVA_LONG, 0, (long) Call.length(value.sourceLayerIds()));
    }
    MemorySegment.copy(
        call.view(call.text(value.filter())),
        0,
        target.asSlice(24),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    target.asSlice(4).set(JAVA_INT, 0, fields);
    return target;
  }

  static SourceFeature readSourceFeature(MemorySegment source, Scope scope) {
    return new SourceFeature(
        Memory.textView(source.asSlice(0)), Memory.textView(source.asSlice(16)));
  }

  static MemorySegment writeSourceFeature(Call call, SourceFeature value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.SourceFeature);
    MemorySegment.copy(
        call.view(call.text(value.feature())),
        0,
        target.asSlice(0),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    MemorySegment.copy(
        call.view(call.text(value.sourceLayerId())),
        0,
        target.asSlice(16),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    return target;
  }

  static TextureReadbackResult readTextureReadbackResult(MemorySegment source, Scope scope) {
    return new TextureReadbackResult(
        Memory.bytesView(source.asSlice(0)),
        Codecs.readTextureImageInfo(source.asSlice(16), scope));
  }

  static MemorySegment writeTextureReadbackResult(Call call, TextureReadbackResult value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.TextureReadbackResult);
    MemorySegment.copy(
        call.view(call.bytes(value.data())),
        0,
        target.asSlice(0),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    MemorySegment.copy(
        Codecs.writeTextureImageInfo(call, value.info()),
        0,
        target.asSlice(16),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.TextureImageInfo.byteSize());
    return target;
  }

  static TextureImageInfo readTextureImageInfo(MemorySegment source, Scope scope) {
    return new TextureImageInfo(
        source.asSlice(0).get(JAVA_INT, 0),
        source.asSlice(4).get(JAVA_INT, 0),
        source.asSlice(8).get(JAVA_INT, 0),
        source.asSlice(16).get(JAVA_LONG, 0));
  }

  static MemorySegment writeTextureImageInfo(Call call, TextureImageInfo value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.TextureImageInfo);
    target.asSlice(0).set(JAVA_INT, 0, value.width());
    target.asSlice(4).set(JAVA_INT, 0, value.height());
    target.asSlice(8).set(JAVA_INT, 0, value.stride());
    target.asSlice(16).set(JAVA_LONG, 0, value.byteLength());
    return target;
  }

  static MemorySegment writeFrameDemand(Call call, FrameDemand value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.FrameDemand);
    target
        .asSlice(0)
        .set(JAVA_INT, 0, (int) org.maplibre.nativeffi.internal.c.Layouts.FrameDemand.byteSize());
    target.asSlice(4).set(JAVA_INT, 0, value.flags().rawValue());
    target.asSlice(8).set(JAVA_LONG, 0, value.token());
    return target;
  }

  static MemorySegment writeResourceResponse(Call call, ResourceResponse value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.ResourceResponse);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.ResourceResponse.byteSize());
    int fields = 0;
    target.asSlice(8).set(JAVA_INT, 0, value.status().rawValue());
    target.asSlice(12).set(JAVA_INT, 0, value.errorReason().rawValue());
    target.asSlice(16).set(ADDRESS, 0, call.bytes(value.bytes()));
    target.asSlice(24).set(JAVA_LONG, 0, (long) Call.length(value.bytes()));
    MemorySegment.copy(
        call.view(call.text(value.errorMessage())),
        0,
        target.asSlice(32),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    target.asSlice(48).set(JAVA_BOOLEAN, 0, value.mustRevalidate());
    if (value.modifiedUnixMs() != null) {
      fields |= C.MLN_RESOURCE_RESPONSE_MODIFIED;
      target.asSlice(56).set(JAVA_LONG, 0, value.modifiedUnixMs());
    }
    if (value.expiresUnixMs() != null) {
      fields |= C.MLN_RESOURCE_RESPONSE_EXPIRES;
      target.asSlice(64).set(JAVA_LONG, 0, value.expiresUnixMs());
    }
    MemorySegment.copy(
        call.view(call.text(value.etag())),
        0,
        target.asSlice(72),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    if (value.retryAfterUnixMs() != null) {
      fields |= C.MLN_RESOURCE_RESPONSE_RETRY_AFTER;
      target.asSlice(88).set(JAVA_LONG, 0, value.retryAfterUnixMs());
    }
    target.asSlice(4).set(JAVA_INT, 0, fields);
    return target;
  }

  static MemorySegment writeResourceRequestCancelHandler(
      Call call, ResourceRequestCancelHandler value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.ResourceRequestCancelHandler);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int)
                org.maplibre.nativeffi.internal.c.Layouts.ResourceRequestCancelHandler.byteSize());
    if (value.nativeRegistration() != null) {
      var registration = call.nativeRegistration(value.nativeRegistration());
      target.asSlice(16).set(ADDRESS, 0, registration.userData());
      target.asSlice(24).set(ADDRESS, 0, registration.releaseUserData());
      target.asSlice(8).set(ADDRESS, 0, registration.callback(0));
    } else if (value.callback() != null) {
      long token = call.register(value);
      target.asSlice(16).set(ADDRESS, 0, MemorySegment.ofAddress(token));
      target.asSlice(24).set(ADDRESS, 0, Roots.RELEASE);
      if (value.callback() != null)
        target.asSlice(8).set(ADDRESS, 0, Upcalls.ResourceRequestCancelHandler_callback);
    }
    return target;
  }

  static MemorySegment writeRuntimeOptions(Call call, RuntimeOptions value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.RuntimeOptions);
    target
        .asSlice(0)
        .set(
            JAVA_INT, 0, (int) org.maplibre.nativeffi.internal.c.Layouts.RuntimeOptions.byteSize());
    MemorySegment.copy(
        call.view(call.text(value.assetPath())),
        0,
        target.asSlice(8),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    MemorySegment.copy(
        call.view(call.text(value.cachePath())),
        0,
        target.asSlice(24),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    return target;
  }

  static MemorySegment writeMapOptions(Call call, MapOptions value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.MapOptions);
    target
        .asSlice(0)
        .set(JAVA_INT, 0, (int) org.maplibre.nativeffi.internal.c.Layouts.MapOptions.byteSize());
    int fields = 0;
    MemorySegment.copy(
        Codecs.writeLogicalExtent(call, value.initialExtent()),
        0,
        target.asSlice(8),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.LogicalExtent.byteSize());
    target.asSlice(24).set(JAVA_INT, 0, value.mapMode().rawValue());
    target.asSlice(28).set(JAVA_BOOLEAN, 0, value.fastPforEnabled());
    if (value.eventMask() != null) {
      fields |= C.MLN_MAP_OPTION_EVENT_MASK;
      target.asSlice(32).set(JAVA_LONG, 0, value.eventMask().rawValue());
    }
    target.asSlice(4).set(JAVA_INT, 0, fields);
    return target;
  }

  static OfflineRegionDefinition readOfflineRegionDefinition(MemorySegment source, Scope scope) {
    return new OfflineRegionDefinition(
        (switch (source.asSlice(4).get(JAVA_INT, 0)) {
          case C.MLN_OFFLINE_REGION_DEFINITION_TILE_PYRAMID ->
              new OfflineRegionDefinitionData.TilePyramid(
                  Codecs.readOfflineTilePyramidRegionDefinition(source.asSlice(8), scope));
          case C.MLN_OFFLINE_REGION_DEFINITION_GEOMETRY ->
              new OfflineRegionDefinitionData.Geometry(
                  Codecs.readOfflineGeometryRegionDefinition(source.asSlice(8), scope));
          default ->
              new OfflineRegionDefinitionData.Unknown(
                  source.asSlice(4).get(JAVA_INT, 0),
                  source
                      .asSlice(8)
                      .asSlice(
                          0,
                          org.maplibre.nativeffi.internal.c.Layouts.OfflineRegionDefinitionData
                              .byteSize())
                      .toArray(JAVA_BYTE));
        }));
  }

  static MemorySegment writeOfflineRegionDefinition(Call call, OfflineRegionDefinition value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.OfflineRegionDefinition);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.OfflineRegionDefinition.byteSize());
    switch (value.data()) {
      case OfflineRegionDefinitionData.TilePyramid arm -> {
        target.asSlice(4).set(JAVA_INT, 0, C.MLN_OFFLINE_REGION_DEFINITION_TILE_PYRAMID);
        MemorySegment.copy(
            Codecs.writeOfflineTilePyramidRegionDefinition(call, arm.value()),
            0,
            target.asSlice(8),
            0,
            org.maplibre.nativeffi.internal.c.Layouts.OfflineTilePyramidRegionDefinition
                .byteSize());
      }
      case OfflineRegionDefinitionData.Geometry arm -> {
        target.asSlice(4).set(JAVA_INT, 0, C.MLN_OFFLINE_REGION_DEFINITION_GEOMETRY);
        MemorySegment.copy(
            Codecs.writeOfflineGeometryRegionDefinition(call, arm.value()),
            0,
            target.asSlice(8),
            0,
            org.maplibre.nativeffi.internal.c.Layouts.OfflineGeometryRegionDefinition.byteSize());
      }
      case OfflineRegionDefinitionData.Unknown arm -> {
        target.asSlice(4).set(JAVA_INT, 0, arm.rawTag());
        MemorySegment.copy(
            arm.bytes(),
            0,
            target.asSlice(8),
            JAVA_BYTE,
            0,
            Math.toIntExact(
                org.maplibre.nativeffi.internal.c.Layouts.OfflineRegionDefinitionData.byteSize()));
      }
    }
    return target;
  }

  static OfflineTilePyramidRegionDefinition readOfflineTilePyramidRegionDefinition(
      MemorySegment source, Scope scope) {
    return new OfflineTilePyramidRegionDefinition(
        Memory.textView(source.asSlice(0)),
        Codecs.readLatLngBounds(source.asSlice(16), scope),
        source.asSlice(48).get(JAVA_DOUBLE, 0),
        source.asSlice(56).get(JAVA_DOUBLE, 0),
        source.asSlice(64).get(JAVA_FLOAT, 0),
        source.asSlice(68).get(JAVA_BOOLEAN, 0));
  }

  static MemorySegment writeOfflineTilePyramidRegionDefinition(
      Call call, OfflineTilePyramidRegionDefinition value) {
    var target =
        call.arena.allocate(
            org.maplibre.nativeffi.internal.c.Layouts.OfflineTilePyramidRegionDefinition);
    MemorySegment.copy(
        call.view(call.text(value.styleUrl())),
        0,
        target.asSlice(0),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    MemorySegment.copy(
        Codecs.writeLatLngBounds(call, value.bounds()),
        0,
        target.asSlice(16),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.LatLngBounds.byteSize());
    target.asSlice(48).set(JAVA_DOUBLE, 0, value.minZoom());
    target.asSlice(56).set(JAVA_DOUBLE, 0, value.maxZoom());
    target.asSlice(64).set(JAVA_FLOAT, 0, value.pixelRatio());
    target.asSlice(68).set(JAVA_BOOLEAN, 0, value.includeIdeographs());
    return target;
  }

  static OfflineGeometryRegionDefinition readOfflineGeometryRegionDefinition(
      MemorySegment source, Scope scope) {
    return new OfflineGeometryRegionDefinition(
        Memory.textView(source.asSlice(0)),
        Memory.textView(source.asSlice(16)),
        source.asSlice(32).get(JAVA_DOUBLE, 0),
        source.asSlice(40).get(JAVA_DOUBLE, 0),
        source.asSlice(48).get(JAVA_FLOAT, 0),
        source.asSlice(52).get(JAVA_BOOLEAN, 0));
  }

  static MemorySegment writeOfflineGeometryRegionDefinition(
      Call call, OfflineGeometryRegionDefinition value) {
    var target =
        call.arena.allocate(
            org.maplibre.nativeffi.internal.c.Layouts.OfflineGeometryRegionDefinition);
    MemorySegment.copy(
        call.view(call.text(value.styleUrl())),
        0,
        target.asSlice(0),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    MemorySegment.copy(
        call.view(call.text(value.geometry())),
        0,
        target.asSlice(16),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    target.asSlice(32).set(JAVA_DOUBLE, 0, value.minZoom());
    target.asSlice(40).set(JAVA_DOUBLE, 0, value.maxZoom());
    target.asSlice(48).set(JAVA_FLOAT, 0, value.pixelRatio());
    target.asSlice(52).set(JAVA_BOOLEAN, 0, value.includeIdeographs());
    return target;
  }

  static OfflineRegionInfo readOfflineRegionInfo(MemorySegment source, Scope scope) {
    return new OfflineRegionInfo(
        source.asSlice(0).get(JAVA_LONG, 0),
        Codecs.readOfflineRegionDefinition(source.asSlice(8), scope),
        Memory.bytes(source.asSlice(88).get(ADDRESS, 0), source.asSlice(96).get(JAVA_LONG, 0)));
  }

  static MemorySegment writeOfflineRegionInfo(Call call, OfflineRegionInfo value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.OfflineRegionInfo);
    target.asSlice(0).set(JAVA_LONG, 0, value.id());
    MemorySegment.copy(
        Codecs.writeOfflineRegionDefinition(call, value.definition()),
        0,
        target.asSlice(8),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.OfflineRegionDefinition.byteSize());
    target.asSlice(88).set(ADDRESS, 0, call.bytes(value.metadata()));
    target.asSlice(96).set(JAVA_LONG, 0, (long) Call.length(value.metadata()));
    return target;
  }

  static OfflineRegionStatus readOfflineRegionStatus(MemorySegment source, Scope scope) {
    return new OfflineRegionStatus(
        new OfflineRegionDownloadState(source.asSlice(0).get(JAVA_INT, 0)),
        source.asSlice(8).get(JAVA_LONG, 0),
        source.asSlice(16).get(JAVA_LONG, 0),
        source.asSlice(24).get(JAVA_LONG, 0),
        source.asSlice(32).get(JAVA_LONG, 0),
        source.asSlice(40).get(JAVA_LONG, 0),
        source.asSlice(48).get(JAVA_LONG, 0),
        source.asSlice(56).get(JAVA_BOOLEAN, 0),
        source.asSlice(57).get(JAVA_BOOLEAN, 0));
  }

  static MemorySegment writeOfflineRegionStatus(Call call, OfflineRegionStatus value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.OfflineRegionStatus);
    target.asSlice(0).set(JAVA_INT, 0, value.downloadState().rawValue());
    target.asSlice(8).set(JAVA_LONG, 0, value.completedResourceCount());
    target.asSlice(16).set(JAVA_LONG, 0, value.completedResourceSize());
    target.asSlice(24).set(JAVA_LONG, 0, value.completedTileCount());
    target.asSlice(32).set(JAVA_LONG, 0, value.requiredTileCount());
    target.asSlice(40).set(JAVA_LONG, 0, value.completedTileSize());
    target.asSlice(48).set(JAVA_LONG, 0, value.requiredResourceCount());
    target.asSlice(56).set(JAVA_BOOLEAN, 0, value.requiredResourceCountIsPrecise());
    target.asSlice(57).set(JAVA_BOOLEAN, 0, value.complete());
    return target;
  }

  static MemorySegment writeRuntimeEventHandler(Call call, RuntimeEventHandler value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.RuntimeEventHandler);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.RuntimeEventHandler.byteSize());
    if (value.nativeRegistration() != null) {
      var registration = call.nativeRegistration(value.nativeRegistration());
      target.asSlice(16).set(ADDRESS, 0, registration.userData());
      target.asSlice(24).set(ADDRESS, 0, registration.releaseUserData());
      target.asSlice(8).set(ADDRESS, 0, registration.callback(0));
    } else if (value.callback() != null) {
      long token = call.register(value);
      target.asSlice(16).set(ADDRESS, 0, MemorySegment.ofAddress(token));
      target.asSlice(24).set(ADDRESS, 0, Roots.RELEASE);
      if (value.callback() != null)
        target.asSlice(8).set(ADDRESS, 0, Upcalls.RuntimeEventHandler_callback);
    }
    return target;
  }

  static MemorySegment writeHttpHeaderTransform(Call call, HttpHeaderTransform value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.HttpHeaderTransform);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.HttpHeaderTransform.byteSize());
    if (value.nativeRegistration() != null) {
      var registration = call.nativeRegistration(value.nativeRegistration());
      target.asSlice(16).set(ADDRESS, 0, registration.userData());
      target.asSlice(24).set(ADDRESS, 0, registration.releaseUserData());
      target.asSlice(8).set(ADDRESS, 0, registration.callback(0));
    } else if (value.callback() != null) {
      long token = call.register(value);
      target.asSlice(16).set(ADDRESS, 0, MemorySegment.ofAddress(token));
      target.asSlice(24).set(ADDRESS, 0, Roots.RELEASE);
      if (value.callback() != null)
        target.asSlice(8).set(ADDRESS, 0, Upcalls.HttpHeaderTransform_callback);
    }
    target
        .asSlice(32)
        .set(
            ADDRESS,
            0,
            call.array(
                value.rules(),
                org.maplibre.nativeffi.internal.c.Layouts.HttpHeaderRule,
                (elementTarget, elementValue) -> {
                  MemorySegment.copy(
                      Codecs.writeHttpHeaderRule(call, elementValue),
                      0,
                      elementTarget,
                      0,
                      org.maplibre.nativeffi.internal.c.Layouts.HttpHeaderRule.byteSize());
                }));
    target.asSlice(40).set(JAVA_LONG, 0, (long) Call.length(value.rules()));
    return target;
  }

  static MemorySegment writeHttpHeaderRule(Call call, HttpHeaderRule value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.HttpHeaderRule);
    target
        .asSlice(0)
        .set(
            JAVA_INT, 0, (int) org.maplibre.nativeffi.internal.c.Layouts.HttpHeaderRule.byteSize());
    target.asSlice(4).set(JAVA_INT, 0, value.kinds().rawValue());
    target.asSlice(8).set(JAVA_INT, 0, value.flags().rawValue());
    MemorySegment.copy(
        call.view(call.text(value.url())),
        0,
        target.asSlice(16),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    target
        .asSlice(32)
        .set(
            ADDRESS,
            0,
            call.array(
                value.headers(),
                org.maplibre.nativeffi.internal.c.Layouts.HttpHeader,
                (elementTarget, elementValue) -> {
                  MemorySegment.copy(
                      Codecs.writeHttpHeader(call, elementValue),
                      0,
                      elementTarget,
                      0,
                      org.maplibre.nativeffi.internal.c.Layouts.HttpHeader.byteSize());
                }));
    target.asSlice(40).set(JAVA_LONG, 0, (long) Call.length(value.headers()));
    return target;
  }

  static MemorySegment writeHttpHeader(Call call, HttpHeader value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.HttpHeader);
    MemorySegment.copy(
        call.view(call.text(value.name())),
        0,
        target.asSlice(0),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    MemorySegment.copy(
        call.view(call.text(value.value())),
        0,
        target.asSlice(16),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    return target;
  }

  static MemorySegment writeResourceProvider(Call call, ResourceProvider value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.ResourceProvider);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.ResourceProvider.byteSize());
    if (value.nativeRegistration() != null) {
      var registration = call.nativeRegistration(value.nativeRegistration());
      target.asSlice(16).set(ADDRESS, 0, registration.userData());
      target.asSlice(24).set(ADDRESS, 0, registration.releaseUserData());
      target.asSlice(8).set(ADDRESS, 0, registration.callback(0));
    } else if (value.callback() != null) {
      long token = call.register(value);
      target.asSlice(16).set(ADDRESS, 0, MemorySegment.ofAddress(token));
      target.asSlice(24).set(ADDRESS, 0, Roots.RELEASE);
      if (value.callback() != null)
        target.asSlice(8).set(ADDRESS, 0, Upcalls.ResourceProvider_callback);
    }
    target
        .asSlice(40)
        .set(
            ADDRESS,
            0,
            call.array(
                value.routes(),
                org.maplibre.nativeffi.internal.c.Layouts.ResourceRoute,
                (elementTarget, elementValue) -> {
                  MemorySegment.copy(
                      Codecs.writeResourceRoute(call, elementValue),
                      0,
                      elementTarget,
                      0,
                      org.maplibre.nativeffi.internal.c.Layouts.ResourceRoute.byteSize());
                }));
    target.asSlice(48).set(JAVA_LONG, 0, (long) Call.length(value.routes()));
    return target;
  }

  static MemorySegment writeResourceRoute(Call call, ResourceRoute value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.ResourceRoute);
    target
        .asSlice(0)
        .set(JAVA_INT, 0, (int) org.maplibre.nativeffi.internal.c.Layouts.ResourceRoute.byteSize());
    target.asSlice(4).set(JAVA_INT, 0, value.kinds().rawValue());
    target.asSlice(8).set(JAVA_INT, 0, value.flags().rawValue());
    MemorySegment.copy(
        call.view(call.text(value.url())),
        0,
        target.asSlice(16),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    return target;
  }

  static MemorySegment writeResourceTransform(Call call, ResourceTransform value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.ResourceTransform);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.ResourceTransform.byteSize());
    if (value.nativeRegistration() != null) {
      var registration = call.nativeRegistration(value.nativeRegistration());
      target.asSlice(16).set(ADDRESS, 0, registration.userData());
      target.asSlice(24).set(ADDRESS, 0, registration.releaseUserData());
      target.asSlice(8).set(ADDRESS, 0, registration.callback(0));
    } else if (value.callback() != null) {
      long token = call.register(value);
      target.asSlice(16).set(ADDRESS, 0, MemorySegment.ofAddress(token));
      target.asSlice(24).set(ADDRESS, 0, Roots.RELEASE);
      if (value.callback() != null)
        target.asSlice(8).set(ADDRESS, 0, Upcalls.ResourceTransform_callback);
    }
    return target;
  }

  static MemorySegment writeStyleExpressionOptions(Call call, StyleExpressionOptions value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.StyleExpressionOptions);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.StyleExpressionOptions.byteSize());
    int fields = 0;
    if (value.expectedType() != null) {
      fields |= C.MLN_STYLE_EXPRESSION_OPTION_EXPECTED_TYPE;
      MemorySegment.copy(
          Codecs.writeStyleExpressionType(call, value.expectedType()),
          0,
          target.asSlice(8),
          0,
          org.maplibre.nativeffi.internal.c.Layouts.StyleExpressionType.byteSize());
    }
    target.asSlice(4).set(JAVA_INT, 0, fields);
    return target;
  }

  static MemorySegment writeStyleExpressionType(Call call, StyleExpressionType value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.StyleExpressionType);
    target.asSlice(0).set(JAVA_INT, 0, value.kind().rawValue());
    target.asSlice(4).set(JAVA_INT, 0, value.itemKind().rawValue());
    target.asSlice(8).set(JAVA_INT, 0, value.itemCount());
    return target;
  }

  static MemorySegment writeStyleExpressionInputs(Call call, StyleExpressionInputs value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.StyleExpressionInputs);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.StyleExpressionInputs.byteSize());
    int fields = 0;
    if (value.zoom() != null) {
      fields |= C.MLN_STYLE_EXPRESSION_INPUT_ZOOM;
      target.asSlice(8).set(JAVA_DOUBLE, 0, value.zoom());
    }
    if (value.colorRampParameter() != null) {
      fields |= C.MLN_STYLE_EXPRESSION_INPUT_COLOR_RAMP_PARAMETER;
      target.asSlice(16).set(JAVA_DOUBLE, 0, value.colorRampParameter());
    }
    if (value.elevation() != null) {
      fields |= C.MLN_STYLE_EXPRESSION_INPUT_ELEVATION;
      target.asSlice(24).set(JAVA_DOUBLE, 0, value.elevation());
    }
    MemorySegment.copy(
        call.view(call.text(value.feature())),
        0,
        target.asSlice(32),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    MemorySegment.copy(
        call.view(call.text(value.featureState())),
        0,
        target.asSlice(48),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    MemorySegment.copy(
        call.view(call.text(value.globalState())),
        0,
        target.asSlice(64),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    if (value.canonicalTileId() != null) {
      fields |= C.MLN_STYLE_EXPRESSION_INPUT_CANONICAL_TILE_ID;
      MemorySegment.copy(
          Codecs.writeCanonicalTileId(call, value.canonicalTileId()),
          0,
          target.asSlice(80),
          0,
          org.maplibre.nativeffi.internal.c.Layouts.CanonicalTileId.byteSize());
    }
    target
        .asSlice(96)
        .set(
            ADDRESS,
            0,
            call.array(
                value.availableImages(),
                org.maplibre.nativeffi.internal.c.Layouts.BufferView,
                (elementTarget, elementValue) -> {
                  MemorySegment.copy(
                      call.view(call.text(elementValue)),
                      0,
                      elementTarget,
                      0,
                      org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
                }));
    target.asSlice(104).set(JAVA_LONG, 0, (long) Call.length(value.availableImages()));
    target.asSlice(4).set(JAVA_INT, 0, fields);
    return target;
  }

  static StyleExpressionInfo readStyleExpressionInfo(MemorySegment source, Scope scope) {
    return new StyleExpressionInfo(
        source.asSlice(4).get(JAVA_BOOLEAN, 0), source.asSlice(5).get(JAVA_BOOLEAN, 0));
  }

  static MemorySegment writeStyleExpressionInfo(Call call, StyleExpressionInfo value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.StyleExpressionInfo);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.StyleExpressionInfo.byteSize());
    target.asSlice(4).set(JAVA_BOOLEAN, 0, value.isFeatureConstant());
    target.asSlice(5).set(JAVA_BOOLEAN, 0, value.isZoomConstant());
    return target;
  }

  static CameraTransitionEnd readCameraTransitionEnd(MemorySegment source, Scope scope) {
    return new CameraTransitionEnd(
        new CameraTransitionOutcome(source.asSlice(4).get(JAVA_INT, 0)),
        source.asSlice(8).get(JAVA_LONG, 0));
  }

  static MemorySegment writeCameraTransitionEnd(Call call, CameraTransitionEnd value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.CameraTransitionEnd);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.CameraTransitionEnd.byteSize());
    target.asSlice(4).set(JAVA_INT, 0, value.outcome().rawValue());
    target.asSlice(8).set(JAVA_LONG, 0, value.generation());
    return target;
  }

  static java.util.List<RuntimeEvent> readEventBatchView(MemorySegment source, Scope scope) {
    return Memory.array(
        source.asSlice(8).get(ADDRESS, 0),
        source.asSlice(16).get(JAVA_LONG, 0),
        Integer.toUnsignedLong(source.asSlice(4).get(JAVA_INT, 0)),
        org.maplibre.nativeffi.internal.c.Layouts.RuntimeEvent.byteSize(),
        item -> Codecs.readRuntimeEvent(item, scope));
  }

  static RuntimeEvent readRuntimeEvent(MemorySegment source, Scope scope) {
    return new RuntimeEvent(
        new RuntimeEventType(source.asSlice(0).get(JAVA_INT, 0)),
        new RuntimeEventSourceType(source.asSlice(4).get(JAVA_INT, 0)),
        source.asSlice(8).get(JAVA_LONG, 0),
        source.asSlice(16).get(JAVA_LONG, 0),
        source.asSlice(24).get(JAVA_INT, 0),
        Memory.textView(source.asSlice(32)),
        (switch (source.asSlice(28).get(JAVA_INT, 0)) {
          case C.MLN_RUNTIME_EVENT_PAYLOAD_RENDER_FRAME ->
              new RuntimeEventPayload.RenderFrame(
                  Codecs.readRuntimeEventRenderFrame(source.asSlice(48), scope));
          case C.MLN_RUNTIME_EVENT_PAYLOAD_RENDER_MAP ->
              new RuntimeEventPayload.RenderMap(
                  Codecs.readRuntimeEventRenderMap(source.asSlice(48), scope));
          case C.MLN_RUNTIME_EVENT_PAYLOAD_TILE_ACTION ->
              new RuntimeEventPayload.TileAction(
                  Codecs.readRuntimeEventTileAction(source.asSlice(48), scope));
          case C.MLN_RUNTIME_EVENT_PAYLOAD_OFFLINE_REGION_STATUS ->
              new RuntimeEventPayload.OfflineRegionStatus(
                  Codecs.readRuntimeEventOfflineRegionStatus(source.asSlice(48), scope));
          case C.MLN_RUNTIME_EVENT_PAYLOAD_OFFLINE_REGION_RESPONSE_ERROR ->
              new RuntimeEventPayload.OfflineRegionResponseError(
                  Codecs.readRuntimeEventOfflineRegionResponseError(source.asSlice(48), scope));
          case C.MLN_RUNTIME_EVENT_PAYLOAD_OFFLINE_REGION_TILE_COUNT_LIMIT ->
              new RuntimeEventPayload.OfflineRegionTileCountLimit(
                  Codecs.readRuntimeEventOfflineRegionTileCountLimit(source.asSlice(48), scope));
          case C.MLN_RUNTIME_EVENT_PAYLOAD_GLYPHS ->
              new RuntimeEventPayload.Glyphs(
                  Codecs.readRuntimeEventGlyphs(source.asSlice(48), scope));
          case C.MLN_RUNTIME_EVENT_PAYLOAD_SPRITE ->
              new RuntimeEventPayload.Sprite(
                  Codecs.readRuntimeEventSprite(source.asSlice(48), scope));
          case C.MLN_RUNTIME_EVENT_PAYLOAD_NONE -> new RuntimeEventPayload.Empty();
          default ->
              new RuntimeEventPayload.Unknown(
                  source.asSlice(28).get(JAVA_INT, 0),
                  source
                      .asSlice(48)
                      .asSlice(
                          0,
                          org.maplibre.nativeffi.internal.c.Layouts.RuntimeEventPayload.byteSize())
                      .toArray(JAVA_BYTE));
        }));
  }

  static MemorySegment writeRuntimeEvent(Call call, RuntimeEvent value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.RuntimeEvent);
    target.asSlice(0).set(JAVA_INT, 0, value.type().rawValue());
    target.asSlice(4).set(JAVA_INT, 0, value.sourceType().rawValue());
    target.asSlice(8).set(JAVA_LONG, 0, value.source());
    target.asSlice(16).set(JAVA_LONG, 0, value.generation());
    target.asSlice(24).set(JAVA_INT, 0, value.code());
    MemorySegment.copy(
        call.view(call.text(value.message())),
        0,
        target.asSlice(32),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    switch (value.payload()) {
      case RuntimeEventPayload.RenderFrame arm -> {
        target.asSlice(28).set(JAVA_INT, 0, C.MLN_RUNTIME_EVENT_PAYLOAD_RENDER_FRAME);
        MemorySegment.copy(
            Codecs.writeRuntimeEventRenderFrame(call, arm.value()),
            0,
            target.asSlice(48),
            0,
            org.maplibre.nativeffi.internal.c.Layouts.RuntimeEventRenderFrame.byteSize());
      }
      case RuntimeEventPayload.RenderMap arm -> {
        target.asSlice(28).set(JAVA_INT, 0, C.MLN_RUNTIME_EVENT_PAYLOAD_RENDER_MAP);
        MemorySegment.copy(
            Codecs.writeRuntimeEventRenderMap(call, arm.value()),
            0,
            target.asSlice(48),
            0,
            org.maplibre.nativeffi.internal.c.Layouts.RuntimeEventRenderMap.byteSize());
      }
      case RuntimeEventPayload.TileAction arm -> {
        target.asSlice(28).set(JAVA_INT, 0, C.MLN_RUNTIME_EVENT_PAYLOAD_TILE_ACTION);
        MemorySegment.copy(
            Codecs.writeRuntimeEventTileAction(call, arm.value()),
            0,
            target.asSlice(48),
            0,
            org.maplibre.nativeffi.internal.c.Layouts.RuntimeEventTileAction.byteSize());
      }
      case RuntimeEventPayload.OfflineRegionStatus arm -> {
        target.asSlice(28).set(JAVA_INT, 0, C.MLN_RUNTIME_EVENT_PAYLOAD_OFFLINE_REGION_STATUS);
        MemorySegment.copy(
            Codecs.writeRuntimeEventOfflineRegionStatus(call, arm.value()),
            0,
            target.asSlice(48),
            0,
            org.maplibre.nativeffi.internal.c.Layouts.RuntimeEventOfflineRegionStatus.byteSize());
      }
      case RuntimeEventPayload.OfflineRegionResponseError arm -> {
        target
            .asSlice(28)
            .set(JAVA_INT, 0, C.MLN_RUNTIME_EVENT_PAYLOAD_OFFLINE_REGION_RESPONSE_ERROR);
        MemorySegment.copy(
            Codecs.writeRuntimeEventOfflineRegionResponseError(call, arm.value()),
            0,
            target.asSlice(48),
            0,
            org.maplibre.nativeffi.internal.c.Layouts.RuntimeEventOfflineRegionResponseError
                .byteSize());
      }
      case RuntimeEventPayload.OfflineRegionTileCountLimit arm -> {
        target
            .asSlice(28)
            .set(JAVA_INT, 0, C.MLN_RUNTIME_EVENT_PAYLOAD_OFFLINE_REGION_TILE_COUNT_LIMIT);
        MemorySegment.copy(
            Codecs.writeRuntimeEventOfflineRegionTileCountLimit(call, arm.value()),
            0,
            target.asSlice(48),
            0,
            org.maplibre.nativeffi.internal.c.Layouts.RuntimeEventOfflineRegionTileCountLimit
                .byteSize());
      }
      case RuntimeEventPayload.Glyphs arm -> {
        target.asSlice(28).set(JAVA_INT, 0, C.MLN_RUNTIME_EVENT_PAYLOAD_GLYPHS);
        MemorySegment.copy(
            Codecs.writeRuntimeEventGlyphs(call, arm.value()),
            0,
            target.asSlice(48),
            0,
            org.maplibre.nativeffi.internal.c.Layouts.RuntimeEventGlyphs.byteSize());
      }
      case RuntimeEventPayload.Sprite arm -> {
        target.asSlice(28).set(JAVA_INT, 0, C.MLN_RUNTIME_EVENT_PAYLOAD_SPRITE);
        MemorySegment.copy(
            Codecs.writeRuntimeEventSprite(call, arm.value()),
            0,
            target.asSlice(48),
            0,
            org.maplibre.nativeffi.internal.c.Layouts.RuntimeEventSprite.byteSize());
      }
      case RuntimeEventPayload.Empty ignored -> {
        target.asSlice(28).set(JAVA_INT, 0, C.MLN_RUNTIME_EVENT_PAYLOAD_NONE);
      }
      case RuntimeEventPayload.Unknown arm -> {
        target.asSlice(28).set(JAVA_INT, 0, arm.rawTag());
        MemorySegment.copy(
            arm.bytes(),
            0,
            target.asSlice(48),
            JAVA_BYTE,
            0,
            Math.toIntExact(
                org.maplibre.nativeffi.internal.c.Layouts.RuntimeEventPayload.byteSize()));
      }
    }
    return target;
  }

  static RuntimeEventRenderFrame readRuntimeEventRenderFrame(MemorySegment source, Scope scope) {
    return new RuntimeEventRenderFrame(
        new RenderMode(source.asSlice(0).get(JAVA_INT, 0)),
        source.asSlice(4).get(JAVA_BOOLEAN, 0),
        source.asSlice(5).get(JAVA_BOOLEAN, 0),
        Codecs.readRenderingStats(source.asSlice(8), scope));
  }

  static MemorySegment writeRuntimeEventRenderFrame(Call call, RuntimeEventRenderFrame value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.RuntimeEventRenderFrame);
    target.asSlice(0).set(JAVA_INT, 0, value.mode().rawValue());
    target.asSlice(4).set(JAVA_BOOLEAN, 0, value.needsRepaint());
    target.asSlice(5).set(JAVA_BOOLEAN, 0, value.placementChanged());
    MemorySegment.copy(
        Codecs.writeRenderingStats(call, value.stats()),
        0,
        target.asSlice(8),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.RenderingStats.byteSize());
    return target;
  }

  static RenderingStats readRenderingStats(MemorySegment source, Scope scope) {
    return new RenderingStats(
        source.asSlice(0).get(JAVA_DOUBLE, 0),
        source.asSlice(8).get(JAVA_DOUBLE, 0),
        source.asSlice(16).get(JAVA_LONG, 0),
        source.asSlice(24).get(JAVA_LONG, 0),
        source.asSlice(32).get(JAVA_LONG, 0));
  }

  static MemorySegment writeRenderingStats(Call call, RenderingStats value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.RenderingStats);
    target.asSlice(0).set(JAVA_DOUBLE, 0, value.encodingTime());
    target.asSlice(8).set(JAVA_DOUBLE, 0, value.renderingTime());
    target.asSlice(16).set(JAVA_LONG, 0, value.frameCount());
    target.asSlice(24).set(JAVA_LONG, 0, value.drawCallCount());
    target.asSlice(32).set(JAVA_LONG, 0, value.totalDrawCallCount());
    return target;
  }

  static RuntimeEventRenderMap readRuntimeEventRenderMap(MemorySegment source, Scope scope) {
    return new RuntimeEventRenderMap(new RenderMode(source.asSlice(0).get(JAVA_INT, 0)));
  }

  static MemorySegment writeRuntimeEventRenderMap(Call call, RuntimeEventRenderMap value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.RuntimeEventRenderMap);
    target.asSlice(0).set(JAVA_INT, 0, value.mode().rawValue());
    return target;
  }

  static RuntimeEventTileAction readRuntimeEventTileAction(MemorySegment source, Scope scope) {
    return new RuntimeEventTileAction(
        new TileOperation(source.asSlice(0).get(JAVA_INT, 0)),
        Codecs.readTileId(source.asSlice(4), scope));
  }

  static MemorySegment writeRuntimeEventTileAction(Call call, RuntimeEventTileAction value) {
    var target =
        call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.RuntimeEventTileAction);
    target.asSlice(0).set(JAVA_INT, 0, value.operation().rawValue());
    MemorySegment.copy(
        Codecs.writeTileId(call, value.tileId()),
        0,
        target.asSlice(4),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.TileId.byteSize());
    return target;
  }

  static TileId readTileId(MemorySegment source, Scope scope) {
    return new TileId(
        source.asSlice(0).get(JAVA_INT, 0),
        source.asSlice(4).get(JAVA_INT, 0),
        source.asSlice(8).get(JAVA_INT, 0),
        source.asSlice(12).get(JAVA_INT, 0),
        source.asSlice(16).get(JAVA_INT, 0));
  }

  static MemorySegment writeTileId(Call call, TileId value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.TileId);
    target.asSlice(0).set(JAVA_INT, 0, value.overscaledZ());
    target.asSlice(4).set(JAVA_INT, 0, value.wrap());
    target.asSlice(8).set(JAVA_INT, 0, value.canonicalZ());
    target.asSlice(12).set(JAVA_INT, 0, value.canonicalX());
    target.asSlice(16).set(JAVA_INT, 0, value.canonicalY());
    return target;
  }

  static RuntimeEventOfflineRegionStatus readRuntimeEventOfflineRegionStatus(
      MemorySegment source, Scope scope) {
    return new RuntimeEventOfflineRegionStatus(
        source.asSlice(0).get(JAVA_LONG, 0),
        Codecs.readOfflineRegionStatus(source.asSlice(8), scope));
  }

  static MemorySegment writeRuntimeEventOfflineRegionStatus(
      Call call, RuntimeEventOfflineRegionStatus value) {
    var target =
        call.arena.allocate(
            org.maplibre.nativeffi.internal.c.Layouts.RuntimeEventOfflineRegionStatus);
    target.asSlice(0).set(JAVA_LONG, 0, value.regionId());
    MemorySegment.copy(
        Codecs.writeOfflineRegionStatus(call, value.status()),
        0,
        target.asSlice(8),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.OfflineRegionStatus.byteSize());
    return target;
  }

  static RuntimeEventOfflineRegionResponseError readRuntimeEventOfflineRegionResponseError(
      MemorySegment source, Scope scope) {
    return new RuntimeEventOfflineRegionResponseError(
        source.asSlice(0).get(JAVA_LONG, 0),
        new ResourceErrorReason(source.asSlice(8).get(JAVA_INT, 0)));
  }

  static MemorySegment writeRuntimeEventOfflineRegionResponseError(
      Call call, RuntimeEventOfflineRegionResponseError value) {
    var target =
        call.arena.allocate(
            org.maplibre.nativeffi.internal.c.Layouts.RuntimeEventOfflineRegionResponseError);
    target.asSlice(0).set(JAVA_LONG, 0, value.regionId());
    target.asSlice(8).set(JAVA_INT, 0, value.reason().rawValue());
    return target;
  }

  static RuntimeEventOfflineRegionTileCountLimit readRuntimeEventOfflineRegionTileCountLimit(
      MemorySegment source, Scope scope) {
    return new RuntimeEventOfflineRegionTileCountLimit(
        source.asSlice(0).get(JAVA_LONG, 0), source.asSlice(8).get(JAVA_LONG, 0));
  }

  static MemorySegment writeRuntimeEventOfflineRegionTileCountLimit(
      Call call, RuntimeEventOfflineRegionTileCountLimit value) {
    var target =
        call.arena.allocate(
            org.maplibre.nativeffi.internal.c.Layouts.RuntimeEventOfflineRegionTileCountLimit);
    target.asSlice(0).set(JAVA_LONG, 0, value.regionId());
    target.asSlice(8).set(JAVA_LONG, 0, value.limit());
    return target;
  }

  static RuntimeEventGlyphs readRuntimeEventGlyphs(MemorySegment source, Scope scope) {
    return new RuntimeEventGlyphs(
        Memory.array(
            source.asSlice(0).get(ADDRESS, 0),
            source.asSlice(8).get(JAVA_LONG, 0),
            org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize(),
            org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize(),
            item -> Memory.textView(item)),
        source.asSlice(16).get(JAVA_INT, 0),
        source.asSlice(20).get(JAVA_INT, 0),
        source.asSlice(24).get(JAVA_BOOLEAN, 0));
  }

  static MemorySegment writeRuntimeEventGlyphs(Call call, RuntimeEventGlyphs value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.RuntimeEventGlyphs);
    target
        .asSlice(0)
        .set(
            ADDRESS,
            0,
            call.array(
                value.fontStack(),
                org.maplibre.nativeffi.internal.c.Layouts.BufferView,
                (elementTarget, elementValue) -> {
                  MemorySegment.copy(
                      call.view(call.text(elementValue)),
                      0,
                      elementTarget,
                      0,
                      org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
                }));
    target.asSlice(8).set(JAVA_LONG, 0, (long) Call.length(value.fontStack()));
    target.asSlice(16).set(JAVA_INT, 0, value.first());
    target.asSlice(20).set(JAVA_INT, 0, value.last());
    target.asSlice(24).set(JAVA_BOOLEAN, 0, value.fontFace());
    return target;
  }

  static RuntimeEventSprite readRuntimeEventSprite(MemorySegment source, Scope scope) {
    return new RuntimeEventSprite(
        Memory.textView(source.asSlice(0)), Memory.textView(source.asSlice(16)));
  }

  static MemorySegment writeRuntimeEventSprite(Call call, RuntimeEventSprite value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.RuntimeEventSprite);
    MemorySegment.copy(
        call.view(call.text(value.id())),
        0,
        target.asSlice(0),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    MemorySegment.copy(
        call.view(call.text(value.url())),
        0,
        target.asSlice(16),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    return target;
  }

  static ResourceRequestInfo readResourceRequestInfo(MemorySegment source, Scope scope) {
    return new ResourceRequestInfo(
        Memory.textView(source.asSlice(8)),
        Memory.textView(source.asSlice(24)),
        new ResourceKind(source.asSlice(40).get(JAVA_INT, 0)),
        new ResourceLoadingMethod(source.asSlice(44).get(JAVA_INT, 0)),
        new ResourcePriority(source.asSlice(48).get(JAVA_INT, 0)),
        new ResourceUsage(source.asSlice(52).get(JAVA_INT, 0)),
        new ResourceStoragePolicy(source.asSlice(56).get(JAVA_INT, 0)),
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_RESOURCE_REQUEST_RANGE) == 0
            ? null
            : Codecs.readResourceRange(source.asSlice(64), scope)),
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_RESOURCE_REQUEST_PRIOR_MODIFIED) == 0
            ? null
            : source.asSlice(80).get(JAVA_LONG, 0)),
        ((source.asSlice(4).get(JAVA_INT, 0) & C.MLN_RESOURCE_REQUEST_PRIOR_EXPIRES) == 0
            ? null
            : source.asSlice(88).get(JAVA_LONG, 0)),
        Memory.textView(source.asSlice(96)),
        Memory.bytes(source.asSlice(112).get(ADDRESS, 0), source.asSlice(120).get(JAVA_LONG, 0)));
  }

  static MemorySegment writeResourceRequestInfo(Call call, ResourceRequestInfo value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.ResourceRequestInfo);
    target
        .asSlice(0)
        .set(
            JAVA_INT,
            0,
            (int) org.maplibre.nativeffi.internal.c.Layouts.ResourceRequestInfo.byteSize());
    int fields = 0;
    MemorySegment.copy(
        call.view(call.text(value.requestedUrl())),
        0,
        target.asSlice(8),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    MemorySegment.copy(
        call.view(call.text(value.resolvedUrl())),
        0,
        target.asSlice(24),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    target.asSlice(40).set(JAVA_INT, 0, value.kind().rawValue());
    target.asSlice(44).set(JAVA_INT, 0, value.loadingMethod().rawValue());
    target.asSlice(48).set(JAVA_INT, 0, value.priority().rawValue());
    target.asSlice(52).set(JAVA_INT, 0, value.usage().rawValue());
    target.asSlice(56).set(JAVA_INT, 0, value.storagePolicy().rawValue());
    if (value.range() != null) {
      fields |= C.MLN_RESOURCE_REQUEST_RANGE;
      MemorySegment.copy(
          Codecs.writeResourceRange(call, value.range()),
          0,
          target.asSlice(64),
          0,
          org.maplibre.nativeffi.internal.c.Layouts.ResourceRange.byteSize());
    }
    if (value.priorModifiedUnixMs() != null) {
      fields |= C.MLN_RESOURCE_REQUEST_PRIOR_MODIFIED;
      target.asSlice(80).set(JAVA_LONG, 0, value.priorModifiedUnixMs());
    }
    if (value.priorExpiresUnixMs() != null) {
      fields |= C.MLN_RESOURCE_REQUEST_PRIOR_EXPIRES;
      target.asSlice(88).set(JAVA_LONG, 0, value.priorExpiresUnixMs());
    }
    MemorySegment.copy(
        call.view(call.text(value.priorEtag())),
        0,
        target.asSlice(96),
        0,
        org.maplibre.nativeffi.internal.c.Layouts.BufferView.byteSize());
    target.asSlice(112).set(ADDRESS, 0, call.bytes(value.priorData()));
    target.asSlice(120).set(JAVA_LONG, 0, (long) Call.length(value.priorData()));
    target.asSlice(4).set(JAVA_INT, 0, fields);
    return target;
  }

  static ResourceRange readResourceRange(MemorySegment source, Scope scope) {
    return new ResourceRange(
        source.asSlice(0).get(JAVA_LONG, 0), source.asSlice(8).get(JAVA_LONG, 0));
  }

  static MemorySegment writeResourceRange(Call call, ResourceRange value) {
    var target = call.arena.allocate(org.maplibre.nativeffi.internal.c.Layouts.ResourceRange);
    target.asSlice(0).set(JAVA_LONG, 0, value.start());
    target.asSlice(8).set(JAVA_LONG, 0, value.end());
    return target;
  }
}
