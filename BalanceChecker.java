package com.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class BalanceChecker {
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter Account Number:");
        int accNo = sc.nextInt();

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bank",
                "root",
                "root"
            );

            
            String query = "SELECT holder_name, balance FROM accounts WHERE acc_no = ?";

            
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, accNo);

            
            ResultSet rs = pst.executeQuery();

            
            if (rs.next()) {
                System.out.println("\nAccount Holder Name : " + rs.getString("holder_name"));
                System.out.println("Account Balance     : ₹" + rs.getDouble("balance"));
            } else {
                System.out.println("\nAccount not found");
            }

            
            rs.close();
            pst.close();
            con.close();
            sc.close();

        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
}



