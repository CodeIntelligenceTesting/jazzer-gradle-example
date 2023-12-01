plugins {
    id("java")
    id("com.code-intelligence.cifuzz") version "1.10.0"
}

group = "com.code-intelligence"
version = "1.0-SNAPSHOT"

repositories {
    // Add the Code Intelligence repository to resolve Jazzer dependencies
    // Authentication is provided via gradle.properties to not include them in the build file.
    // For more options see https://docs.gradle.org/current/samples/sample_publishing_credentials.html
    maven {
        name = "CodeIntelligenceRepository"
        url = uri("https://gitlab.code-intelligence.com/api/v4/projects/89/packages/maven")
        credentials(PasswordCredentials::class)
        content {
            includeGroupByRegex("com\\.code-intelligence.*")
        }
    }
    mavenCentral()
}

tasks.test {
    useJUnitPlatform()
}
