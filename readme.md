# 💰 Personal Finance Tracker - Backend

## 📌 Overview
Personal Finance Tracker is a simple backend application built using **Java 21** and **Spring Boot** to manage **income and expense transactions**.

The application focuses on clean REST API design and real-world date-based reporting, without unnecessary complexity.

---

## 🎯 Features
- Add, update, delete financial transactions
- Categorize income and expenses
- Automatically sets today’s date if not provided
- Fetch transactions by:
    - Weekly range (last 7 days)
    - Monthly range (last 1 month)
    - Custom date range

---

## 🛠 Tech Stack
- Java 21
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Lombok

---

## 🔌 REST APIs

### 🧾 Transactions

| Method | Endpoint | Description |
|------|---------|-------------|
| POST | `/api/transactions` | Add a new transaction |
| PUT | `/api/transactions/{id}` | Update an existing transaction |
| GET | `/api/transactions` | Fetch all transactions |
| GET | `/api/transactions/{id}` | Fetch transaction by ID |
| DELETE | `/api/transactions/{id}` | Delete a transaction |

---

### 📊 Reports

| Method | Endpoint | Description |
|------|---------|-------------|
| GET | `/api/reports/range?startDate=YYYY-MM-DD&endDate=YYYY-MM-DD` | Transactions in custom date range |
| GET | `/api/reports/weekly` | Transactions from last 7 days |
| GET | `/api/reports/monthly` | Transactions from last 1 month |

---

## 🧠 Notes
- If `date` is not provided while creating a transaction, the system automatically sets **today’s date**
- Designed to be simple, readable, and easy to extend


## 🚀 Setup & Run

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/your-username/PersonalFinanceTracker.git
cd PersonalFinanceTracker