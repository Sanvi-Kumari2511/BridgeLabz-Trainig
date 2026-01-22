package com.javacollections.exception;
import java.util.Scanner;

public class MultipleCatchBlocks {
	public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int[] arr = null; 

            try {
            	
                //Taking array size
                System.out.print("Enter array size (enter 0 for null array): ");
                int n = sc.nextInt();

                //Initialize array only if size > 0
                if (n > 0) {
                	
                    arr = new int[n];
                    System.out.println("Enter array elements:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }
                }

                //Taking index to retrieve
                System.out.print("Enter index: ");
                int index = sc.nextInt();

                //Retrieve and print value
                System.out.println("Value at index " + index + ": " + arr[index]);

            } 
            
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index!");
            } 
            
            catch (NullPointerException e) {
                System.out.println("Array is not initialized!");
            }
      }
}
