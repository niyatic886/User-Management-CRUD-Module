# User Management CRUD Module

A simple **User Management system** built with **Spring Boot**, **Spring Data JPA**, and **MySQL**.  
This project provides RESTful APIs for managing users with basic CRUD operations.

## Features

- Create, Read, Update, Delete (CRUD) operations for users
- Validations for required fields (e.g., email cannot be null)
- Layered architecture: Controller, Service, DAO, Repository
- MySQL database integration using Spring Data JPA
- REST APIs for easy integration with frontend or other applications

## Database Schema

Table: `user`

| Column Name      | Type        | Constraints             |
|-----------------|------------|------------------------|
| id              | BIGINT     | Primary Key, Auto Increment |
| email_id        | VARCHAR(100)| Not Null, Unique       |
| name            | VARCHAR(100)| Not Null              |
| whatsapp_number | VARCHAR(15)| Nullable              |
| gender          | VARCHAR(10)| Nullable              |

## REST API Endpoints

| Method | Endpoint       | Description        |
|--------|----------------|------------------|
| POST   | /users         | Create new user   |
| GET    | /users         | Get all users     |
| GET    | /users/{id}    | Get user by ID    |
| PUT    | /users/{id}    | Update user       |
| DELETE | /users/{id}    | Delete user       |

## Technical Stack

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven

## Getting Started

1. **Clone the repository**

```bash
git clone https://github.com/your-username/user-management-crud.git
