plugins {
    kotlin("jvm") version "1.9.22"
    id("com.google.protobuf") version "0.9.4"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val protobufVersion = "3.21.12"

dependencies {
    implementation("com.google.protobuf:protobuf-java:$protobufVersion")
    implementation("com.google.protobuf:protobuf-kotlin:$protobufVersion")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

protobuf {
    protoc { artifact = "com.google.protobuf:protoc:$protobufVersion" }
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}

