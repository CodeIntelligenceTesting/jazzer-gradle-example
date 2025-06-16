# Jazzer Gradle Example
This example uses Jazzer version 0.24.0 and shows how you can run it directly from Gradle.

For detailed information on how to use Jazzer, please refer to the [Jazzer documentation](https://github.com/CodeIntelligenceTesting/jazzer?tab=readme-ov-file#using-jazzer-via)

## Run
You can run Jazzer's fuzz tests as part of Gradle tests in one of the following ways:
1. Run a fuzz test in the fuzzing mode. 
   ```shell
   JAZZER_FUZZ=1 ./gradlew test --tests "org.example.PersonTest.fuzzPerson"
   ```
1. Run a fuzz test in the regression mode.
   ```shell
   ./gradlew test --tests "org.example.PersonTest.fuzzPerson"
   ```
