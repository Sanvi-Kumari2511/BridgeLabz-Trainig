import java.util.Scanner;

  public class ReverseArray {
     public static void main(String args []) {
	 Scanner sc = new Scanner(System.in);
		
	//Taking input from user
	System.out.print("Enter a number : ");
        int number = sc.nextInt();
	int num = number;
        int count = 0;

        while(num != 0) {
        num = num / 10;
        count++;
        }

        int[] digits = new int[count];

        num = number;

        //Storing digits in the array
        for(int i = count - 1; i >= 0; i--) {
        digits[i] = num % 10;
        num = num / 10;
        }

        //Creating a reverse array
        int[] reverse = new int[count];

    //    for(int i = 0, j = count - 1; i < count; i++, j--) {
     //   reverse[i] = digits[j];
     //   }

        //Displaying the reverse array
        System.out.print("Reversed number: ");
        for(int i = count - 1; i >= 0; i--) {
        System.out.print(digits[i]);
        }
    }
}