package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PasswordValidatorTest {

    @Test
    void isAtLeastEightCharacters() {
//         Given: A password longer and shorter than 8 characters
        String validPassword = "Password859";
        String invalidPassword = "pass1";
//         When: passwords are validated
        boolean isValid = PasswordValidator.isAtLeastEightCharacters(validPassword);
        boolean isInvalid = PasswordValidator.isAtLeastEightCharacters(invalidPassword);
//         Then: The valid password should return true and the invalid false
        assertTrue(isValid);
        assertFalse(isInvalid);
    }

    @Test
    void containsDigit() {
        assertTrue(PasswordValidator.containsDigit("Password1"));
        assertFalse(PasswordValidator.containsDigit("Password"));
    }

    @Test
    void containsUpperAndLowerCase() {
        assertTrue(PasswordValidator.containsUpperAndLowerCase("Password"));
        assertFalse(PasswordValidator.containsUpperAndLowerCase("password"));
        assertFalse(PasswordValidator.containsUpperAndLowerCase("PASSWORD"));
    }

    @Test
    void isCommonPassword() {
        assertTrue(PasswordValidator.isCommonPassword("123456"));
        assertFalse(PasswordValidator.isCommonPassword("Password1"));
    }

}