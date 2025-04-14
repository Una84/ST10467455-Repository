/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class UserValidation {
      public static boolean isUsernameValid(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public static String processUsername(String username, String firstName, String lastName) {
        if (isUsernameValid(username)) {
            return "Welcome " + firstName + " " + lastName + ", it is great to see you.";
        } else {
            return "Username is not correctly formatted. Please ensure that your username contains an underscore and is no more than 5 characters in length.";
        }
    }

    public static boolean isPasswordComplex(String password) {
        return password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[0-9].*") &&
                password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
    }

    public static String processPassword(String password) {
        if (isPasswordComplex(password)) {
            return "Password successfully captured.";
        } else {
            return "Password is not correctly formatted. Please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.";
        }
    }

    public static boolean isCellNumberValid(String cellNumber) {
        return cellNumber.matches("^\\+\\d{1,3}\\d{7,15}$");
    }

    public static String processCellNumber(String cellNumber) {
        if (isCellNumberValid(cellNumber)) {
            return "Cell number successfully captured.";
        } else {
            return "Cell phone number is incorrectly formatted or does not contain an international code. Please correct the number and try again.";
        }
    }

    public static boolean login(String username, String password) {
        return isUsernameValid(username) && isPasswordComplex(password);
    }
}
    

