import java.util.Scanner;

public class SplitTextIn2D {

    //Creating a method to split text without using split() method
    public static String[] manualSplit(String str) {
        //Counting the spaces
        int count = 1;
        for (int i = 0;; i++) {
            try {
                if (str.charAt(i) == ' ') 
				count++;
            } catch (Exception e) {
                break;
            }
        }

        String[] words = new String[count];
        String word = "";
        int index = 0;

        for (int i = 0;; i++) {
            try {
                char ch = str.charAt(i);
                if (ch == ' ') {
                    words[index] = word;
                    word = "";
                    index++;
                } 
				else {
                    word += ch;
                }
            } catch (Exception e) {
			
                //last word
                words[index] = word;
                break;
            }
        }
        return words;
    }

    //Creating a method to calculate length without using length() method
    public static int findLength(String str) {
        int count = 0;
        while(true) {
            try {
                str.charAt(count);
                count++;
            } 
			catch (Exception e) {
                return count;
            }
        }
    }

    //Creating a method to store words and lengths in a 2D array
    public static String[][] storeWord(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];                     
            result[i][1] = String.valueOf(findLength(words[i])); 
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = sc.nextLine();

        String[] words = manualSplit(text);
        String[][] wordLength = storeWord(words);

        for (int i = 0; i < wordLength.length; i++) {
            int length = Integer.parseInt(wordLength[i][1]); 
            System.out.println(wordLength[i][0] + "\t" + length);
        }
    }
}
