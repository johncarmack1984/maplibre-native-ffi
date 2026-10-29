// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi.internal.c;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import java.lang.invoke.*;

public final class Layouts {
  private Layouts() {}

  public static final GroupLayout UnitBezier =
      MemoryLayout.structLayout(
          JAVA_DOUBLE.withName("x1"),
          JAVA_DOUBLE.withName("y1"),
          JAVA_DOUBLE.withName("x2"),
          JAVA_DOUBLE.withName("y2"));
  public static final GroupLayout CameraTransitionHandler =
      MemoryLayout.structLayout(
          ADDRESS.withName("callback"),
          ADDRESS.withName("user_data"),
          ADDRESS.withName("release_user_data"),
          JAVA_LONG.withName("queue"));
  public static final GroupLayout AnimationOptions =
      MemoryLayout.structLayout(
          JAVA_INT.withName("fields"),
          MemoryLayout.paddingLayout(4),
          JAVA_DOUBLE.withName("duration_ms"),
          JAVA_DOUBLE.withName("velocity"),
          JAVA_DOUBLE.withName("min_zoom"),
          Layouts.UnitBezier.withName("easing"),
          JAVA_LONG.withName("transition_id"),
          Layouts.CameraTransitionHandler.withName("end_handler"));
  public static final GroupLayout LatLng =
      MemoryLayout.structLayout(
          JAVA_DOUBLE.withName("latitude"), JAVA_DOUBLE.withName("longitude"));
  public static final GroupLayout LatLngBounds =
      MemoryLayout.structLayout(
          Layouts.LatLng.withName("southwest"), Layouts.LatLng.withName("northeast"));
  public static final GroupLayout BoundOptions =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("fields"),
          Layouts.LatLngBounds.withName("bounds"),
          JAVA_DOUBLE.withName("min_zoom"),
          JAVA_DOUBLE.withName("max_zoom"),
          JAVA_DOUBLE.withName("min_pitch"),
          JAVA_DOUBLE.withName("max_pitch"));
  public static final GroupLayout BufferView =
      MemoryLayout.structLayout(ADDRESS.withName("data"), JAVA_LONG.withName("size"));
  public static final GroupLayout EdgeInsets =
      MemoryLayout.structLayout(
          JAVA_DOUBLE.withName("top"),
          JAVA_DOUBLE.withName("left"),
          JAVA_DOUBLE.withName("bottom"),
          JAVA_DOUBLE.withName("right"));
  public static final GroupLayout Camera =
      MemoryLayout.structLayout(
          Layouts.LatLng.withName("center"),
          JAVA_DOUBLE.withName("center_altitude"),
          Layouts.EdgeInsets.withName("padding"),
          JAVA_DOUBLE.withName("zoom"),
          JAVA_DOUBLE.withName("bearing"),
          JAVA_DOUBLE.withName("pitch"),
          JAVA_DOUBLE.withName("roll"),
          JAVA_DOUBLE.withName("field_of_view"));
  public static final GroupLayout ScreenPoint =
      MemoryLayout.structLayout(JAVA_DOUBLE.withName("x"), JAVA_DOUBLE.withName("y"));
  public static final GroupLayout CameraDelta =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("fields"),
          Layouts.ScreenPoint.withName("offset"),
          JAVA_DOUBLE.withName("scale"),
          JAVA_DOUBLE.withName("bearing"),
          JAVA_DOUBLE.withName("pitch"),
          Layouts.ScreenPoint.withName("anchor"),
          Layouts.AnimationOptions.withName("animation"),
          JAVA_INT.withName("gesture_phase"),
          JAVA_INT.withName("reserved"));
  public static final GroupLayout CameraFitOptions =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("fields"),
          Layouts.EdgeInsets.withName("padding"),
          JAVA_DOUBLE.withName("bearing"),
          JAVA_DOUBLE.withName("pitch"));
  public static final GroupLayout CameraOptions =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("fields"),
          Layouts.LatLng.withName("center"),
          JAVA_DOUBLE.withName("center_altitude"),
          Layouts.EdgeInsets.withName("padding"),
          Layouts.ScreenPoint.withName("anchor"),
          JAVA_DOUBLE.withName("zoom"),
          JAVA_DOUBLE.withName("bearing"),
          JAVA_DOUBLE.withName("pitch"),
          JAVA_DOUBLE.withName("roll"),
          JAVA_DOUBLE.withName("field_of_view"));
  public static final GroupLayout CameraQueryResult =
      MemoryLayout.structLayout(
          JAVA_LONG.withName("generation"), Layouts.Camera.withName("camera"));
  public static final GroupLayout CameraTransitionEnd =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("outcome"),
          JAVA_LONG.withName("generation"));
  public static final GroupLayout CameraUpdate =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("mode"),
          Layouts.CameraOptions.withName("camera"),
          Layouts.AnimationOptions.withName("animation"),
          JAVA_INT.withName("gesture_phase"),
          JAVA_INT.withName("reserved"));
  public static final GroupLayout CanonicalTileId =
      MemoryLayout.structLayout(
          JAVA_INT.withName("z"), JAVA_INT.withName("x"), JAVA_INT.withName("y"));
  public static final GroupLayout Completion =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.paddingLayout(4),
          ADDRESS.withName("callback"),
          ADDRESS.withName("user_data"),
          ADDRESS.withName("release_user_data"),
          JAVA_LONG.withName("queue"));
  public static final GroupLayout CompletionResult =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("status"),
          JAVA_INT.withName("disposition"),
          JAVA_INT.withName("value_size"),
          JAVA_LONG.withName("generation"),
          JAVA_LONG.withName("render_update_generation"),
          Layouts.BufferView.withName("diagnostic"),
          ADDRESS.withName("value"),
          JAVA_LONG.withName("value_count"));
  public static final GroupLayout CustomGeometrySourceOptions =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("fields"),
          ADDRESS.withName("fetch_tile"),
          ADDRESS.withName("cancel_tile"),
          ADDRESS.withName("user_data"),
          JAVA_DOUBLE.withName("min_zoom"),
          JAVA_DOUBLE.withName("max_zoom"),
          JAVA_DOUBLE.withName("tolerance"),
          JAVA_INT.withName("tile_size"),
          JAVA_INT.withName("buffer"),
          JAVA_BOOLEAN.withName("clip"),
          JAVA_BOOLEAN.withName("wrap"),
          MemoryLayout.paddingLayout(6),
          ADDRESS.withName("release_user_data"),
          JAVA_LONG.withName("queue"));
  public static final GroupLayout CustomVectorSourceOptions =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("fields"),
          ADDRESS.withName("fetch_tile"),
          ADDRESS.withName("cancel_tile"),
          ADDRESS.withName("user_data"),
          JAVA_DOUBLE.withName("min_zoom"),
          JAVA_DOUBLE.withName("max_zoom"),
          ADDRESS.withName("release_user_data"),
          JAVA_LONG.withName("queue"));
  public static final GroupLayout Wake =
      MemoryLayout.structLayout(
          ADDRESS.withName("callback"),
          ADDRESS.withName("user_data"),
          ADDRESS.withName("release_user_data"),
          JAVA_LONG.withName("queue"));
  public static final GroupLayout DeliveryQueueOptions =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.paddingLayout(4),
          Layouts.Wake.withName("wake"),
          ADDRESS.withName("release_abandoned_user_data"));
  public static final GroupLayout Diagnostic =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.sequenceLayout(4096, JAVA_BYTE).withName("message"));
  public static final GroupLayout EglContextDescriptor =
      MemoryLayout.structLayout(
          ADDRESS.withName("display"),
          ADDRESS.withName("config"),
          ADDRESS.withName("share_context"),
          JAVA_INT.withName("client_api"),
          MemoryLayout.paddingLayout(4),
          ADDRESS.withName("get_proc_address"));
  public static final GroupLayout EventBatchView =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("event_size"),
          ADDRESS.withName("events"),
          JAVA_LONG.withName("event_count"));
  public static final GroupLayout FeatureStateSelector =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("fields"),
          Layouts.BufferView.withName("source_id"),
          Layouts.BufferView.withName("source_layer_id"),
          Layouts.BufferView.withName("feature_id"),
          Layouts.BufferView.withName("state_key"));
  public static final GroupLayout FrameDemand =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"), JAVA_INT.withName("flags"), JAVA_LONG.withName("token"));
  public static final GroupLayout Vec3 =
      MemoryLayout.structLayout(
          JAVA_DOUBLE.withName("x"), JAVA_DOUBLE.withName("y"), JAVA_DOUBLE.withName("z"));
  public static final GroupLayout Quaternion =
      MemoryLayout.structLayout(
          JAVA_DOUBLE.withName("x"),
          JAVA_DOUBLE.withName("y"),
          JAVA_DOUBLE.withName("z"),
          JAVA_DOUBLE.withName("w"));
  public static final GroupLayout FreeCameraOptions =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("fields"),
          Layouts.Vec3.withName("position"),
          Layouts.Quaternion.withName("orientation"));
  public static final GroupLayout GeoJsonSourceOptions =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("fields"),
          JAVA_DOUBLE.withName("min_zoom"),
          JAVA_DOUBLE.withName("max_zoom"),
          JAVA_DOUBLE.withName("tolerance"),
          JAVA_DOUBLE.withName("cluster_max_zoom"),
          Layouts.BufferView.withName("cluster_properties"),
          JAVA_INT.withName("buffer"),
          JAVA_INT.withName("cluster_radius"),
          JAVA_INT.withName("cluster_min_points"),
          JAVA_BOOLEAN.withName("line_metrics"),
          JAVA_BOOLEAN.withName("cluster"),
          JAVA_BOOLEAN.withName("synchronous_tiling"),
          MemoryLayout.paddingLayout(1));
  public static final GroupLayout GpuSync =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"), JAVA_INT.withName("kind"), JAVA_LONG.withName("handle"));
  public static final GroupLayout GraphicsDeviceOptions =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("fields"),
          JAVA_INT.withName("adapter_index"),
          JAVA_BOOLEAN.withName("single_context"),
          MemoryLayout.paddingLayout(3));
  public static final GroupLayout LogicalExtent =
      MemoryLayout.structLayout(
          JAVA_INT.withName("width"),
          JAVA_INT.withName("height"),
          JAVA_DOUBLE.withName("scale_factor"));
  public static final GroupLayout GraphicsDeviceTextureDescriptor =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.paddingLayout(4),
          Layouts.LogicalExtent.withName("extent"));
  public static final GroupLayout HttpHeader =
      MemoryLayout.structLayout(
          Layouts.BufferView.withName("name"), Layouts.BufferView.withName("value"));
  public static final GroupLayout HttpHeaderRule =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("kinds"),
          JAVA_INT.withName("flags"),
          MemoryLayout.paddingLayout(4),
          Layouts.BufferView.withName("url"),
          ADDRESS.withName("headers"),
          JAVA_LONG.withName("header_count"));
  public static final GroupLayout HttpHeaderTransform =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.paddingLayout(4),
          ADDRESS.withName("callback"),
          ADDRESS.withName("user_data"),
          ADDRESS.withName("release_user_data"),
          ADDRESS.withName("rules"),
          JAVA_LONG.withName("rule_count"));
  public static final GroupLayout HttpHeaderTransformResponse =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"), MemoryLayout.paddingLayout(4), ADDRESS.withName("context"));
  public static final GroupLayout ImageContent =
      MemoryLayout.structLayout(
          JAVA_FLOAT.withName("left"),
          JAVA_FLOAT.withName("top"),
          JAVA_FLOAT.withName("right"),
          JAVA_FLOAT.withName("bottom"));
  public static final GroupLayout ImageStretch =
      MemoryLayout.structLayout(JAVA_FLOAT.withName("from"), JAVA_FLOAT.withName("to"));
  public static final GroupLayout LogHandler =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.paddingLayout(4),
          ADDRESS.withName("callback"),
          ADDRESS.withName("user_data"),
          ADDRESS.withName("release_user_data"),
          JAVA_LONG.withName("queue"));
  public static final GroupLayout MapOptions =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("fields"),
          Layouts.LogicalExtent.withName("initial_extent"),
          JAVA_INT.withName("map_mode"),
          JAVA_BOOLEAN.withName("fast_pfor_enabled"),
          MemoryLayout.paddingLayout(3),
          JAVA_LONG.withName("event_mask"));
  public static final GroupLayout MapTileOptions =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("fields"),
          JAVA_INT.withName("prefetch_zoom_delta"),
          MemoryLayout.paddingLayout(4),
          JAVA_DOUBLE.withName("lod_min_radius"),
          JAVA_DOUBLE.withName("lod_scale"),
          JAVA_DOUBLE.withName("lod_pitch_threshold"),
          JAVA_DOUBLE.withName("lod_zoom_shift"),
          JAVA_INT.withName("lod_mode"),
          MemoryLayout.paddingLayout(4));
  public static final GroupLayout ProjectionMode =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("fields"),
          JAVA_BOOLEAN.withName("axonometric"),
          MemoryLayout.paddingLayout(7),
          JAVA_DOUBLE.withName("x_skew"),
          JAVA_DOUBLE.withName("y_skew"));
  public static final GroupLayout MapViewportOptions =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("fields"),
          JAVA_INT.withName("north_orientation"),
          JAVA_INT.withName("constrain_mode"),
          JAVA_INT.withName("viewport_mode"),
          MemoryLayout.paddingLayout(4),
          Layouts.EdgeInsets.withName("frustum_offset"));
  public static final GroupLayout MapView =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.paddingLayout(4),
          Layouts.Camera.withName("camera"),
          Layouts.LogicalExtent.withName("extent"),
          Layouts.ProjectionMode.withName("projection_mode"),
          Layouts.MapViewportOptions.withName("viewport"));
  public static final GroupLayout MapSnapshot =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("debug_options"),
          JAVA_LONG.withName("generation"),
          JAVA_BOOLEAN.withName("fully_loaded"),
          JAVA_BOOLEAN.withName("rendering_stats_view_enabled"),
          JAVA_BOOLEAN.withName("gesture_in_progress"),
          JAVA_BOOLEAN.withName("transition_in_progress"),
          MemoryLayout.paddingLayout(4),
          JAVA_LONG.withName("event_mask"),
          JAVA_LONG.withName("latest_render_update_generation"),
          Layouts.MapTileOptions.withName("tile"),
          Layouts.BoundOptions.withName("bounds"),
          Layouts.FreeCameraOptions.withName("free_camera"),
          Layouts.MapView.withName("view"));
  public static final GroupLayout MetalBorrowedTexture =
      MemoryLayout.structLayout(ADDRESS.withName("texture"));
  public static final GroupLayout MetalBorrowedTextureDescriptor =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.paddingLayout(4),
          Layouts.LogicalExtent.withName("extent"),
          JAVA_INT.withName("physical_width"),
          JAVA_INT.withName("physical_height"),
          ADDRESS.withName("textures"),
          JAVA_LONG.withName("texture_count"));
  public static final GroupLayout MetalContextDescriptor =
      MemoryLayout.structLayout(ADDRESS.withName("device"));
  public static final GroupLayout MetalOwnedTextureDescriptor =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.paddingLayout(4),
          Layouts.LogicalExtent.withName("extent"),
          Layouts.MetalContextDescriptor.withName("context"),
          JAVA_LONG.withName("pixel_format"));
  public static final GroupLayout MetalSurfaceDescriptor =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.paddingLayout(4),
          Layouts.LogicalExtent.withName("extent"),
          Layouts.MetalContextDescriptor.withName("context"),
          ADDRESS.withName("layer"));
  public static final GroupLayout MetalTextureFrame =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.paddingLayout(4),
          JAVA_LONG.withName("generation"),
          JAVA_INT.withName("width"),
          JAVA_INT.withName("height"),
          JAVA_DOUBLE.withName("scale_factor"),
          JAVA_LONG.withName("frame_id"),
          JAVA_INT.withName("slot"),
          MemoryLayout.paddingLayout(4),
          ADDRESS.withName("texture"),
          ADDRESS.withName("device"),
          JAVA_LONG.withName("pixel_format"));
  public static final GroupLayout OfflineGeometryRegionDefinition =
      MemoryLayout.structLayout(
          Layouts.BufferView.withName("style_url"),
          Layouts.BufferView.withName("geometry"),
          JAVA_DOUBLE.withName("min_zoom"),
          JAVA_DOUBLE.withName("max_zoom"),
          JAVA_FLOAT.withName("pixel_ratio"),
          JAVA_BOOLEAN.withName("include_ideographs"),
          MemoryLayout.paddingLayout(3));
  public static final GroupLayout OfflineTilePyramidRegionDefinition =
      MemoryLayout.structLayout(
          Layouts.BufferView.withName("style_url"),
          Layouts.LatLngBounds.withName("bounds"),
          JAVA_DOUBLE.withName("min_zoom"),
          JAVA_DOUBLE.withName("max_zoom"),
          JAVA_FLOAT.withName("pixel_ratio"),
          JAVA_BOOLEAN.withName("include_ideographs"),
          MemoryLayout.paddingLayout(3));
  public static final GroupLayout OfflineRegionDefinitionData =
      MemoryLayout.unionLayout(
          Layouts.OfflineTilePyramidRegionDefinition.withName("tile_pyramid"),
          Layouts.OfflineGeometryRegionDefinition.withName("geometry"));
  public static final GroupLayout OfflineRegionDefinition =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("type"),
          Layouts.OfflineRegionDefinitionData.withName("data"));
  public static final GroupLayout OfflineRegionInfo =
      MemoryLayout.structLayout(
          JAVA_LONG.withName("id"),
          Layouts.OfflineRegionDefinition.withName("definition"),
          ADDRESS.withName("metadata"),
          JAVA_LONG.withName("metadata_size"));
  public static final GroupLayout OfflineRegionStatus =
      MemoryLayout.structLayout(
          JAVA_INT.withName("download_state"),
          MemoryLayout.paddingLayout(4),
          JAVA_LONG.withName("completed_resource_count"),
          JAVA_LONG.withName("completed_resource_size"),
          JAVA_LONG.withName("completed_tile_count"),
          JAVA_LONG.withName("required_tile_count"),
          JAVA_LONG.withName("completed_tile_size"),
          JAVA_LONG.withName("required_resource_count"),
          JAVA_BOOLEAN.withName("required_resource_count_is_precise"),
          JAVA_BOOLEAN.withName("complete"),
          MemoryLayout.paddingLayout(6));
  public static final GroupLayout OpenGlBorrowedTexture =
      MemoryLayout.structLayout(JAVA_INT.withName("texture"));
  public static final GroupLayout WglContextDescriptor =
      MemoryLayout.structLayout(
          ADDRESS.withName("device_context"),
          ADDRESS.withName("share_context"),
          ADDRESS.withName("get_proc_address"));
  public static final GroupLayout WebGlContextDescriptor =
      MemoryLayout.structLayout(
          JAVA_INT.withName("kind"),
          JAVA_INT.withName("context"),
          Layouts.BufferView.withName("canvas_selector"));
  public static final GroupLayout OpenGlContextDescriptorData =
      MemoryLayout.unionLayout(
          Layouts.WglContextDescriptor.withName("wgl"),
          Layouts.EglContextDescriptor.withName("egl"),
          Layouts.WebGlContextDescriptor.withName("web_gl"));
  public static final GroupLayout OpenGlContextDescriptor =
      MemoryLayout.structLayout(
          JAVA_INT.withName("platform"),
          JAVA_INT.withName("ownership"),
          Layouts.OpenGlContextDescriptorData.withName("data"));
  public static final GroupLayout OpenGlBorrowedTextureDescriptor =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.paddingLayout(4),
          Layouts.LogicalExtent.withName("extent"),
          JAVA_INT.withName("physical_width"),
          JAVA_INT.withName("physical_height"),
          Layouts.OpenGlContextDescriptor.withName("context"),
          ADDRESS.withName("textures"),
          JAVA_LONG.withName("texture_count"),
          JAVA_INT.withName("target"),
          MemoryLayout.paddingLayout(4));
  public static final GroupLayout OpenGlOwnedTextureDescriptor =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.paddingLayout(4),
          Layouts.LogicalExtent.withName("extent"),
          Layouts.OpenGlContextDescriptor.withName("context"));
  public static final GroupLayout OpenGlSurfaceDescriptor =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.paddingLayout(4),
          Layouts.LogicalExtent.withName("extent"),
          Layouts.OpenGlContextDescriptor.withName("context"),
          ADDRESS.withName("surface"));
  public static final GroupLayout OpenGlTextureFrame =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.paddingLayout(4),
          JAVA_LONG.withName("generation"),
          JAVA_INT.withName("width"),
          JAVA_INT.withName("height"),
          JAVA_DOUBLE.withName("scale_factor"),
          JAVA_LONG.withName("frame_id"),
          JAVA_INT.withName("slot"),
          JAVA_INT.withName("texture"),
          JAVA_INT.withName("target"),
          JAVA_INT.withName("internal_format"),
          JAVA_INT.withName("format"),
          JAVA_INT.withName("type"));
  public static final GroupLayout PremultipliedRgba8Image =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("width"),
          JAVA_INT.withName("height"),
          JAVA_INT.withName("stride"),
          ADDRESS.withName("pixels"),
          JAVA_LONG.withName("byte_length"));
  public static final GroupLayout ProjectedMeters =
      MemoryLayout.structLayout(JAVA_DOUBLE.withName("northing"), JAVA_DOUBLE.withName("easting"));
  public static final GroupLayout QueueLock =
      MemoryLayout.structLayout(
          ADDRESS.withName("lock"),
          ADDRESS.withName("unlock"),
          ADDRESS.withName("user_data"),
          ADDRESS.withName("release_user_data"));
  public static final GroupLayout RenderAbandonResult =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("disposition"),
          JAVA_INT.withName("quarantined_resource_count"),
          JAVA_INT.withName("reserved"));
  public static final GroupLayout RenderFrameBatchView =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("result_size"),
          ADDRESS.withName("results"),
          JAVA_LONG.withName("result_count"));
  public static final GroupLayout RenderFrameResult =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("disposition"),
          JAVA_LONG.withName("token"),
          JAVA_LONG.withName("map_update_generation"),
          JAVA_LONG.withName("generation"),
          JAVA_LONG.withName("frame_generation"),
          JAVA_BOOLEAN.withName("needs_repaint"),
          MemoryLayout.paddingLayout(7),
          Layouts.MapView.withName("view"),
          JAVA_INT.withName("mode"),
          MemoryLayout.paddingLayout(4));
  public static final GroupLayout RenderSessionAttachOptions =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("driver"),
          JAVA_INT.withName("requested_texture_ring_depth"),
          JAVA_INT.withName("producer_sync_kind"),
          Layouts.Wake.withName("frame_wake"),
          Layouts.Wake.withName("driver_work_wake"),
          Layouts.QueueLock.withName("queue_lock"));
  public static final GroupLayout RenderSessionCapabilities =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("driver"),
          JAVA_INT.withName("texture_ring_depth"),
          JAVA_INT.withName("flags"));
  public static final GroupLayout RenderSessionSnapshot =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("state"),
          Layouts.LogicalExtent.withName("extent"),
          JAVA_LONG.withName("generation"),
          JAVA_LONG.withName("map_update_generation"),
          JAVA_LONG.withName("rendered_update_generation"),
          JAVA_LONG.withName("frame_generation"),
          JAVA_INT.withName("acquired_frame_count"),
          MemoryLayout.paddingLayout(4));
  public static final GroupLayout RenderedFeature =
      MemoryLayout.structLayout(
          Layouts.BufferView.withName("feature"),
          Layouts.BufferView.withName("layer_id"),
          Layouts.BufferView.withName("source_id"),
          Layouts.BufferView.withName("source_layer_id"),
          Layouts.BufferView.withName("state"));
  public static final GroupLayout RenderedFeatureQueryOptions =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("fields"),
          ADDRESS.withName("layer_ids"),
          JAVA_LONG.withName("layer_id_count"),
          Layouts.BufferView.withName("filter"));
  public static final GroupLayout ScreenBox =
      MemoryLayout.structLayout(
          Layouts.ScreenPoint.withName("min"), Layouts.ScreenPoint.withName("max"));
  public static final GroupLayout ScreenLineString =
      MemoryLayout.structLayout(ADDRESS.withName("points"), JAVA_LONG.withName("point_count"));
  public static final GroupLayout RenderedQueryGeometryData =
      MemoryLayout.unionLayout(
          Layouts.ScreenPoint.withName("point"),
          Layouts.ScreenBox.withName("box"),
          Layouts.ScreenLineString.withName("line_string"));
  public static final GroupLayout RenderedQueryGeometry =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("type"),
          Layouts.RenderedQueryGeometryData.withName("data"));
  public static final GroupLayout RenderingStats =
      MemoryLayout.structLayout(
          JAVA_DOUBLE.withName("encoding_time"),
          JAVA_DOUBLE.withName("rendering_time"),
          JAVA_LONG.withName("frame_count"),
          JAVA_LONG.withName("draw_call_count"),
          JAVA_LONG.withName("total_draw_call_count"));
  public static final GroupLayout ResourceProvider =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.paddingLayout(4),
          ADDRESS.withName("callback"),
          ADDRESS.withName("user_data"),
          ADDRESS.withName("release_user_data"),
          JAVA_LONG.withName("queue"),
          ADDRESS.withName("routes"),
          JAVA_LONG.withName("route_count"));
  public static final GroupLayout ResourceRange =
      MemoryLayout.structLayout(JAVA_LONG.withName("start"), JAVA_LONG.withName("end"));
  public static final GroupLayout ResourceRequestCancelHandler =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.paddingLayout(4),
          ADDRESS.withName("callback"),
          ADDRESS.withName("user_data"),
          ADDRESS.withName("release_user_data"),
          JAVA_LONG.withName("queue"));
  public static final GroupLayout ResourceRequestInfo =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("fields"),
          Layouts.BufferView.withName("requested_url"),
          Layouts.BufferView.withName("resolved_url"),
          JAVA_INT.withName("kind"),
          JAVA_INT.withName("loading_method"),
          JAVA_INT.withName("priority"),
          JAVA_INT.withName("usage"),
          JAVA_INT.withName("storage_policy"),
          MemoryLayout.paddingLayout(4),
          Layouts.ResourceRange.withName("range"),
          JAVA_LONG.withName("prior_modified_unix_ms"),
          JAVA_LONG.withName("prior_expires_unix_ms"),
          Layouts.BufferView.withName("prior_etag"),
          ADDRESS.withName("prior_data"),
          JAVA_LONG.withName("prior_data_size"));
  public static final GroupLayout ResourceResponse =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("fields"),
          JAVA_INT.withName("status"),
          JAVA_INT.withName("error_reason"),
          ADDRESS.withName("bytes"),
          JAVA_LONG.withName("byte_count"),
          Layouts.BufferView.withName("error_message"),
          JAVA_BOOLEAN.withName("must_revalidate"),
          MemoryLayout.paddingLayout(7),
          JAVA_LONG.withName("modified_unix_ms"),
          JAVA_LONG.withName("expires_unix_ms"),
          Layouts.BufferView.withName("etag"),
          JAVA_LONG.withName("retry_after_unix_ms"));
  public static final GroupLayout ResourceRoute =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("kinds"),
          JAVA_INT.withName("flags"),
          MemoryLayout.paddingLayout(4),
          Layouts.BufferView.withName("url"));
  public static final GroupLayout ResourceTransform =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.paddingLayout(4),
          ADDRESS.withName("callback"),
          ADDRESS.withName("user_data"),
          ADDRESS.withName("release_user_data"),
          JAVA_LONG.withName("queue"));
  public static final GroupLayout RuntimeEventRenderFrame =
      MemoryLayout.structLayout(
          JAVA_INT.withName("mode"),
          JAVA_BOOLEAN.withName("needs_repaint"),
          JAVA_BOOLEAN.withName("placement_changed"),
          MemoryLayout.paddingLayout(2),
          Layouts.RenderingStats.withName("stats"));
  public static final GroupLayout RuntimeEventRenderMap =
      MemoryLayout.structLayout(JAVA_INT.withName("mode"));
  public static final GroupLayout TileId =
      MemoryLayout.structLayout(
          JAVA_INT.withName("overscaled_z"),
          JAVA_INT.withName("wrap"),
          JAVA_INT.withName("canonical_z"),
          JAVA_INT.withName("canonical_x"),
          JAVA_INT.withName("canonical_y"));
  public static final GroupLayout RuntimeEventTileAction =
      MemoryLayout.structLayout(JAVA_INT.withName("operation"), Layouts.TileId.withName("tile_id"));
  public static final GroupLayout RuntimeEventOfflineRegionStatus =
      MemoryLayout.structLayout(
          JAVA_LONG.withName("region_id"), Layouts.OfflineRegionStatus.withName("status"));
  public static final GroupLayout RuntimeEventOfflineRegionResponseError =
      MemoryLayout.structLayout(
          JAVA_LONG.withName("region_id"),
          JAVA_INT.withName("reason"),
          MemoryLayout.paddingLayout(4));
  public static final GroupLayout RuntimeEventOfflineRegionTileCountLimit =
      MemoryLayout.structLayout(JAVA_LONG.withName("region_id"), JAVA_LONG.withName("limit"));
  public static final GroupLayout RuntimeEventGlyphs =
      MemoryLayout.structLayout(
          ADDRESS.withName("font_stack"),
          JAVA_LONG.withName("font_count"),
          JAVA_INT.withName("first"),
          JAVA_INT.withName("last"),
          JAVA_BOOLEAN.withName("font_face"),
          MemoryLayout.paddingLayout(7));
  public static final GroupLayout RuntimeEventSprite =
      MemoryLayout.structLayout(
          Layouts.BufferView.withName("id"), Layouts.BufferView.withName("url"));
  public static final GroupLayout RuntimeEventPayload =
      MemoryLayout.unionLayout(
          Layouts.RuntimeEventRenderFrame.withName("render_frame"),
          Layouts.RuntimeEventRenderMap.withName("render_map"),
          Layouts.RuntimeEventTileAction.withName("tile_action"),
          Layouts.RuntimeEventOfflineRegionStatus.withName("offline_region_status"),
          Layouts.RuntimeEventOfflineRegionResponseError.withName("offline_region_response_error"),
          Layouts.RuntimeEventOfflineRegionTileCountLimit.withName(
              "offline_region_tile_count_limit"),
          Layouts.RuntimeEventGlyphs.withName("glyphs"),
          Layouts.RuntimeEventSprite.withName("sprite"));
  public static final GroupLayout RuntimeEvent =
      MemoryLayout.structLayout(
          JAVA_INT.withName("type"),
          JAVA_INT.withName("source_type"),
          JAVA_LONG.withName("source"),
          JAVA_LONG.withName("generation"),
          JAVA_INT.withName("code"),
          JAVA_INT.withName("payload_type"),
          Layouts.BufferView.withName("message"),
          Layouts.RuntimeEventPayload.withName("payload"));
  public static final GroupLayout RuntimeEventHandler =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.paddingLayout(4),
          ADDRESS.withName("callback"),
          ADDRESS.withName("user_data"),
          ADDRESS.withName("release_user_data"),
          JAVA_LONG.withName("queue"));
  public static final GroupLayout RuntimeOptions =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.paddingLayout(4),
          Layouts.BufferView.withName("asset_path"),
          Layouts.BufferView.withName("cache_path"));
  public static final GroupLayout SourceFeature =
      MemoryLayout.structLayout(
          Layouts.BufferView.withName("feature"), Layouts.BufferView.withName("source_layer_id"));
  public static final GroupLayout SourceFeatureQueryOptions =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("fields"),
          ADDRESS.withName("source_layer_ids"),
          JAVA_LONG.withName("source_layer_id_count"),
          Layouts.BufferView.withName("filter"));
  public static final GroupLayout StyleExpressionInfo =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_BOOLEAN.withName("is_feature_constant"),
          JAVA_BOOLEAN.withName("is_zoom_constant"),
          MemoryLayout.paddingLayout(2));
  public static final GroupLayout StyleExpressionInputs =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("fields"),
          JAVA_DOUBLE.withName("zoom"),
          JAVA_DOUBLE.withName("color_ramp_parameter"),
          JAVA_DOUBLE.withName("elevation"),
          Layouts.BufferView.withName("feature"),
          Layouts.BufferView.withName("feature_state"),
          Layouts.BufferView.withName("global_state"),
          Layouts.CanonicalTileId.withName("canonical_tile_id"),
          MemoryLayout.paddingLayout(4),
          ADDRESS.withName("available_images"),
          JAVA_LONG.withName("available_image_count"));
  public static final GroupLayout StyleExpressionType =
      MemoryLayout.structLayout(
          JAVA_INT.withName("kind"),
          JAVA_INT.withName("item_kind"),
          JAVA_INT.withName("item_count"));
  public static final GroupLayout StyleExpressionOptions =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("fields"),
          Layouts.StyleExpressionType.withName("expected_type"));
  public static final GroupLayout StyleImageInfo =
      MemoryLayout.structLayout(
          JAVA_INT.withName("width"),
          JAVA_INT.withName("height"),
          JAVA_INT.withName("fields"),
          MemoryLayout.paddingLayout(4),
          Layouts.BufferView.withName("pixels"),
          ADDRESS.withName("stretch_x"),
          JAVA_LONG.withName("stretch_x_count"),
          ADDRESS.withName("stretch_y"),
          JAVA_LONG.withName("stretch_y_count"),
          Layouts.ImageContent.withName("content"),
          JAVA_INT.withName("text_fit_width"),
          JAVA_INT.withName("text_fit_height"),
          JAVA_FLOAT.withName("pixel_ratio"),
          JAVA_BOOLEAN.withName("sdf"),
          JAVA_BOOLEAN.withName("keep_unused"),
          MemoryLayout.paddingLayout(2));
  public static final GroupLayout StyleImageOptions =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("fields"),
          ADDRESS.withName("stretch_x"),
          JAVA_LONG.withName("stretch_x_count"),
          ADDRESS.withName("stretch_y"),
          JAVA_LONG.withName("stretch_y_count"),
          Layouts.ImageContent.withName("content"),
          JAVA_INT.withName("text_fit_width"),
          JAVA_INT.withName("text_fit_height"),
          JAVA_FLOAT.withName("pixel_ratio"),
          JAVA_BOOLEAN.withName("sdf"),
          JAVA_BOOLEAN.withName("keep_unused"),
          MemoryLayout.paddingLayout(2));
  public static final GroupLayout StyleLayerInfo =
      MemoryLayout.structLayout(
          Layouts.BufferView.withName("id"),
          Layouts.BufferView.withName("type"),
          Layouts.BufferView.withName("source_id"),
          Layouts.BufferView.withName("source_layer"),
          JAVA_DOUBLE.withName("min_zoom"),
          JAVA_DOUBLE.withName("max_zoom"),
          JAVA_INT.withName("visibility"),
          MemoryLayout.paddingLayout(4));
  public static final GroupLayout StyleSourceTileInfo =
      MemoryLayout.structLayout(
          ADDRESS.withName("tile_urls"),
          JAVA_LONG.withName("tile_url_count"),
          JAVA_DOUBLE.withName("min_zoom"),
          JAVA_DOUBLE.withName("max_zoom"),
          JAVA_INT.withName("scheme"),
          MemoryLayout.paddingLayout(4));
  public static final GroupLayout StyleSourceInfo =
      MemoryLayout.structLayout(
          Layouts.BufferView.withName("id"),
          JAVA_INT.withName("type"),
          JAVA_INT.withName("fields"),
          JAVA_BOOLEAN.withName("is_volatile"),
          MemoryLayout.paddingLayout(7),
          Layouts.BufferView.withName("attribution"),
          Layouts.BufferView.withName("url"),
          Layouts.StyleSourceTileInfo.withName("tile_json"),
          Layouts.LatLngBounds.withName("bounds"),
          JAVA_INT.withName("tile_size"),
          JAVA_INT.withName("vector_encoding"),
          JAVA_INT.withName("raster_encoding"),
          MemoryLayout.paddingLayout(4));
  public static final GroupLayout StyleTransitionOptions =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          JAVA_INT.withName("fields"),
          JAVA_DOUBLE.withName("duration_ms"),
          JAVA_DOUBLE.withName("delay_ms"),
          JAVA_BOOLEAN.withName("enable_placement_transitions"),
          MemoryLayout.paddingLayout(7));
  public static final GroupLayout TextureImageInfo =
      MemoryLayout.structLayout(
          JAVA_INT.withName("width"),
          JAVA_INT.withName("height"),
          JAVA_INT.withName("stride"),
          MemoryLayout.paddingLayout(4),
          JAVA_LONG.withName("byte_length"));
  public static final GroupLayout TextureReadbackResult =
      MemoryLayout.structLayout(
          Layouts.BufferView.withName("data"), Layouts.TextureImageInfo.withName("info"));
  public static final GroupLayout VulkanBorrowedTexture =
      MemoryLayout.structLayout(JAVA_LONG.withName("image"), JAVA_LONG.withName("image_view"));
  public static final GroupLayout VulkanContextDescriptor =
      MemoryLayout.structLayout(
          ADDRESS.withName("instance"),
          ADDRESS.withName("physical_device"),
          ADDRESS.withName("device"),
          ADDRESS.withName("graphics_queue"),
          JAVA_INT.withName("graphics_queue_family_index"),
          MemoryLayout.paddingLayout(4),
          ADDRESS.withName("get_instance_proc_addr"),
          ADDRESS.withName("get_device_proc_addr"));
  public static final GroupLayout VulkanBorrowedTextureDescriptor =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.paddingLayout(4),
          Layouts.LogicalExtent.withName("extent"),
          JAVA_INT.withName("physical_width"),
          JAVA_INT.withName("physical_height"),
          Layouts.VulkanContextDescriptor.withName("context"),
          ADDRESS.withName("textures"),
          JAVA_LONG.withName("texture_count"),
          JAVA_INT.withName("format"),
          JAVA_INT.withName("initial_layout"),
          JAVA_INT.withName("final_layout"),
          MemoryLayout.paddingLayout(4));
  public static final GroupLayout VulkanOwnedTextureDescriptor =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.paddingLayout(4),
          Layouts.LogicalExtent.withName("extent"),
          Layouts.VulkanContextDescriptor.withName("context"));
  public static final GroupLayout VulkanSurfaceDescriptor =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.paddingLayout(4),
          Layouts.LogicalExtent.withName("extent"),
          Layouts.VulkanContextDescriptor.withName("context"),
          JAVA_LONG.withName("surface"));
  public static final GroupLayout VulkanTextureFrame =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.paddingLayout(4),
          JAVA_LONG.withName("generation"),
          JAVA_INT.withName("width"),
          JAVA_INT.withName("height"),
          JAVA_DOUBLE.withName("scale_factor"),
          JAVA_LONG.withName("frame_id"),
          JAVA_INT.withName("slot"),
          MemoryLayout.paddingLayout(4),
          JAVA_LONG.withName("image"),
          JAVA_LONG.withName("image_view"),
          ADDRESS.withName("device"),
          JAVA_INT.withName("format"),
          JAVA_INT.withName("layout"));
  public static final GroupLayout WebGpuBorrowedTexture =
      MemoryLayout.structLayout(ADDRESS.withName("texture"), ADDRESS.withName("texture_view"));
  public static final GroupLayout WebGpuContextDescriptor =
      MemoryLayout.structLayout(
          ADDRESS.withName("instance"), ADDRESS.withName("device"), ADDRESS.withName("queue"));
  public static final GroupLayout WebGpuBorrowedTextureDescriptor =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.paddingLayout(4),
          Layouts.LogicalExtent.withName("extent"),
          JAVA_INT.withName("physical_width"),
          JAVA_INT.withName("physical_height"),
          Layouts.WebGpuContextDescriptor.withName("context"),
          ADDRESS.withName("textures"),
          JAVA_LONG.withName("texture_count"),
          JAVA_INT.withName("format"),
          MemoryLayout.paddingLayout(4));
  public static final GroupLayout WebGpuOwnedTextureDescriptor =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.paddingLayout(4),
          Layouts.LogicalExtent.withName("extent"),
          Layouts.WebGpuContextDescriptor.withName("context"));
  public static final GroupLayout WebGpuSurfaceDescriptor =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.paddingLayout(4),
          Layouts.LogicalExtent.withName("extent"),
          Layouts.WebGpuContextDescriptor.withName("context"),
          ADDRESS.withName("surface"),
          JAVA_INT.withName("format"),
          MemoryLayout.paddingLayout(4));
  public static final GroupLayout WebGpuTextureFrame =
      MemoryLayout.structLayout(
          JAVA_INT.withName("size"),
          MemoryLayout.paddingLayout(4),
          JAVA_LONG.withName("generation"),
          JAVA_INT.withName("width"),
          JAVA_INT.withName("height"),
          JAVA_DOUBLE.withName("scale_factor"),
          JAVA_LONG.withName("frame_id"),
          JAVA_INT.withName("slot"),
          MemoryLayout.paddingLayout(4),
          ADDRESS.withName("texture"),
          ADDRESS.withName("texture_view"),
          ADDRESS.withName("device"),
          JAVA_INT.withName("format"),
          MemoryLayout.paddingLayout(4));
}
