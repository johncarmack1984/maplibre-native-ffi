package org.maplibre.nativeffi.internal.c;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/** Native artifact loading, shared by the checked managed entry point and FFM symbol lookup. */
public final class NativeLoading {
  private static boolean loaded;

  private NativeLoading() {}

  public static synchronized void load() {
    if (loaded) return;
    String library = System.mapLibraryName("maplibre-native-c");
    String root = "META-INF/maplibre-native-ffi/" + classifier() + "/";
    try {
      var loader = NativeLoading.class.getClassLoader();
      var resources = Collections.list(loader.getResources(root + library));
      if (resources.size() > 1)
        throw new UnsatisfiedLinkError("Multiple native runtime JARs provide " + root + library);
      if (resources.isEmpty()) {
        System.loadLibrary("maplibre-native-c");
        loaded = true;
        return;
      }
      var source = resources.getFirst();
      String container =
          source.toExternalForm().substring(0, source.toExternalForm().length() - library.length());
      var directory = Files.createTempDirectory("maplibre-java-");
      for (String file : dependencies()) {
        var candidates = Collections.list(loader.getResources(root + file));
        for (var candidate : candidates) {
          if (!candidate.toExternalForm().equals(container + file)) continue;
          try (var stream = candidate.openStream()) {
            Files.copy(stream, directory.resolve(file));
          }
          break;
        }
      }
      try (var stream = source.openStream()) {
        Files.copy(stream, directory.resolve(library));
      }
      load(directory.resolve(library));
    } catch (IOException failure) {
      throw (UnsatisfiedLinkError)
          new UnsatisfiedLinkError("Unable to extract the MapLibre native runtime")
              .initCause(failure);
    }
  }

  public static synchronized void load(Path path) {
    if (loaded) return;
    var library = path.toAbsolutePath().normalize();
    for (String name : dependencies()) {
      var dependency = library.resolveSibling(name);
      if (Files.isRegularFile(dependency)) System.load(dependency.toString());
    }
    System.load(library.toString());
    loaded = true;
  }

  private static List<String> dependencies() {
    String os = System.getProperty("os.name").toLowerCase(Locale.ROOT);
    if (os.contains("windows"))
      return List.of("vulkan-1.dll", "libEGL.dll", "libGLESv2.dll", "EGL.dll", "GLESv2.dll");
    if (os.contains("mac"))
      return List.of("libvulkan.1.dylib", "libvulkan.dylib", "libEGL.dylib", "libGLESv2.dylib");
    return List.of(
        "libvulkan.so.1",
        "libvulkan.so",
        "libEGL.so.1",
        "libEGL.so",
        "libGLESv2.so.2",
        "libGLESv2.so");
  }

  private static String classifier() {
    String os = System.getProperty("os.name").toLowerCase(Locale.ROOT);
    String arch = System.getProperty("os.arch").toLowerCase(Locale.ROOT);
    boolean arm = arch.equals("aarch64") || arch.equals("arm64");
    if (!arm && !arch.equals("x86_64") && !arch.equals("amd64"))
      throw new UnsatisfiedLinkError("Unsupported JVM architecture: " + arch);
    String suffix = arm ? "arm64" : "x64";
    if (os.contains("windows")) return "natives-windows-" + suffix;
    if (os.contains("mac")) return "natives-macos-" + suffix;
    if (os.contains("freebsd") && !arm) return "natives-freebsd-x64";
    if (os.contains("linux"))
      return "natives-linux-" + (musl(arm ? "aarch64" : "x86_64") ? "musl-" : "") + suffix;
    throw new UnsatisfiedLinkError("Unsupported JVM platform: " + os + "/" + arch);
  }

  private static boolean musl(String architecture) {
    try {
      String loader = Path.of("/lib/ld-musl-" + architecture + ".so.1").toRealPath().toString();
      return Files.readAllLines(Path.of("/proc/self/maps")).stream()
          .anyMatch(line -> line.endsWith(" " + loader));
    } catch (IOException absent) {
      return false;
    }
  }
}
