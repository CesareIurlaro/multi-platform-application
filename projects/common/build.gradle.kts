plugins {
    kotlin("multiplatform")
}

repositories {
    jcenter()
}

kotlin {

    jvm()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
        val jvmMain by getting {
            dependencies {

                val persistenceApiVersion: String by project
                val validationApiVersion: String by project

                implementation(kotlin("stdlib-jdk8"))
                implementation("javax.persistence:persistence-api:$persistenceApiVersion")
                implementation("javax.validation:validation-api:$validationApiVersion")

            }
        }
    }
}