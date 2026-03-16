plugins {
    id("breezy.library")
}

android {
    namespace = "org.breezyweather.ui.theme.weatherView"

    defaultConfig {
        consumerProguardFiles("consumer-rules.pro")
    }
}

dependencies {
    implementation(libs.core.ktx)
}
