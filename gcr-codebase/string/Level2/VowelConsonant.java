import java.util.Scanner;

public class VowelConsonant {

    //Creating a method to check vowel or consonant
    public static String checkChar(char ch) {

        //Convert uppercase to lowercase using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);   
        }

        if (ch >= 'a' && ch <= 'z') { 
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                return "Vowel";
            else
                return "Consonant";
        } 
        
        return "Not a letter";
    }

    //Creating a method to count vowels and consonants in a string using charAt() method
    public static int[] countVowelConsonant(String str) {
        int vowel = 0, consonant = 0;

        for (int i = 0;; i++) {
            try {
                char ch = str.charAt(i);
                String result = checkChar(ch);

                if (result.equals("Vowel"))
                    vowel++;
                else if (result.equals("Consonant"))
                    consonant++;
            } 
            catch (Exception e) {
                break;   
            }
        }

        return new int[]{vowel, consonant};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		//Taking input from user
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int[] result = countVowelConsonant(str);

        System.out.println("\nNumber of vowels in a string : " + result[0]);
        System.out.println("Number of consonants in a string : " + result[1]);
    }
}
