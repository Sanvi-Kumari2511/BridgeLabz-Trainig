package com.javaregex.basicproblems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateUsername {

    public static void main(String[] args) {

        //Regex pattern
        String usernameRegex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a username: ");
        String username = sc.nextLine();

        //Validate username
        if (Pattern.matches(usernameRegex, username)) {
            System.out.println(username + " : Valid");
        }
        
        else {
            System.out.println(username + " : "+ " Invalid");
        }
    }
}
