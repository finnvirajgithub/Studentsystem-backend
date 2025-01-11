
# Student Management System - Backend

This repository contains the backend implementation of a simple Student Management System using **Spring Boot**. It supports CRUD operations and interacts with a MySQL database.

## Features
- Add, update, view, and delete students
- RESTful API for integration with the frontend
- MySQL database integration

## Prerequisites
Before starting, ensure you have the following tools installed:
- [Java Development Kit (JDK 17)](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)
- [MySQL Workbench](https://dev.mysql.com/downloads/workbench/)
- [Postman](https://www.postman.com/downloads/) for API testing

## Step 1: Setting Up the Project
1. **Create a Spring Boot Application:**
   - Go to [Spring Initializr](https://start.spring.io/).
   - Choose the following options:
     - **Project:** Maven
     - **Language:** Java
     - **Spring Boot Version:** 3.x.x (latest stable version)
     - **Dependencies:** Spring Web, Spring Data JPA, MySQL Driver
   - Click **Generate** to download the project as a `.zip` file.

2. **Import the Project into IntelliJ IDEA:**
   - Open IntelliJ IDEA and select **File > Open**.
   - Navigate to the downloaded `.zip` file, extract it, and open the extracted folder.

3. **Configure MySQL Database:**
   - Start MySQL Workbench and create a new database. Example:
     ```sql
     CREATE DATABASE student_management;
     ```
   - Note down the database name, username, and password.

4. **Set Up `application.properties`:**
   - Open `src/main/resources/application.properties`.
   - Add the following configuration:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/student_management
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     spring.jpa.hibernate.ddl-auto=update
     spring.jpa.show-sql=true
     ```

5. **Run the Application:**
   - Navigate to the main class (e.g., `StudentManagementApplication.java`).
   - Right-click and select **Run**.

6. **Test the Backend:**
   - Use Postman to test the application endpoints (e.g., `GET`, `POST`, `PUT`, `DELETE`).

You're now ready to start coding the CRUD operations! Refer to the code implementation section for detailed steps.
