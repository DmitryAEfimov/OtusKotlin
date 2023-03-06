plugins {
    kotlin("jvm")
    application
}

dependencies {
    testImplementation(kotlin("test-junit"))
    testImplementation ("com.github.stefanbirkner:system-lambda:1.2.1")
}