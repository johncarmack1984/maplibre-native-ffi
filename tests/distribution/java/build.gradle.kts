plugins {
  java
  application
}

val repository = providers.gradleProperty("maplibre.repository").get()
val version = providers.gradleProperty("maplibre.version").get()
val backend = providers.gradleProperty("maplibre.backend").get()
val classifier = providers.gradleProperty("maplibre.classifier").get()

repositories {
  exclusiveContent {
    forRepository { maven(repository) }
    filter { includeGroup("org.maplibre.nativeffi") }
  }
  mavenCentral()
}

dependencies {
  implementation("org.maplibre.nativeffi:maplibre-native-ffi-java:$version")
  runtimeOnly(
    "org.maplibre.nativeffi:maplibre-native-ffi-runtime-$backend-jvm:$version:$classifier@jar",
  )
}

java {
  toolchain { languageVersion = JavaLanguageVersion.of(libs.versions.java.toolchain.get().toInt()) }
}

application {
  mainClass = "Main"
  applicationDefaultJvmArgs = listOf("--enable-native-access=ALL-UNNAMED")
}

tasks.named("run") {
  doFirst {
    check(
      configurations.runtimeClasspath.get().resolvedConfiguration.resolvedArtifacts.none {
        it.moduleVersion.id.group.startsWith("org.jetbrains.kotlin") ||
          it.moduleVersion.id.group.startsWith("org.jetbrains.kotlinx")
      },
    ) {
      "The Java distribution must not resolve a Kotlin runtime"
    }
  }
}
