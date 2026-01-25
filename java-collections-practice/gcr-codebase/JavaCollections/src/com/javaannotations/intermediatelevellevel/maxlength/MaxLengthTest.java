package com.javaannotations.intermediatelevellevel.maxlength;
public class MaxLengthTest {

    public static void main(String[] args) {

        try {
            //Valid username
            User user1 = new User("Sanvi123");
            System.out.println("User1 created: " + user1.getUsername());

            //Invalid username 
            User user2 = new User("SanviSigh1234"); 
            System.out.println("User2 created: " + user2.getUsername());

        } 
        
        catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}