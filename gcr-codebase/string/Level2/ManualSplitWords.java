import java.util.Scanner;

public class SplitWords {

    //Creating a method to find length of the string without using length() method
    public static int findLength(String text) {
        int count = 0;
        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (Exception e) {
                return count;
            }
        }
    }

    //Creating a method to split the text into words manually
    public static String[] manualSplit(String text) {

        int length = findLength(text);
        int wordCount = 1;

        //Counting spaces to find the number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int start = 0;
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[index] = text.substring(start, i);
                index++;
                start = i + 1;
            }
        }

        //Last word
        words[index] = text.substring(start, length);

        return words;
    }

    //Creating a method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length)
		return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
		//Taking input from user
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String[] manualWords = manualSplit(text);       
        String[] builtInWords = text.split(" ");        
		
        boolean result = compareArrays(manualWords, builtInWords);

        System.out.println("\nWords using manual split:");
        for (String word : manualWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("\nBoth splitting results same? : " + result);
    }
}
