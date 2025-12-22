import java.util.Scanner;

public class IndexOut {

    //Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] arr) {
        System.out.println("\nGenerating an ArrayIndexOutOfBoundsException: ");

        //Accessing index larger than the length of an array
        System.out.println(arr[arr.length]);  
    }

    //Creating a method to handle an exception
    public static void handleException(String[] arr) {
        System.out.println("\nHandling an exception (ArrayIndexOutOfBoundsException)");

        try {
            System.out.println(arr[arr.length]);  
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught the exception : " + e);
        }
        catch (RuntimeException e) {
            System.out.println("Caught the runtime exception: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name's number: ");
        int number = sc.nextInt();

        String[] names = new String[number];

        System.out.println("Enter " + number + " names:");

        for (int i = 0; i < number; i++) {
            names[i] = sc.next();
        }

        //Calling a method that generates exception
        try {
            generateException(names);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e);
        }

        //Calling a method that handles the exception
        handleException(names);
    }
}
