# 🏨 Hotel Reservation API Tests

This project contains API automation tests for a Hotel Reservation system using Postman.

---

## 🔧 Tools
- Postman

---

## 📌 API
- Restful Booker API  
https://restful-booker.herokuapp.com

---

## 📂 Project Structure

postman/
  collection.json
  environment.example.json

---

## 🚀 How to Run

1. Import `collection.json` into Postman  
2. Import `environment.example.json`  
3. Update variables:
   - baseUrl
   - token (auto-generated)
4. Run the collection

---

## 🔄 Test Flow

CreateToken → CreateBooking → GetBooking → Update → PartialUpdate → Delete

---

## ✅ Test Scenarios

- Authentication (Token generation)  
- Create Booking  
- Get Booking  
- Update Booking  
- Partial Update Booking  
- Delete Booking  

---

## 📎 Notes

- Environment variables are provided as template  
- Token is generated dynamically during execution  
- Booking ID is stored automatically from response  
