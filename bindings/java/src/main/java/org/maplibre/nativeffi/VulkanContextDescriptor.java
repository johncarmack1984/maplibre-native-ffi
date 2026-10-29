// Generated from the C headers by tools/bindgen. Do not edit.
package org.maplibre.nativeffi;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;

/**
 * Vulkan backend context fields shared by Vulkan render targets.
 *
 * @see <a
 *     href="https://maplibre.org/maplibre-native-ffi/reference/c/render__target_8h.html">mln_vulkan_context_descriptor</a>
 */
public record VulkanContextDescriptor(
    NativePointer instance,
    NativePointer physicalDevice,
    NativePointer device,
    NativePointer graphicsQueue,
    int graphicsQueueFamilyIndex,
    NativePointer getInstanceProcAddr,
    NativePointer getDeviceProcAddr) {
  public VulkanContextDescriptor(
      NativePointer instance,
      NativePointer physicalDevice,
      NativePointer device,
      NativePointer graphicsQueue) {
    this(
        instance, physicalDevice, device, graphicsQueue, 0, NativePointer.NULL, NativePointer.NULL);
  }

  public VulkanContextDescriptor withInstance(NativePointer replacement) {
    return new VulkanContextDescriptor(
        replacement,
        this.physicalDevice,
        this.device,
        this.graphicsQueue,
        this.graphicsQueueFamilyIndex,
        this.getInstanceProcAddr,
        this.getDeviceProcAddr);
  }

  public VulkanContextDescriptor withPhysicalDevice(NativePointer replacement) {
    return new VulkanContextDescriptor(
        this.instance,
        replacement,
        this.device,
        this.graphicsQueue,
        this.graphicsQueueFamilyIndex,
        this.getInstanceProcAddr,
        this.getDeviceProcAddr);
  }

  public VulkanContextDescriptor withDevice(NativePointer replacement) {
    return new VulkanContextDescriptor(
        this.instance,
        this.physicalDevice,
        replacement,
        this.graphicsQueue,
        this.graphicsQueueFamilyIndex,
        this.getInstanceProcAddr,
        this.getDeviceProcAddr);
  }

  public VulkanContextDescriptor withGraphicsQueue(NativePointer replacement) {
    return new VulkanContextDescriptor(
        this.instance,
        this.physicalDevice,
        this.device,
        replacement,
        this.graphicsQueueFamilyIndex,
        this.getInstanceProcAddr,
        this.getDeviceProcAddr);
  }

  public VulkanContextDescriptor withGraphicsQueueFamilyIndex(int replacement) {
    return new VulkanContextDescriptor(
        this.instance,
        this.physicalDevice,
        this.device,
        this.graphicsQueue,
        replacement,
        this.getInstanceProcAddr,
        this.getDeviceProcAddr);
  }

  public VulkanContextDescriptor withGetInstanceProcAddr(NativePointer replacement) {
    return new VulkanContextDescriptor(
        this.instance,
        this.physicalDevice,
        this.device,
        this.graphicsQueue,
        this.graphicsQueueFamilyIndex,
        replacement,
        this.getDeviceProcAddr);
  }

  public VulkanContextDescriptor withGetDeviceProcAddr(NativePointer replacement) {
    return new VulkanContextDescriptor(
        this.instance,
        this.physicalDevice,
        this.device,
        this.graphicsQueue,
        this.graphicsQueueFamilyIndex,
        this.getInstanceProcAddr,
        replacement);
  }
}
