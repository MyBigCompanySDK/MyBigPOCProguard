plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.mybigcompanysdk.mybigsdk_core"
    compileSdk = 34

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
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}

val PUBLISH_GROUP_ID by extra ( "io.github.MyBigCompanySDK")
val PUBLISH_VERSION by extra ("1.0.0")
val PUBLISH_ARTIFACT_ID by extra("MyBigSDKCore")
val PUBLISH_DESCRIPTION by extra ("my big sdk core")
val PUBLISH_URL by extra ("https://github.com/MyBigCompanySDK/MyBigPOCProguard")
val PUBLISH_LICENSE_NAME by extra ("Apache License 2.0")
val PUBLISH_LICENSE_URL by extra ("https://github.com/MyBigCompanySDK/MyBigPOCProguard/blob/master/LICENSE")
val PUBLISH_DEVELOPER_ID by extra ("TheScreamer74")
val PUBLISH_DEVELOPER_NAME by extra ("Thomas Huyghues")
val PUBLISH_DEVELOPER_EMAIL by extra ("thomas.huyghues@miam.tech")
val PUBLISH_SCM_CONNECTION by extra ("scm:git:github.com/MyBigCompanySDK/MyBigPOCProguard.git")
val PUBLISH_SCM_DEVELOPER_CONNECTION by extra ("scm:git:ssh://github.com/MyBigCompanySDK/MyBigPOCProguard.git")
val PUBLISH_SCM_URL by extra ("https://github.com/MyBigCompanySDK/MyBigPOCProguard/tree/master")

apply("${rootProject.projectDir}/scripts/publish-module.gradle")