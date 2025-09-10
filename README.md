# User Management App  

A simple **CRUD web application** built with **Spring Boot (backend)** and **HTML, CSS, JavaScript (frontend)**.  
The app allows users to **Add, View, Update, and Delete** user records with a clean and minimal interface.  

---

## 🚀 Features  

- ➕ **Add User** – Create new user records  
- 📋 **View Users** – List all users in a table  
- ✏️ **Update User** – Modify existing user details  
- ❌ **Delete User** – Remove users from the system  
- ⚡ **REST API Backend** – Built with Spring Boot and JPA  
- 🌐 **Simple Frontend** – HTML, CSS, and JavaScript  

---

## 🛠️ Tech Stack  

### Backend  
- Java  
- Spring Boot  
- Spring Data JPA  
- Hibernate  
- MySQL (or any relational database)  

### Frontend  
- HTML  
- CSS  
- JavaScript  

### Tools  
- Maven  
- Git & GitHub  
- IDE (IntelliJ IDEA / Eclipse / VS Code)  

---

## ⚙️ Setup & Installation  

1. **Clone the repository**  
   ```bash
   git clone https://github.com/your-username/UserManegmentApp.git
   cd UserManegmentApp

2. **Configure Database**
    Edit src/main/resources/application.properties with your MySQL credentials:

     spring.datasource.url=jdbc:mysql://localhost:3306/userdb
     spring.datasource.username=root
     spring.datasource.password=yourpassword
     spring.jpa.hibernate.ddl-auto=update

3.  **Run the Application**
       In bash : mvn spring-boot:run

4. **Add url to browser**
       http://localhost:8080

📂 Project Structure

UserManegmentApp/
 ├── src/main/java/...       # Spring Boot backend
 ├── src/main/resources/
 │    ├── static/            # CSS, JS
 │    ├── templates/         # HTML pages
 │    └── application.properties
 ├── pom.xml                 # Maven dependencies
 └── README.md               # Project documentation

 📜 License
   This project is licensed under the MIT License.

