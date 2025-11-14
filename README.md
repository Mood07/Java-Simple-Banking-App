# 🏦 Simple Banking Application (Java OOP Project)

A console-based **Java Banking System** built using solid
**Object-Oriented Programming (OOP)** principles.\
This project includes multiple account types, inheritance, polymorphism,
interest calculation, transfers, and fully interactive console menus.

Perfect for showcasing **Java fundamentals**, **inheritance-based
architecture**, and real-world banking logic in your GitHub portfolio.

------------------------------------------------------------------------

## 📦 Features

  Feature              Description
  -------------------- ----------------------------------------------
  🏛 Create Accounts    Create Savings or Checking accounts
  💸 Deposit Money     Add balance to an account
  🏧 Withdraw Money    Withdraw with balance and overdraft handling
  🔁 Money Transfer    Transfer between any two accounts
  📈 Apply Interest    Applies interest rate to savings accounts
  📋 List Accounts     View all registered accounts
  🛡 Input Validation   Safe handling of user input

------------------------------------------------------------------------

## 🧱 Project Structure

    Banking-App/
    │
    ├── src/
    │   ├── Main.java               # Menu & program flow
    │   ├── Bank.java               # Banking logic (list, find, transfer)
    │   ├── Account.java            # Base account class
    │   ├── SavingsAccount.java     # Savings with interest
    │   └── CheckingAccount.java    # Checking with overdraft
    │
    ├── out/                        # Compiled classes
    │
    └── README.md

------------------------------------------------------------------------

## 🧩 OOP Concepts Used

  Concept                   Application
  ------------------------- -------------------------------------------------
  **Inheritance**           SavingsAccount & CheckingAccount extend Account
  **Polymorphism**          Shared deposit/withdraw/transfer behavior
  **Encapsulation**         Private fields + getters/setters
  **Overriding**            withdraw() customized in CheckingAccount
  **Dynamic Collections**   All accounts stored using ArrayList

------------------------------------------------------------------------

## ▶ How to Run

### 1️⃣ Compile:

``` bash
javac -d out src/*.java
```

### 2️⃣ Run:

``` bash
java -cp out Main
```

------------------------------------------------------------------------

## 🖥 Demo Output

    ===================================
            Simple Banking App         
    ===================================

    ----------- MENU -----------
    1 - Create Savings Account
    2 - Create Checking Account
    3 - Deposit Money
    4 - Withdraw Money
    5 - Transfer Money
    6 - Apply Interest (Savings)
    7 - List All Accounts
    0 - Exit
    ----------------------------
    Choose an option:

------------------------------------------------------------------------

## 🧰 Technologies Used

  Category              Tools
  --------------------- ---------------------------------
  **Language**          Java 23
  **Paradigm**          OOP (Inheritance, Polymorphism)
  **Collections**       ArrayList
  **Environment**       VS Code / IntelliJ / Terminal
  **Version Control**   Git & GitHub

------------------------------------------------------------------------

## 🧨 Future Enhancements

-   File-based persistence (JSON or TXT)
-   Transaction history logs
-   IBAN validation
-   GUI interface (JavaFX)
-   Admin panel for account management

------------------------------------------------------------------------

## 👨‍💻 Author

**Berke Arda Türk**\
Data Science & AI Enthusiast \| Computer Science (B.ASc)\
[🌐 Portfolio Website](https://berke-turk.web.app/) • [💼
LinkedIn](https://www.linkedin.com/in/berke-arda-turk/) • [🐙
GitHub](https://github.com/Mood07)
