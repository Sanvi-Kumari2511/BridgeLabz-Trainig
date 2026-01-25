package com.javajunit.advancedproblems.passwordstrengthtesting;

import java.util.regex.Pattern;

public class PasswordValidator {
	//Regex pattern
    private static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*\\d).{8,}$";

    //Password validation
    public static boolean isValid(String password) {
        if (password == null) {
            return false;
        }
        return Pattern.matches(PASSWORD_REGEX, password);
    }
}
