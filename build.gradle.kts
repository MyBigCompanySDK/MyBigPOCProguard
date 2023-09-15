// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("com.android.library") version "8.1.0" apply false
    id("io.github.gradle-nexus.publish-plugin") version "1.1.0" apply true
    id("maven-publish")
    id("signing")
}

buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("io.github.gradle-nexus:publish-plugin:1.1.0")
    }
}

ext["signing.keyId"] = "D8C241BC"
ext["signing.password"] = "D@ftpunK76"
ext["signing.secretKeyRingFile"] = "SecretRingKey.gpg"

apply("${rootProject.projectDir}/scripts/publish-root.gradle")