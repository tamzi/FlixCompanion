buildscript {
    repositories {
        google()
        mavenCentral()
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    /*Android specific configs*/
    alias(libs.plugins.android.application) apply false
    // id("com.android.application") version "7.4.2" apply false
    alias(libs.plugins.android.library) apply false
    //id("com.android.library") version "7.4.2" apply false

    /*Kotlin specific configs*/
    alias(libs.plugins.kotlin.jvm)
    //id("org.jetbrains.kotlin.jvm") version "1.8.10" apply false
    alias(libs.plugins.kotlin.serialization) apply false
    /*adding the below :
    * alias(libs.plugins.kotlin.android) apply false
    * to replace:
    * id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    * Will throw an error because the
    *     alias(libs.plugins.kotlin.jvm)
    * covers everything we want to add.
    * */

    alias(libs.plugins.ksp) apply false
    //id("com.google.devtools.ksp") version "1.8.10-1.0.9" apply false
    alias(libs.plugins.android.test) apply false
    //id("com.android.test") version "7.4.2" apply false


    /*Firebase specific configs*/
    alias(libs.plugins.firebase.crashlytics) apply false
    alias(libs.plugins.firebase.perf) apply false

}
