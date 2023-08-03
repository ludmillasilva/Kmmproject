plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.ludmilla.kmmproject.android"
    compileSdk = 32
    defaultConfig {
        applicationId = "com.ludmilla.kmmproject.android"
        minSdk = Playstore.minSdk
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.0"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(":shared"))
    implementation(Compose.ui)
    implementation(Compose.tooling)
    implementation(Compose.toolingPreview)
    implementation(Compose.foundation)
    implementation(Compose.material)
    implementation(Compose.activity)
}