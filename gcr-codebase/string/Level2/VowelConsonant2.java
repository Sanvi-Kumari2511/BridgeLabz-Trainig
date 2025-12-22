import java.util.Scanner;

public class VowelConsonant2 {

    //Creating a method to check the type of character 
    public static String checkChar(char ch) {

        //Converting uppercase to lowercase using ASCII 
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                return "Vowel";
            } 
			else {
                return "Consonant";
            }
        }

        return "Not a letter";
    }

    //Creating a method to store character in a 2D array
    public static String[][] findCharTypes(String str) {

        String[][] result = new String[str.length()][2];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkChar(ch);
        }

        return result;
    }

    //Creating a method for displaying the table
    public static void showTable(String[][] arr) {
        System.out.println("\nChar\tType");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + arr[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		//Taking user input
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String[][] result = findCharTypes(str);

        showTable(result);
    }
}
