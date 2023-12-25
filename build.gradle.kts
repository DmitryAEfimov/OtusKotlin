import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") apply false
}

group = "ru.otus.kotlin.professional"

repositories {
    mavenCentral()
}

subprojects {
    group = rootProject.group
    version = rootProject.libs.versions.speclibVersion

    repositories {
        mavenCentral()
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "17"
    }

    tasks {
        withType<Test>().configureEach {
            useJUnitPlatform()
            filter {
                isFailOnNoMatchingTests = false
            }
            testLogging {
                showExceptions = true
                showStandardStreams = true
                events = setOf(
                    org.gradle.api.tasks.testing.logging.TestLogEvent.FAILED,
                    org.gradle.api.tasks.testing.logging.TestLogEvent.PASSED
                )
                exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
            }
        }
    }
}