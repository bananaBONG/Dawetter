import breezy.buildlogic.configureCompose

plugins {
    id("com.android.application")

    id("breezy.code.lint")
}

android {
    configureCompose(this)
}
