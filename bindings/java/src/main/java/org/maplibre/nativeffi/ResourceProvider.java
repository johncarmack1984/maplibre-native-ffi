// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Resource provider state.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/runtime_8h.html">mln_resource_provider</a>
 */
public final class ResourceProvider {
  private final NativeRegistration nativeRegistration;
  private final ResourceProviderCallback callback;
  private final java.util.List<ResourceRoute> routes;

  public ResourceProvider(ResourceProviderCallback callback, java.util.List<ResourceRoute> routes) {
    this(callback, routes, null);
  }

  ResourceProvider(
      ResourceProviderCallback callback,
      java.util.List<ResourceRoute> routes,
      NativeRegistration nativeRegistration) {
    this.nativeRegistration = nativeRegistration;
    this.callback = callback;
    this.routes = java.util.List.copyOf(routes);
  }

  public ResourceProviderCallback callback() {
    return callback;
  }

  public java.util.List<ResourceRoute> routes() {
    return routes;
  }

  public ResourceProvider(ResourceProviderCallback callback) {
    this(callback, java.util.List.of());
  }

  NativeRegistration nativeRegistration() {
    return nativeRegistration;
  }

  public static ResourceProvider nativeRegistration(
      NativePointer callback,
      NativePointer userData,
      NativePointer releaseUserData,
      java.util.List<ResourceRoute> routes) {
    return new ResourceProvider(
        null,
        routes,
        new NativeRegistration(new NativePointer[] {callback}, userData, releaseUserData));
  }

  public ResourceProvider withCallback(ResourceProviderCallback replacement) {
    return new ResourceProvider(replacement, this.routes, null);
  }

  public ResourceProvider withRoutes(java.util.List<ResourceRoute> replacement) {
    return new ResourceProvider(this.callback, replacement, nativeRegistration);
  }
}
