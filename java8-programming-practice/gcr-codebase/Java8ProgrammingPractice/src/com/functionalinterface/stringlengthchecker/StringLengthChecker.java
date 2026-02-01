package com.functionalinterface.stringlengthchecker;

import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {

        //Define a message
        String message = "Hello, Sanvi Singh";

        //Function to calculate length
        Function<String, Integer> lengthFunction = msg -> msg.length();

        // Use apply() method  to get length
        int length = lengthFunction.apply(message);

        //Displaying result
        System.out.println("Message: " + message);
        System.out.println("Length: " + length);

        //Check if length exceeds a limit
        int limit = 30;
        if (length > limit) {
            System.out.println("Alert! Message exceeds the limit of " + limit + " characters.");
        } 
        else {
            System.out.println("Message is within the limit.");
        }
    }
}
