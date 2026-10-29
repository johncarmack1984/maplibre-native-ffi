package org.maplibre.nativeffi.consumer;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Path;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;

class ProcessTest {
  @Test
  void shutdownWithLiveGraphicsAndCallbacks() throws Exception {
    var output = java.nio.file.Files.createTempFile("maplibre-java-exit-", ".log");
    var child =
        new ProcessBuilder(
                Path.of(System.getProperty("java.home"), "bin", "java").toString(),
                "--enable-native-access=ALL-UNNAMED",
                "-cp",
                System.getProperty("org.maplibre.nativeffi.test.classpath"),
                "-Djava.library.path=" + System.getProperty("java.library.path"),
                "-Dorg.maplibre.nativeffi.test.graphics.library="
                    + System.getProperty("org.maplibre.nativeffi.test.graphics.library"),
                ExitProbe.class.getName())
            .redirectErrorStream(true)
            .redirectOutput(output.toFile())
            .start();
    try {
      assertTrue(
          child.waitFor(30, TimeUnit.SECONDS), () -> "JVM shutdown timed out: " + read(output));
      assertEquals(0, child.exitValue(), () -> read(output));
      assertTrue(read(output).contains("live graphics ready"));
    } finally {
      child.destroyForcibly();
      java.nio.file.Files.deleteIfExists(output);
    }
  }

  private static String read(Path path) {
    try {
      return java.nio.file.Files.readString(path);
    } catch (java.io.IOException error) {
      throw new AssertionError(error);
    }
  }
}
