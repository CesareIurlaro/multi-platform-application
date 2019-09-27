plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(29)
    buildToolsVersion("29.0.2")

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    defaultConfig {
        targetSdkVersion(29)
        minSdkVersion(21)
        versionCode = 1
        versionName = version.toString()
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        applicationId = "$group.android.app"
    }
    signingConfigs {
        create("default") {
            storeFile = file("my-release-key.keystore")
            storePassword = "abcdef1234"
            keyAlias = "alias_name"
            keyPassword = "abcdef1234"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
        all {
            signingConfig = signingConfigs["default"]
        }
    }
}

dependencies {

    val navVersion: String by project

    implementation(project(":common"))

    implementation(kotlin("stdlib-jdk8"))
    implementation("androidx.appcompat", "appcompat", "1.1.0")
    implementation("androidx.core", "core-ktx", "1.1.0")
    implementation("androidx.constraintlayout", "constraintlayout", "1.1.3")
    implementation("androidx.navigation", "navigation-fragment-ktx", navVersion)
    implementation("androidx.navigation", "navigation-ui-ktx", navVersion)
    implementation("com.google.android.material", "material", "1.0.0")
    implementation("androidx.annotation", "annotation", "1.1.0")
    implementation("androidx.lifecycle", "lifecycle-extensions", "2.1.0")
}