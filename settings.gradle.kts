pluginManagement {
    includeBuild("buildLogic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
/*Application modules*/
rootProject.name = ("FlixCompanion")
include(":app")
include(":flixa")
include(":lint")
include(":flixacatalog")
include(":benchmarks")

/*Core Modules*/
include(":core:network")
include(":core:model")
include(":core:datastore")
include(":core:data")
include(":core:database")
include(":core:domain")
include(":core:utils")

/*Testing Modules*/
include(":testing:coretest")
include(":testing:datastoreTest")
include(":testing:dataTest")

/*Feature Modules*/
include(":feature:settings")
include(":feature:categories")
include(":feature:actors")
include(":feature:movie")
include(":feature:series")
include(":feature:profile")
include(":feature:search")
include(":feature:genres")
include(":feature:hot")
include(":feature:recommended")
include(":feature:bookmarks")
include(":feature:platforms")
include(":feature:feedback")
include(":feature:about")
include(":feature:onboarding")
include(":uiTestHiltManifest")
