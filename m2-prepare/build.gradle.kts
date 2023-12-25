plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotest.multiplatform)
}

kotlin {
    jvm {
        compilations.all {
            kotlinOptions {
                jvmTarget = "17"
            }
        }
    }

    sourceSets {
        val commonTest by getting {
            dependencies {
                implementation(libs.bundles.kotest)
            }
        }

        val jvmTest by getting {
            dependencies {
                implementation(libs.kotest.junit5)
            }
        }
    }
}