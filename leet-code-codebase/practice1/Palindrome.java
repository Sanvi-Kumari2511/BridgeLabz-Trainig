import java.util.Scanner;

public class Palindrome {
	
	//Creating a method to check if a number is palindrome
    public static boolean isPalindrome(int number) {
        if (number<0 || (number%10==0 && number!=0)) {
            return false;
        }
        int reversed=0;
        while (number>reversed) {
            reversed=reversed*10+number%10;
            number /= 10;
        }
         return number==reversed || number==reversed/10;
    }
	public static void main(String args []){
		Scanner sc=new Scanner(System.in);
		
		//Taking input from user 
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		
		//Calling the method
		boolean result=isPalindrome(number);
		
		System.out.println(result);
		
	}
}