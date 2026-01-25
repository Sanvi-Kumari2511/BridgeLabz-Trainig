package com.javaannotations.advancedlevel.roleallowed;

public class RoleBasedAccessTest {

    public static void main(String[] args) {

        Admin service = new Admin();

        //USER trying to access ADMIN method
        User.setRole("USER");
        System.out.println("Role: USER");
        AccessManager.invokeMethod(service, "deleteUser");

        //ADMIN accessing ADMIN method
        User.setRole("ADMIN");
        System.out.println("\nRole: ADMIN");
        AccessManager.invokeMethod(service, "deleteUser");

        //Any role accessing public method
        AccessManager.invokeMethod(service, "viewProfile");
    }
}