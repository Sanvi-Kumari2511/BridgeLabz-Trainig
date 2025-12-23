import java.util.Scanner;

public class PalindromeChecker {

    //Creating a method to take input from user
    public static String takeInput(Scanner sc) {
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    //Creating a method to check the string is palindrome or not
    public static boolean isPalindrome(String str) {
        str = str.replace(" ", "").toLowerCase(); 
        int start = 0;
        int last = str.length() - 1;

        while (start < last) {
            if (str.charAt(start) != str.charAt(last)) {
                return false;
            }
            start++;
            last--;
        }
        return true;
    }

    //Creating a method to display the result
    public static void showResult(boolean result) {
        if (result) {
            System.out.println("The string is a Palindrome");
        } 
		else {
            System.out.println("The string is not a Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        String str = takeInput(sc);

        //Checking palindrome or not
        boolean result = isPalindrome(str);

        //Displaying the result
        showResult(result);
    }
}
