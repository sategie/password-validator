package org.example;

import java.util.Arrays;
import java.util.List;

public class PasswordValidator {
    public static void main(String[] args) {
        System.out.println("Password Validator: ");

        String password = "Goodpassword123";

        if (PasswordValidator.isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    // Commonly used passwords
    private static final List<String> COMMON_PASSWORDS = Arrays.asList(
            "123456", "password", "Password", "password123", "Password123", "123456789", "12345678", "12345", "1234567", "123123"
    );

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

//     Method to detect commonly used passwords
    public static boolean isCommonPassword(String password) {
        return COMMON_PASSWORDS.contains(password);
    }

    // Method to validate the password based on all conditions
    public static boolean isValidPassword(String password) {
        return isAtLeastEightCharacters(password) &&
                containsDigit(password) &&
                containsUpperAndLowerCase(password) &&
                !isCommonPassword(password);
    }

}

