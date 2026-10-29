package org.maplibre.nativeffi.consumer;

import static java.lang.foreign.ValueLayout.*;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.nio.file.Path;
import org.maplibre.nativeffi.*;

/** Host GPU objects come from the common C test fixture. */
final class TestGraphics implements AutoCloseable {
  private static final Arena LIBRARY_ARENA = Arena.ofShared();
  private static final SymbolLookup SYMBOLS =
      SymbolLookup.libraryLookup(
          Path.of(System.getProperty("org.maplibre.nativeffi.test.graphics.library")),
          LIBRARY_ARENA);

  private static MethodHandle function(String name, FunctionDescriptor descriptor) {
    return Linker.nativeLinker().downcallHandle(SYMBOLS.findOrThrow(name), descriptor);
  }

  private final MemorySegment graphics;
  private final int backend;

  TestGraphics() {
    var mask = Maplibre.supportedRenderBackendMask();
    backend =
        mask.contains(RenderBackendFlag.METAL)
            ? 1
            : mask.contains(RenderBackendFlag.VULKAN)
                ? 2
                : Maplibre.openGlSupportedContextProviderMask()
                        .contains(OpenGlContextProviderFlag.EGL)
                    ? 3
                    : 4;
    try {
      graphics =
          (MemorySegment)
              function("mln_test_graphics_create", FunctionDescriptor.of(ADDRESS, JAVA_INT))
                  .invokeExact(backend);
    } catch (Throwable failure) {
      throw new AssertionError(failure);
    }
    if (graphics.address() == 0) throw new AssertionError("Host test graphics creation failed");
  }

  private NativePointer pointer(MemorySegment context, long offset) {
    return NativePointer.ofAddress(context.get(ADDRESS, offset).address());
  }

  Pending<RenderSessionHandle> attach(
      MapHandle map, LogicalExtent extent, RenderSessionAttachOptions options) {
    try (var arena = Arena.ofConfined()) {
      // mln_test_graphics_context: two uint32_t values followed by thirteen pointers.
      var context = arena.allocate(112, 8);
      boolean ok =
          (boolean)
              function(
                      "mln_test_graphics_get_context",
                      FunctionDescriptor.of(JAVA_BOOLEAN, ADDRESS, ADDRESS))
                  .invokeExact(graphics, context);
      if (!ok) throw new AssertionError("Host context query failed");
      return switch (backend) {
        case 1 ->
            map.attachMetalOwnedTexture(
                new MetalOwnedTextureDescriptor(
                    extent, new MetalContextDescriptor(pointer(context, 8)), 80),
                options);
        case 2 ->
            map.attachVulkanOwnedTexture(
                new VulkanOwnedTextureDescriptor(
                    extent,
                    new VulkanContextDescriptor(
                        pointer(context, 16),
                        pointer(context, 24),
                        pointer(context, 32),
                        pointer(context, 40),
                        context.get(JAVA_INT, 4),
                        pointer(context, 48),
                        pointer(context, 56))),
                options);
        case 3 ->
            map.attachOpenGlOwnedTexture(
                new OpenGlOwnedTextureDescriptor(
                    extent,
                    new OpenGlContextDescriptor(
                        OpenGlContextOwnership.DEDICATED,
                        new OpenGlContextDescriptorData.Egl(
                            new EglContextDescriptor(
                                pointer(context, 64),
                                pointer(context, 72),
                                NativePointer.NULL,
                                OpenGlClientApi.GLES,
                                pointer(context, 104))))),
                options);
        default ->
            map.attachOpenGlOwnedTexture(
                new OpenGlOwnedTextureDescriptor(
                    extent,
                    new OpenGlContextDescriptor(
                        OpenGlContextOwnership.DEDICATED,
                        new OpenGlContextDescriptorData.Wgl(
                            new WglContextDescriptor(
                                pointer(context, 88), NativePointer.NULL, pointer(context, 104))))),
                options);
      };
    } catch (Throwable failure) {
      throw new AssertionError(failure);
    }
  }

  public void close() {
    try {
      function("mln_test_graphics_destroy", FunctionDescriptor.ofVoid(ADDRESS))
          .invokeExact(graphics);
    } catch (Throwable failure) {
      throw new AssertionError(failure);
    }
  }
}
