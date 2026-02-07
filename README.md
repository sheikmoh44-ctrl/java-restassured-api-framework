# REST API Automation Framework

### Java \| Rest Assured \| Maven \| JUnit

This repository contains a scalable and production-ready REST API
Automation Framework built using Java and Rest Assured.

The framework demonstrates strong backend automation skills, clean
architecture, reusable components, and real-world API validation
practices.

------------------------------------------------------------------------

## 📌 Project Objective

The goal of this project is to automate RESTful APIs with:

-   Clean and maintainable test structure\
-   Proper request and response validations\
-   Reusable utilities for scalability

This framework reflects industry-standard API automation practices used
in real QA projects.

------------------------------------------------------------------------

## 🛠️ Tech Stack

-   Java (JDK 8+)\
-   Rest Assured\
-   JUnit\
-   Maven\
-   JSON Path\
-   Hamcrest Assertions

------------------------------------------------------------------------

   Project Structure
=================

src
 └── test
      ├── java
      │    └── com.sheik.api
      │         ├── base
      │         │     └── BaseClass.java
      │         │
      │         ├── endpoints
      │         │     └── Endpoints.java
      │         │
      │         ├── payload
      │         │     └── Product.java
      │         │
      │         ├── runner
      │         │     └── TestRunner.java
      │         │
      │         ├── stepdefinitions
      │         │     └── UserStep.java
      │         │
      │         └── utils
      │               └── ConfigReader.java
      │
      └── resources
           ├── config
           │     └── config.properties
           │
           └── features
                 └── user.feature
   

### Key Features

-   Centralized base configuration\
-   Reusable request specification\
-   Dynamic payload handling\
-   Externalized configuration using config.properties\
-   Clean assertion structure\
-   Easy scalability for large API test suites

------------------------------------------------------------------------

## 🧪 Test Coverage Includes

-   GET request validation\
-   POST request with payload validation\
-   PUT request update validation\
-   DELETE request validation\
-   Status code verification\
-   Response body validation\
-   Header validation\
-   Authentication handling (Basic / Bearer token)\
-   Negative test scenarios

------------------------------------------------------------------------

## ▶️ How to Execute

### 1️ Clone the repository

    git clone <your-repository-url>

### 2️ Navigate to the project folder

    cd api-automation-framework

### 3️ Run using Maven

    mvn clean test

------------------------------------------------------------------------

## 📊 Test Reports

Execution reports are generated under:

    target/surefire-reports/

The framework can also be extended to integrate:

-   Allure Reports\
-   Extent Reports\
-   CI/CD pipelines (Jenkins, GitHub Actions)

------------------------------------------------------------------------

## 🎯 Why This Project Matters

This project demonstrates:

-   Strong understanding of API automation fundamentals\
-   Real-world backend validation approach\
-   Clean code practices\
-   Framework design knowledge\
-   Scalable automation structure

It is suitable for:

-   Freelance API automation projects\
-   Backend QA roles\
-   Automation Engineer positions\
-   CI/CD automation integration

------------------------------------------------------------------------

## 👨‍💻 About

Developed by a QA Automation Engineer with hands-on experience in:

-   API Automation\
-   Mobile Automation (Appium)\
-   Web Automation (Selenium)\
-   Java-based automation frameworks
