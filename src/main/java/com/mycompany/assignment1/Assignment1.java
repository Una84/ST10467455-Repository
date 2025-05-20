/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment1;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author RC_Student_lab
 */
public class Assignment1 {

    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

        // Get user details
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Username (must contain '_' and be <= 5 chars): ");
        String userName = scanner.nextLine();

        System.out.print("Enter Password (min 8 chars, must include uppercase, lowercase, digit, and special char): ");
        String password = scanner.nextLine();

        System.out.print("Enter Cell Number (must start with +27 and be 12 characters): ");
        String cellNumber = scanner.nextLine();

        // Create Login object
        Login login = new Login(firstName, lastName, userName, password, cellNumber);

        // Output validation results
        System.out.println("\n--- Login Validation ---");
        System.out.println("Username valid? " + login.checkUserName());
        System.out.println("Password complex? " + login.checkPasswordComplex());
        System.out.println("Cell number valid? " + login.isValidCellNumber());
        System.out.println("Overall Status: " + login.getLoginStatus());

        scanner.close();
    }
}