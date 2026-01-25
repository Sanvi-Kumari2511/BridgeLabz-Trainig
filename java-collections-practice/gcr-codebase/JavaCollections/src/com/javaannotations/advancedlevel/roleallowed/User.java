package com.javaannotations.advancedlevel.roleallowed;

public class User {

    private static String currentRole;

    //Method to set role
    public static void setRole(String role) {
        currentRole = role;
    }

    //Method to get role
    public static String getRole() {
        return currentRole;
    }
}