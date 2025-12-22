import java.util.Scanner;

public class Frequency {

    //Creating a method to find frequency of characters
    public static String[][] frequency(String str) {

        int[] freq = new int[256];   
		
        //Counting the frequency of character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        //Counting unique characters 
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > 0) {
                count++;
                freq[str.charAt(i)] = -freq[str.charAt(i)]; 
            }
        }

        //Reseting the frequencies for correct values
        for (int i = 0; i < 256; i++) {
            if (freq[i] < 0) {
                freq[i] = -freq[i];
            }
        }

        String[][] result = new String[count][2];
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] > 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                freq[ch] = 0; 
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String[][] freq = frequency(str);

        System.out.println("\nCharacter\tFrequency");
       

        for (int i = 0; i < freq.length; i++) {
            System.out.println(freq[i][0] + "\t\t" + freq[i][1]);
        }
    }
}
