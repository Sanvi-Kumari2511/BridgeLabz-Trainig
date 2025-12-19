import java.util.Scanner;

//program to print a multiplication table of a number.

  public class MultiplicationTable {
     public static void main(String args []) {
	    Scanner sc = new Scanner(System.in);
		
		//Taking user input
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		//Taking array to store results
		int table [] = new int [10];
		
		for(int i = 1; i <= 10; i++) {
		table[i - 1] = number * i;
		}
		
		System.out.println("\nMultiplication table of " + number + ":");
		
		for(int i = 1; i <= 10; i++) {
		//displaying the result
		System.out.println(number + " * " + i + " = " + table[i - 1]);
                }
		}
		}