package com.javajunit.advancedproblems.userregistrationtesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
	 //Test valid registration 
    @Test
    void testValidRegistration() {
        assertDoesNotThrow(() -> {
            UserRegistration.registerUser(
                    "sanvi",
                    "sanvi@gmail.com",
                    "Password1");
        });
    }

    //Test invalid username
    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser(
                    "ab",
                    "test@gmail.com",
                    "Password1");
        });
    }

    //Test invalid email
    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser(
                    "sanvi",
                    "invalid-email",
                    "Password1");
        });
    }

    //Test invalid password
    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser(
                    "sanvi",
                    "test@gmail.com",
                    "pass");
        });
    }
}
