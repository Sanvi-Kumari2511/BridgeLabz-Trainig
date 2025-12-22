import java.util.Scanner;

public class Palindrome {

    //Logic 1: Creating a method to compare the characters from the start and end
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    //Logic 2: Creating a recursive method
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) {
            return true; 
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    //Creating a method to reverse string using charAt
    public static char[] reverseString(String str) {
        int length = str.length();
        char[] reverse = new char[length];
        for (int i = 0; i < length; i++) {
            reverse[i] = str.charAt(length - 1 - i);
        }
        return reverse;
    }

    //Logic 3: Creating a methohd to to compare the characters using char arrays and reversed array
    public static boolean isPalindromeCharArray(String str) {
        char[] original = str.toCharArray();
        char[] reversed = reverseString(str);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		//Taking user input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean result1 = isPalindrome(str);
        System.out.println("\nCheck palindrome using iterative: " + result1);
		
        boolean result2 = isPalindromeRecursive(str, 0, str.length() - 1);
        System.out.println("Check palindrome using recursive: " + result2);

        
        boolean result3 = isPalindromeCharArray(str);
        System.out.println("Check palindrome using char aray: " + result3);
    }
}
