plugins {
    kotlin("jvm") version "2.2.20"
    id("org.jlleitschuh.gradle.ktlint") version "14.0.1"
}

group = "net.johanbasson"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.http4k.core)
    implementation(libs.http4k.server.netty)
    implementation(libs.http4k.format.kotlinx.serialization)
    implementation(libs.http4k.format.jackson)
    implementation(libs.http4k.client.okhttp)
    implementation(libs.http4k.api.openapi)
    implementation(libs.http4k.api.ui.swagger)

    implementation(libs.http4k.ops.micrometer)
    implementation(libs.http4k.ops.opentelemetry)
    implementation(libs.http4k.ops.resilience4j)

    // Logging
    implementation(libs.logging.kotlin)
    implementation(libs.logging.logback)
    implementation(libs.logging.slf4j)

    // Arrow-kt
    implementation(libs.arrow.core)
    implementation(libs.arrow.fx.coroutines)

    // BCrypt
    implementation(libs.bcrypt.core)

    // JWT
    implementation(libs.jwt.core)

    // Test dependencies\
    testImplementation(kotlin("test"))
    testImplementation(libs.restAssured.core)
    testImplementation(libs.kotest.runner.junit5)
    testImplementation(libs.kotest.assertions.core)
    testImplementation(libs.kotest.property)
    testImplementation(libs.kotest.assertions.arrow)
    testImplementation(libs.mockk.core)
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}
