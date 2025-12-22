import java.util.Scanner;

public class FrequencyUsingNested {

    //Creating a method to find frequency using nested loops
    public static String[] frequency(String str) {

        char[] ch = str.toCharArray();
        int[] freq = new int[ch.length];

        //Calculating frequency
        for (int i = 0; i < ch.length; i++) {

            freq[i] = 1;   

            for (int j = i + 1; j < ch.length; j++) {

                if (ch[i] == ch[j]) {
                    freq[i]++;
                    ch[j] = '0';  
                }

            }
        }

        //Counting valid characters 
        int size = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '0') {
                size++;
            }
        }

        String[] result = new String[size];

        int index = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '0') {

                result[index] = ch[i] + " = " + freq[i];
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

        String[] result2 = frequency(str);

        System.out.println("\nFrequency of character:");

        for (int i = 0; i < result2.length; i++) {
            System.out.println(result2[i]);
        }
    }
}
