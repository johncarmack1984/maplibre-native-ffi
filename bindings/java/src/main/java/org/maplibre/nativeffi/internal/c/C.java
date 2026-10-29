// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi.internal.c;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import java.lang.invoke.*;

/** Desktop C API. Unsigned integers use Java's signed carriers with the same bits. */
public final class C {
  private C() {}

  public static final int MLN_C_VERSION = 0;
  public static final int MLN_AMBIENT_CACHE_OPERATION_RESET_DATABASE = 1;
  public static final int MLN_AMBIENT_CACHE_OPERATION_PACK_DATABASE = 2;
  public static final int MLN_AMBIENT_CACHE_OPERATION_INVALIDATE = 3;
  public static final int MLN_AMBIENT_CACHE_OPERATION_CLEAR = 4;
  public static final int MLN_ANIMATION_OPTION_DURATION = 1;
  public static final int MLN_ANIMATION_OPTION_VELOCITY = 2;
  public static final int MLN_ANIMATION_OPTION_MIN_ZOOM = 4;
  public static final int MLN_ANIMATION_OPTION_EASING = 8;
  public static final int MLN_ANIMATION_OPTION_TRANSITION_ID = 16;
  public static final int MLN_BOUND_OPTION_BOUNDS = 1;
  public static final int MLN_BOUND_OPTION_MIN_ZOOM = 2;
  public static final int MLN_BOUND_OPTION_MAX_ZOOM = 4;
  public static final int MLN_BOUND_OPTION_MIN_PITCH = 8;
  public static final int MLN_BOUND_OPTION_MAX_PITCH = 16;
  public static final int MLN_BOUND_OPTION_UNBOUNDED = 32;
  public static final int MLN_CAMERA_CHANGE_MODE_IMMEDIATE = 0;
  public static final int MLN_CAMERA_CHANGE_MODE_ANIMATED = 1;
  public static final int MLN_CAMERA_DELTA_OFFSET = 1;
  public static final int MLN_CAMERA_DELTA_SCALE = 2;
  public static final int MLN_CAMERA_DELTA_BEARING = 4;
  public static final int MLN_CAMERA_DELTA_PITCH = 8;
  public static final int MLN_CAMERA_DELTA_ANCHOR = 16;
  public static final int MLN_CAMERA_FIT_OPTION_PADDING = 1;
  public static final int MLN_CAMERA_FIT_OPTION_BEARING = 2;
  public static final int MLN_CAMERA_FIT_OPTION_PITCH = 4;
  public static final int MLN_CAMERA_OPTION_CENTER = 1;
  public static final int MLN_CAMERA_OPTION_ZOOM = 2;
  public static final int MLN_CAMERA_OPTION_BEARING = 4;
  public static final int MLN_CAMERA_OPTION_PITCH = 8;
  public static final int MLN_CAMERA_OPTION_CENTER_ALTITUDE = 16;
  public static final int MLN_CAMERA_OPTION_PADDING = 32;
  public static final int MLN_CAMERA_OPTION_ANCHOR = 64;
  public static final int MLN_CAMERA_OPTION_ROLL = 128;
  public static final int MLN_CAMERA_OPTION_FOV = 256;
  public static final int MLN_CAMERA_TRANSITION_OUTCOME_COMPLETED = 0;
  public static final int MLN_CAMERA_TRANSITION_OUTCOME_CANCELLED = 1;
  public static final int MLN_CAMERA_TRANSITION_OUTCOME_CLOSED = 2;
  public static final int MLN_CAMERA_UPDATE_MODE_JUMP = 0;
  public static final int MLN_CAMERA_UPDATE_MODE_EASE = 1;
  public static final int MLN_CAMERA_UPDATE_MODE_FLY = 2;
  public static final int MLN_COMMAND_DISPOSITION_COMMITTED = 0;
  public static final int MLN_COMMAND_DISPOSITION_FAILED = 1;
  public static final int MLN_COMMAND_DISPOSITION_CANCELLED = 2;
  public static final int MLN_CONSTRAIN_MODE_NONE = 0;
  public static final int MLN_CONSTRAIN_MODE_HEIGHT_ONLY = 1;
  public static final int MLN_CONSTRAIN_MODE_WIDTH_AND_HEIGHT = 2;
  public static final int MLN_CONSTRAIN_MODE_SCREEN = 3;
  public static final int MLN_CUSTOM_GEOMETRY_SOURCE_OPTION_MIN_ZOOM = 1;
  public static final int MLN_CUSTOM_GEOMETRY_SOURCE_OPTION_MAX_ZOOM = 2;
  public static final int MLN_CUSTOM_GEOMETRY_SOURCE_OPTION_TOLERANCE = 4;
  public static final int MLN_CUSTOM_GEOMETRY_SOURCE_OPTION_TILE_SIZE = 8;
  public static final int MLN_CUSTOM_GEOMETRY_SOURCE_OPTION_BUFFER = 16;
  public static final int MLN_CUSTOM_GEOMETRY_SOURCE_OPTION_CLIP = 32;
  public static final int MLN_CUSTOM_GEOMETRY_SOURCE_OPTION_WRAP = 64;
  public static final int MLN_CUSTOM_VECTOR_SOURCE_OPTION_MIN_ZOOM = 1;
  public static final int MLN_CUSTOM_VECTOR_SOURCE_OPTION_MAX_ZOOM = 2;
  public static final int MLN_FEATURE_STATE_SELECTOR_FEATURE_ID = 1;
  public static final int MLN_FRAME_DEMAND_FORCE = 1;
  public static final int MLN_FRAME_DEMAND_PRESENT = 2;
  public static final int MLN_FRAME_DEMAND_WAIT_FOR_UPDATE = 4;
  public static final int MLN_FREE_CAMERA_OPTION_POSITION = 1;
  public static final int MLN_FREE_CAMERA_OPTION_ORIENTATION = 2;
  public static final int MLN_GEO_JSON_SOURCE_OPTION_MIN_ZOOM = 1;
  public static final int MLN_GEO_JSON_SOURCE_OPTION_MAX_ZOOM = 2;
  public static final int MLN_GEO_JSON_SOURCE_OPTION_TOLERANCE = 4;
  public static final int MLN_GEO_JSON_SOURCE_OPTION_CLUSTER_MAX_ZOOM = 8;
  public static final int MLN_GEO_JSON_SOURCE_OPTION_BUFFER = 16;
  public static final int MLN_GEO_JSON_SOURCE_OPTION_CLUSTER_RADIUS = 32;
  public static final int MLN_GEO_JSON_SOURCE_OPTION_CLUSTER_MIN_POINTS = 64;
  public static final int MLN_GEO_JSON_SOURCE_OPTION_LINE_METRICS = 128;
  public static final int MLN_GEO_JSON_SOURCE_OPTION_CLUSTER = 256;
  public static final int MLN_GEO_JSON_SOURCE_OPTION_SYNCHRONOUS_TILING = 512;
  public static final int MLN_GESTURE_PHASE_NONE = 0;
  public static final int MLN_GESTURE_PHASE_BEGIN = 1;
  public static final int MLN_GESTURE_PHASE_UPDATE = 2;
  public static final int MLN_GESTURE_PHASE_END = 3;
  public static final int MLN_GESTURE_PHASE_CANCEL = 4;
  public static final int MLN_GPU_SYNC_CPU_COMPLETE = 0;
  public static final int MLN_GPU_SYNC_OPEN_GL_FENCE = 1;
  public static final int MLN_GRAPHICS_DEVICE_OPTION_ADAPTER_INDEX = 1;
  public static final int MLN_GRAPHICS_DEVICE_OPTION_SINGLE_CONTEXT = 2;
  public static final int MLN_LOG_EVENT_GENERAL = 0;
  public static final int MLN_LOG_EVENT_SETUP = 1;
  public static final int MLN_LOG_EVENT_SHADER = 2;
  public static final int MLN_LOG_EVENT_PARSE_STYLE = 3;
  public static final int MLN_LOG_EVENT_PARSE_TILE = 4;
  public static final int MLN_LOG_EVENT_RENDER = 5;
  public static final int MLN_LOG_EVENT_STYLE = 6;
  public static final int MLN_LOG_EVENT_DATABASE = 7;
  public static final int MLN_LOG_EVENT_HTTP_REQUEST = 8;
  public static final int MLN_LOG_EVENT_SPRITE = 9;
  public static final int MLN_LOG_EVENT_IMAGE = 10;
  public static final int MLN_LOG_EVENT_GRAPHICS_BACKEND = 11;
  public static final int MLN_LOG_EVENT_JNI = 12;
  public static final int MLN_LOG_EVENT_ANDROID = 13;
  public static final int MLN_LOG_EVENT_CRASH = 14;
  public static final int MLN_LOG_EVENT_GLYPH = 15;
  public static final int MLN_LOG_EVENT_TIMING = 16;
  public static final int MLN_LOG_SEVERITY_INFO = 1;
  public static final int MLN_LOG_SEVERITY_WARNING = 2;
  public static final int MLN_LOG_SEVERITY_ERROR = 3;
  public static final int MLN_LOG_SEVERITY_FLAG_INFO = 2;
  public static final int MLN_LOG_SEVERITY_FLAG_WARNING = 4;
  public static final int MLN_LOG_SEVERITY_FLAG_ERROR = 8;
  public static final int MLN_LOG_SEVERITY_FLAG_DEFAULT = 6;
  public static final int MLN_LOG_SEVERITY_FLAG_ALL = 14;
  public static final int MLN_MAP_DEBUG_TILE_BORDERS = 2;
  public static final int MLN_MAP_DEBUG_PARSE_STATUS = 4;
  public static final int MLN_MAP_DEBUG_TIMESTAMPS = 8;
  public static final int MLN_MAP_DEBUG_COLLISION = 16;
  public static final int MLN_MAP_DEBUG_OVERDRAW = 32;
  public static final int MLN_MAP_DEBUG_STENCIL_CLIP = 64;
  public static final int MLN_MAP_DEBUG_DEPTH_BUFFER = 128;
  public static final int MLN_MAP_MODE_CONTINUOUS = 0;
  public static final int MLN_MAP_MODE_STATIC = 1;
  public static final int MLN_MAP_MODE_TILE = 2;
  public static final int MLN_MAP_OPTION_EVENT_MASK = 1;
  public static final int MLN_MAP_TILE_OPTION_PREFETCH_ZOOM_DELTA = 1;
  public static final int MLN_MAP_TILE_OPTION_LOD_MIN_RADIUS = 2;
  public static final int MLN_MAP_TILE_OPTION_LOD_SCALE = 4;
  public static final int MLN_MAP_TILE_OPTION_LOD_PITCH_THRESHOLD = 8;
  public static final int MLN_MAP_TILE_OPTION_LOD_ZOOM_SHIFT = 16;
  public static final int MLN_MAP_TILE_OPTION_LOD_MODE = 32;
  public static final int MLN_MAP_VIEWPORT_OPTION_NORTH_ORIENTATION = 1;
  public static final int MLN_MAP_VIEWPORT_OPTION_CONSTRAIN_MODE = 2;
  public static final int MLN_MAP_VIEWPORT_OPTION_VIEWPORT_MODE = 4;
  public static final int MLN_MAP_VIEWPORT_OPTION_FRUSTUM_OFFSET = 8;
  public static final int MLN_NETWORK_STATUS_ONLINE = 1;
  public static final int MLN_NETWORK_STATUS_OFFLINE = 2;
  public static final int MLN_NORTH_ORIENTATION_UP = 0;
  public static final int MLN_NORTH_ORIENTATION_RIGHT = 1;
  public static final int MLN_NORTH_ORIENTATION_DOWN = 2;
  public static final int MLN_NORTH_ORIENTATION_LEFT = 3;
  public static final int MLN_OFFLINE_REGION_DEFINITION_TILE_PYRAMID = 1;
  public static final int MLN_OFFLINE_REGION_DEFINITION_GEOMETRY = 2;
  public static final int MLN_OFFLINE_REGION_DOWNLOAD_INACTIVE = 0;
  public static final int MLN_OFFLINE_REGION_DOWNLOAD_ACTIVE = 1;
  public static final int MLN_OPEN_GL_CLIENT_API_UNSPECIFIED = 0;
  public static final int MLN_OPEN_GL_CLIENT_API_GL = 1;
  public static final int MLN_OPEN_GL_CLIENT_API_GLES = 2;
  public static final int MLN_OPEN_GL_CONTEXT_OWNERSHIP_SHARED = 0;
  public static final int MLN_OPEN_GL_CONTEXT_OWNERSHIP_DEDICATED = 1;
  public static final int MLN_OPEN_GL_CONTEXT_PLATFORM_UNSPECIFIED = 0;
  public static final int MLN_OPEN_GL_CONTEXT_PLATFORM_WGL = 1;
  public static final int MLN_OPEN_GL_CONTEXT_PLATFORM_EGL = 2;
  public static final int MLN_OPEN_GL_CONTEXT_PLATFORM_WEB_GL = 3;
  public static final int MLN_OPEN_GL_CONTEXT_PROVIDER_FLAG_WGL = 1;
  public static final int MLN_OPEN_GL_CONTEXT_PROVIDER_FLAG_EGL = 2;
  public static final int MLN_OPEN_GL_CONTEXT_PROVIDER_FLAG_WEB_GL = 4;
  public static final int MLN_PROJECTION_MODE_AXONOMETRIC = 1;
  public static final int MLN_PROJECTION_MODE_X_SKEW = 2;
  public static final int MLN_PROJECTION_MODE_Y_SKEW = 4;
  public static final int MLN_RENDER_ABANDON_DISPOSITION_CLEAN = 0;
  public static final int MLN_RENDER_ABANDON_DISPOSITION_QUARANTINED = 1;
  public static final int MLN_RENDER_BACKEND_FLAG_METAL = 1;
  public static final int MLN_RENDER_BACKEND_FLAG_VULKAN = 2;
  public static final int MLN_RENDER_BACKEND_FLAG_OPEN_GL = 4;
  public static final int MLN_RENDER_BACKEND_FLAG_WEB_GPU = 8;
  public static final int MLN_RENDER_DRIVER_CORE_WORKER = 1;
  public static final int MLN_RENDER_DRIVER_CALLER_GRAPHICS_THREAD = 2;
  public static final int MLN_RENDER_MODE_PARTIAL = 0;
  public static final int MLN_RENDER_MODE_FULL = 1;
  public static final int MLN_RENDER_RESULT_RENDERED = 0;
  public static final int MLN_RENDER_RESULT_NO_UPDATE = 1;
  public static final int MLN_RENDER_RESULT_TARGET_NOT_READY = 2;
  public static final int MLN_RENDER_RESULT_SUPERSEDED = 3;
  public static final int MLN_RENDER_SESSION_CAPABILITY_FRAME_ACQUISITION = 1;
  public static final int MLN_RENDER_SESSION_CAPABILITY_READBACK = 2;
  public static final int MLN_RENDER_SESSION_CAPABILITY_CONSUMER_SYNC = 4;
  public static final int MLN_RENDER_SESSION_CAPABILITY_PRESENTATION = 8;
  public static final int MLN_RENDER_SESSION_STATE_ATTACHING = 1;
  public static final int MLN_RENDER_SESSION_STATE_ATTACHED = 2;
  public static final int MLN_RENDER_SESSION_STATE_DETACHING = 3;
  public static final int MLN_RENDER_SESSION_STATE_DETACHED = 4;
  public static final int MLN_RENDER_SESSION_STATE_TARGET_LOST = 5;
  public static final int MLN_RENDER_SESSION_STATE_ABANDONED = 6;
  public static final int MLN_RENDERED_FEATURE_QUERY_OPTION_LAYER_IDS = 1;
  public static final int MLN_RENDERED_QUERY_GEOMETRY_TYPE_POINT = 1;
  public static final int MLN_RENDERED_QUERY_GEOMETRY_TYPE_BOX = 2;
  public static final int MLN_RENDERED_QUERY_GEOMETRY_TYPE_LINE_STRING = 3;
  public static final int MLN_RESOURCE_ERROR_REASON_NONE = 0;
  public static final int MLN_RESOURCE_ERROR_REASON_NOT_FOUND = 1;
  public static final int MLN_RESOURCE_ERROR_REASON_SERVER = 2;
  public static final int MLN_RESOURCE_ERROR_REASON_CONNECTION = 3;
  public static final int MLN_RESOURCE_ERROR_REASON_RATE_LIMIT = 4;
  public static final int MLN_RESOURCE_ERROR_REASON_OTHER = 5;
  public static final int MLN_RESOURCE_KIND_UNKNOWN = 0;
  public static final int MLN_RESOURCE_KIND_STYLE = 1;
  public static final int MLN_RESOURCE_KIND_SOURCE = 2;
  public static final int MLN_RESOURCE_KIND_TILE = 3;
  public static final int MLN_RESOURCE_KIND_GLYPHS = 4;
  public static final int MLN_RESOURCE_KIND_SPRITE_IMAGE = 5;
  public static final int MLN_RESOURCE_KIND_SPRITE_JSON = 6;
  public static final int MLN_RESOURCE_KIND_IMAGE = 7;
  public static final int MLN_RESOURCE_KIND_FLAG_UNKNOWN = 1;
  public static final int MLN_RESOURCE_KIND_FLAG_STYLE = 2;
  public static final int MLN_RESOURCE_KIND_FLAG_SOURCE = 4;
  public static final int MLN_RESOURCE_KIND_FLAG_TILE = 8;
  public static final int MLN_RESOURCE_KIND_FLAG_GLYPHS = 16;
  public static final int MLN_RESOURCE_KIND_FLAG_SPRITE_IMAGE = 32;
  public static final int MLN_RESOURCE_KIND_FLAG_SPRITE_JSON = 64;
  public static final int MLN_RESOURCE_KIND_FLAG_IMAGE = 128;
  public static final int MLN_RESOURCE_KIND_FLAG_ALL = 255;
  public static final int MLN_RESOURCE_LOADING_METHOD_ALL = 0;
  public static final int MLN_RESOURCE_LOADING_METHOD_CACHE_ONLY = 1;
  public static final int MLN_RESOURCE_LOADING_METHOD_NETWORK_ONLY = 2;
  public static final int MLN_RESOURCE_PRIORITY_REGULAR = 0;
  public static final int MLN_RESOURCE_PRIORITY_LOW = 1;
  public static final int MLN_RESOURCE_REQUEST_RANGE = 1;
  public static final int MLN_RESOURCE_REQUEST_PRIOR_MODIFIED = 2;
  public static final int MLN_RESOURCE_REQUEST_PRIOR_EXPIRES = 4;
  public static final int MLN_RESOURCE_RESPONSE_MODIFIED = 1;
  public static final int MLN_RESOURCE_RESPONSE_EXPIRES = 2;
  public static final int MLN_RESOURCE_RESPONSE_RETRY_AFTER = 4;
  public static final int MLN_RESOURCE_RESPONSE_STATUS_OK = 0;
  public static final int MLN_RESOURCE_RESPONSE_STATUS_ERROR = 1;
  public static final int MLN_RESOURCE_RESPONSE_STATUS_NO_CONTENT = 2;
  public static final int MLN_RESOURCE_RESPONSE_STATUS_NOT_MODIFIED = 3;
  public static final int MLN_RESOURCE_STORAGE_POLICY_PERMANENT = 0;
  public static final int MLN_RESOURCE_STORAGE_POLICY_VOLATILE = 1;
  public static final int MLN_RESOURCE_USAGE_ONLINE = 0;
  public static final int MLN_RESOURCE_USAGE_OFFLINE = 1;
  public static final long MLN_RUNTIME_EVENT_FLAG_NONE = 0L;
  public static final long MLN_RUNTIME_EVENT_FLAG_MAP_CAMERA_WILL_CHANGE = 2L;
  public static final long MLN_RUNTIME_EVENT_FLAG_MAP_CAMERA_IS_CHANGING = 4L;
  public static final long MLN_RUNTIME_EVENT_FLAG_MAP_CAMERA_DID_CHANGE = 8L;
  public static final long MLN_RUNTIME_EVENT_FLAG_MAP_STYLE_LOADED = 16L;
  public static final long MLN_RUNTIME_EVENT_FLAG_MAP_LOADING_STARTED = 32L;
  public static final long MLN_RUNTIME_EVENT_FLAG_MAP_LOADING_FINISHED = 64L;
  public static final long MLN_RUNTIME_EVENT_FLAG_MAP_LOADING_FAILED = 128L;
  public static final long MLN_RUNTIME_EVENT_FLAG_MAP_IDLE = 256L;
  public static final long MLN_RUNTIME_EVENT_FLAG_MAP_RENDER_ERROR = 512L;
  public static final long MLN_RUNTIME_EVENT_FLAG_MAP_RENDER_FRAME_STARTED = 1024L;
  public static final long MLN_RUNTIME_EVENT_FLAG_MAP_RENDER_FRAME_FINISHED = 2048L;
  public static final long MLN_RUNTIME_EVENT_FLAG_MAP_RENDER_MAP_STARTED = 4096L;
  public static final long MLN_RUNTIME_EVENT_FLAG_MAP_RENDER_MAP_FINISHED = 8192L;
  public static final long MLN_RUNTIME_EVENT_FLAG_MAP_STYLE_IMAGE_MISSING = 16384L;
  public static final long MLN_RUNTIME_EVENT_FLAG_MAP_TILE_ACTION = 32768L;
  public static final long MLN_RUNTIME_EVENT_FLAG_MAP_SOURCE_CHANGED = 65536L;
  public static final long MLN_RUNTIME_EVENT_FLAG_OFFLINE_REGION_STATUS_CHANGED = 131072L;
  public static final long MLN_RUNTIME_EVENT_FLAG_OFFLINE_REGION_RESPONSE_ERROR = 262144L;
  public static final long MLN_RUNTIME_EVENT_FLAG_OFFLINE_REGION_TILE_COUNT_LIMIT_EXCEEDED =
      524288L;
  public static final long MLN_RUNTIME_EVENT_FLAG_MAP_GLYPHS_REQUESTED = 1048576L;
  public static final long MLN_RUNTIME_EVENT_FLAG_MAP_GLYPHS_LOADED = 2097152L;
  public static final long MLN_RUNTIME_EVENT_FLAG_MAP_GLYPHS_ERROR = 4194304L;
  public static final long MLN_RUNTIME_EVENT_FLAG_MAP_SPRITE_REQUESTED = 8388608L;
  public static final long MLN_RUNTIME_EVENT_FLAG_MAP_SPRITE_LOADED = 16777216L;
  public static final long MLN_RUNTIME_EVENT_FLAG_MAP_SPRITE_ERROR = 33554432L;
  public static final long MLN_RUNTIME_EVENT_FLAG_ALL_MAP_EVENTS = 66191358L;
  public static final long MLN_RUNTIME_EVENT_FLAG_ALL_RUNTIME_EVENTS = 917504L;
  public static final long MLN_RUNTIME_EVENT_FLAG_ALL = 67108862L;
  public static final int MLN_RUNTIME_EVENT_PAYLOAD_NONE = 0;
  public static final int MLN_RUNTIME_EVENT_PAYLOAD_RENDER_FRAME = 1;
  public static final int MLN_RUNTIME_EVENT_PAYLOAD_RENDER_MAP = 2;
  public static final int MLN_RUNTIME_EVENT_PAYLOAD_TILE_ACTION = 3;
  public static final int MLN_RUNTIME_EVENT_PAYLOAD_OFFLINE_REGION_STATUS = 4;
  public static final int MLN_RUNTIME_EVENT_PAYLOAD_OFFLINE_REGION_RESPONSE_ERROR = 5;
  public static final int MLN_RUNTIME_EVENT_PAYLOAD_OFFLINE_REGION_TILE_COUNT_LIMIT = 6;
  public static final int MLN_RUNTIME_EVENT_PAYLOAD_GLYPHS = 7;
  public static final int MLN_RUNTIME_EVENT_PAYLOAD_SPRITE = 8;
  public static final int MLN_RUNTIME_EVENT_SOURCE_RUNTIME = 0;
  public static final int MLN_RUNTIME_EVENT_SOURCE_MAP = 1;
  public static final int MLN_RUNTIME_EVENT_MAP_CAMERA_WILL_CHANGE = 1;
  public static final int MLN_RUNTIME_EVENT_MAP_CAMERA_IS_CHANGING = 2;
  public static final int MLN_RUNTIME_EVENT_MAP_CAMERA_DID_CHANGE = 3;
  public static final int MLN_RUNTIME_EVENT_MAP_STYLE_LOADED = 4;
  public static final int MLN_RUNTIME_EVENT_MAP_LOADING_STARTED = 5;
  public static final int MLN_RUNTIME_EVENT_MAP_LOADING_FINISHED = 6;
  public static final int MLN_RUNTIME_EVENT_MAP_LOADING_FAILED = 7;
  public static final int MLN_RUNTIME_EVENT_MAP_IDLE = 8;
  public static final int MLN_RUNTIME_EVENT_MAP_RENDER_ERROR = 9;
  public static final int MLN_RUNTIME_EVENT_MAP_RENDER_FRAME_STARTED = 10;
  public static final int MLN_RUNTIME_EVENT_MAP_RENDER_FRAME_FINISHED = 11;
  public static final int MLN_RUNTIME_EVENT_MAP_RENDER_MAP_STARTED = 12;
  public static final int MLN_RUNTIME_EVENT_MAP_RENDER_MAP_FINISHED = 13;
  public static final int MLN_RUNTIME_EVENT_MAP_STYLE_IMAGE_MISSING = 14;
  public static final int MLN_RUNTIME_EVENT_MAP_TILE_ACTION = 15;
  public static final int MLN_RUNTIME_EVENT_MAP_SOURCE_CHANGED = 16;
  public static final int MLN_RUNTIME_EVENT_OFFLINE_REGION_STATUS_CHANGED = 17;
  public static final int MLN_RUNTIME_EVENT_OFFLINE_REGION_RESPONSE_ERROR = 18;
  public static final int MLN_RUNTIME_EVENT_OFFLINE_REGION_TILE_COUNT_LIMIT_EXCEEDED = 19;
  public static final int MLN_RUNTIME_EVENT_MAP_GLYPHS_REQUESTED = 20;
  public static final int MLN_RUNTIME_EVENT_MAP_GLYPHS_LOADED = 21;
  public static final int MLN_RUNTIME_EVENT_MAP_GLYPHS_ERROR = 22;
  public static final int MLN_RUNTIME_EVENT_MAP_SPRITE_REQUESTED = 23;
  public static final int MLN_RUNTIME_EVENT_MAP_SPRITE_LOADED = 24;
  public static final int MLN_RUNTIME_EVENT_MAP_SPRITE_ERROR = 25;
  public static final int MLN_SOURCE_FEATURE_QUERY_OPTION_SOURCE_LAYER_IDS = 1;
  public static final int MLN_STATUS_OK = 0;
  public static final int MLN_STATUS_INVALID_ARGUMENT = -1;
  public static final int MLN_STATUS_INVALID_STATE = -2;
  public static final int MLN_STATUS_WRONG_THREAD = -3;
  public static final int MLN_STATUS_UNSUPPORTED = -4;
  public static final int MLN_STATUS_NATIVE_ERROR = -5;
  public static final int MLN_STATUS_CANCELLED = -6;
  public static final int MLN_STATUS_BUSY = -7;
  public static final int MLN_STATUS_TARGET_LOST = -8;
  public static final int MLN_STATUS_NOT_READY = -9;
  public static final int MLN_STATUS_NOT_FOUND = -10;
  public static final int MLN_STYLE_EXPRESSION_INPUT_ZOOM = 1;
  public static final int MLN_STYLE_EXPRESSION_INPUT_COLOR_RAMP_PARAMETER = 2;
  public static final int MLN_STYLE_EXPRESSION_INPUT_ELEVATION = 4;
  public static final int MLN_STYLE_EXPRESSION_INPUT_CANONICAL_TILE_ID = 8;
  public static final int MLN_STYLE_EXPRESSION_OPTION_EXPECTED_TYPE = 1;
  public static final int MLN_STYLE_EXPRESSION_TYPE_VALUE = 0;
  public static final int MLN_STYLE_EXPRESSION_TYPE_NUMBER = 1;
  public static final int MLN_STYLE_EXPRESSION_TYPE_STRING = 2;
  public static final int MLN_STYLE_EXPRESSION_TYPE_BOOLEAN = 3;
  public static final int MLN_STYLE_EXPRESSION_TYPE_COLOR = 4;
  public static final int MLN_STYLE_EXPRESSION_TYPE_OBJECT = 5;
  public static final int MLN_STYLE_EXPRESSION_TYPE_FORMATTED = 6;
  public static final int MLN_STYLE_EXPRESSION_TYPE_IMAGE = 7;
  public static final int MLN_STYLE_EXPRESSION_TYPE_PADDING = 8;
  public static final int MLN_STYLE_EXPRESSION_TYPE_VARIABLE_ANCHOR_OFFSET_COLLECTION = 9;
  public static final int MLN_STYLE_EXPRESSION_TYPE_ARRAY = 10;
  public static final int MLN_STYLE_IMAGE_INFO_CONTENT = 1;
  public static final int MLN_STYLE_IMAGE_INFO_TEXT_FIT_WIDTH = 2;
  public static final int MLN_STYLE_IMAGE_INFO_TEXT_FIT_HEIGHT = 4;
  public static final int MLN_STYLE_IMAGE_OPTION_PIXEL_RATIO = 1;
  public static final int MLN_STYLE_IMAGE_OPTION_SDF = 2;
  public static final int MLN_STYLE_IMAGE_OPTION_STRETCH_X = 4;
  public static final int MLN_STYLE_IMAGE_OPTION_STRETCH_Y = 8;
  public static final int MLN_STYLE_IMAGE_OPTION_CONTENT = 16;
  public static final int MLN_STYLE_IMAGE_OPTION_TEXT_FIT_WIDTH = 32;
  public static final int MLN_STYLE_IMAGE_OPTION_TEXT_FIT_HEIGHT = 64;
  public static final int MLN_STYLE_IMAGE_OPTION_KEEP_UNUSED = 128;
  public static final int MLN_STYLE_IMAGE_TEXT_FIT_STRETCH_OR_SHRINK = 0;
  public static final int MLN_STYLE_IMAGE_TEXT_FIT_STRETCH_ONLY = 1;
  public static final int MLN_STYLE_IMAGE_TEXT_FIT_PROPORTIONAL = 2;
  public static final int MLN_STYLE_LAYER_VISIBILITY_VISIBLE = 0;
  public static final int MLN_STYLE_LAYER_VISIBILITY_NONE = 1;
  public static final int MLN_STYLE_RASTER_DEM_ENCODING_MAPBOX = 0;
  public static final int MLN_STYLE_RASTER_DEM_ENCODING_TERRARIUM = 1;
  public static final int MLN_STYLE_SOURCE_INFO_TILE_JSON = 1;
  public static final int MLN_STYLE_SOURCE_INFO_BOUNDS = 2;
  public static final int MLN_STYLE_SOURCE_INFO_TILE_SIZE = 4;
  public static final int MLN_STYLE_SOURCE_INFO_VECTOR_ENCODING = 8;
  public static final int MLN_STYLE_SOURCE_INFO_RASTER_ENCODING = 16;
  public static final int MLN_STYLE_SOURCE_TYPE_UNKNOWN = 0;
  public static final int MLN_STYLE_SOURCE_TYPE_VECTOR = 1;
  public static final int MLN_STYLE_SOURCE_TYPE_RASTER = 2;
  public static final int MLN_STYLE_SOURCE_TYPE_RASTER_DEM = 3;
  public static final int MLN_STYLE_SOURCE_TYPE_GEO_JSON = 4;
  public static final int MLN_STYLE_SOURCE_TYPE_IMAGE = 5;
  public static final int MLN_STYLE_SOURCE_TYPE_VIDEO = 6;
  public static final int MLN_STYLE_SOURCE_TYPE_ANNOTATIONS = 7;
  public static final int MLN_STYLE_SOURCE_TYPE_CUSTOM_GEOMETRY = 8;
  public static final int MLN_STYLE_SOURCE_TYPE_CUSTOM_VECTOR = 9;
  public static final int MLN_STYLE_TILE_SCHEME_XYZ = 0;
  public static final int MLN_STYLE_TILE_SCHEME_TMS = 1;
  public static final int MLN_STYLE_TRANSITION_OPTION_DURATION = 1;
  public static final int MLN_STYLE_TRANSITION_OPTION_DELAY = 2;
  public static final int MLN_STYLE_TRANSITION_OPTION_ENABLE_PLACEMENT_TRANSITIONS = 4;
  public static final int MLN_STYLE_VECTOR_TILE_ENCODING_MVT = 0;
  public static final int MLN_STYLE_VECTOR_TILE_ENCODING_MLT = 1;
  public static final int MLN_TILE_LOD_MODE_DEFAULT = 0;
  public static final int MLN_TILE_LOD_MODE_DISTANCE = 1;
  public static final int MLN_TILE_OPERATION_REQUESTED_FROM_CACHE = 0;
  public static final int MLN_TILE_OPERATION_REQUESTED_FROM_NETWORK = 1;
  public static final int MLN_TILE_OPERATION_LOAD_FROM_NETWORK = 2;
  public static final int MLN_TILE_OPERATION_LOAD_FROM_CACHE = 3;
  public static final int MLN_TILE_OPERATION_START_PARSE = 4;
  public static final int MLN_TILE_OPERATION_END_PARSE = 5;
  public static final int MLN_TILE_OPERATION_ERROR = 6;
  public static final int MLN_TILE_OPERATION_CANCELLED = 7;
  public static final int MLN_TILE_OPERATION_NULL = 8;
  public static final int MLN_URL_MATCH_EXACT = 0;
  public static final int MLN_URL_MATCH_GLOB = 1;
  public static final int MLN_VIEWPORT_MODE_DEFAULT = 0;
  public static final int MLN_VIEWPORT_MODE_FLIPPED_Y = 1;
  public static final int MLN_WEB_GL_CONTEXT_EXISTING = 0;
  public static final int MLN_WEB_GL_CONTEXT_TRANSFERRED_CANVAS = 1;

