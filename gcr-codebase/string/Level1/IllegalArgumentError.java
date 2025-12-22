import java.util.Scanner;

    public class IllegalArgumentError {

       //Creating a method to generate the exception
        public static void generateException(String text) 
		{
           System.out.println("\nIllegalArgumentException is generating");

           //start index greater than end index 
           System.out.println(text.substring(5, 2)); 
        }

        //Method to handle the exception
        public static void handleException(String text) 
		{
           System.out.println("\nIllegalArgumentException handling");
        
           try 
		     {
             System.out.println(text.substring(5, 2));
             }
             catch (IllegalArgumentException e) 
		     {
             System.out.println("Exception caught: " + e);
        }
           catch (RuntimeException e) 
		   {
           //Generic handling
           System.out.println("Runtime exception caught: " + e);
           }
	    }
	
        public static void main(String[] args) 
		{

            Scanner sc = new Scanner(System.in);
            
			//Taking user's input
            System.out.print("Enter a string: ");
            String text = sc.next();

            //Calling the generate exception
            try {
            generateException(text);
            }
            catch (IllegalArgumentException e) {
            System.out.println("Exception caught in main: " + e);
            }

            //Calling the handle exception
            handleException(text);
       }
    }
