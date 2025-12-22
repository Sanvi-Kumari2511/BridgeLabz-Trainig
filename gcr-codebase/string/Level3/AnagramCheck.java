import java.util.Scanner;

public class AnagramCheck {

    //Creating a method to check the two strings are anagram or not
    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        //Creating an array to store the frequency of characters in a string
        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        //Finding the frequency of 1st text
        for (int i = 0; i < str1.length(); i++) {
            frequency1[str1.charAt(i)]++;
        }

        //Finding the frequency of 2nd text
        for (int i = 0; i < str2.length(); i++) {
            frequency2[str2.charAt(i)]++;
        }

        //Comparing the frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        boolean result = isAnagram(str1, str2);

        System.out.println("\nBoth the strings are anagram: " + result);
    }
}
