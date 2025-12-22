import java.util.Scanner;

    public class NumberFormatDemo {

       //Creating a method to generate the exception
       public static void generateException(String text) 
	    {
          System.out.println("\nNumberFormatException Generating");
        
        //This line will throw NumberFormatException
          int number = Integer.parseInt(text);

          System.out.println("Number after converted: " + number);
        }

        //Creating a method to handle the exception
    public static void handleException(String text) {
        System.out.println("\nNumberFormatException handling");

        try {
            int number = Integer.parseInt(text);
            System.out.println("Number after converted: " + number);
        }
        catch (NumberFormatException e) {
            System.out.println("Caught the NumberFormatException: " + e);
        }
        catch (RuntimeException e) {
            System.out.println("Caught the RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
		//Taking input from user
        System.out.print("Enter a number: ");
        String text = sc.next();

        //Calling a method that generates exception
        try {
            generateException(text);
        }
        catch (NumberFormatException e) {
            System.out.println("Exception caught in main: " + e);
        }

        //Calling a method that handles the exception
        handleException(text);
    }
}

