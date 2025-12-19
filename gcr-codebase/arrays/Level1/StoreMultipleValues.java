import java.util.Scanner;

  public class StoreMultipleValues {
     public static void main(String args []) {
	    Scanner sc = new Scanner(System.in);
		
		// array of 10 double values
		double numbers [] = new double [10];
		double total = 0.0;
		int index = 0;
		
		System.out.println("Enter positive numbers :");
		
		while(true) {
		System.out.println("Enter a number: ");
		double number = sc.nextDouble();
		
		if(number <= 0) {
		break;
		}
		if(index == 10) {
		System.out.println("maximum index");
		break;
		}
		numbers [index] = number;
		index++;
		}
		
		//calculating sum
		for(int i = 0; i < index; i++) {
		total += numbers [i];
		}
		
		//displaying stored values
		System.out.println("\nStored values:");
		for(int i = 0; i < index; i++) {
		System.out.println(numbers [i]);
		}
		
		//displaying total sum
		System.out.println("\nSum of all the numbers: " + total);
		}
		}