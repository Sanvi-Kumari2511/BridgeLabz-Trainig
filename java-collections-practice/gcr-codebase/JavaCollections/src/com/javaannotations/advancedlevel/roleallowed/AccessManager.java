package com.javaannotations.advancedlevel.roleallowed;

import java.lang.reflect.Method;

public class AccessManager {

    public static void invokeMethod(Object obj, String methodName) {

        try {
            Method method = obj.getClass().getMethod(methodName);

            //Check if method has RoleAllowed annotation
            if (method.isAnnotationPresent(RoleAllowed.class)) {

                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
                String requiredRole = roleAllowed.value();
                String currentRole = User.getRole();

                if (!requiredRole.equals(currentRole)) {
                    System.out.println("Access Denied");
                    return;
                }
            }

            //Access method if allowed
            method.invoke(obj);

        } 
        
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}