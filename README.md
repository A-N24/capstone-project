# INF 653 Capstone Project: Simple Task Management System

## Overview

The Simple Task Management System is a web application designed to help individuals, freelancers, and small teams organize, prioritize, and track their tasks efficiently. Built with Java Spring Boot, this project showcases our proficiency in backend development, database integration, and frontend presentation.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [Testing](#testing)
- [Documentation](#documentation)
- [Team Members](#team-members)
- [License](#license)

## Features

- **User Authentication:** Secure registration and login system with role-based access control.
  
- **Task Management:** CRUD operations for tasks, allowing users to create, read, update, and delete tasks.
  
- **Validation and Error Handling:** Robust validation mechanisms and error messages for data integrity and user guidance.
  
- **Responsive User Interface:** User-friendly and responsive design optimized for various devices.
  
- **Documentation and Testing:** Comprehensive documentation and testing strategy to ensure reliability and functionality.

## Technologies Used

- **Backend Framework:** Java Spring Boot
- **Frontend Framework:** Thymeleaf
- **Database:** PostgreSQL
- **ORM:** Spring Data JPA
- **Security:** Spring Security
- **Testing Frameworks:** JUnit, Mockito
- **UI Framework:** Bootstrap

## Installation

1. **Clone the Repository:**
    ```bash
    git clone https://github.com/your-username/simple-task-management-system.git
    ```

2. **Navigate to the Project Directory:**
    ```bash
    cd simple-task-management-system
    ```

3. **Build and Run the Application:**
    ```bash
    ./mvnw spring-boot:run
    ```

The application will be accessible at `http://localhost:8080`.

## Usage

1. **Registration and Login:**
    - Register as a new user or log in with existing credentials.
  
2. **Task Management:**
    - Create new tasks, view existing tasks, update task details, or delete tasks as needed.
  
3. **Profile Management:**
    - Update user profile details and manage account settings.

## Testing

- **Unit Tests:** Ensure individual components work as expected.
- **Integration Tests:** Ensure seamless interaction between controllers, services, and repositories.
- **End-to-End Tests:** Simulate user interactions to test all features together.

To run tests, use the following command:
```bash
./mvnw test
```

## Documentation

- **Installation Guide:** Step-by-step instructions to clone, configure, and run the application.
  
- **User Manual:** Detailed instructions on how to use each feature of the application.
  
- **Architecture and Design Documentation:** Overview of the project architecture, database schema design, and key design decisions.

## Team Members

- **Amani Nelson:** Backend Development, Database Integration
- **Sokheang Lim:** Frontend Development, UI Design

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
