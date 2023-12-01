# Jazzer Gradle Example

This example uses the closed source cifuzz plugin version 1.10.0 and Jazzer version 0.23.0, available from the private GitLab package repository at https://gitlab.code-intelligence.com/groups/artifacts/-/packages.

**Note**: The project can not be build without proper repository setup!

## Setup

1. Add repository credentials to `~/.gradle/gradle.properties`  
   See [Publishing Credentials](https://docs.gradle.org/current/samples/sample_publishing_credentials.html) for more options.
    ```
    CodeIntelligenceRepositoryUsername=Trial-User
    CodeIntelligenceRepositoryPassword=<TOKEN>
    ```
1. Take a look at existing configuration
   1. Configuration of build repository in `build.gradle.kts` 
      ```kotlin
      repositories {
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
      ```
   1. Configuration of plugin repository in `settings.gradle.kts`
      ```kotlin
      pluginManagement {
        repositories {
           maven {
               name = "CodeIntelligenceRepository"
               url = uri("https://gitlab.code-intelligence.com/api/v4/projects/89/packages/maven")
               credentials(PasswordCredentials::class)
               content {
                   includeGroupByRegex("com\\.code-intelligence.*")
               }
           }
        }
      } 
      ```
   1. Added cifuzz Gradle plugin in `build.gradle.kts`
       ```kotlin
        id("com.code-intelligence.cifuzz") version "1.10.0"
        ```
1. Install `cifuzz` `2.19.0+`

## Run
1. Execute fuzzing run
   ```shell
   cifuzz run org.example.PersonTest::fuzzPerson
   ```
1. Execute coverage run
   ```shell
   cifuzz coverage org.example.PersonTest::fuzzPerson
   ```
