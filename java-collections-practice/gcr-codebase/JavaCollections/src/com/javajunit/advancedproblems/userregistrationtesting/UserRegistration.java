package com.javajunit.advancedproblems.userregistrationtesting;

import java.util.regex.Pattern;

public class UserRegistration {
	//Method to register user with basic validation
    public static void registerUser(String username, String email, String password) {

        if (username == null || username.length() < 4) {
            throw new IllegalArgumentException("Invalid username");
        }

        if (email == null || !Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", email)) {
            throw new IllegalArgumentException("Invalid email");
        }

        if (password == null || !Pattern.matches("^(?=.*[A-Z])(?=.*\\d).{8,}$", password)) {
            throw new IllegalArgumentException("Invalid password");
        }
    }
}
