plugins {
    kotlin("jvm")
}

dependencies {
    testImplementation(libs.bundles.junit5)
    testImplementation(libs.system.lambda)
    testImplementation(kotlin("test"))
}