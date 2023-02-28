buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()

        if (!libs.versions.compose.snapshot.get().endsWith("SNAPSHOT")) {
            maven { url = uri("https://androidx.dev/snapshots/builds/${libs.versions.compose.snapshot.get()}/artifacts/repository/") }
        }
    }
    dependencies {
        classpath(libs.android.gradlePlugin)
        classpath(libs.kotlin.gradlePlugin)
    }
}





