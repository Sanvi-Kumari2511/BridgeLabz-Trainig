import java.util.Scanner;

  public class Factors {
     public static void main(String args []) {
	    Scanner sc = new Scanner(System.in);
		
		//Taking inputs from user
		System.out.print("Enter a natural number: ");
                int number = sc.nextInt();
		
		int maxFactor = 10;
		int [] factor = new int [maxFactor];
		int index = 0;
		
		//Calculating factors
		for(int i = 1; i <= number; i++) {
                if(number % i == 0) {  
		
		if(index == maxFactor) {
                maxFactor *= 2;         
                int[] temp = new int[maxFactor];
 		
		 //Copying all old values into temp
		 for(int j = 0; j < index; j++) {
                 temp[j] = factor[j];
                 }
		 
		 //Assigning a new bigger array
		 factor = temp;
		 }
		 
		 //Storing factor
		 factor[index] = i;
                 index++;
                 }
                }

               //Displaying results
               System.out.println("\nFactors of " + number + ":");
               for(int i = 0; i < index; i++) {
               System.out.print(factor[i] + " ");
		}
		}
		}
