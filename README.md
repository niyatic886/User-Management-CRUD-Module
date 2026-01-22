# User Management CRUD Module

A simple **User Management system** built with **Spring Boot**, **Spring Data JPA**, and **MySQL**.  
This project provides RESTful APIs for managing users with basic CRUD operations.

---

## 🔗 Project Links

- **GitHub Repository**:  [Github Repo](https://github.com/niyatic886/User-Management-CRUD-Module)

- **Postman Collection**:  [Postman Collection](https://app.getpostman.com/join-team?invite_code=ba88d9082c7d64cb1a56536ec6a9d1b661e4e960c78ee8ca11cea5e92a638176)
---

## 🚀 Features

- Create, Read, Update, Delete (CRUD) operations for users
- Validations for required fields (example: email must not be null)
- Layered architecture: Controller, Service, DAO, Repository
- MySQL database integration using Spring Data JPA
- REST APIs for easy frontend or third-party integration

---

## 🗄️ Database Schema

Table: `user`

| Column Name      | Type          | Constraints                |
|------------------|--------------|---------------------------|
| id               | BIGINT       | Primary Key, Auto Increment |
| email_id         | VARCHAR(100) | Not Null, Unique           |
| name             | VARCHAR(100) | Not Null                  |
| whatsapp_number  | VARCHAR(15)  | Nullable                  |
| gender           | VARCHAR(10)  | Nullable                  |

---

## 📌 REST API Endpoints

| Method | Endpoint       | Description       |
|--------|----------------|------------------|
| POST   | /users         | Create new user  |
| GET    | /users         | Get all users    |
| GET    | /users/{id}    | Get user by ID   |
| PUT    | /users/{id}    | Update user      |
| DELETE | /users/{id}    | Delete user      |

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven

---

## ⚙️ Getting Started

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/your-username/user-management-crud.git
