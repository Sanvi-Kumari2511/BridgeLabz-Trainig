import java.util.Scanner;

public class AnagramCheck {

    //Creating a method to check that two strins are anagram or not
    public static boolean isAnagram(String str1, String str2) {

        //Removing spaces and converting to lowercase
        str1 = str1.replace(" ", "").toLowerCase();
        str2 = str2.replace(" ", "").toLowerCase();

        //Checking conditions for the anagram
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] frequency = new int[256]; 
		
        //Counting the characters of first string
        for (int i = 0; i < str1.length(); i++) {
            frequency[str1.charAt(i)]++;
        }

        //Subtracting characters of second string
        for (int i = 0; i < str2.length(); i++) {
            frequency[str2.charAt(i)]--;
        }

        //Checking that if all the counts are zero
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) {
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

        //Checking the strings are anagram or not
        if (isAnagram(str1, str2)) {
            System.out.println("Both the strings are Anagrams");
        } 
		else {
            System.out.println("Both the strings are not Anagrams");
        }
    }
}
