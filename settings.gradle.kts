rootProject.name = "kotlin-professional"
include("m1-hw1-stub-project")

pluginManagement {
    val kotlinVersion: String by settings
    plugins {
        kotlin("jvm") version kotlinVersion apply false
    }
}