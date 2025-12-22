import java.util.Scanner;

public class StringLength {

    //Creating a method to return string length without using length() method
    public static int findLength(String str) {
        int count = 0;
		
        //Accessing characters until exception occurs and returning when exception occurs
        while(true) {
            try {
                str.charAt(count);  
                count++;  
            } 
            catch(Exception e) {
                return count; 
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
		//Taking input from user
        System.out.print("Enter a string: ");
        String str = sc.next();  

        //Calling the custom method 
        int lengthMnual = findLength(str); 

        //Calling the built-in method
        int lengthBuiltin = str.length();   

        System.out.println("\nManual Length is : " + lengthMnual);
        System.out.println("Built-in Length is : " + lengthBuiltin);

        System.out.println("\nBoth results are equal: " + (lengthMnual == lengthBuiltin));
    }
}
