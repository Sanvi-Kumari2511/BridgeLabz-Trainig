import java.util.Scanner;

public class UpperCaseConversion{

    //Creating a method to convert text into uppercase
    public static String toUpper(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32); 
            }

            result += ch;
        }

        return result;
    }

    //Creating a method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.println("Enter a string :");
        String str = sc.nextLine();

        //Using simple Uppercase logic
        String upper = toUpper(str);

        //Using built-in uppercase method
        String builtinUpper = str.toUpperCase();

        System.out.println("\nUppercase using custom method: " + upper);
        System.out.println("Uppercase using built-in method: " + builtinUpper);

        if (compareStrings(upper, builtinUpper)) {
            System.out.println("Both uppercase results are same");
        } 
		else {
            System.out.println("Both uppercase results are different");
        }
    }
}
