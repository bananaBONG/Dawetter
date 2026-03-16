plugins {
    id("breezy.library")
    kotlin("plugin.serialization")
}

android {
    namespace = "breezyweather.domain"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }
}

dependencies {
    implementation(projects.weatherUnit)
    implementation(libs.kotlinx.serialization.json)

    api(libs.sqldelight.android.paging)
}
