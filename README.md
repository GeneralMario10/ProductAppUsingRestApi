# Product Management API

A simple backend project for managing products using **Spring Boot**, **JPA**, **MySQL**, and **RESTful APIs**.

## 📌 Description

This project is a basic CRUD (Create, Read, Update, Delete) application for managing products in a store. It provides a set of RESTful endpoints to interact with the product database. The backend is built using **Spring Boot**, and data is persisted using **JPA** with a **MySQL** database.

## 🔧 Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL
- RESTful API
- Maven

## ⚙️ Features

- Add a new product
- Get a list of all products
- Get a product by ID
- Update product information
- Delete a product

## 🔗 API Endpoints

| Method | Endpoint         | Description             |
|--------|------------------|-------------------------|
| GET    | `/api/products`  | Get all products        |
| GET    | `/api/products/{id}` | Get product by ID   |
| POST   | `/api/products`  | Add a new product       |
| PUT    | `/api/products/{id}` | Update product by ID |
| DELETE | `/api/products/{id}` | Delete product by ID |

## 🛠️ How to Run the Project

1. **Clone the repository**

```bash
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name
