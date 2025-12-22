import java.util.Scanner;

public class ShortestLongestString {

    //Creating a method to split the text into words without using split() method
    public static String[] manualSplit(String text) {

        //Counting the words
        int count = 1;
        for (int i = 0;; i++) {
            try {
                if (text.charAt(i) == ' ')
				count++;
            } 
			
		catch (Exception e) {
                break;
            }
        }

        String[] words = new String[count];
        String word = "";
        int index = 0;

        for (int i = 0;; i++) {
            try {
                char ch = text.charAt(i);
                if (ch == ' ') {
                    words[index] = word;
                    index++;
                    word = "";
                } 
				else {
                    word += ch;
                }
            } 
			catch (Exception e) {
                words[index] = word; 
                break;
            }
        }
        return words;
    }

    //Creating a method to find string's length without using length() method
    public static int findLength(String str) {
        int length = 0;
        while(true) {
            try {
                str.charAt(length);
                length++;
            } catch(Exception e) {
                return length;
            }
        }
    }

    //Storing word and length in 2D array
    public static String[][] wordLengthStore(String[] words) {
        String[][] result = new String[words.length][2];
        for(int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    //Returning shortest and longest index
    public static int[] findShortestAndLongest(String[][] arr) {
        int shortest = Integer.parseInt(arr[0][1]);
        int longest = Integer.parseInt(arr[0][1]);
        int shortestIndex = 0;
        int longestIndex = 0;

        for(int i = 1; i < arr.length; i++) {
            int length = Integer.parseInt(arr[i][1]);

            if(length < shortest) {
                shortest = length;
                shortestIndex = i;
            }
            if(length > longest) {
                longest = length;
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = sc.nextLine();

        String[] words = manualSplit(text);

        String[][] wordLength = wordLengthStore(words);

        int[] result = findShortestAndLongest(wordLength);

        System.out.println("\nShortest word in the string : " + wordLength[result[0]][0] + " ("+ wordLength[result[0]][1] + ")");

        System.out.println("Longest word in the string : " + wordLength[result[1]][0] + " ("+ wordLength[result[1]][1] + ")");
    }
}
