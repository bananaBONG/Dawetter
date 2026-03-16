import breezy.buildlogic.configureAndroid
import breezy.buildlogic.configureTest

plugins {
    id("com.android.library")

    id("breezy.code.lint")
}

val agpMajorVersion = runCatching {
    val versionClass = Class.forName("com.android.builder.model.Version")
    val version = versionClass.getField("ANDROID_GRADLE_PLUGIN_VERSION").get(null) as String
    version.substringBefore('.').toInt()
}.getOrDefault(8)

if (agpMajorVersion < 9) {
    apply(plugin = "org.jetbrains.kotlin.android")
}

android {
    configureAndroid(this)
    configureTest()
}
