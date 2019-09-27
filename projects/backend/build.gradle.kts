import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
    kotlin("plugin.jpa")
    id("org.springframework.boot")
    war
}

dependencies {

    val springVersion: String by project
    val jacksonVersion: String by project
    val firebaseVersion: String by project
    val h2Version: String by project
    val mimepullVersion: String by project

    implementation(project(":common"))

    implementation(kotlin("reflect"))
    implementation(kotlin("stdlib-jdk8"))

    implementation("org.springframework.boot", "spring-boot-starter-data-jpa", springVersion)
    implementation("org.springframework.boot", "spring-boot-starter-data-rest", springVersion)
    implementation("org.springframework.boot", "spring-boot-starter-web", springVersion)
    implementation("org.springframework.boot", "spring-boot-starter-web-services", springVersion)
    implementation("org.jvnet.mimepull", "mimepull", mimepullVersion)
    implementation("com.fasterxml.jackson.module", "jackson-module-kotlin", jacksonVersion)
    implementation("com.google.firebase", "firebase-admin", firebaseVersion)

    runtime("com.h2database", "h2", h2Version)
    runtime("org.springframework.boot", "spring-boot-starter-tomcat", springVersion)

}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}