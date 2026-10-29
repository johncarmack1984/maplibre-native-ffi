import com.vanniktech.maven.publish.JavaLibrary
import com.vanniktech.maven.publish.JavadocJar
import java.time.Duration
import org.maplibre.nativeffi.gradle.HostPlatform
import org.maplibre.nativeffi.gradle.MaplibreNativeCArtifact
import org.maplibre.nativeffi.gradle.nativeInstall
import org.maplibre.nativeffi.gradle.registerLocalBuildVerification

plugins {
  `java-library`
  id("com.vanniktech.maven.publish")
}

tasks.withType<JavaCompile>().configureEach {
  options.release.set(libs.versions.java.release.get().toInt())
}

val install = nativeInstall(HostPlatform.current().targetPlatform)
val verifyNative = registerLocalBuildVerification("verifyNativeLibrary", install)

tasks.test {
  useJUnitPlatform()
  systemProperty(
    "org.maplibre.nativeffi.test.classpath",
    sourceSets.test.get().runtimeClasspath.asPath,
  )
  dependsOn(verifyNative)
  jvmArgs("--enable-native-access=ALL-UNNAMED")
  timeout.set(Duration.ofMinutes(5))
  install.prefix?.let(::MaplibreNativeCArtifact)?.let { native ->
    systemProperty("java.library.path", native.runtimeLibraryDir.absolutePath)
    systemProperty(
      "org.maplibre.nativeffi.test.graphics.library",
      native.testGraphicsLibraryPath.absolutePath,
    )
    inputs.dir(native.installDir).withPropertyName("nativeInstall")
  }
  testLogging { exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL }
}

dependencies {
  testImplementation(libs.junit.jupiter)
  testRuntimeOnly(libs.junit.launcher)
}

mavenPublishing {
  configure(JavaLibrary(javadocJar = JavadocJar.Javadoc(), sourcesJar = true))
  coordinates(
    groupId = providers.gradleProperty("maplibre.maven.group").get(),
    artifactId = "maplibre-native-ffi-java",
    version = providers.gradleProperty("maplibre.maven.version").get(),
  )
  publishToMavenCentral()
  pom {
    name.set("MapLibre Native FFI Java binding")
    description.set("Managed Java bindings for the MapLibre Native C API over desktop FFM.")
  }
}

val deviceConsole = configurations.create("deviceConsole")

dependencies {
  deviceConsole("org.junit.platform:junit-platform-console-standalone:${libs.versions.junit.get()}")
}

tasks.register<Sync>("deviceTestClasspath") {
  dependsOn(tasks.testClasses)
  into(layout.buildDirectory.dir("device-test"))
  from(sourceSets.test.get().output) { into("classes") }
  from(sourceSets.main.get().output) { into("classes") }
  from(deviceConsole) { into("lib") }
}

tasks.javadoc {
  exclude("**/internal/**")
  (options as StandardJavadocDocletOptions).addBooleanOption("Xdoclint:all,-missing", true)
}
