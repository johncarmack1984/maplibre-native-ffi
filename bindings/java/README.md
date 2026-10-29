# Java

A standalone Java 25 desktop binding over the Foreign Function and Memory API.
It has no Kotlin runtime dependency and does not target Android.

```java
try (var runtime = RuntimeHandle.create(new RuntimeOptions())) {
  var created = runtime.createMap(new MapOptions(new LogicalExtent(640, 480, 1)));
  try (var map = created.handle()) {
    created.ready().join();
    map.setStyleJson(styleJson).join();
    var camera = map.getCamera().join();
    map.release().join();
  }
  runtime.release().join();
}
```

Use `org.maplibre.nativeffi:maplibre-native-ffi-java` with a matching desktop
native runtime JAR. Run the JVM with `--enable-native-access=ALL-UNNAMED`. See
the package Javadoc for ownership, callbacks, and borrowed view contracts.

Build with `mise run //bindings/java:build`. Test a native build with
`mise run //bindings/java:test <preset>`.
