import java.util.Scanner;

  public class MeanHeight {
     public static void main(String args []) {
	    Scanner sc = new Scanner(System.in);
		
		//Array to store 11 heights
		double height [] = new double [11];
		double sum = 0.0;
		
		System.out.print("Enter height of 11 players: ");
        
		//Taking inputs and calculating sum
		for(int i = 0; i < height.length; i++) {
		System.out.print("\nEnter height of player " + (i + 1) + ": ");
		height [i] = sc.nextDouble();
		sum += height [i];
		}
		
		double mean = sum / 11;
		
		//Displaaying result
		System.out.println("\nMean height of the football team is " + mean);
		}
		}