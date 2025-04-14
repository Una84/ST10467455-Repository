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
           
    System.out.print("Enter cell phone number with international code: ");
    String phenoNumber = scanner.nextLine();
    
    String regex = "^\\+\\d{1,3}\\d{1,10}$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(phenoNumber);
    
    if(matcher.matches()){
        System.out.println("true");
        System.out.println("Cell phone number successfully added");
    }else{
        System.out.println("False");
        System.out.println("Cell phone number incorrectly formatted");
    }
           
    scanner.close();
           
}
}