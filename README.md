# Maven Standalone Application

Welcome to the **Maven Standalone Application** project! This project demonstrates how to set up a basic Maven project, integrate JUnit for testing, and configure SonarQube for continuous code quality analysis. The project includes a simple Java application (`devops-class.java`) that serves as an introduction to Maven and the DevOps workflow.

## Project Overview

This project is designed for students who are learning how to use Maven as a build tool for Java projects. It provides a basic setup to help understand the following concepts:

- **Maven Project Structure**: Understanding how to organize Java projects using Maven.
- **JUnit for Testing**: Basic integration of unit tests in a Maven project.
- **SonarQube Integration**: Setting up SonarQube for static code analysis to ensure high-quality code.
- **SCM Configuration**: Git integration and managing project versions.

## Project Features

- **Maven Build Tool**: Automates project builds, dependency management, and packaging.
- **JUnit 5 for Testing**: Includes unit tests to validate the application's behavior.
- **SonarQube Configuration**: Configuration for continuous code quality checks with SonarQube.
- **GitHub SCM Integration**: Integrated with GitHub for version control and issue management.

## Setup Instructions

To get started with this project, follow these steps:

### 1. Clone the Repository

Clone the project repository to your local machine using Git:

```bash
git clone https://github.com/m-pasima/maven-application.git
```

### 2. Install Maven

If you don't have Maven installed on your machine, follow the instructions in the [official Maven documentation](https://maven.apache.org/install.html).

Also you can check out this repository for installation scripts [Maven Installation Script](https://github.com/m-pasima/cicd-tools-installation-scripts)

### 3. Build the Project

Navigate to the project directory and run the following command to build the project:

```bash
mvn clean install
```

This will compile the source code, run tests, and package the application as a JAR file.

### 4. Run the Application

To run the application, use the following command:

```bash
mvn exec:java
```

Ensure that the `devops-class.java` is specified as the main class in the `pom.xml` (under the `maven-jar-plugin` section) if it is the entry point.

### 5. Run the Tests

To run the tests with JUnit 5, use the following command:

```bash
mvn test
```

This will execute all the tests in the project.

### 6. SonarQube Analysis

To perform a static code analysis with SonarQube, use the following command:

```bash
mvn sonar:sonar
```

This will push your code to the SonarQube server (make sure your SonarQube server is running and the credentials are correctly configured in `pom.xml`).

## Project Structure

The project follows a typical Maven directory structure:

```
maven-standalone-application/
│
├── pom.xml                      # Maven configuration file
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── mt/
│   │               └── sample/
│   │                   └── devops-class.java     # Main application class
│   └── test/
│       └── java/
│           └── com/
│               └── mt/
│                   └── sample/
│                       └── HelloWorldTest.java  # JUnit tests
└── target/
    └── maven-standalone-application-0.0.1-SNAPSHOT.jar # Generated JAR file
```

## Key Components

- **`pom.xml`**: The Maven configuration file that defines the project, dependencies, plugins, and build settings.
- **`devops-class.java`**: The main class that outputs a welcome message and the current date.
- **`HelloWorldTest.java`**: A sample unit test class demonstrating how to use JUnit with Maven.
- **SonarQube**: A tool for continuous code quality inspection, configured to analyze the project.
- **JUnit 5**: Used for unit testing, ensuring that the code works as expected.

## SonarQube Configuration

The `pom.xml` file is configured to send code to a SonarQube instance for analysis. The configuration includes the following SonarQube details:

- **SonarQube Host URL**: `http://YourSonarQubeHostName:9000/`
- **Login Credentials**: Both the login and password are set to `admin` for simplicity in this example.

Please ensure your SonarQube instance is running and accessible before attempting to run the SonarQube analysis.

## Issues and Contributions

Feel free to open an issue on GitHub if you encounter any problems or have questions about the project. You can also submit a pull request to contribute improvements.

- **Issue Tracker**: [https://github.com/m-pasima/maven-application/issues](https://github.com/m-pasima/maven-application/issues)
- **Source Code**: [https://github.com/m-pasima/maven-application](https://github.com/m-pasima/maven-application)



### **Summary:**
This `README.md` file provides a clear,  overview of the project, explaining its purpose, setup, usage instructions, and key components, with updated paths and filenames matching your project structure. It is written with the educational aspect in mind, giving students a step-by-step guide to set up, run, and understand the Maven-based Java application.
