import java.util.Scanner;
   public class ReverseString{
       
	   //Creating a method to reverse a string
	   public static String reverse(String str){
	      String rev = "";
		  
		  for(int i = str.length() - 1; i >= 0; i--){
		     rev = rev + str.charAt(i);  
		  }
		  return rev;
	   }
	   public static void main(String args []){
	       Scanner sc = new Scanner(System.in);
		   
		   //Taking input from user
		   System.out.println("Enter a string: ");
		   String str = sc.nextLine();
		   
		   //Calling the method
		   String output = reverse(str);
		   
		   //Displaying the result
		   System.out.println("The reversed string is: " + output);
	   }
	   
   }
   