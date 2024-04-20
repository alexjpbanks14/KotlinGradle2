plugins {
    kotlin("jvm") version "1.9.23"
    application
}

repositories { mavenCentral(); gradlePluginPortal() }

dependencies { // All the libraries you want to use. See 4️⃣
    // Copy dependencies' names after you find them in a repository
    testImplementation(kotlin("test")) // The Kotlin test library
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinJvmCompile>().configureEach {
    jvmTargetValidationMode.set(org.jetbrains.kotlin.gradle.dsl.jvm.JvmTargetValidationMode.WARNING)
}

application {
    mainClass.set("main.kotlin.MainKt") // The main class of the application
}