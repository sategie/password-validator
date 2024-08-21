package org.example;

import java.util.Arrays;
import java.util.List;
//Scanner class which is used to get user input
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {

//        Create Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("**Password Validator**");

        System.out.print("Enter your password: ");
//        nextLine method used with the Scanner object to capture user input on the next line
        String password = scanner.nextLine();


        if (PasswordValidator.isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
        scanner.close();
    }



    // Method to ensure password is at least 8 characters long
    public static boolean isAtLeastEightCharacters(String password) {
        return password.length() >= 8;
    }

    // Method to check if password contains digits
    public static boolean containsDigit(String password) {
        return password.matches(".*\\d.*");
    }

    // Method to ensure both uppercase and lowercase letters are used
    public static boolean containsUpperAndLowerCase(String password) {
        return password.matches(".*[A-Z].*") && password.matches(".*[a-z].*");
    }

   /*private makes the variable only accessible within the PasswordValidator class
   * final means the variable is a constant which cannot be changed
   * Arrays.asList(...) is a utility method from the
 class that converts an array to a fixed-size list.*/
    private static final List<String> COMMON_PASSWORDS = Arrays.asList(
            "123456", "password", "Password", "password123", "Password123", "123456789", "12345678", "12345", "1234567", "123123"
    );

//     Method to detect commonly used passwords
    public static boolean isCommonPassword(String password) {
        return COMMON_PASSWORDS.contains(password);
    }

    // Method to validate the password based on all conditions
    public static boolean isValidPassword(String password) {
        return isAtLeastEightCharacters(password) &&
//                containsDigit(password) &&
                containsUpperAndLowerCase(password) &&
                !isCommonPassword(password);
    }

}

