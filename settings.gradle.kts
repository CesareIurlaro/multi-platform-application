val kotlinVersion: String by settings
val androidGradlePluginVersion: String by settings
val springVersion: String by settings

pluginManagement {

    repositories {
        google()
        mavenCentral()
        jcenter()
    }

    resolutionStrategy {
        eachPlugin {
            println(requested)
            when (requested.id.id) {
                "org.jetbrains.kotlin.plugin.spring" -> useModule("org.jetbrains.kotlin:kotlin-allopen:$kotlinVersion")
                "org.jetbrains.kotlin.plugin.jpa" -> useModule("org.jetbrains.kotlin:kotlin-noarg:$kotlinVersion")
                "org.jetbrains.kotlin.jvm", "org.jetbrains.kotlin.android", "org.jetbrains.kotlin.multiplatform", "org.jetbrains.kotlin.android.extensions" -> useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
                "com.android.application" -> useModule("com.android.tools.build:gradle:$androidGradlePluginVersion")
                "org.springframework.boot" -> useModule("org.springframework.boot:spring-boot-gradle-plugin:$springVersion")
            }
        }
    }
}

rootProject.name = "Unito Taass Project"
enableFeaturePreview("GRADLE_METADATA")

include(":android-client", ":backend", ":common")
project(":android-client").projectDir = file("projects/android-client")
project(":backend").projectDir = file("projects/backend")
project(":common").projectDir = file("projects/common")