plugins {
    kotlin("multiplatform") apply false
    id("com.android.application") apply false
}

allprojects {
    group = "edu.unito"
    version = "0.0.1"
}

subprojects {

    repositories {
        google()
        mavenCentral()
        jcenter()
        maven("https://jitpack.io")
    }

}