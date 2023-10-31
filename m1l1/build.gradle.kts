plugins {
    kotlin("jvm")
}

val systemLambdaVersion: String by project

dependencies {
    testImplementation(kotlin("test-junit"))
    testImplementation ("com.github.stefanbirkner:system-lambda:${systemLambdaVersion}")
}