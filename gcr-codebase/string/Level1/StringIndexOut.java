import java.util.Scanner;

    public class StringIndexOut {

        //Creating a method to generate the exception
        public static void generateException(String text) {
        System.out.println("\nGenerating StringIndexOutOfBoundsException");

        //This line shows charAt beyond the length of string
        System.out.println(text.charAt(text.length())); 
        }

        //Creating a method to handle the exception
        public static void handleException(String text) {
        System.out.println("\nStringIndexOutOfBoundsException handling");

        try {
        
        System.out.println(text.charAt(text.length()));  
        } 
		
        catch (Exception e) {
        System.out.println("Exception caught: " + e);
        }
        }

        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        //calling a method that throws exception
        try {
        generateException(text);
        } 
		catch (Exception e) {
        System.out.println("Exception caught in main: " + e);
        }

        //Calling a method that handles the exception
        handleException(text);
    }
}
