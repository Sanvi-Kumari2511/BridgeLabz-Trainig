import java.util.Scanner;

  public class SaveOddEven {
     public static void main(String args []) {
	    Scanner sc = new Scanner(System.in);
		
		//Array to store 11 heights
		System.out.print("Enter a natural number: ");
                int number = sc.nextInt();
		
		//Checking number is natural or not
		if(number <= 0) {
		System.out.println(number + " is not a natural number");
                return;
                }
		
		//Taking array's size
		int size = number / 2 + 1;
		
		int [] odd = new int [size];
		int [] even = new int [size];
		
		int oddIndex = 0, evenIndex = 0;
		for(int i = 1; i <= number; i++) {
		if(i % 2 == 0) {
		even [evenIndex] = i;
		evenIndex++;
		}
		else {
		odd [oddIndex] = i;
		oddIndex++;
		}
		}
		
		//Displaying results
		System.out.println("\nOdd numbers are: ");
		for(int i = 0; i < oddIndex; i++) {
               System.out.print(odd[i] + " ");
               }
		
	      System.out.println("\n\nEven numbers are: ");
              for(int i = 0; i < evenIndex; i++) {
              System.out.print(even[i] + " ");
                 }
	     }
	}