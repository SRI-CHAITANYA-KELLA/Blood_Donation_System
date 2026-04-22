# 🩸 Blood Donation Management System (Spring Boot + Thymeleaf + MySQL)

## 📌 Overview

The **Blood Donation Management System** is a web-based application developed using **Spring Boot and Thymeleaf** to manage blood donor information efficiently.

This system allows users to register as donors, view donor records, search donors based on name and address, update donor details, and delete donor records. The application follows a structured **Spring MVC architecture** and integrates with a MySQL database using **Spring Data JPA**.

---

## 🛠️ Tech Stack

* **Backend:** Java, Spring Boot
* **Frontend:** Thymeleaf, HTML, CSS, Bootstrap
* **Database:** MySQL
* **ORM:** Hibernate (JPA)
* **Build Tool:** Maven
* **IDE:** Eclipse / IntelliJ

---

## ✨ Features

* ✅ Donor Registration with validation
* ✅ Success confirmation page after registration
* ✅ View all donors in table format
* ✅ Search donor by Name
* ✅ Search donor by Address
* ✅ Update donor details with pre-filled form
* ✅ Delete donor with confirmation popup
* ✅ Responsive UI using Bootstrap
* ✅ MVC Architecture implementation
* ✅ Database integration using JPA

---

## 🏗️ Architecture

This project follows **Spring MVC layered architecture**:

* **Controller Layer**

  * Handles HTTP requests and page navigation
* **Service Layer**

  * Contains business logic
* **DAO Layer**

  * Manages database operations
* **Repository Layer**

  * Uses Spring Data JPA
* **Entity Layer**

  * Represents donor data model

---

## 📂 Project Structure

```id="bloodultstruct"
com.demo
│── controller
│     └── DonarController.java
│── entity
│     └── Donar.java
│── DAO
│     └── DonarDAO.java
│── Repository
│     └── DonarRepository.java
│── Service
│     └── DonarService.java
│── Userexception
│     └── Exception.java
│── templates
│     ├── DonarRegistration.html
│     ├── DonarTable.html
│     ├── UpdateDetails.html
│     └── registrationSuccess.html
```

---

## 🖥️ User Interface

### 🔹 Donor Registration Page

* Bootstrap-based form UI
* Input validation (email, age, required fields)

### 🔹 Registration Success Page

* Confirmation message after successful registration
* Navigation to donor list

### 🔹 Donor Table Page

* Displays all donors in a structured table
* Features:

  * Search by name
  * Search by address
  * Update button
  * Delete button with confirmation

### 🔹 Update Page

* Pre-filled donor data
* Editable fields
* Confirmation before updating

---

## 🔄 Application Flow

1. User visits `/donar`
2. Fills donor registration form
3. Data is stored in MySQL database
4. Success page is displayed
5. User navigates to donor list
6. User can:

   * Search donors
   * Update donor details
   * Delete donor records

---

## ⚙️ Configuration

### application.properties

```id="bloodultprop"
spring.datasource.url=jdbc:mysql://localhost:3306/your_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 🚀 How to Run

### 1️⃣ Clone Repository

```id="bloodultclone"
git clone https://github.com/your-username/blood-donation-system.git
```

### 2️⃣ Open in IDE

* Import as Maven Project

### 3️⃣ Configure Database

* Create MySQL database
* Update credentials

### 4️⃣ Run Application

```id="bloodultrun"
mvn spring-boot:run
```

### 5️⃣ Access Application

```id="bloodulturl"
http://localhost:8080/donar
```

---

## 🧪 Example Input

```id="bloodultexample"
Name: Chaitanya  
Email: chai@example.com  
Address: Hyderabad  
Age: 23  
Blood Group: O+  
```

---

## 📈 Future Enhancements

* 🔹 Rename "Donar" → "Donor" (naming standard)
* 🔹 Add validation using @Valid annotations
* 🔹 Implement global exception handling
* 🔹 Add login system (Admin/User roles)
* 🔹 Add emergency blood request feature
* 🔹 Deploy application to cloud

---

## ⚠️ Known Improvements

* Naming convention: "Donar" should be "Donor"
* Age should be stored as integer instead of String
* Exception class naming can be improved

---

## 🤝 Contributing

Contributions are welcome! Feel free to fork and contribute.

---

## 📧 Contact

**Chaitanya**
🔗 LinkedIn: https://linkedin.com/in/your-profile

---

## ⭐ Support

If you like this project, give it a ⭐ on GitHub!
