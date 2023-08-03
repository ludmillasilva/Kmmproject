plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.ludmilla.kmmproject.android"
    compileSdk = Playstore.compileSdk
    defaultConfig {
        applicationId = "com.ludmilla.kmmproject.android"
        minSdk = Playstore.minSdk
        targetSdk = Playstore.targetSdk
        versionCode = Playstore.versionCode
        versionName = Playstore.versionName
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.composeCompiler
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