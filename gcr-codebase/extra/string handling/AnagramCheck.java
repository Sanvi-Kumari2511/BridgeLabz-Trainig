import java.util.Scanner;

public class CompareStrings {

    //Creating a method to compare two strings lexicographically
    public static int compare(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();
        int minLength = Math.min(length1, length2);

        for (int i = 0; i < minLength; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch1 != ch2) {
                return ch1 - ch2;  
            }
        }

        return length1 - length2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter string 1: ");
        String str1 = sc.nextLine();

        System.out.print("Enter string 2: ");
        String str2 = sc.nextLine();

        int result = compare(str1, str2);

        //Displaying the results
        if (result == 0) {
            System.out.println("Both strings are equal.");
        } 
		else if (result < 0) {
            System.out.println("String 1 comes before");
        }
		else {
            System.out.println("String 1 comes later");
        }
    }
}
