import java.util.Scanner;
import java.util.*;

    public class NullPointeExeptiionDemo {

        //Creating a method to generate the exception
        public static void generateException() {
        String text = null;   
        System.out.println("NullPointerException generating");
        
        //This line will throw an exception
        System.out.println(text.length()); 
        }

        //Creating a method to handle the NullPointerException
        public static void handleException() {
        String text = null;
        System.out.println("\nNullPointerException handling");

        try {
        System.out.println(text.length()); 
        } 
		
		catch (Exception e) {
        System.out.println("\nException caught: " + e);
        }
        }

        public static void main(String[] args) {

        //Creating a method to call the generated exception
        try {
        generateException(); 
        } 
		catch (Exception e) {
        System.out.println("Exception caught in main: " + e);
        }

        //Refactoring the code to call the method to handle the RuntimeException
        handleException();
    }
}
