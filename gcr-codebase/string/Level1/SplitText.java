import java.util.Scanner;

public class SplitText {

    //Creating a method to find length of the string without using buil-in method length()
    public static int findLength(String str) {
        int count = 0;
        while (true) {
            try {
                str.charAt(count);
                count++;
            } catch (Exception e) {
                return count;
            }
        }
    }

    //Creating a method to spliting the text into words manually using charAt()
    public static String[] manualSplit(String str) {
        int length = findLength(str);
        int countSpaces = 0;

        //Counting the words
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ')
                countSpaces++;
        }

        String[] words = new String[countSpaces + 1];
        int start = 0, index = 0;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                words[index++] = str.substring(start, i);
                start = i + 1;
            }
        }

        words[index] = str.substring(start, length);
        return words;
    }

    //Creatinng a method to compare two string arrays
    public static boolean compare(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) 
		return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) 
			return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		//Taking input from user
        System.out.println("Enter a text: ");
        String text = sc.nextLine();

        String[] manual = manualSplit(text);
        String[] builtin = text.split(" ");

        System.out.println("\nIf result is same then compare both the string arrays: " + compare(manual, builtin));
    }
}
