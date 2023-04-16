plugins {
    `kotlin-dsl`
}
group = "com.tamzi.flixcompanion.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {

    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.firebase.performance.gradle)
    compileOnly(libs.firebase.crashlytics.gradle)
    compileOnly(libs.ksp.gradlePlugin)
}
gradlePlugin {
    plugins {
        /* Common android & kotlin options*/
        register("androidLibrary") {
            id = "flixcompanion.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("androidTest") {
            id = "flixcompanion.android.test"
            implementationClass = "AndroidTestConventionPlugin"
        }
        register("AndroidApplication") {
            id = "flixcompanion.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        /*Compose specific*/
        register("AndroidApplicationCompose") {
            id = "flixcompanion.android.application"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }
        register("androidLibraryCompose") {
            id = "flixcompanion.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }
        register("androidFeature") {
            id = "flixcompanion.android.feature"
            implementationClass = "AndroidFeatureConventionPlugin"
        }
        /* Hilt convention*/
        register("androidHilt") {
            id = "flixcompanion.android.hilt"
            implementationClass = "AndroidHiltConventionPlugin"
        }
        /* RoomDB convention*/
        register("androidRoom") {
            id = "flixcompanion.android.room"
            implementationClass = "AndroidRoomConventionPlugin"
        }
        /* firebase convention*/
        register("androidFirebase") {
            id = "flixcompanion.android.application.firebase"
            implementationClass = "AndroidApplicationFirebaseConventionPlugin"
        }
        /*for releases*/
        register("androidFlavors") {
            id = "flixcompanion.android.application.flavors"
            implementationClass = "AndroidApplicationFlavorsConventionPlugin"
        }

    }
}
