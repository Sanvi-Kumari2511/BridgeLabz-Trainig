import java.util.Scanner;

public class MostFrequentCharacter {

    //Creating a method to find the most frequent character in a string
    public static char findMostFrequentChar(String str) {
        int[] frequency = new int[256]; 
		
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;
        }

        char mostOccurChar = str.charAt(0);
        int maximumCount = frequency[mostOccurChar];

        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (frequency[ch] > maximumCount) {
                maximumCount = frequency[ch];
                mostOccurChar = ch;
            }
        }

        return mostOccurChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char result = findMostFrequentChar(str);

        //Displaying the result
        System.out.println("THe most frequent character in a string is: " + result);
    }
}
