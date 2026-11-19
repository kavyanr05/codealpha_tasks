# CodeAlpha Java Application using Gradle

## Project Overview

This project is developed as part of the CodeAlpha DevOps Internship.

It demonstrates Java application development, Gradle build automation, dependency management, automated testing, and Continuous Integration (CI) using GitHub Actions.

## Technologies Used

- Java JDK 21
- Gradle 9.9.1
- JUnit Jupiter
- Apache Commons Lang
- Git and GitHub
- GitHub Actions
- Visual Studio Code

## Project Structure

```text
CodeAlpha_Java_Gradle/
├── .github/
│   └── workflows/
│       └── gradle.yml
├── app/
│   ├── src/
│   │   ├── main/java/org/example/App.java
│   │   └── test/java/org/example/AppTest.java
│   └── build.gradle.kts
├── gradle/
├── gradlew
├── gradlew.bat
├── gradle.properties
└── settings.gradle.kts
```

## Features

- Java application development.
- Automated builds using Gradle.
- Dependency management using Maven Central.
- Unit testing using JUnit Jupiter.
- Continuous Integration using GitHub Actions.
- Automatic build and test execution on pushes and pull requests to the main branch.

## How to Run

Make sure Java JDK 21 is installed.

Run the application on Windows:

```powershell
.\gradlew.bat run
```

Build the project:

```powershell
.\gradlew.bat build
```

Run automated tests:

```powershell
.\gradlew.bat test
```

## Testing

The project includes two JUnit tests:

- appHasAGreeting
- appHasProjectInfo

Both tests passed successfully, with a 100% success rate in the Gradle test report.

## CI/CD Pipeline

GitHub Actions is configured to automatically:

1. Check out the repository.
2. Set up Java 21.
3. Execute the Gradle build.
4. Run automated tests.

The GitHub Actions workflow is located at:

`.github/workflows/gradle.yml`

## Learning Outcomes

- Understanding Java development.
- Automating builds using Gradle.
- Managing external dependencies.
- Writing and executing automated unit tests.
- Implementing a CI pipeline with GitHub Actions.

## Internship

Developed as part of the CodeAlpha DevOps Internship.

## GitHub Repository

https://github.com/kavyanr05/CodeAlpha_Java_Gradle