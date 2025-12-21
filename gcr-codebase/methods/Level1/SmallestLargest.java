import java.util.Scanner;

public class SmallestLargest { 

    //Creating a method
    public static int[] findSmallesAndtLargest(int number1, int number2, int number3) {

        int smallest = number1;
        int largest = number1;

        //Checking smallest number
        if (number2 < smallest) {
        smallest = number2;
        }
        if (number3 < smallest) {
        smallest = number3;
        }

        //Checking largest number
        if (number2 > largest) {
        largest = number2;
        }
        if (number3 > largest) {
        largest = number3;
        }

        //Return both values in array
        return new int[]{smallest, largest};
        }

        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
		//Taking input from user
        System.out.println("Enter 3 numbers:");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
         
		//Creating object
		int result [] = findSmallesAndtLargest (number1, number2, number3);
         
		//Displaying results
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);
    }
}