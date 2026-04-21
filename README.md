# 🏨 Hotel Reservation API Automation Framework

This project contains API automation tests using both **Postman** and **Rest Assured (Java)** for a Hotel Reservation system.

It demonstrates a **hybrid API testing approach**, combining:
- Manual / exploratory API testing (Postman)
- Automated regression testing (Rest Assured )

---

## 🔧 Technologies

### 📌 Postman Layer
- Postman Collections
- Environment Variables
- Dynamic chaining (Token, Booking ID)

### 📌 Automation Layer
- Java
- Rest Assured
- Maven
- Jackson (POJO serialization)

---

## 🌐 API Under Test

**Restful Booker API**

Base URL:https://restful-booker.herokuapp.com

---

## 🚀 How to Run

### 📌 Postman
- Import `collection.json`
- Import `environment.example.json`
- Set environment variables:
  - `baseUrl`
  - `token` (auto-generated during run)
- Run collection

---

### 📌 Rest Assured (Java)

Run tests using Maven:

```bash
mvn clean test

🔄 Test Flow

📌 Postman Flow
CreateToken → CreateBooking → GetBooking → UpdateBooking → PartialUpdate → Delete

📌 Automation Flow (Rest Assured)
Create Booking → Validate Response → Get Booking → Update → Delete

✅ Covered Test Scenarios

🔐 Authentication
Token generation
Authorization validation

🏨 Booking Operations
Create booking
Get booking by ID
Update booking (PUT)
Partial update (PATCH)
Delete booking

🧪 Automation Features (Rest Assured)
POJO-based request models
Clean BaseTest structure
Reusable API methods
Response validation with assertions
Dynamic test data handling

📎 Notes
Postman collection is used for exploratory & manual testing
Rest Assured is used for regression automation
Token and booking IDs are dynamically handled in both layers
Project follows a hybrid API testing strategy
