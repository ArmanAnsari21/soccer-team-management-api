# Soccer Team Management API

## Overview

This project is a backend REST API built using Java Spring Boot and MongoDB to manage soccer teams and players. The system supports CRUD operations for team and player records and demonstrates backend service architecture commonly used in production applications.

The project includes containerized deployment using Docker and supports API testing through Postman.

## Features

- Create, update, delete, and retrieve soccer teams
- Manage player records associated with teams
- RESTful API design
- MongoDB data storage
- Docker-based deployment
- API testing using Postman

## Technologies Used

- Java
- Spring Boot
- MongoDB
- Docker
- Maven
- REST APIs
- Postman

## API Endpoints

### Teams

POST /teams  
Create a new team

GET /teams  
Retrieve all teams

GET /teams/{id}  
Retrieve a specific team

PUT /teams/{id}  
Update a team

DELETE /teams/{id}  
Delete a team

## Running the Application

### Run with Docker

docker-compose up --build

### Run Locally

mvn spring-boot:run

## Why I Built This

I built this project to strengthen my backend development skills using Java Spring Boot and MongoDB. This project demonstrates experience designing REST APIs, handling structured data, and deploying backend services using containerized workflows.
