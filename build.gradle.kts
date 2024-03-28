buildscript {

    val wear_compose_version by extra("1.3.0")
    val horologist_version by extra("0.6.6")
    val wear_tiles_version by extra("1.3.0")
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id ("com.android.application") version ("8.3.1") apply false
    id ("com.android.library") version ("8.3.1") apply false
    id ("org.jetbrains.kotlin.android") version ("1.9.22") apply false
    id("org.jetbrains.kotlin.jvm") version "1.9.22" apply false
    id("com.google.devtools.ksp") version "1.9.22-1.0.17" apply false
    id("com.android.test") version "8.3.1" apply false
}
