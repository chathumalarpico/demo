# Demo Spring Boot Service

This repository is a minimal Spring Boot web API. It is intentionally small and is a good starter project for learning Spring Boot basics.

## Project structure

- `pom.xml`: Maven build file with Java 21, Spring Boot Web, and Spring Boot Test dependencies.
- `src/main/java/com/chathumal/demo/DemoApplication.java`: application entry point (`main`) and auto-configuration bootstrap.
- `src/main/java/com/chathumal/demo/controller/RestController.java`: REST controller exposing a single `GET /` endpoint that returns `Hello AWS`.
- `src/main/resources/application.properties`: app configuration (`spring.application.name`, custom server port `8085`).
- `src/test/java/com/chathumal/demo/DemoApplicationTests.java`: context-load smoke test.

## How the app behaves

- The app starts from `DemoApplication` via `SpringApplication.run(...)`.
- Spring scans and registers the controller.
- `GET /` responds with plain text `Hello AWS`.
- CORS is currently open via `@CrossOrigin` on the controller.

## Recommended next learning steps

1. Add a service layer class and move business logic out of the controller.
2. Add a DTO and return JSON responses instead of raw strings.
3. Add dedicated controller tests (`@WebMvcTest`) and endpoint assertions.
4. Add profiles and environment-specific config (`application-dev.properties`, etc.).
5. Add input validation and global exception handling (`@ControllerAdvice`).