  private static final class Fn_mln_acquired_frame_discard {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_acquired_frame_discard", FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS));
  }

  /**
   * Consumes an acquired frame without consumer GPU synchronization, so it quarantines the
   * frame&#x27;s slot of the texture ring.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_acquired_frame_discard</a>
   */
  public static int mln_acquired_frame_discard(long frame, MemorySegment out_diagnostic) {
    try {
      return (int) Fn_mln_acquired_frame_discard.HANDLE.invokeExact(frame, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_acquired_frame_get_metal_texture {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_acquired_frame_get_metal_texture",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Copies Metal-native metadata from an acquired frame.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_acquired_frame_get_metal_texture</a>
   */
  /** Available on: macos. */
  public static int mln_acquired_frame_get_metal_texture(
      long frame, MemorySegment out_frame, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_acquired_frame_get_metal_texture.HANDLE.invokeExact(
              frame, out_frame, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_acquired_frame_get_open_gl_texture {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_acquired_frame_get_open_gl_texture",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Copies OpenGL-native metadata from an acquired frame.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_acquired_frame_get_open_gl_texture</a>
   */
  public static int mln_acquired_frame_get_open_gl_texture(
      long frame, MemorySegment out_frame, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_acquired_frame_get_open_gl_texture.HANDLE.invokeExact(
              frame, out_frame, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_acquired_frame_get_producer_sync {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_acquired_frame_get_producer_sync",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Copies the producer synchronization for an acquired texture frame.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_acquired_frame_get_producer_sync</a>
   */
  public static int mln_acquired_frame_get_producer_sync(
      long frame, MemorySegment out_sync, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_acquired_frame_get_producer_sync.HANDLE.invokeExact(
              frame, out_sync, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_acquired_frame_get_result {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_acquired_frame_get_result",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Copies common metadata for an acquired frame.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_acquired_frame_get_result</a>
   */
  public static int mln_acquired_frame_get_result(
      long frame, MemorySegment out_result, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_acquired_frame_get_result.HANDLE.invokeExact(frame, out_result, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_acquired_frame_get_vulkan_texture {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_acquired_frame_get_vulkan_texture",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Copies Vulkan-native metadata from an acquired frame.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_acquired_frame_get_vulkan_texture</a>
   */
  public static int mln_acquired_frame_get_vulkan_texture(
      long frame, MemorySegment out_frame, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_acquired_frame_get_vulkan_texture.HANDLE.invokeExact(
              frame, out_frame, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_acquired_frame_release {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_acquired_frame_release",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Releases an acquired frame after the host&#x27;s GPU work that reads it.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_acquired_frame_release</a>
   */
  public static int mln_acquired_frame_release(
      long frame, MemorySegment consumer_completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_acquired_frame_release.HANDLE.invokeExact(
              frame, consumer_completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_acquired_frame_view_begin {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_acquired_frame_view_begin",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Begins an allocation-free scope that borrows an acquired frame.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_acquired_frame_view_begin</a>
   */
  public static int mln_acquired_frame_view_begin(
      long frame, MemorySegment out_scope, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_acquired_frame_view_begin.HANDLE.invokeExact(frame, out_scope, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_acquired_frame_view_end {
    static final MethodHandle HANDLE =
        Ffm.downcall("mln_acquired_frame_view_end", FunctionDescriptor.ofVoid(ADDRESS));
  }

  /**
   * Ends one scope from {@code mln_acquired_frame_view_begin()}. Null has no effect.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_acquired_frame_view_end</a>
   */
  public static void mln_acquired_frame_view_end(MemorySegment scope) {
    try {
      Fn_mln_acquired_frame_view_end.HANDLE.invokeExact(scope);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_binding_dart_wake_create {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_binding_dart_wake_create",
            FunctionDescriptor.of(JAVA_INT, ADDRESS, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Creates a wake that posts integer messages through Dart native API version 2.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/binding__support_8h.html">mln_binding_dart_wake_create</a>
   */
  public static int mln_binding_dart_wake_create(
      MemorySegment post_cobject, long port, MemorySegment out_wake, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_binding_dart_wake_create.HANDLE.invokeExact(
              post_cobject, port, out_wake, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_binding_owner_finalize {
    static final MethodHandle HANDLE =
        Ffm.downcall("mln_binding_owner_finalize", FunctionDescriptor.ofVoid(ADDRESS));
  }

  /**
   * Disposes the token&#x27;s native owner and releases the token on any thread.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/binding__support_8h.html">mln_binding_owner_finalize</a>
   */
  public static void mln_binding_owner_finalize(MemorySegment token) {
    try {
      Fn_mln_binding_owner_finalize.HANDLE.invokeExact(token);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_binding_owner_token_create {
    static final MethodHandle HANDLE =
        Ffm.downcall("mln_binding_owner_token_create", FunctionDescriptor.of(ADDRESS, JAVA_LONG));
  }

  /**
   * Creates a finalizer token for one owned native handle.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/binding__support_8h.html">mln_binding_owner_token_create</a>
   */
  public static MemorySegment mln_binding_owner_token_create(long handle) {
    try {
      return (MemorySegment) Fn_mln_binding_owner_token_create.HANDLE.invokeExact(handle);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_binding_owner_token_destroy {
    static final MethodHandle HANDLE =
        Ffm.downcall("mln_binding_owner_token_destroy", FunctionDescriptor.ofVoid(ADDRESS));
  }

  /**
   * Releases a finalizer token after explicit owner release.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/binding__support_8h.html">mln_binding_owner_token_destroy</a>
   */
  public static void mln_binding_owner_token_destroy(MemorySegment token) {
    try {
      Fn_mln_binding_owner_token_destroy.HANDLE.invokeExact(token);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_binding_render_session_abandon_at_exit {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_binding_render_session_abandon_at_exit",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Abandons a render session during a host runtime&#x27;s shutdown, keeping its graphics objects.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/binding__support_8h.html">mln_binding_render_session_abandon_at_exit</a>
   */
  public static int mln_binding_render_session_abandon_at_exit(
      long session, MemorySegment out_result, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_binding_render_session_abandon_at_exit.HANDLE.invokeExact(
              session, out_result, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_c_version {
    static final MethodHandle HANDLE =
        Ffm.downcall("mln_c_version", FunctionDescriptor.of(JAVA_INT));
  }

  /**
   * Reports the C ABI contract version. The value is 0 while the ABI is unstable, and will
   * increment on each SemVer major release.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/base_8h.html">mln_c_version</a>
   */
  public static int mln_c_version() {
    try {
      return (int) Fn_mln_c_version.HANDLE.invokeExact();
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_delivery_queue_create {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_delivery_queue_create",
            FunctionDescriptor.of(JAVA_INT, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Creates a delivery queue.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/delivery_8h.html">mln_delivery_queue_create</a>
   */
  public static int mln_delivery_queue_create(
      MemorySegment options, MemorySegment out_queue, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_delivery_queue_create.HANDLE.invokeExact(options, out_queue, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_delivery_queue_dispatch {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_delivery_queue_dispatch", FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS));
  }

  /**
   * Runs every call queued so far, in push order, on the calling thread.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/delivery_8h.html">mln_delivery_queue_dispatch</a>
   */
  public static int mln_delivery_queue_dispatch(long queue, MemorySegment out_diagnostic) {
    try {
      return (int) Fn_mln_delivery_queue_dispatch.HANDLE.invokeExact(queue, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_delivery_queue_release {
    static final MethodHandle HANDLE =
        Ffm.downcall("mln_delivery_queue_release", FunctionDescriptor.ofVoid(JAVA_LONG));
  }

  /**
   * Releases a delivery queue. A null handle is a no-op.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/delivery_8h.html">mln_delivery_queue_release</a>
   */
  public static void mln_delivery_queue_release(long queue) {
    try {
      Fn_mln_delivery_queue_release.HANDLE.invokeExact(queue);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_geo_json_source_data_create {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_geo_json_source_data_create",
            FunctionDescriptor.of(JAVA_INT, Layouts.BufferView, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Prepares GeoJSON source data for installation on a map.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_geo_json_source_data_create</a>
   */
  public static int mln_geo_json_source_data_create(
      MemorySegment data,
      MemorySegment options,
      MemorySegment out_data,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_geo_json_source_data_create.HANDLE.invokeExact(
              data, options, out_data, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_geo_json_source_data_release {
    static final MethodHandle HANDLE =
        Ffm.downcall("mln_geo_json_source_data_release", FunctionDescriptor.ofVoid(JAVA_LONG));
  }

  /**
   * Releases prepared GeoJSON source data.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_geo_json_source_data_release</a>
   */
  public static void mln_geo_json_source_data_release(long data) {
    try {
      Fn_mln_geo_json_source_data_release.HANDLE.invokeExact(data);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_graphics_device_create {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_graphics_device_create",
            FunctionDescriptor.of(JAVA_INT, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Creates a graphics device for this build&#x27;s render backend.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/graphics__device_8h.html">mln_graphics_device_create</a>
   */
  public static int mln_graphics_device_create(
      MemorySegment options, MemorySegment out_device, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_graphics_device_create.HANDLE.invokeExact(options, out_device, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_graphics_device_release {
    static final MethodHandle HANDLE =
        Ffm.downcall("mln_graphics_device_release", FunctionDescriptor.ofVoid(JAVA_LONG));
  }

  /**
   * Releases a graphics device.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/graphics__device_8h.html">mln_graphics_device_release</a>
   */
  public static void mln_graphics_device_release(long device) {
    try {
      Fn_mln_graphics_device_release.HANDLE.invokeExact(device);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_http_header_transform_response_set_header {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_http_header_transform_response_set_header",
            FunctionDescriptor.of(
                JAVA_INT, ADDRESS, Layouts.BufferView, Layouts.BufferView, ADDRESS));
  }

  /**
   * Sets one outgoing HTTP request header for the current transform invocation.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_http_header_transform_response_set_header</a>
   */
  public static int mln_http_header_transform_response_set_header(
      MemorySegment response,
      MemorySegment name,
      MemorySegment value,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_http_header_transform_response_set_header.HANDLE.invokeExact(
              response, name, value, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_lat_lng_for_projected_meters {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_lat_lng_for_projected_meters",
            FunctionDescriptor.of(JAVA_INT, Layouts.ProjectedMeters, ADDRESS, ADDRESS));
  }

  /**
   * Converts spherical Mercator projected meters to a geographic coordinate.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/projection_8h.html">mln_lat_lng_for_projected_meters</a>
   */
  public static int mln_lat_lng_for_projected_meters(
      MemorySegment meters, MemorySegment out_coordinate, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_lat_lng_for_projected_meters.HANDLE.invokeExact(
              meters, out_coordinate, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_log_clear_callback {
    static final MethodHandle HANDLE =
        Ffm.downcall("mln_log_clear_callback", FunctionDescriptor.of(JAVA_INT, ADDRESS));
  }

  /**
   * Clears the process-global log callback.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/logging_8h.html">mln_log_clear_callback</a>
   */
  public static int mln_log_clear_callback(MemorySegment out_diagnostic) {
    try {
      return (int) Fn_mln_log_clear_callback.HANDLE.invokeExact(out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_log_set_async_severity_mask {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_log_set_async_severity_mask", FunctionDescriptor.of(JAVA_INT, JAVA_INT, ADDRESS));
  }

  /**
   * Controls which log severities MapLibre Native may dispatch asynchronously.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/logging_8h.html">mln_log_set_async_severity_mask</a>
   */
  public static int mln_log_set_async_severity_mask(int mask, MemorySegment out_diagnostic) {
    try {
      return (int) Fn_mln_log_set_async_severity_mask.HANDLE.invokeExact(mask, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_log_set_callback {
    static final MethodHandle HANDLE =
        Ffm.downcall("mln_log_set_callback", FunctionDescriptor.of(JAVA_INT, ADDRESS, ADDRESS));
  }

  /**
   * Installs a process-global MapLibre Native log callback.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/logging_8h.html">mln_log_set_callback</a>
   */
  public static int mln_log_set_callback(MemorySegment handler, MemorySegment out_diagnostic) {
    try {
      return (int) Fn_mln_log_set_callback.HANDLE.invokeExact(handler, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_logical_extent_physical_size {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_logical_extent_physical_size",
            FunctionDescriptor.of(JAVA_INT, Layouts.LogicalExtent, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Computes the physical device-pixel size of a logical extent.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__target_8h.html">mln_logical_extent_physical_size</a>
   */
  public static int mln_logical_extent_physical_size(
      MemorySegment extent,
      MemorySegment out_width,
      MemorySegment out_height,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_logical_extent_physical_size.HANDLE.invokeExact(
              extent, out_width, out_height, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_add_custom_geometry_source {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_add_custom_geometry_source",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, Layouts.BufferView, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Adds a custom geometry source.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_add_custom_geometry_source</a>
   */
  public static int mln_map_add_custom_geometry_source(
      long map,
      MemorySegment source_id,
      MemorySegment options,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_add_custom_geometry_source.HANDLE.invokeExact(
              map, source_id, options, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_add_custom_vector_source {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_add_custom_vector_source",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, Layouts.BufferView, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Adds a custom vector source.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_add_custom_vector_source</a>
   */
  public static int mln_map_add_custom_vector_source(
      long map,
      MemorySegment source_id,
      MemorySegment options,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_add_custom_vector_source.HANDLE.invokeExact(
              map, source_id, options, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_add_geo_json_source_data {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_add_geo_json_source_data",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, Layouts.BufferView, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Adds a GeoJSON source with prepared inline data.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_add_geo_json_source_data</a>
   */
  public static int mln_map_add_geo_json_source_data(
      long map,
      MemorySegment source_id,
      long data,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_add_geo_json_source_data.HANDLE.invokeExact(
              map, source_id, data, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_add_geo_json_source_url {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_add_geo_json_source_url",
            FunctionDescriptor.of(
                JAVA_INT,
                JAVA_LONG,
                Layouts.BufferView,
                Layouts.BufferView,
                ADDRESS,
                ADDRESS,
                ADDRESS));
  }

  /**
   * Adds a GeoJSON source with URL data.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_add_geo_json_source_url</a>
   */
  public static int mln_map_add_geo_json_source_url(
      long map,
      MemorySegment source_id,
      MemorySegment url,
      MemorySegment options,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_add_geo_json_source_url.HANDLE.invokeExact(
              map, source_id, url, options, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_add_image_source_image {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_add_image_source_image",
            FunctionDescriptor.of(
                JAVA_INT,
                JAVA_LONG,
                Layouts.BufferView,
                ADDRESS,
                JAVA_LONG,
                ADDRESS,
                ADDRESS,
                ADDRESS));
  }

  /**
   * Adds an image source with inline image pixels.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_add_image_source_image</a>
   */
  public static int mln_map_add_image_source_image(
      long map,
      MemorySegment source_id,
      MemorySegment coordinates,
      long coordinate_count,
      MemorySegment image,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_add_image_source_image.HANDLE.invokeExact(
              map, source_id, coordinates, coordinate_count, image, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_add_image_source_url {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_add_image_source_url",
            FunctionDescriptor.of(
                JAVA_INT,
                JAVA_LONG,
                Layouts.BufferView,
                ADDRESS,
                JAVA_LONG,
                Layouts.BufferView,
                ADDRESS,
                ADDRESS));
  }

  /**
   * Adds an image source that loads its image from a URL.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_add_image_source_url</a>
   */
  public static int mln_map_add_image_source_url(
      long map,
      MemorySegment source_id,
      MemorySegment coordinates,
      long coordinate_count,
      MemorySegment url,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_add_image_source_url.HANDLE.invokeExact(
              map, source_id, coordinates, coordinate_count, url, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_add_style_layer_json {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_add_style_layer_json",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, Layouts.BufferView, Layouts.BufferView, ADDRESS, ADDRESS));
  }

  /**
   * Adds one style layer from a full style-spec layer JSON object.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_add_style_layer_json</a>
   */
  public static int mln_map_add_style_layer_json(
      long map,
      MemorySegment layer_json,
      MemorySegment before_layer_id,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_add_style_layer_json.HANDLE.invokeExact(
              map, layer_json, before_layer_id, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_add_style_source_json {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_add_style_source_json",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, Layouts.BufferView, Layouts.BufferView, ADDRESS, ADDRESS));
  }

  /**
   * Adds one style source from a style-spec source JSON object.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_add_style_source_json</a>
   */
  public static int mln_map_add_style_source_json(
      long map,
      MemorySegment source_id,
      MemorySegment source_json,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_add_style_source_json.HANDLE.invokeExact(
              map, source_id, source_json, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_apply_camera_delta {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_apply_camera_delta",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Submits one atomic relative camera update.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_apply_camera_delta</a>
   */
  public static int mln_map_apply_camera_delta(
      long map, MemorySegment delta, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_apply_camera_delta.HANDLE.invokeExact(map, delta, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_attach_graphics_device_texture {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_attach_graphics_device_texture",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Starts attachment of a texture target that renders on a graphics device.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/graphics__device_8h.html">mln_map_attach_graphics_device_texture</a>
   */
  public static int mln_map_attach_graphics_device_texture(
      long map,
      long device,
      MemorySegment descriptor,
      MemorySegment options,
      MemorySegment out_session,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_attach_graphics_device_texture.HANDLE.invokeExact(
              map, device, descriptor, options, out_session, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_attach_metal_borrowed_texture {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_attach_metal_borrowed_texture",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Starts attachment of a ring of caller-owned Metal textures.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_map_attach_metal_borrowed_texture</a>
   */
  /** Available on: macos. */
  public static int mln_map_attach_metal_borrowed_texture(
      long map,
      MemorySegment descriptor,
      MemorySegment options,
      MemorySegment out_session,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_attach_metal_borrowed_texture.HANDLE.invokeExact(
              map, descriptor, options, out_session, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_attach_metal_owned_texture {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_attach_metal_owned_texture",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Starts attachment of a session-owned Metal texture ring.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_map_attach_metal_owned_texture</a>
   */
  /** Available on: macos. */
  public static int mln_map_attach_metal_owned_texture(
      long map,
      MemorySegment descriptor,
      MemorySegment options,
      MemorySegment out_session,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_attach_metal_owned_texture.HANDLE.invokeExact(
              map, descriptor, options, out_session, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_attach_metal_surface {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_attach_metal_surface",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Starts attachment of a Metal surface target.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/surface_8h.html">mln_map_attach_metal_surface</a>
   */
  /** Available on: macos. */
  public static int mln_map_attach_metal_surface(
      long map,
      MemorySegment descriptor,
      MemorySegment options,
      MemorySegment out_session,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_attach_metal_surface.HANDLE.invokeExact(
              map, descriptor, options, out_session, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_attach_open_gl_borrowed_texture {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_attach_open_gl_borrowed_texture",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Starts attachment of a ring of caller-owned OpenGL textures.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_map_attach_open_gl_borrowed_texture</a>
   */
  public static int mln_map_attach_open_gl_borrowed_texture(
      long map,
      MemorySegment descriptor,
      MemorySegment options,
      MemorySegment out_session,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_attach_open_gl_borrowed_texture.HANDLE.invokeExact(
              map, descriptor, options, out_session, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_attach_open_gl_owned_texture {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_attach_open_gl_owned_texture",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Starts attachment of a session-owned OpenGL texture ring.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_map_attach_open_gl_owned_texture</a>
   */
  public static int mln_map_attach_open_gl_owned_texture(
      long map,
      MemorySegment descriptor,
      MemorySegment options,
      MemorySegment out_session,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_attach_open_gl_owned_texture.HANDLE.invokeExact(
              map, descriptor, options, out_session, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_attach_open_gl_surface {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_attach_open_gl_surface",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Starts attachment of an OpenGL surface target.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/surface_8h.html">mln_map_attach_open_gl_surface</a>
   */
  public static int mln_map_attach_open_gl_surface(
      long map,
      MemorySegment descriptor,
      MemorySegment options,
      MemorySegment out_session,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_attach_open_gl_surface.HANDLE.invokeExact(
              map, descriptor, options, out_session, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_attach_vulkan_borrowed_texture {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_attach_vulkan_borrowed_texture",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Starts attachment of a ring of caller-owned Vulkan images.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_map_attach_vulkan_borrowed_texture</a>
   */
  public static int mln_map_attach_vulkan_borrowed_texture(
      long map,
      MemorySegment descriptor,
      MemorySegment options,
      MemorySegment out_session,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_attach_vulkan_borrowed_texture.HANDLE.invokeExact(
              map, descriptor, options, out_session, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_attach_vulkan_owned_texture {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_attach_vulkan_owned_texture",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Starts attachment of a session-owned Vulkan texture ring.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_map_attach_vulkan_owned_texture</a>
   */
  public static int mln_map_attach_vulkan_owned_texture(
      long map,
      MemorySegment descriptor,
      MemorySegment options,
      MemorySegment out_session,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_attach_vulkan_owned_texture.HANDLE.invokeExact(
              map, descriptor, options, out_session, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_attach_vulkan_surface {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_attach_vulkan_surface",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Starts attachment of a Vulkan surface target.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/surface_8h.html">mln_map_attach_vulkan_surface</a>
   */
  public static int mln_map_attach_vulkan_surface(
      long map,
      MemorySegment descriptor,
      MemorySegment options,
      MemorySegment out_session,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_attach_vulkan_surface.HANDLE.invokeExact(
              map, descriptor, options, out_session, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_begin_command_group {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_begin_command_group",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Begins a command group, which holds this map&#x27;s render updates until the group ends.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_begin_command_group</a>
   */
  public static int mln_map_begin_command_group(
      long map, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_begin_command_group.HANDLE.invokeExact(map, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_camera_for_geometry {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_camera_for_geometry",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, Layouts.BufferView, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Starts an ordered query for a camera that fits a GeoJSON geometry.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_camera_for_geometry</a>
   */
  public static int mln_map_camera_for_geometry(
      long map,
      MemorySegment geometry,
      MemorySegment fit_options,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_camera_for_geometry.HANDLE.invokeExact(
              map, geometry, fit_options, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_camera_for_lat_lng_bounds {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_camera_for_lat_lng_bounds",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, Layouts.LatLngBounds, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Starts an ordered query for a camera that fits geographic bounds.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_camera_for_lat_lng_bounds</a>
   */
  public static int mln_map_camera_for_lat_lng_bounds(
      long map,
      MemorySegment bounds,
      MemorySegment fit_options,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_camera_for_lat_lng_bounds.HANDLE.invokeExact(
              map, bounds, fit_options, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_camera_for_lat_lngs {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_camera_for_lat_lngs",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, ADDRESS, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Starts an ordered query for a camera that fits geographic coordinates.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_camera_for_lat_lngs</a>
   */
  public static int mln_map_camera_for_lat_lngs(
      long map,
      MemorySegment coordinates,
      long coordinate_count,
      MemorySegment fit_options,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_camera_for_lat_lngs.HANDLE.invokeExact(
              map, coordinates, coordinate_count, fit_options, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_cancel_camera_transition {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_cancel_camera_transition",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Cancels the camera transitions of the commands whose animation carried transition_id, and
   * leaves every other transition running.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_cancel_camera_transition</a>
   */
  public static int mln_map_cancel_camera_transition(
      long map, long transition_id, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_cancel_camera_transition.HANDLE.invokeExact(
              map, transition_id, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_cancel_transitions {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_cancel_transitions",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Cancels the camera transitions running when this command commits.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_cancel_transitions</a>
   */
  public static int mln_map_cancel_transitions(
      long map, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_cancel_transitions.HANDLE.invokeExact(map, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_dispose {
    static final MethodHandle HANDLE =
        Ffm.downcall("mln_map_dispose", FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS));
  }

  /**
   * Consumes a map handle without observing its asynchronous retirement.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_dispose</a>
   */
  public static int mln_map_dispose(long map, MemorySegment out_diagnostic) {
    try {
      return (int) Fn_mln_map_dispose.HANDLE.invokeExact(map, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_dump_debug_logs {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_dump_debug_logs",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Submits an ordered debug-log command.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_dump_debug_logs</a>
   */
  public static int mln_map_dump_debug_logs(
      long map, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int) Fn_mln_map_dump_debug_logs.HANDLE.invokeExact(map, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_end_command_group {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_end_command_group",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Ends the innermost command group that {@code mln_map_begin_command_group()} began.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_end_command_group</a>
   */
  public static int mln_map_end_command_group(
      long map, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int) Fn_mln_map_end_command_group.HANDLE.invokeExact(map, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_get_camera {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_get_camera", FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Starts an ordered camera read.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_get_camera</a>
   */
  public static int mln_map_get_camera(
      long map, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int) Fn_mln_map_get_camera.HANDLE.invokeExact(map, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_get_feature_state {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_get_feature_state",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Starts an ordered read of per-feature state from this map.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_get_feature_state</a>
   */
  public static int mln_map_get_feature_state(
      long map, MemorySegment selector, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_get_feature_state.HANDLE.invokeExact(
              map, selector, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_get_global_state {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_get_global_state",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Queries the global-state JSON object, including style defaults.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_get_global_state</a>
   */
  public static int mln_map_get_global_state(
      long map, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int) Fn_mln_map_get_global_state.HANDLE.invokeExact(map, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_get_image_source_coordinates {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_get_image_source_coordinates",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, Layouts.BufferView, ADDRESS, ADDRESS));
  }

  /**
   * Copies image source coordinates.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_get_image_source_coordinates</a>
   */
  public static int mln_map_get_image_source_coordinates(
      long map, MemorySegment source_id, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_get_image_source_coordinates.HANDLE.invokeExact(
              map, source_id, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_get_loaded_style_json {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_get_loaded_style_json",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Starts an ordered copy of the last successfully parsed style document.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_get_loaded_style_json</a>
   */
  public static int mln_map_get_loaded_style_json(
      long map, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_get_loaded_style_json.HANDLE.invokeExact(map, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_get_snapshot {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_get_snapshot", FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Copies the map&#x27;s latest published snapshot.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_get_snapshot</a>
   */
  public static int mln_map_get_snapshot(
      long map, MemorySegment out_snapshot, MemorySegment out_diagnostic) {
    try {
      return (int) Fn_mln_map_get_snapshot.HANDLE.invokeExact(map, out_snapshot, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_get_style_image {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_get_style_image",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, Layouts.BufferView, ADDRESS, ADDRESS));
  }

  /**
   * Copies one complete runtime style image.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_get_style_image</a>
   */
  public static int mln_map_get_style_image(
      long map, MemorySegment image_id, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_get_style_image.HANDLE.invokeExact(map, image_id, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_get_style_layer {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_get_style_layer",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, Layouts.BufferView, ADDRESS, ADDRESS));
  }

  /**
   * Copies the complete metadata of one style layer.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_get_style_layer</a>
   */
  public static int mln_map_get_style_layer(
      long map, MemorySegment layer_id, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_get_style_layer.HANDLE.invokeExact(map, layer_id, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_get_style_layer_json {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_get_style_layer_json",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, Layouts.BufferView, ADDRESS, ADDRESS));
  }

  /**
   * Serializes one style layer as a full style-spec layer JSON object.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_get_style_layer_json</a>
   */
  public static int mln_map_get_style_layer_json(
      long map, MemorySegment layer_id, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_get_style_layer_json.HANDLE.invokeExact(
              map, layer_id, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_get_style_layer_property {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_get_style_layer_property",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, Layouts.BufferView, Layouts.BufferView, ADDRESS, ADDRESS));
  }

  /**
   * Serializes one layer property as a style-spec JSON value.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_get_style_layer_property</a>
   */
  public static int mln_map_get_style_layer_property(
      long map,
      MemorySegment layer_id,
      MemorySegment property_name,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_get_style_layer_property.HANDLE.invokeExact(
              map, layer_id, property_name, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_get_style_light_property {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_get_style_light_property",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, Layouts.BufferView, ADDRESS, ADDRESS));
  }

  /**
   * Serializes one style light property as a style-spec JSON value.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_get_style_light_property</a>
   */
  public static int mln_map_get_style_light_property(
      long map,
      MemorySegment property_name,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_get_style_light_property.HANDLE.invokeExact(
              map, property_name, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_get_style_source {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_get_style_source",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, Layouts.BufferView, ADDRESS, ADDRESS));
  }

  /**
   * Copies the complete metadata of one style source.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_get_style_source</a>
   */
  public static int mln_map_get_style_source(
      long map, MemorySegment source_id, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_get_style_source.HANDLE.invokeExact(
              map, source_id, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_get_style_transition_options {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_get_style_transition_options",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Reads the style&#x27;s global transition options.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_get_style_transition_options</a>
   */
  public static int mln_map_get_style_transition_options(
      long map, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_get_style_transition_options.HANDLE.invokeExact(
              map, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_get_style_url {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_get_style_url", FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Starts an ordered copy of the last requested style URL.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_get_style_url</a>
   */
  public static int mln_map_get_style_url(
      long map, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int) Fn_mln_map_get_style_url.HANDLE.invokeExact(map, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_invalidate_custom_geometry_source_region {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_invalidate_custom_geometry_source_region",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, Layouts.BufferView, Layouts.LatLngBounds, ADDRESS, ADDRESS));
  }

  /**
   * Invalidates custom geometry source data inside one geographic region.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_invalidate_custom_geometry_source_region</a>
   */
  public static int mln_map_invalidate_custom_geometry_source_region(
      long map,
      MemorySegment source_id,
      MemorySegment bounds,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_invalidate_custom_geometry_source_region.HANDLE.invokeExact(
              map, source_id, bounds, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_invalidate_custom_geometry_source_tile {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_invalidate_custom_geometry_source_tile",
            FunctionDescriptor.of(
                JAVA_INT,
                JAVA_LONG,
                Layouts.BufferView,
                Layouts.CanonicalTileId,
                ADDRESS,
                ADDRESS));
  }

  /**
   * Invalidates custom geometry source data for one canonical tile.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_invalidate_custom_geometry_source_tile</a>
   */
  public static int mln_map_invalidate_custom_geometry_source_tile(
      long map,
      MemorySegment source_id,
      MemorySegment tile_id,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_invalidate_custom_geometry_source_tile.HANDLE.invokeExact(
              map, source_id, tile_id, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_invalidate_custom_vector_source_tile {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_invalidate_custom_vector_source_tile",
            FunctionDescriptor.of(
                JAVA_INT,
                JAVA_LONG,
                Layouts.BufferView,
                Layouts.CanonicalTileId,
                ADDRESS,
                ADDRESS));
  }

  /**
   * Invalidates custom vector source data for one canonical tile.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_invalidate_custom_vector_source_tile</a>
   */
  public static int mln_map_invalidate_custom_vector_source_tile(
      long map,
      MemorySegment source_id,
      MemorySegment tile_id,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_invalidate_custom_vector_source_tile.HANDLE.invokeExact(
              map, source_id, tile_id, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_lat_lng_bounds_for_camera {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_lat_lng_bounds_for_camera",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Starts an ordered wrapped-bounds query for a copied camera.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_lat_lng_bounds_for_camera</a>
   */
  public static int mln_map_lat_lng_bounds_for_camera(
      long map, MemorySegment camera, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_lat_lng_bounds_for_camera.HANDLE.invokeExact(
              map, camera, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_lat_lng_bounds_for_camera_unwrapped {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_lat_lng_bounds_for_camera_unwrapped",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Starts an ordered unwrapped-bounds query for a copied camera.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_lat_lng_bounds_for_camera_unwrapped</a>
   */
  public static int mln_map_lat_lng_bounds_for_camera_unwrapped(
      long map, MemorySegment camera, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_lat_lng_bounds_for_camera_unwrapped.HANDLE.invokeExact(
              map, camera, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_list_style_layers {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_list_style_layers",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Starts an ordered query of every style layer in style order.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_list_style_layers</a>
   */
  public static int mln_map_list_style_layers(
      long map, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int) Fn_mln_map_list_style_layers.HANDLE.invokeExact(map, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_list_style_sources {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_list_style_sources",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Lists every style source in style order.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_list_style_sources</a>
   */
  public static int mln_map_list_style_sources(
      long map, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_list_style_sources.HANDLE.invokeExact(map, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_move_style_layer {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_move_style_layer",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, Layouts.BufferView, Layouts.BufferView, ADDRESS, ADDRESS));
  }

  /**
   * Moves one style layer before another layer or to the top.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_move_style_layer</a>
   */
  public static int mln_map_move_style_layer(
      long map,
      MemorySegment layer_id,
      MemorySegment before_layer_id,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_move_style_layer.HANDLE.invokeExact(
              map, layer_id, before_layer_id, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_projection_create {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_projection_create",
            FunctionDescriptor.of(JAVA_INT, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Creates a standalone projection of a view, such as the view of a rendered frame or of a map
   * snapshot.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/projection_8h.html">mln_map_projection_create</a>
   */
  public static int mln_map_projection_create(
      MemorySegment view, MemorySegment out_projection, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_projection_create.HANDLE.invokeExact(view, out_projection, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_projection_get_camera {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_projection_get_camera",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Copies the projection camera.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/projection_8h.html">mln_map_projection_get_camera</a>
   */
  public static int mln_map_projection_get_camera(
      long projection, MemorySegment out_camera, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_projection_get_camera.HANDLE.invokeExact(
              projection, out_camera, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_projection_lat_lng_for_pixel {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_projection_lat_lng_for_pixel",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, Layouts.ScreenPoint, ADDRESS, ADDRESS));
  }

  /**
   * Converts a screen point to a geographic coordinate.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/projection_8h.html">mln_map_projection_lat_lng_for_pixel</a>
   */
  public static int mln_map_projection_lat_lng_for_pixel(
      long projection,
      MemorySegment point,
      MemorySegment out_coordinate,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_projection_lat_lng_for_pixel.HANDLE.invokeExact(
              projection, point, out_coordinate, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_projection_lat_lng_for_pixel_unwrapped {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_projection_lat_lng_for_pixel_unwrapped",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, Layouts.ScreenPoint, ADDRESS, ADDRESS));
  }

  /**
   * Converts a screen point to an unwrapped geographic coordinate.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/projection_8h.html">mln_map_projection_lat_lng_for_pixel_unwrapped</a>
   */
  public static int mln_map_projection_lat_lng_for_pixel_unwrapped(
      long projection,
      MemorySegment point,
      MemorySegment out_coordinate,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_projection_lat_lng_for_pixel_unwrapped.HANDLE.invokeExact(
              projection, point, out_coordinate, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_projection_lat_lngs_for_pixels {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_projection_lat_lngs_for_pixels",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Converts screen points to geographic coordinates.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/projection_8h.html">mln_map_projection_lat_lngs_for_pixels</a>
   */
  public static int mln_map_projection_lat_lngs_for_pixels(
      long projection,
      MemorySegment points,
      long point_count,
      MemorySegment out_coordinates,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_projection_lat_lngs_for_pixels.HANDLE.invokeExact(
              projection, points, point_count, out_coordinates, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_projection_lat_lngs_for_pixels_unwrapped {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_projection_lat_lngs_for_pixels_unwrapped",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Converts screen points to unwrapped geographic coordinates.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/projection_8h.html">mln_map_projection_lat_lngs_for_pixels_unwrapped</a>
   */
  public static int mln_map_projection_lat_lngs_for_pixels_unwrapped(
      long projection,
      MemorySegment points,
      long point_count,
      MemorySegment out_coordinates,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_projection_lat_lngs_for_pixels_unwrapped.HANDLE.invokeExact(
              projection, points, point_count, out_coordinates, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_projection_meters_per_pixel_at_latitude {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_projection_meters_per_pixel_at_latitude",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_DOUBLE, ADDRESS, ADDRESS));
  }

  /**
   * Reads the ground distance covered by one logical map pixel at a latitude for the helper camera
   * zoom.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/projection_8h.html">mln_map_projection_meters_per_pixel_at_latitude</a>
   */
  public static int mln_map_projection_meters_per_pixel_at_latitude(
      long projection,
      double latitude,
      MemorySegment out_meters_per_pixel,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_projection_meters_per_pixel_at_latitude.HANDLE.invokeExact(
              projection, latitude, out_meters_per_pixel, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_projection_pixel_for_lat_lng {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_projection_pixel_for_lat_lng",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, Layouts.LatLng, ADDRESS, ADDRESS));
  }

  /**
   * Converts a geographic coordinate to a screen point.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/projection_8h.html">mln_map_projection_pixel_for_lat_lng</a>
   */
  public static int mln_map_projection_pixel_for_lat_lng(
      long projection,
      MemorySegment coordinate,
      MemorySegment out_point,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_projection_pixel_for_lat_lng.HANDLE.invokeExact(
              projection, coordinate, out_point, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_projection_pixels_for_lat_lngs {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_projection_pixels_for_lat_lngs",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Converts geographic coordinates to screen points.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/projection_8h.html">mln_map_projection_pixels_for_lat_lngs</a>
   */
  public static int mln_map_projection_pixels_for_lat_lngs(
      long projection,
      MemorySegment coordinates,
      long coordinate_count,
      MemorySegment out_points,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_projection_pixels_for_lat_lngs.HANDLE.invokeExact(
              projection, coordinates, coordinate_count, out_points, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_projection_release {
    static final MethodHandle HANDLE =
        Ffm.downcall("mln_map_projection_release", FunctionDescriptor.ofVoid(JAVA_LONG));
  }

  /**
   * Releases a standalone projection.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/projection_8h.html">mln_map_projection_release</a>
   */
  public static void mln_map_projection_release(long projection) {
    try {
      Fn_mln_map_projection_release.HANDLE.invokeExact(projection);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_projection_set_camera {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_projection_set_camera",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Applies a camera update to a standalone projection.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/projection_8h.html">mln_map_projection_set_camera</a>
   */
  public static int mln_map_projection_set_camera(
      long projection, MemorySegment camera, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_projection_set_camera.HANDLE.invokeExact(projection, camera, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_release {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_release", FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Releases a map asynchronously.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_release</a>
   */
  public static int mln_map_release(
      long map, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int) Fn_mln_map_release.HANDLE.invokeExact(map, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_remove_feature_state {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_remove_feature_state",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Removes per-feature state from this map.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_remove_feature_state</a>
   */
  public static int mln_map_remove_feature_state(
      long map, MemorySegment selector, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_remove_feature_state.HANDLE.invokeExact(
              map, selector, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_remove_style_image {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_remove_style_image",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, Layouts.BufferView, ADDRESS, ADDRESS));
  }

  /**
   * Removes one runtime style image by ID.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_remove_style_image</a>
   */
  public static int mln_map_remove_style_image(
      long map, MemorySegment image_id, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_remove_style_image.HANDLE.invokeExact(
              map, image_id, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_remove_style_layer {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_remove_style_layer",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, Layouts.BufferView, ADDRESS, ADDRESS));
  }

  /**
   * Removes one style layer by ID.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_remove_style_layer</a>
   */
  public static int mln_map_remove_style_layer(
      long map, MemorySegment layer_id, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_remove_style_layer.HANDLE.invokeExact(
              map, layer_id, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_remove_style_source {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_remove_style_source",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, Layouts.BufferView, ADDRESS, ADDRESS));
  }

  /**
   * Removes one style source by ID.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_remove_style_source</a>
   */
  public static int mln_map_remove_style_source(
      long map, MemorySegment source_id, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_remove_style_source.HANDLE.invokeExact(
              map, source_id, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_request_repaint {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_request_repaint",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Requests a repaint for a continuous map.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_request_repaint</a>
   */
  public static int mln_map_request_repaint(
      long map, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int) Fn_mln_map_request_repaint.HANDLE.invokeExact(map, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_request_still_image {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_request_still_image",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Requests one still image for a static or tile map, which renders itself.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_request_still_image</a>
   */
  public static int mln_map_request_still_image(
      long map, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_request_still_image.HANDLE.invokeExact(map, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_resize {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_resize",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, Layouts.LogicalExtent, ADDRESS, ADDRESS));
  }

  /**
   * Submits the sole post-creation logical extent update.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_resize</a>
   */
  public static int mln_map_resize(
      long map, MemorySegment extent, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int) Fn_mln_map_resize.HANDLE.invokeExact(map, extent, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_set_bounds {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_set_bounds",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Submits a copied camera-constraint command.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_set_bounds</a>
   */
  public static int mln_map_set_bounds(
      long map, MemorySegment options, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_set_bounds.HANDLE.invokeExact(map, options, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_set_custom_geometry_source_tile_data {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_set_custom_geometry_source_tile_data",
            FunctionDescriptor.of(
                JAVA_INT,
                JAVA_LONG,
                Layouts.BufferView,
                Layouts.CanonicalTileId,
                Layouts.BufferView,
                ADDRESS,
                ADDRESS));
  }

  /**
   * Sets custom geometry source data for one canonical tile.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_custom_geometry_source_tile_data</a>
   */
  public static int mln_map_set_custom_geometry_source_tile_data(
      long map,
      MemorySegment source_id,
      MemorySegment tile_id,
      MemorySegment data,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_set_custom_geometry_source_tile_data.HANDLE.invokeExact(
              map, source_id, tile_id, data, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_set_custom_geometry_source_tile_error {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_set_custom_geometry_source_tile_error",
            FunctionDescriptor.of(
                JAVA_INT,
                JAVA_LONG,
                Layouts.BufferView,
                Layouts.CanonicalTileId,
                Layouts.BufferView,
                ADDRESS,
                ADDRESS));
  }

  /**
   * Reports a custom geometry source error for one canonical tile.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_custom_geometry_source_tile_error</a>
   */
  public static int mln_map_set_custom_geometry_source_tile_error(
      long map,
      MemorySegment source_id,
      MemorySegment tile_id,
      MemorySegment message,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_set_custom_geometry_source_tile_error.HANDLE.invokeExact(
              map, source_id, tile_id, message, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_set_custom_vector_source_tile_data {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_set_custom_vector_source_tile_data",
            FunctionDescriptor.of(
                JAVA_INT,
                JAVA_LONG,
                Layouts.BufferView,
                Layouts.CanonicalTileId,
                JAVA_INT,
                Layouts.BufferView,
                ADDRESS,
                ADDRESS));
  }

  /**
   * Sets custom vector source data for one canonical tile.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_custom_vector_source_tile_data</a>
   */
  public static int mln_map_set_custom_vector_source_tile_data(
      long map,
      MemorySegment source_id,
      MemorySegment tile_id,
      int encoding,
      MemorySegment data,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_set_custom_vector_source_tile_data.HANDLE.invokeExact(
              map, source_id, tile_id, encoding, data, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_set_custom_vector_source_tile_error {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_set_custom_vector_source_tile_error",
            FunctionDescriptor.of(
                JAVA_INT,
                JAVA_LONG,
                Layouts.BufferView,
                Layouts.CanonicalTileId,
                Layouts.BufferView,
                ADDRESS,
                ADDRESS));
  }

  /**
   * Reports a custom vector source error for one canonical tile.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_custom_vector_source_tile_error</a>
   */
  public static int mln_map_set_custom_vector_source_tile_error(
      long map,
      MemorySegment source_id,
      MemorySegment tile_id,
      MemorySegment message,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_set_custom_vector_source_tile_error.HANDLE.invokeExact(
              map, source_id, tile_id, message, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_set_debug_options {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_set_debug_options",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_INT, ADDRESS, ADDRESS));
  }

  /**
   * Submits a debug-overlay command.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_set_debug_options</a>
   */
  public static int mln_map_set_debug_options(
      long map, int options, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_set_debug_options.HANDLE.invokeExact(map, options, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_set_event_mask {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_set_event_mask",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Selects which map-originated event types this map queues.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_set_event_mask</a>
   */
  public static int mln_map_set_event_mask(
      long map, long mask, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_set_event_mask.HANDLE.invokeExact(map, mask, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_set_feature_state {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_set_feature_state",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, ADDRESS, Layouts.BufferView, ADDRESS, ADDRESS));
  }

  /**
   * Submits a copied per-feature-state command.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_set_feature_state</a>
   */
  public static int mln_map_set_feature_state(
      long map,
      MemorySegment selector,
      MemorySegment state,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_set_feature_state.HANDLE.invokeExact(
              map, selector, state, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_set_free_camera_options {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_set_free_camera_options",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Submits a copied free-camera command.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_set_free_camera_options</a>
   */
  public static int mln_map_set_free_camera_options(
      long map, MemorySegment options, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_set_free_camera_options.HANDLE.invokeExact(
              map, options, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_set_geo_json_source_data {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_set_geo_json_source_data",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, Layouts.BufferView, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Updates one GeoJSON source with prepared inline data.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_geo_json_source_data</a>
   */
  public static int mln_map_set_geo_json_source_data(
      long map,
      MemorySegment source_id,
      long data,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_set_geo_json_source_data.HANDLE.invokeExact(
              map, source_id, data, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_set_geo_json_source_synchronous_tiling {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_set_geo_json_source_synchronous_tiling",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, Layouts.BufferView, JAVA_BOOLEAN, ADDRESS, ADDRESS));
  }

  /**
   * Overrides one GeoJSON source&#x27;s synchronous tiling at runtime.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_geo_json_source_synchronous_tiling</a>
   */
  public static int mln_map_set_geo_json_source_synchronous_tiling(
      long map,
      MemorySegment source_id,
      boolean enabled,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_set_geo_json_source_synchronous_tiling.HANDLE.invokeExact(
              map, source_id, enabled, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_set_geo_json_source_url {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_set_geo_json_source_url",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, Layouts.BufferView, Layouts.BufferView, ADDRESS, ADDRESS));
  }

  /**
   * Updates one GeoJSON source to load data from a URL.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_geo_json_source_url</a>
   */
  public static int mln_map_set_geo_json_source_url(
      long map,
      MemorySegment source_id,
      MemorySegment url,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_set_geo_json_source_url.HANDLE.invokeExact(
              map, source_id, url, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_set_global_state_property {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_set_global_state_property",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, Layouts.BufferView, Layouts.BufferView, ADDRESS, ADDRESS));
  }

  /**
   * Submits a global-state JSON value. JSON null restores the style default.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_global_state_property</a>
   */
  public static int mln_map_set_global_state_property(
      long map,
      MemorySegment property_name,
      MemorySegment value,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_set_global_state_property.HANDLE.invokeExact(
              map, property_name, value, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_set_image_source_coordinates {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_set_image_source_coordinates",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, Layouts.BufferView, ADDRESS, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Updates image source coordinates.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_image_source_coordinates</a>
   */
  public static int mln_map_set_image_source_coordinates(
      long map,
      MemorySegment source_id,
      MemorySegment coordinates,
      long coordinate_count,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_set_image_source_coordinates.HANDLE.invokeExact(
              map, source_id, coordinates, coordinate_count, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_set_image_source_image {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_set_image_source_image",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, Layouts.BufferView, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Updates an image source with inline image pixels.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_image_source_image</a>
   */
  public static int mln_map_set_image_source_image(
      long map,
      MemorySegment source_id,
      MemorySegment image,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_set_image_source_image.HANDLE.invokeExact(
              map, source_id, image, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_set_image_source_url {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_set_image_source_url",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, Layouts.BufferView, Layouts.BufferView, ADDRESS, ADDRESS));
  }

  /**
   * Updates an image source to load its image from a URL.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_image_source_url</a>
   */
  public static int mln_map_set_image_source_url(
      long map,
      MemorySegment source_id,
      MemorySegment url,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_set_image_source_url.HANDLE.invokeExact(
              map, source_id, url, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_set_projection_mode {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_set_projection_mode",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Submits axonometric rendering options.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_set_projection_mode</a>
   */
  public static int mln_map_set_projection_mode(
      long map, MemorySegment mode, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_set_projection_mode.HANDLE.invokeExact(map, mode, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_set_rendering_stats_view_enabled {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_set_rendering_stats_view_enabled",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_BOOLEAN, ADDRESS, ADDRESS));
  }

  /**
   * Submits a rendering-stats visibility command.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_set_rendering_stats_view_enabled</a>
   */
  public static int mln_map_set_rendering_stats_view_enabled(
      long map, boolean enabled, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_set_rendering_stats_view_enabled.HANDLE.invokeExact(
              map, enabled, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_set_style_image {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_set_style_image",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, Layouts.BufferView, ADDRESS, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Sets one runtime style image.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_style_image</a>
   */
  public static int mln_map_set_style_image(
      long map,
      MemorySegment image_id,
      MemorySegment image,
      MemorySegment options,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_set_style_image.HANDLE.invokeExact(
              map, image_id, image, options, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_set_style_json {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_set_style_json",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, Layouts.BufferView, ADDRESS, ADDRESS));
  }

  /**
   * Queues an inline style JSON command. A committed command means the map applied the JSON, not
   * that the style loaded: style loading events report the resource and parse results that follow.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_set_style_json</a>
   */
  public static int mln_map_set_style_json(
      long map, MemorySegment json, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_set_style_json.HANDLE.invokeExact(map, json, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_set_style_layer_property {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_set_style_layer_property",
            FunctionDescriptor.of(
                JAVA_INT,
                JAVA_LONG,
                Layouts.BufferView,
                Layouts.BufferView,
                Layouts.BufferView,
                ADDRESS,
                ADDRESS));
  }

  /**
   * Sets one layer property using its MapLibre style-spec property name.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_style_layer_property</a>
   */
  public static int mln_map_set_style_layer_property(
      long map,
      MemorySegment layer_id,
      MemorySegment property_name,
      MemorySegment value,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_set_style_layer_property.HANDLE.invokeExact(
              map, layer_id, property_name, value, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_set_style_light_json {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_set_style_light_json",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, Layouts.BufferView, ADDRESS, ADDRESS));
  }

  /**
   * Sets the style light from a style-spec light JSON object.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_style_light_json</a>
   */
  public static int mln_map_set_style_light_json(
      long map, MemorySegment light_json, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_set_style_light_json.HANDLE.invokeExact(
              map, light_json, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_set_style_light_property {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_set_style_light_property",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, Layouts.BufferView, Layouts.BufferView, ADDRESS, ADDRESS));
  }

  /**
   * Sets one style light property using its MapLibre style-spec property name.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_style_light_property</a>
   */
  public static int mln_map_set_style_light_property(
      long map,
      MemorySegment property_name,
      MemorySegment value,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_set_style_light_property.HANDLE.invokeExact(
              map, property_name, value, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_set_style_source_volatile {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_set_style_source_volatile",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, Layouts.BufferView, JAVA_BOOLEAN, ADDRESS, ADDRESS));
  }

  /**
   * Sets whether one style source stores fetched tiles in the persistent cache.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_style_source_volatile</a>
   */
  public static int mln_map_set_style_source_volatile(
      long map,
      MemorySegment source_id,
      boolean is_volatile,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_set_style_source_volatile.HANDLE.invokeExact(
              map, source_id, is_volatile, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_set_style_transition_options {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_set_style_transition_options",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Sets the style&#x27;s global transition options.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style_8h.html">mln_map_set_style_transition_options</a>
   */
  public static int mln_map_set_style_transition_options(
      long map, MemorySegment options, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_set_style_transition_options.HANDLE.invokeExact(
              map, options, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_set_style_url {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_set_style_url",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, Layouts.BufferView, ADDRESS, ADDRESS));
  }

  /**
   * Queues a style URL command. A committed command means the map accepted the URL, not that the
   * style loaded: style loading events report the network, decode, and parse results that follow.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_map_set_style_url</a>
   */
  public static int mln_map_set_style_url(
      long map, MemorySegment url, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_set_style_url.HANDLE.invokeExact(map, url, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_set_tile_options {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_set_tile_options",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Submits a copied tile-options command.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_set_tile_options</a>
   */
  public static int mln_map_set_tile_options(
      long map, MemorySegment options, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_set_tile_options.HANDLE.invokeExact(map, options, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_set_viewport_options {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_set_viewport_options",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Submits a copied viewport-options command.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_set_viewport_options</a>
   */
  public static int mln_map_set_viewport_options(
      long map, MemorySegment options, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_set_viewport_options.HANDLE.invokeExact(
              map, options, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_map_update_camera {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_map_update_camera",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Submits one atomic camera update.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/camera_8h.html">mln_map_update_camera</a>
   */
  public static int mln_map_update_camera(
      long map, MemorySegment update, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_map_update_camera.HANDLE.invokeExact(map, update, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_network_get_status {
    static final MethodHandle HANDLE =
        Ffm.downcall("mln_network_get_status", FunctionDescriptor.of(JAVA_INT, ADDRESS, ADDRESS));
  }

  /**
   * Reads MapLibre Native&#x27;s process-global network status.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_network_get_status</a>
   */
  public static int mln_network_get_status(MemorySegment out_status, MemorySegment out_diagnostic) {
    try {
      return (int) Fn_mln_network_get_status.HANDLE.invokeExact(out_status, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_network_set_status {
    static final MethodHandle HANDLE =
        Ffm.downcall("mln_network_set_status", FunctionDescriptor.of(JAVA_INT, JAVA_INT, ADDRESS));
  }

  /**
   * Sets MapLibre Native&#x27;s process-global network status.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_network_set_status</a>
   */
  public static int mln_network_set_status(int status, MemorySegment out_diagnostic) {
    try {
      return (int) Fn_mln_network_set_status.HANDLE.invokeExact(status, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_open_gl_supported_context_provider_mask {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_open_gl_supported_context_provider_mask", FunctionDescriptor.of(JAVA_INT));
  }

  /**
   * Returns OpenGL context providers supported by this build.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__target_8h.html">mln_open_gl_supported_context_provider_mask</a>
   */
  public static int mln_open_gl_supported_context_provider_mask() {
    try {
      return (int) Fn_mln_open_gl_supported_context_provider_mask.HANDLE.invokeExact();
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_plugin_get_register_function_v1 {
    static final MethodHandle HANDLE =
        Ffm.downcall("mln_plugin_get_register_function_v1", FunctionDescriptor.of(ADDRESS));
  }

  /**
   * Returns the process-wide plugin registration entry point; never null.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/plugin_8h.html">mln_plugin_get_register_function_v1</a>
   */
  public static MemorySegment mln_plugin_get_register_function_v1() {
    try {
      return (MemorySegment) Fn_mln_plugin_get_register_function_v1.HANDLE.invokeExact();
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_projected_meters_for_lat_lng {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_projected_meters_for_lat_lng",
            FunctionDescriptor.of(JAVA_INT, Layouts.LatLng, ADDRESS, ADDRESS));
  }

  /**
   * Converts a geographic coordinate to spherical Mercator projected meters.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/projection_8h.html">mln_projected_meters_for_lat_lng</a>
   */
  public static int mln_projected_meters_for_lat_lng(
      MemorySegment coordinate, MemorySegment out_meters, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_projected_meters_for_lat_lng.HANDLE.invokeExact(
              coordinate, out_meters, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_render_frame_batch_release {
    static final MethodHandle HANDLE =
        Ffm.downcall("mln_render_frame_batch_release", FunctionDescriptor.ofVoid(JAVA_LONG));
  }

  /**
   * Releases a frame-result batch.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_frame_batch_release</a>
   */
  public static void mln_render_frame_batch_release(long batch) {
    try {
      Fn_mln_render_frame_batch_release.HANDLE.invokeExact(batch);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_render_session_abandon {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_render_session_abandon",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Irreversibly ends session work and destroys the session&#x27;s graphics objects where that is
   * safe.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_abandon</a>
   */
  public static int mln_render_session_abandon(
      long session, MemorySegment out_result, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_render_session_abandon.HANDLE.invokeExact(session, out_result, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_render_session_acquire_frame {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_render_session_acquire_frame",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Acquires the oldest rendered frame that is not already acquired. The frame owns its slot until
   * release. The call is nonblocking.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_acquire_frame</a>
   */
  public static int mln_render_session_acquire_frame(
      long session, MemorySegment out_frame, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_render_session_acquire_frame.HANDLE.invokeExact(
              session, out_frame, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_render_session_barrier {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_render_session_barrier",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Ends every frame demand that has not started with {@code MLN_RENDER_RESULT_NO_UPDATE} and
   * completes after earlier driver work has finished. A running demand finishes its attempt and
   * ends any wait for a map update or a free slot. After completion, a new frame demand is required
   * to render again, except that a pending still image submits its next demand itself; see {@code
   * mln_map_request_still_image()}.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_barrier</a>
   */
  public static int mln_render_session_barrier(
      long session, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_render_session_barrier.HANDLE.invokeExact(session, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_render_session_clear_data {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_render_session_clear_data",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Starts asynchronous renderer-data clearing.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_clear_data</a>
   */
  public static int mln_render_session_clear_data(
      long session, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_render_session_clear_data.HANDLE.invokeExact(session, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_render_session_detach {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_render_session_detach",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Starts normal graphics-owner teardown and map detachment.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_detach</a>
   */
  public static int mln_render_session_detach(
      long session, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_render_session_detach.HANDLE.invokeExact(session, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_render_session_dispose {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_render_session_dispose",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Consumes a session in any state and retires it, then runs completion, if given, once the host
   * may destroy the target&#x27;s graphics objects.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_dispose</a>
   */
  public static int mln_render_session_dispose(
      long session, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_render_session_dispose.HANDLE.invokeExact(session, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_render_session_drain_frame_results {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_render_session_drain_frame_results",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Drains every currently queued terminal frame result.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_drain_frame_results</a>
   */
  public static int mln_render_session_drain_frame_results(
      long session, MemorySegment out_batch, MemorySegment out_view, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_render_session_drain_frame_results.HANDLE.invokeExact(
              session, out_batch, out_view, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_render_session_dump_debug_logs {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_render_session_dump_debug_logs",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Starts asynchronous renderer diagnostic-log emission.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_dump_debug_logs</a>
   */
  public static int mln_render_session_dump_debug_logs(
      long session, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_render_session_dump_debug_logs.HANDLE.invokeExact(
              session, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_render_session_get_capabilities {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_render_session_get_capabilities",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Returns the immutable capabilities fixed during attachment.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_get_capabilities</a>
   */
  public static int mln_render_session_get_capabilities(
      long session, MemorySegment out_capabilities, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_render_session_get_capabilities.HANDLE.invokeExact(
              session, out_capabilities, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_render_session_get_snapshot {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_render_session_get_snapshot",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Copies the latest render-session snapshot from any native thread.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_get_snapshot</a>
   */
  public static int mln_render_session_get_snapshot(
      long session, MemorySegment out_snapshot, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_render_session_get_snapshot.HANDLE.invokeExact(
              session, out_snapshot, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_render_session_query_feature_extensions {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_render_session_query_feature_extensions",
            FunctionDescriptor.of(
                JAVA_INT,
                JAVA_LONG,
                Layouts.BufferView,
                Layouts.BufferView,
                Layouts.BufferView,
                Layouts.BufferView,
                Layouts.BufferView,
                ADDRESS,
                ADDRESS));
  }

  /**
   * Starts a feature-extension query against the latest driver state.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/query_8h.html">mln_render_session_query_feature_extensions</a>
   */
  public static int mln_render_session_query_feature_extensions(
      long session,
      MemorySegment source_id,
      MemorySegment feature,
      MemorySegment extension,
      MemorySegment extension_field,
      MemorySegment arguments,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_render_session_query_feature_extensions.HANDLE.invokeExact(
              session,
              source_id,
              feature,
              extension,
              extension_field,
              arguments,
              completion,
              out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_render_session_query_rendered_features {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_render_session_query_rendered_features",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Starts a rendered-feature query against the last frame that the session rendered, so render
   * after a camera or style change for a result that matches it.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/query_8h.html">mln_render_session_query_rendered_features</a>
   */
  public static int mln_render_session_query_rendered_features(
      long session,
      MemorySegment geometry,
      MemorySegment options,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_render_session_query_rendered_features.HANDLE.invokeExact(
              session, geometry, options, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_render_session_query_source_features {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_render_session_query_source_features",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, Layouts.BufferView, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Starts a source-feature query against the tiles that the source loaded for rendering, which it
   * loads only while a visible layer uses it.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/query_8h.html">mln_render_session_query_source_features</a>
   */
  public static int mln_render_session_query_source_features(
      long session,
      MemorySegment source_id,
      MemorySegment options,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_render_session_query_source_features.HANDLE.invokeExact(
              session, source_id, options, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_render_session_read_texture {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_render_session_read_texture",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Reads back the latest frame of the session&#x27;s owned texture as premultiplied RGBA8.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_render_session_read_texture</a>
   */
  public static int mln_render_session_read_texture(
      long session, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_render_session_read_texture.HANDLE.invokeExact(
              session, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_render_session_reduce_memory_use {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_render_session_reduce_memory_use",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Starts best-effort release of renderer caches.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_reduce_memory_use</a>
   */
  public static int mln_render_session_reduce_memory_use(
      long session, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_render_session_reduce_memory_use.HANDLE.invokeExact(
              session, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_render_session_request_frame {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_render_session_request_frame",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Requests a frame without waiting. Every accepted demand produces one terminal result record.
   * Caller-driver sessions require service on the graphics thread. Core-worker sessions need no
   * host service.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_request_frame</a>
   */
  public static int mln_render_session_request_frame(
      long session, MemorySegment demand, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_render_session_request_frame.HANDLE.invokeExact(session, demand, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_render_session_resize {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_render_session_resize",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, Layouts.LogicalExtent, ADDRESS, ADDRESS));
  }

  /**
   * Starts an ordered logical resize of the driver and the map. The driver applies the extent in
   * order with its other work, and later driver work does not wait for the map. The completion runs
   * after both have applied it and the map has published its snapshot. Frames render once a map
   * update matches the applied extent; static and tile maps publish that update for their next
   * still image.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_resize</a>
   */
  public static int mln_render_session_resize(
      long session, MemorySegment extent, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_render_session_resize.HANDLE.invokeExact(
              session, extent, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_render_session_service_driver_work {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_render_session_service_driver_work",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS));
  }

  /**
   * Services every queued item for a caller-graphics-thread driver. The first successful service
   * call fixes the session&#x27;s graphics-thread identity; later calls from another native thread
   * return {@code MLN_STATUS_WRONG_THREAD}. The target context must be current. Core-worker
   * sessions return {@code MLN_STATUS_INVALID_STATE}.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__session_8h.html">mln_render_session_service_driver_work</a>
   */
  public static int mln_render_session_service_driver_work(
      long session, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_render_session_service_driver_work.HANDLE.invokeExact(session, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_render_session_set_metal_borrowed_texture_target {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_render_session_set_metal_borrowed_texture_target",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Starts an ordered replacement of every texture of a caller-owned Metal ring.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_render_session_set_metal_borrowed_texture_target</a>
   */
  /** Available on: macos. */
  public static int mln_render_session_set_metal_borrowed_texture_target(
      long session,
      MemorySegment descriptor,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_render_session_set_metal_borrowed_texture_target.HANDLE.invokeExact(
              session, descriptor, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_render_session_set_metal_surface_target {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_render_session_set_metal_surface_target",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Starts an ordered Metal surface replacement.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/surface_8h.html">mln_render_session_set_metal_surface_target</a>
   */
  /** Available on: macos. */
  public static int mln_render_session_set_metal_surface_target(
      long session,
      MemorySegment descriptor,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_render_session_set_metal_surface_target.HANDLE.invokeExact(
              session, descriptor, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_render_session_set_open_gl_borrowed_texture_target {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_render_session_set_open_gl_borrowed_texture_target",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Starts an ordered replacement of every texture of a caller-owned OpenGL ring.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_render_session_set_open_gl_borrowed_texture_target</a>
   */
  public static int mln_render_session_set_open_gl_borrowed_texture_target(
      long session,
      MemorySegment descriptor,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_render_session_set_open_gl_borrowed_texture_target.HANDLE.invokeExact(
              session, descriptor, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_render_session_set_open_gl_surface_target {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_render_session_set_open_gl_surface_target",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Starts an ordered OpenGL surface replacement.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/surface_8h.html">mln_render_session_set_open_gl_surface_target</a>
   */
  public static int mln_render_session_set_open_gl_surface_target(
      long session,
      MemorySegment descriptor,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_render_session_set_open_gl_surface_target.HANDLE.invokeExact(
              session, descriptor, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_render_session_set_vulkan_borrowed_texture_target {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_render_session_set_vulkan_borrowed_texture_target",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Starts an ordered replacement of every image of a caller-owned Vulkan ring.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/texture_8h.html">mln_render_session_set_vulkan_borrowed_texture_target</a>
   */
  public static int mln_render_session_set_vulkan_borrowed_texture_target(
      long session,
      MemorySegment descriptor,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_render_session_set_vulkan_borrowed_texture_target.HANDLE.invokeExact(
              session, descriptor, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_render_session_set_vulkan_surface_target {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_render_session_set_vulkan_surface_target",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Starts an ordered Vulkan surface replacement.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/surface_8h.html">mln_render_session_set_vulkan_surface_target</a>
   */
  public static int mln_render_session_set_vulkan_surface_target(
      long session,
      MemorySegment descriptor,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_render_session_set_vulkan_surface_target.HANDLE.invokeExact(
              session, descriptor, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_resource_request_complete {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_resource_request_complete",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Completes a C API resource provider request and consumes its handle.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_request_complete</a>
   */
  public static int mln_resource_request_complete(
      long handle, MemorySegment response, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_resource_request_complete.HANDLE.invokeExact(handle, response, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_resource_request_is_cancelled {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_resource_request_is_cancelled",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Reports whether MapLibre has cancelled a C API resource provider request.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_request_is_cancelled</a>
   */
  public static int mln_resource_request_is_cancelled(
      long handle, MemorySegment out_cancelled, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_resource_request_is_cancelled.HANDLE.invokeExact(
              handle, out_cancelled, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_resource_request_pass_through {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_resource_request_pass_through",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS));
  }

  /**
   * Hands an outstanding provider request to the built-in network loader and consumes its handle.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_request_pass_through</a>
   */
  public static int mln_resource_request_pass_through(long handle, MemorySegment out_diagnostic) {
    try {
      return (int) Fn_mln_resource_request_pass_through.HANDLE.invokeExact(handle, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_resource_request_release {
    static final MethodHandle HANDLE =
        Ffm.downcall("mln_resource_request_release", FunctionDescriptor.ofVoid(JAVA_LONG));
  }

  /**
   * Releases the provider&#x27;s resource request handle without answering it.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_request_release</a>
   */
  public static void mln_resource_request_release(long handle) {
    try {
      Fn_mln_resource_request_release.HANDLE.invokeExact(handle);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_resource_request_set_cancel_callback {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_resource_request_set_cancel_callback",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Registers a callback that runs when MapLibre cancels a C API resource provider request.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_request_set_cancel_callback</a>
   */
  public static int mln_resource_request_set_cancel_callback(
      long handle,
      MemorySegment handler,
      MemorySegment out_cancelled,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_resource_request_set_cancel_callback.HANDLE.invokeExact(
              handle, handler, out_cancelled, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_resource_transform_request_complete {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_resource_transform_request_complete",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, Layouts.BufferView, ADDRESS));
  }

  /**
   * Answers a resource transform request with a replacement URL and consumes its handle.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_transform_request_complete</a>
   */
  public static int mln_resource_transform_request_complete(
      long request, MemorySegment url, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_resource_transform_request_complete.HANDLE.invokeExact(
              request, url, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_resource_transform_request_release {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_resource_transform_request_release", FunctionDescriptor.ofVoid(JAVA_LONG));
  }

  /**
   * Releases a resource transform request without answering it.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_transform_request_release</a>
   */
  public static void mln_resource_transform_request_release(long request) {
    try {
      Fn_mln_resource_transform_request_release.HANDLE.invokeExact(request);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_runtime_clear_event_handler {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_runtime_clear_event_handler",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Stops event delivery and retires the previous handler.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_clear_event_handler</a>
   */
  public static int mln_runtime_clear_event_handler(
      long runtime, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_runtime_clear_event_handler.HANDLE.invokeExact(
              runtime, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_runtime_clear_http_header_transform {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_runtime_clear_http_header_transform",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Clears the runtime-scoped outgoing HTTP header transform.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_clear_http_header_transform</a>
   */
  public static int mln_runtime_clear_http_header_transform(
      long runtime, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_runtime_clear_http_header_transform.HANDLE.invokeExact(
              runtime, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_runtime_clear_resource_provider {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_runtime_clear_resource_provider",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Clears the runtime-scoped network resource provider.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_clear_resource_provider</a>
   */
  public static int mln_runtime_clear_resource_provider(
      long runtime, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_runtime_clear_resource_provider.HANDLE.invokeExact(
              runtime, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_runtime_clear_resource_transform {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_runtime_clear_resource_transform",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Clears the runtime-scoped URL transform for network resources.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_clear_resource_transform</a>
   */
  public static int mln_runtime_clear_resource_transform(
      long runtime, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_runtime_clear_resource_transform.HANDLE.invokeExact(
              runtime, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_runtime_create {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_runtime_create", FunctionDescriptor.of(JAVA_INT, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Creates a runtime.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_create</a>
   */
  public static int mln_runtime_create(
      MemorySegment options, MemorySegment out_runtime, MemorySegment out_diagnostic) {
    try {
      return (int) Fn_mln_runtime_create.HANDLE.invokeExact(options, out_runtime, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_runtime_create_map {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_runtime_create_map",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Starts creation of a map on the runtime.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_runtime_create_map</a>
   */
  public static int mln_runtime_create_map(
      long runtime,
      MemorySegment options,
      MemorySegment out_map,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_runtime_create_map.HANDLE.invokeExact(
              runtime, options, out_map, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_runtime_create_offline_region {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_runtime_create_offline_region",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Starts creating an offline region.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_runtime_create_offline_region</a>
   */
  public static int mln_runtime_create_offline_region(
      long runtime,
      MemorySegment definition,
      MemorySegment metadata,
      long metadata_size,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_runtime_create_offline_region.HANDLE.invokeExact(
              runtime, definition, metadata, metadata_size, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_runtime_delete_offline_region {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_runtime_delete_offline_region",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Deletes an offline region.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_runtime_delete_offline_region</a>
   */
  public static int mln_runtime_delete_offline_region(
      long runtime, long region_id, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_runtime_delete_offline_region.HANDLE.invokeExact(
              runtime, region_id, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_runtime_dispose {
    static final MethodHandle HANDLE =
        Ffm.downcall("mln_runtime_dispose", FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS));
  }

  /**
   * Consumes a runtime handle without observing its asynchronous retirement.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_dispose</a>
   */
  public static int mln_runtime_dispose(long runtime, MemorySegment out_diagnostic) {
    try {
      return (int) Fn_mln_runtime_dispose.HANDLE.invokeExact(runtime, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_runtime_get_event_mask {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_runtime_get_event_mask",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Reports which runtime-scoped event types this runtime queues.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_get_event_mask</a>
   */
  public static int mln_runtime_get_event_mask(
      long runtime, MemorySegment out_mask, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_runtime_get_event_mask.HANDLE.invokeExact(runtime, out_mask, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_runtime_get_offline_region {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_runtime_get_offline_region",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Starts getting one offline region by ID.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_runtime_get_offline_region</a>
   */
  public static int mln_runtime_get_offline_region(
      long runtime, long region_id, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_runtime_get_offline_region.HANDLE.invokeExact(
              runtime, region_id, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_runtime_get_offline_region_status {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_runtime_get_offline_region_status",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Starts getting the current download status for an offline region.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_runtime_get_offline_region_status</a>
   */
  public static int mln_runtime_get_offline_region_status(
      long runtime, long region_id, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_runtime_get_offline_region_status.HANDLE.invokeExact(
              runtime, region_id, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_runtime_invalidate_offline_region {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_runtime_invalidate_offline_region",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Invalidates cached resources for an offline region.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_runtime_invalidate_offline_region</a>
   */
  public static int mln_runtime_invalidate_offline_region(
      long runtime, long region_id, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_runtime_invalidate_offline_region.HANDLE.invokeExact(
              runtime, region_id, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_runtime_list_offline_regions {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_runtime_list_offline_regions",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Starts listing the offline regions in the runtime database.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_runtime_list_offline_regions</a>
   */
  public static int mln_runtime_list_offline_regions(
      long runtime, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_runtime_list_offline_regions.HANDLE.invokeExact(
              runtime, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_runtime_merge_offline_regions {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_runtime_merge_offline_regions",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, Layouts.BufferView, ADDRESS, ADDRESS));
  }

  /**
   * Starts merging offline regions from another MapLibre offline database.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_runtime_merge_offline_regions</a>
   */
  public static int mln_runtime_merge_offline_regions(
      long runtime,
      MemorySegment side_database_path,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_runtime_merge_offline_regions.HANDLE.invokeExact(
              runtime, side_database_path, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_runtime_release {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_runtime_release", FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Starts release of a runtime after checking its children.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_release</a>
   */
  public static int mln_runtime_release(
      long runtime, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int) Fn_mln_runtime_release.HANDLE.invokeExact(runtime, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_runtime_run_ambient_cache_operation {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_runtime_run_ambient_cache_operation",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_INT, ADDRESS, ADDRESS));
  }

  /**
   * Starts a MapLibre ambient cache maintenance operation for this runtime.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_run_ambient_cache_operation</a>
   */
  public static int mln_runtime_run_ambient_cache_operation(
      long runtime, int operation, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_runtime_run_ambient_cache_operation.HANDLE.invokeExact(
              runtime, operation, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_runtime_set_event_handler {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_runtime_set_event_handler",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Selects how runtime and map events reach the host.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_set_event_handler</a>
   */
  public static int mln_runtime_set_event_handler(
      long runtime, MemorySegment handler, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_runtime_set_event_handler.HANDLE.invokeExact(
              runtime, handler, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_runtime_set_event_mask {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_runtime_set_event_mask",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_LONG, ADDRESS));
  }

  /**
   * Selects which runtime-scoped event types this runtime queues.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_set_event_mask</a>
   */
  public static int mln_runtime_set_event_mask(
      long runtime, long mask, MemorySegment out_diagnostic) {
    try {
      return (int) Fn_mln_runtime_set_event_mask.HANDLE.invokeExact(runtime, mask, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_runtime_set_http_header_transform {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_runtime_set_http_header_transform",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Registers or replaces the runtime-scoped outgoing HTTP header transform.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_set_http_header_transform</a>
   */
  public static int mln_runtime_set_http_header_transform(
      long runtime,
      MemorySegment transform,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_runtime_set_http_header_transform.HANDLE.invokeExact(
              runtime, transform, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_runtime_set_maximum_ambient_cache_size {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_runtime_set_maximum_ambient_cache_size",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Starts a change to this runtime&#x27;s maximum ambient cache size.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_set_maximum_ambient_cache_size</a>
   */
  public static int mln_runtime_set_maximum_ambient_cache_size(
      long runtime, long size, MemorySegment completion, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_runtime_set_maximum_ambient_cache_size.HANDLE.invokeExact(
              runtime, size, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_runtime_set_offline_region_download_state {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_runtime_set_offline_region_download_state",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_INT, ADDRESS, ADDRESS));
  }

  /**
   * Sets an offline region&#x27;s native download state.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_runtime_set_offline_region_download_state</a>
   */
  public static int mln_runtime_set_offline_region_download_state(
      long runtime,
      long region_id,
      int state,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_runtime_set_offline_region_download_state.HANDLE.invokeExact(
              runtime, region_id, state, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_runtime_set_offline_region_observed {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_runtime_set_offline_region_observed",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_BOOLEAN, ADDRESS, ADDRESS));
  }

  /**
   * Enables or disables runtime events for an offline region.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_runtime_set_offline_region_observed</a>
   */
  public static int mln_runtime_set_offline_region_observed(
      long runtime,
      long region_id,
      boolean observed,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_runtime_set_offline_region_observed.HANDLE.invokeExact(
              runtime, region_id, observed, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_runtime_set_resource_provider {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_runtime_set_resource_provider",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Registers or replaces a runtime-scoped network resource provider.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_set_resource_provider</a>
   */
  public static int mln_runtime_set_resource_provider(
      long runtime,
      MemorySegment provider,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_runtime_set_resource_provider.HANDLE.invokeExact(
              runtime, provider, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_runtime_set_resource_transform {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_runtime_set_resource_transform",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Registers or updates a runtime-scoped URL transform for network resources.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_runtime_set_resource_transform</a>
   */
  public static int mln_runtime_set_resource_transform(
      long runtime,
      MemorySegment transform,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_runtime_set_resource_transform.HANDLE.invokeExact(
              runtime, transform, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_runtime_update_offline_region_metadata {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_runtime_update_offline_region_metadata",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, JAVA_LONG, ADDRESS, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Starts updating opaque binary metadata for an offline region.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/map_8h.html">mln_runtime_update_offline_region_metadata</a>
   */
  public static int mln_runtime_update_offline_region_metadata(
      long runtime,
      long region_id,
      MemorySegment metadata,
      long metadata_size,
      MemorySegment completion,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_runtime_update_offline_region_metadata.HANDLE.invokeExact(
              runtime, region_id, metadata, metadata_size, completion, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_style_expression_create {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_style_expression_create",
            FunctionDescriptor.of(JAVA_INT, Layouts.BufferView, ADDRESS, ADDRESS, ADDRESS));
  }

  /**
   * Parses a style expression.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style__expression_8h.html">mln_style_expression_create</a>
   */
  public static int mln_style_expression_create(
      MemorySegment expression,
      MemorySegment options,
      MemorySegment out_expression,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_style_expression_create.HANDLE.invokeExact(
              expression, options, out_expression, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_style_expression_evaluate {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_style_expression_evaluate",
            FunctionDescriptor.of(
                JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Evaluates a parsed expression and writes its result as UTF-8 JSON.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style__expression_8h.html">mln_style_expression_evaluate</a>
   */
  public static int mln_style_expression_evaluate(
      long expression,
      MemorySegment inputs,
      MemorySegment out_json,
      long json_capacity,
      MemorySegment out_json_length,
      MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_style_expression_evaluate.HANDLE.invokeExact(
              expression, inputs, out_json, json_capacity, out_json_length, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_style_expression_get_info {
    static final MethodHandle HANDLE =
        Ffm.downcall(
            "mln_style_expression_get_info",
            FunctionDescriptor.of(JAVA_INT, JAVA_LONG, ADDRESS, ADDRESS));
  }

  /**
   * Copies what a parsed expression depends on.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style__expression_8h.html">mln_style_expression_get_info</a>
   */
  public static int mln_style_expression_get_info(
      long expression, MemorySegment out_info, MemorySegment out_diagnostic) {
    try {
      return (int)
          Fn_mln_style_expression_get_info.HANDLE.invokeExact(expression, out_info, out_diagnostic);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_style_expression_release {
    static final MethodHandle HANDLE =
        Ffm.downcall("mln_style_expression_release", FunctionDescriptor.ofVoid(JAVA_LONG));
  }

  /**
   * Releases a style expression.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/style__expression_8h.html">mln_style_expression_release</a>
   */
  public static void mln_style_expression_release(long expression) {
    try {
      Fn_mln_style_expression_release.HANDLE.invokeExact(expression);
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }

  private static final class Fn_mln_supported_render_backend_mask {
    static final MethodHandle HANDLE =
        Ffm.downcall("mln_supported_render_backend_mask", FunctionDescriptor.of(JAVA_INT));
  }

  /**
   * Reports the render backends available in this native library build.
   *
   * @see <a
   *     href="https://maplibre.org/maplibre-native-ffi/reference/c/base_8h.html">mln_supported_render_backend_mask</a>
   */
  public static int mln_supported_render_backend_mask() {
    try {
      return (int) Fn_mln_supported_render_backend_mask.HANDLE.invokeExact();
    } catch (Throwable failure) {
      throw Ffm.rethrow(failure);
    }
  }
}
