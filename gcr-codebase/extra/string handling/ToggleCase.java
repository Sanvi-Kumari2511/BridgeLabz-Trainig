import java.util.Scanner;

public class ToggleCase {

    //Creating a method for toggle case of characters
    public static String toggle(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
			
                //Converting the uppercase letters to lowercase letters
                result = result + (char)(ch + 32);
            } 
			else if (ch >= 'a' && ch <= 'z') {
			
                //Converting the lowercase letters to uppercase letters
                result = result + (char)(ch - 32);
            } 
			else {
                //Non-alphabetic characters are remain same
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

        //Calling the method
        String result = toggle(str);

        //Displaying the result
        System.out.println("The toggled string is " + result);
    }
}
