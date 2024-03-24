plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    alias(libs.plugins.firebaseKotlinAndroid)
}

android {
    signingConfigs {
        create("release") {
                storeFile = file("C:\\Users\\Siva Saravanan\\Documents\\ReminderApp\\app\\keystorefile.jks")
                storePassword = "reminderapp"
                keyAlias = "reminderapp"
                keyPassword = "reminderapp"
        }
    }
    namespace = "com.example.reminderapp"
    compileSdk = 34


    defaultConfig {
        applicationId = "com.example.reminderapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        /* For Debug Version
        versionCode = 4
        versionName = "1.3"*/

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            signingConfig = signingConfigs.getByName("release")
            isDebuggable = false
        }
        getByName("debug") {
            signingConfig = signingConfigs.getByName("debug")
            isDebuggable = true
        }
    }

    flavorDimensions += "appType"
    productFlavors {
        create("dev") {
            applicationId = "com.example.reminderapp.dev"
            dimension = "appType"
            versionNameSuffix = "-dev"
            versionCode = 3
            versionName = "1.2"
        }
        create("prod") {
            applicationId = "com.example.reminderapp.prod"
            dimension = "appType"
            versionNameSuffix = "-prod"
            versionCode = 2
            versionName = "1.1"
        }
    }

    applicationVariants.all {
        val ext = when (flavorName) {
            "dev" -> ".devUrlExt"
            "prod" -> ".prodUrlExt"
            else -> null
        }

        ext?.let {
            buildConfigField("String", "BASE_URL", "\"https://api.hostname$ext\"")
            /*
            other +30 buildConfigField
            ...
            ...
            ...
            */
        }
    }


    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    androidTestImplementation (libs.screengrab)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    implementation(platform(libs.firebase.bom))
    implementation(libs.androidx.firebase.analytics)
}