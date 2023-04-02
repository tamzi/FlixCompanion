plugins {
    id("flixcompanion.android.library")
    id("flixcompanion.android.library.compose")
}

android {
    namespace = "com.flixcompanion.coretest"
}

dependencies {
    api(libs.androidx.test.core)
    api(libs.androidx.compose.ui.test)
    api(libs.androidx.test.espresso.core)
    api(libs.androidx.test.rules)
    api(libs.androidx.test.runner)

    api(libs.junit4)

    api(libs.hilt.android.testing)

    api(libs.kotlinx.coroutines.test)
    api(libs.turbine)

    debugApi(libs.androidx.compose.ui.testManifest)
    implementation(libs.kotlinx.datetime)
}