@file:Suppress("DSL_SCOPE_VIOLATION", "UnstableApiUsage")

import com.thoughtworks.ark.buildlogic.androidApplication
import com.thoughtworks.ark.buildlogic.enableCompose

plugins {
    alias(libs.plugins.application)
    alias(libs.plugins.kotlin)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.kapt)
    alias(libs.plugins.hilt)
    alias(libs.plugins.detekt)
    alias(libs.plugins.router)
}

apply(from = "../config/jacoco/modules.kts")

androidApplication {
    namespace = "com.thoughtworks.ark.feature.dashboard.app"

    defaultConfig {
        applicationId = "com.thoughtworks.ark.feature.dashboard.app"
        versionCode = 1
        versionName = "1.0.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    enableCompose()
}

dependencies {
    implementation(project(":feature-dashboard"))

    implementation(libs.bundles.kotlin)
    implementation(libs.bundles.android)
    implementation(libs.bundles.compose)

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    implementation(libs.router)
    kapt(libs.router.compiler)

    implementation(libs.bundles.coil)

    testImplementation(libs.junit4)

    androidTestImplementation(libs.androidx.junit.ktx)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(libs.androidx.test.core)
    androidTestImplementation(libs.androidx.test.runner)
    androidTestImplementation(libs.androidx.test.rules)
    androidTestImplementation(libs.truth)

    detektPlugins(libs.detekt.formatting)
}