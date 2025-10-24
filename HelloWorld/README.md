## Getting Started

This is a small Java example project. It has been augmented with a minimal Maven build so you can compile and run it with a modern JDK.

## Build with Maven and Java 21

This project is configured to use Java 21 (LTS). There is no automated Copilot upgrade available in this environment (Copilot upgrade tools require a Pro/Enterprise plan). The repository includes a `pom.xml` that sets the compiler release to 21.

Prerequisites:

- A JDK 21 installation on your machine (or container). On Linux you can install Temurin 21 or another distribution. For example, on Ubuntu you can use the Adoptium packages or sdkman.
- Apache Maven (mvn) installed.

Quick commands (run from `HelloWorld`):

```bash
# verify Java 21 is active
java -version

# verify Maven
mvn -v

# compile
mvn clean compile

# run the main class using exec plugin
# the pom is configured to use the packaged main class; you can also pass it explicitly:
mvn exec:java -Dexec.mainClass=com.example.app.App
```

Notes:

- The source file is under `src/main/java/` to match the Maven layout.
- If you prefer Gradle, I can add a `build.gradle` instead.

Next steps I can take for you:

- Install JDK 21 in this devcontainer (if you want me to attempt installing it here).
- Run a build and verify compilation with Java 21.
- Convert the project to Gradle instead of Maven.

