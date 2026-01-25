package com.javaannotations.advancedlevel.roleallowed;

public class Admin {

    //Only ADMIN can access this method
    @RoleAllowed("ADMIN")
    public void deleteUser() {
        System.out.println("User deleted successfully.");
    }

    //Method accessible to everyone
    public void viewProfile() {
        System.out.println("Profile viewed.");
    }
}