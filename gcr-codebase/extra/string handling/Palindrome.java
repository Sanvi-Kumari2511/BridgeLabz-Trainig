import java.util.Scanner;
   public class Palindrome{
       //Creating a method to check the string is palindrome or not
        public static boolean checkPalindrome(String str){
            str = str.toLowerCase();
			int start = 0;
			int last = str.length() - 1;
			
			while(start < last){
			    if(str.charAt(start) != str.charAt(last)){
				    return false;
				}
				start++;
				last--;
			}
			return true;
        }		
		public static void main(String args []){
		    Scanner sc = new Scanner(System.in);
			
			//Taking input from user
			System.out.println("Enter a string: ");
			String str = sc.nextLine();
			
			//Checking the string is palindrome
			if(checkPalindrome(str)){
			System.out.println("The string is palindrome");
		   }
		   else{
		      System.out.println("The string is not a palindrome");
		      
		       }
		   } 
      }
   