# BankAccountBalanceChecker(Java + JDBC)
 OBJECTIVE:
     To fetch and display the account balance of a user by entering an account number using JDBC.

DESCRIPTION:
      -This project is a Java console-based application where the user enters an account number.
       -The system retrieves and displays the corresponding account holder name and balance from the database.

This project demonstrates:
           -JDBC database connectivity
           -SELECT queries
           -Use of PreparedStatement for safe querying
           -Reading data using ResultSet

TECHNOLOGIES USED:
                 Java 
                 JDBC (Java Database Connectivity)
                 MySQL Database
                 Eclipse IDE

Database Table:
       CREATE TABLE accounts (
             acc_no INT PRIMARY KEY,
             holder_name VARCHAR(50),
             balance DOUBLE
              );

How to Run the Project:
                   1. Open the project in Eclipse.
                   2. Add MySQL JDBC Driver (Connector/J) to the build path.
                   3. Update database connection details in the Java file:
Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/bank",
    "root",
    "your_password"
);
                   4. Run the Java file as Java Application.
                   5. Enter the account number when prompted.

Features:
          Fetch account details using account number
          Displays account holder name and balance
          Uses PreparedStatement to prevent SQL Injection
          Reads data using ResultSet

Sample Output:
        Enter Account Number:
         1001
Account Holder Name : Sindhu
Account Balance     : ₹25000.75

      If the account does not exist:
       Account not found

Conclusion:
            This mini-project helps understand basic JDBC operations and database interaction using Java.
             It is suitable for beginners learning Java Database Connectivity.




