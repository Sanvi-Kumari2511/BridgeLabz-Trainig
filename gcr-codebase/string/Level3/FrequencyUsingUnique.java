import java.util.Scanner;

public class FrequencyUsingUnique {

    //Creating a method to find unique characters in a string using charAt() method
    public static char[] uniqueCharacters(String str) {

        char[] arr = new char[str.length()]; 
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                arr[index] = ch;
                index++;
            }
        }
		
        char[] result = new char[index];

        for (int i = 0; i < index; i++) {
            result[i] = arr[i];
        }

        return result;
    }

    //Creating a method to find frequency for unique characters
    public static String[][] frequency(String text) {

        int[] arr = new int[256];

        //Counting frequency
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
        }

        //Getting unique characters
        char[] unique = uniqueCharacters(str);

        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            char ch = unique[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(arr[ch]);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		//Taking input from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String[][] result2 = frequency(str);

        System.out.println("\nCharacter\tFrequency");

        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i][0] + "\t\t" + result2[i][1]);
        }
    }
}
