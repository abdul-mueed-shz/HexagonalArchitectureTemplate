```markdown
# Hexagonal Architecture Spring Boot Project

This project is a template for setting up a Spring Boot application following hexagonal (or clean) architecture principles. The project includes Lombok for reducing boilerplate code, MapStruct for object mapping, and OpenAPI for API documentation.

## Table of Contents
- [Project Structure](#project-structure)
- [Technologies](#technologies)
- [Getting Started](#getting-started)
- [Building and Running](#building-and-running)
- [Generating OpenAPI Documentation](#generating-openapi-documentation)
- [Further Information](#further-information)

## Project Structure

The hexagonal architecture divides the application into distinct layers, with dependencies pointing inward to ensure isolation and flexibility. Below is a sample folder structure for this project:

```
src/main/java/com/yourcompany/yourproject
├── application                # Application layer
│   ├── service                 # Business logic and use cases
│   └── port                    # Interfaces for interacting with infrastructure and domain
│       ├── in                  # Inbound ports (e.g., API, Messaging)
│       └── out                 # Outbound ports (e.g., Repository, External Service)
├── domain                      # Domain layer (core business logic)
│   ├── model                   # Domain models/entities
│   └── service                 # Domain services (pure business logic)
├── infrastructure              # Infrastructure layer
│   ├── adapter                 # Adapters for interacting with external systems
│   │   ├── api                 # REST API adapters
│   │   ├── persistence         # Database adapters (e.g., JPA repositories)
│   │   └── mapper              # Mappers (e.g., MapStruct mappers)
│   └── config                  # Configuration classes (e.g., OpenAPI, beans)
└── main                        # Main entry point
    ├── YourApplication.java    # Spring Boot application entry point
    └── resources
        └── application.yml     # Application configuration
```

## Technologies

This project leverages the following technologies:

- **Java 17**
- **Spring Boot 3.1.4**: Provides the foundation for the project.
- **Spring Data JPA**: For database interactions.
- **Lombok**: Reduces boilerplate code.
- **MapStruct**: Simplifies object mapping.
- **OpenAPI**: Provides API documentation.

## Getting Started

### Prerequisites

Make sure you have the following installed:
- **Java 17** (or a compatible version)
- **Maven** (version 3.6+)
- **Docker** (for containerized databases, optional)

### Clone the Repository

```bash
git clone https://github.com/yourcompany/yourproject.git
cd yourproject
```

### Configure Database (Optional)

Edit the `src/main/resources/application.yml` file to configure your database settings.

### Install Lombok in IDE (if needed)

If your IDE doesn’t support Lombok out of the box, download the Lombok plugin and enable annotation processing in your IDE settings.

### Maven Setup

Ensure all dependencies are downloaded by running:

```bash
mvn clean install
```

## Building and Running

To build and run the project locally:

```bash
mvn spring-boot:run
```

Alternatively, you can build a JAR file:

```bash
mvn clean package
java -jar target/yourproject-0.0.1-SNAPSHOT.jar
```

## Generating OpenAPI Documentation

This project uses the OpenAPI Generator to create API documentation. The configuration is in `pom.xml` under the `openapi-generator-maven-plugin` plugin.

To generate OpenAPI documentation, run:

```bash
mvn openapi-generator:generate
```

The generated documentation will be available in the specified `output` directory in `pom.xml`.

## Example Folder Structure

- **`application` layer**: Contains use cases and service classes. It defines the core business logic and orchestrates interactions between the domain and infrastructure layers.
  - `service`: Business logic classes and orchestrators.
  - `port`: Defines inbound and outbound interfaces.
- **`domain` layer**: The core of the application. Contains domain models and services, representing pure business logic.
- **`infrastructure` layer**: Contains adapters and configurations to interact with the external environment.
  - `adapter`: Adapters for external interactions like REST APIs, databases, and other services.
  - `config`: Configuration files (e.g., OpenAPI, Spring beans).
- **`main`**: Entry point of the application with `@SpringBootApplication`.

## Further Information

- **Hexagonal Architecture**: [Learn more about hexagonal architecture](https://alistair.cockburn.us/hexagonal-architecture/)
- **Lombok**: [Project Lombok documentation](https://projectlombok.org/)
- **MapStruct**: [MapStruct documentation](https://mapstruct.org/documentation/stable/reference/html/)
- **OpenAPI**: [OpenAPI documentation](https://swagger.io/docs/specification/about/)

## License

This project is licensed under the MIT License. See the LICENSE file for details.
```

This `README.md` provides an overview of the project's structure, dependencies, and setup instructions, specifically for a Spring Boot project with hexagonal architecture, Lombok, MapStruct, and OpenAPI. Adjust the placeholders like `yourcompany`, `yourproject`, and specific configuration details as needed.
