plugins {
    id("java-gradle-plugin")
}

java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    implementation("com.github.ben-manes:gradle-versions-plugin:0.38.0")
    implementation("io.github.gradle-nexus:publish-plugin:1.1.0")
    implementation("io.spring.javaformat:spring-javaformat-gradle-plugin:0.0.31")
    implementation("io.spring.nohttp:nohttp-gradle:0.0.10")
    implementation("org.asciidoctor:asciidoctor-gradle-jvm:3.3.2")
    implementation("org.asciidoctor:asciidoctor-gradle-jvm-pdf:3.3.2")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.21")
    implementation("org.hidetake:gradle-ssh-plugin:2.10.1")
    implementation("org.jfrog.buildinfo:build-info-extractor-gradle:4.26.1")
    implementation("org.sonarsource.scanner.gradle:sonarqube-gradle-plugin:2.7.1")
}
