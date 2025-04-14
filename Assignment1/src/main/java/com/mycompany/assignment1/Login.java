/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;

/**
 *
 * @author RC_Student_lab
 */
public class Login {
   private String firstName;
   private String lastName;
   private String userName;
   private String password;
   private String cellNumber;
   
   public Login(String firstName, String lastName, String userName, String password, String cellNumber) {
     this.firstName = firstName;
     this.lastName = lastName; 
     this.userName = userName;
     this.password = password;
     this.cellNumber = cellNumber;
     
}  
public boolean checkUserName() {
     return userName.contains("_")&&userName.length()<=5;
}
 
public boolean checkpasswordComplex(String password) {
     return password.length() >= 8 &&
            password.matches(".*[A-Z].*") &&
               password.matches(".*[a-z].*") &&
               password.matches(".*[0-9].*") &&
               password.matches(".*[!@#$%^&*()].*");
}   

public boolean checkpasswordComplez(String password) {
    return cellNumber.length() == 10 && cellNumber.startsWith("+27");
    }
}