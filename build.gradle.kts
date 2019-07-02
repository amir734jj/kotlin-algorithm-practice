import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm") version "1.3.11"
}

val junitVersion: String = "5.3.2"

repositories {
  jcenter()
}

dependencies {
  testCompile("org.junit.jupiter:junit-jupiter-api:$junitVersion")
  testCompile("org.junit.jupiter:junit-jupiter-params:$junitVersion")
  testRuntime("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
    implementation(kotlin("stdlib-jdk8"))
}

tasks.withType<Test> {
  useJUnitPlatform()
  testLogging {
    events("passed", "skipped", "failed")
  }
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}