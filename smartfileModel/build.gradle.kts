plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.smartfile.model"
    compileSdk = 35

    defaultConfig {
        minSdk = 23

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = true
//            isShrinkResources = true
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
        buildConfig = true
    }

//    buildFeatures {
//        compose =  true
//    }



}

configurations {
    // 确保 Firebase 依赖被传递
    implementation {
        isTransitive = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


    api("com.blankj:utilcodex:1.31.1")

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





    // Facebook 广告 SDK：用于保活点火
    api("com.facebook.android:audience-network-sdk:6.16.0")

    // Firebase 和 FCM：用于远程点火
//    api(platform("com.google.firebase:firebase-bom:32.7.0"))
//    api("com.google.firebase:firebase-messaging-ktx:23.4.1")

    //新保活
    // 基础 UI 库
    //    api("androidx.compose.ui:ui")
    //    api("androidx.compose.ui:ui-graphics")
    //    api("androidx.compose.ui:ui-tooling-preview")
    //    api("androidx.compose.material3:material3")
    //    api("androidx.appcompat:appcompat:1.6.1")
    //    api("androidx.work:work-runtime-ktx:2.9.0")
}