buildscript {

    val wear_compose_version by extra("1.1.2")
    val horologist_version by extra("0.4.4")
    val wear_tiles_version by extra("1.1.0")
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.0.1" apply false
    id("com.android.library") version "8.0.1" apply false
    id("org.jetbrains.kotlin.android") version "1.8.20" apply false
    id("org.jetbrains.kotlin.jvm") version "1.8.20" apply false
    id("com.google.devtools.ksp") version "1.8.20-1.0.11" apply false
    id("com.android.test") version "8.0.1" apply false
}
