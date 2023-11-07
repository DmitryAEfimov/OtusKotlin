rootProject.name = "kotlin.professional"
include("m1l1")

pluginManagement {
    plugins {
        val kotlinVersion: String by settings

        kotlin("jvm") version kotlinVersion apply false
    }
}