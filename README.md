# Maven Standalone Application

Welcome to the **Maven Standalone Application** project! This project serves as an introductory demonstration of using **Maven** as a build tool for Java applications. It showcases how to set up a Maven project, integrate **JUnit 5** for unit testing, and configure **SonarQube** for continuous code quality checks.

## Project Overview

This project is designed to help students understand the following key concepts:

- **Maven Build Tool**: Understanding how to use Maven for dependency management, building Java applications, and packaging.
- **JUnit 5 for Testing**: Integration of JUnit 5 for running unit tests and ensuring the correctness of the code.
- **SonarQube Integration**: Using SonarQube for static code analysis to monitor code quality.
- **GitHub Integration**: Understanding how to manage source code and issues using GitHub.

## Features

- **Maven Project Structure**: Organized Maven project to demonstrate best practices in Java development.
- **JUnit 5 Testing**: Basic unit test class to demonstrate how to write tests and validate code functionality.
- **SonarQube Configuration**: Integration with SonarQube for continuous code quality checks.
- **GitHub Repository**: Hosted on GitHub with issue tracking and version control.

## Setup Instructions

Follow these steps to set up and run the project on your local machine.

### 1. Clone the Repository

First, clone the repository from GitHub:

```bash
git clone https://github.com/m-pasima/maven-application.git
```

### 2. Install Maven

If you don't have Maven installed on your machine, follow the instructions in the [official Maven documentation](https://maven.apache.org/install.html).

### 3. Build the Project

Navigate to the project directory and build the project using Maven:

```bash
cd maven-application
mvn clean install
```

This command will compile the project, run tests, and package the application as a JAR file.

### 4. Run the Application

To run the application, use the following command:

```bash
mvn exec:java
```

Ensure that the `DevOpsWorld.java` is specified as the main class in the `pom.xml` file.

### 5. Run the Tests

You can run the unit tests with the following command:

```bash
mvn test
```

This will run all the tests in the project, including the `HelloWorldTest` class.

### 6. SonarQube Analysis

To perform static code analysis with SonarQube, use the following command:

```bash
mvn sonar:sonar
```

This will send the code to a running SonarQube instance (make sure your SonarQube server is running and credentials are configured in the `pom.xml`).

## Project Structure

The project follows the standard Maven directory structure:

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
│   │                   └── DevOpsWorld.java     # Main application class
│   └── test/
│       └── java/
│           └── com/
│               └── mt/
│                   └── sample/
│                       └── HelloWorldTest.java  # JUnit tests
└── target/
    └── maven-standalone-application-0.0.1-SNAPSHOT.jar # Generated JAR file
```

### **Key Files:**

- **`pom.xml`**: The Maven configuration file that defines the project's dependencies, plugins, and build settings.
- **`DevOpsWorld.java`**: The main class that prints a welcome message and the current date.
- **`HelloWorldTest.java`**: A simple unit test class demonstrating how to use JUnit 5 to test the application.
- **SonarQube Integration**: Configured for static code analysis to monitor and maintain high code quality.

## SonarQube Configuration

This project is configured to integrate with **SonarQube** for continuous code quality inspection. Make sure you have a running SonarQube server and update the SonarQube credentials in the `pom.xml` file.

The configuration in the `pom.xml` includes:

- **SonarQube Host URL**: `http://35.154.242.68:9000/`
- **SonarQube Login Credentials**: `admin` (username) and `admin` (password).

Please ensure your SonarQube instance is properly set up and accessible before running the SonarQube analysis.

## Issues and Contributions

If you encounter any issues or have suggestions for improvements, feel free to open an issue or submit a pull request on GitHub:

- **Issue Tracker**: [https://github.com/m-pasima/maven-application/issues](https://github.com/m-pasima/maven-application/issues)
- **Source Code**: [https://github.com/m-pasima/maven-application](https://github.com/m-pasima/maven-application)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

### **Summary:**

This `README.md` file provides a comprehensive overview of the Maven-based project, its purpose, setup instructions, and how to run the application and tests. It is designed to guide students through the process of building, testing, and analyzing the project with Maven, JUnit 5, and SonarQube, making it an ideal starting point for learning Java development and DevOps practices.

