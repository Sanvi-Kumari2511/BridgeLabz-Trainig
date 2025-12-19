import java.util.Scanner;

  public class MultiplicationSixToNine {
     public static void main(String args []) {
	    Scanner sc = new Scanner(System.in);
		
            //Taking user's input
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            int[] multiplicationResult = new int[4];
		
	   //Storing multiplication from 6 to 9
	    int index = 0;
            for(int i = 6; i <= 9; i++){
            multiplicationResult[index] = number * i;
            index++;
            }
		
            //Displaying output
            System.out.println("\nMultiplication table of " + number + " from 6 to 9:");
	    index = 0;
	    for(int i = 6; i <= 9; i++) {
	    System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
	    index++;
	    }
        }	
   }