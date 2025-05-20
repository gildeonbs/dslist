# 🎮 DSList – Game Catalog API

DSList is a Java Spring Boot backend project that provides a RESTful API for managing a list of video games. Designed as a portfolio piece, it demonstrates backend development skills including domain modeling, data access with JPA, service layers, and RESTful web service design.

---

## 🚀 About the Project

This application simulates a game catalog system where users can browse and organize video games into lists. The focus is on building a well-structured backend using modern practices such as layered architecture, DTOs, and API design principles.

---

## 🛠️ Tech Stack

- **Java 21**
- **Spring Boot**
- **JPA / Hibernate**
- **PostgreSQL**
- **H2 (test database)**
- **Maven**

---

## 📚 Key Concepts

- RESTful API design
- CRUD operations
- Layered architecture (Controller → Service → Repository)
- DTO pattern for data encapsulation
- Object-relational mapping (ORM) with JPA
- Database seeding
- HTTP and JSON communication

---

## 🔄 Features

- Retrieve a list of video games
- Organize games into custom lists
- Reorder games in a list (by position)
- Serve data via a clean RESTful API

---

## 📦 Getting Started

### Clone and Run the Backend

```bash
# Clone the repository
git clone https://github.com/gildeonbs/dslist.git
cd dslist

# Run the Spring Boot application
./mvnw spring-boot:run

