rootProject.name = "spec-lib"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("gradle/libs.version.toml"))
        }
    }
}

pluginManagement {
    plugins {
        val kotlinVersion: String by settings

        kotlin("jvm") version kotlinVersion apply false
        kotlin("multiplatform") version kotlinVersion apply false
    }
}

include("m1l1", "api")
