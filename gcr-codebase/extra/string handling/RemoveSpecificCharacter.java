import java.util.Scanner;

public class RemoveSpecificCharacter {

    //Creating a method to remove a specific character from a string
    public static String remove(String str, char toRemove) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != toRemove) {
                result = result + ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);

        //Calling the method
        String result = remove(str, ch);

        //Displaying the result
        System.out.println("The string after removing the all occurrences: \"" + result + "\"");
    }
}
