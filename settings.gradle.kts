pluginManagement {
//    resolutionStrategy {
//        eachPlugin {
//            if (requested.id.id == "org.jetbrains.kotlin.multiplatform") {
//                useModule("org.jetbrains.kotlin.multiplatform:org.jetbrains.kotlin.multiplatform.gradle.plugin:1.8.20")
//            }
//        }
//    }

    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://plugins.gradle.org/m2/")
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

rootProject.name = "world-community-kmm"
include(":composeApp")
