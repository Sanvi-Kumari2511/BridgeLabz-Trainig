import java.util.Scanner;

public class LowerCaseConversion {

    //Creating a method to convert characters in lowercase
    public static String toLower(String str) {

        String result = "";  

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

           
            if(ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);  
            }

            result += ch;
        }
        return result;
    }

    //Creating a method to compare two strings
    public static boolean compareStrings(String s1, String s2) {
        if(s1.length() != s2.length()) 
		return false;

        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
        //Taking input from user
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        //Converting the string in lower case using built-in method
        String resultBuiltin = str.toLowerCase();

        //Converting th string in lowercase using manual method
        String resultManual = toLower(str);

        //Comparing both the strings
        boolean resultCompare = compareStrings(resultBuiltin, resultManual);

        System.out.println("\nString of built in method : " + resultBuiltin);
        System.out.println("String of manual method : " + resultManual);

        System.out.println("\nBoth strings are equal: " + resultCompare);
    }
}
