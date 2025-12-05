plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.whitenoti.wasid"
    compileSdk = 35

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        aidl = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // okhttp retrofit2
    api("com.google.code.gson:gson:2.11.0")
    api("com.squareup.okhttp3:okhttp:4.12.0")
    api("com.squareup.retrofit2:retrofit:2.9.0")
    api("com.squareup.retrofit2:converter-gson:2.9.0")
    api("com.squareup.okhttp3:logging-interceptor:4.12.0")
    api("com.squareup.retrofit2:adapter-rxjava2:2.5.0")
    api("com.squareup.retrofit2:converter-scalars:2.3.0")

    // firebase
    api(platform("com.google.firebase:firebase-bom:34.1.0"))
    api("com.google.firebase:firebase-analytics")
    api("com.google.firebase:firebase-config")
    api("com.google.firebase:firebase-perf")
    api("com.google.firebase:firebase-crashlytics-ndk")
    api("com.google.firebase:firebase-analytics")

    api("com.google.firebase:firebase-firestore:26.0.0")
    api("com.google.firebase:firebase-common:21.0.0")
    api("com.google.firebase:firebase-messaging:25.0.0")
    api("com.google.firebase:firebase-datatransport")

    api ("androidx.work:work-runtime:2.10.3")
}