import java.util.Scanner;

public class ReplaceWord {

    //Creating a method to replace a word in a sentence
    public static String replaceWord(String text, String oldWord, String newWord) {

        String result = "";
        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord)) {
                result = result + newWord;
            } 
			else {
                result = result + words[i];
            }
			
			//Adding space after the last word
            if (i < words.length - 1) {
                result = result + " ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        System.out.print("Enter a word to replace: ");
        String oldWord = sc.next();

        System.out.print("Enter new word: ");
        String newWord = sc.next();

        //Calling the method
        String result = replaceWord(text, oldWord, newWord);

        //Displaying the result
        System.out.println("Sentence after replacing the old word: " + result);
    }
}
