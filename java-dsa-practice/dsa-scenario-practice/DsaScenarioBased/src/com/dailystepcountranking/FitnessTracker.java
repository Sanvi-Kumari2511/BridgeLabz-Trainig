package com.dailystepcountranking;
import java.util.Scanner;

public class FitnessTracker {

	    static void bubbleSort(int[] steps) {
	        int n = steps.length;
	        boolean swapped;

	        for (int i = 0; i < n - 1; i++) {
	            swapped = false;

	            for (int j = 0; j < n - 1 - i; j++) {
	                //Descending order 
	                if (steps[j] < steps[j + 1]) {
	                	
	                    int temp = steps[j];
	                    steps[j] = steps[j + 1];
	                    steps[j + 1] = temp;
	         
	         swapped = true;
	                }
	            }

	            //If no swap happened, list is already sorted
	            if (!swapped) {
	                break;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of users (<= 20): ");
	        int number = sc.nextInt();

	        int[] steps = new int[number];

	        System.out.println("Enter daily step count: ");
	        for (int i = 0; i < number; i++) {
	            steps[i] = sc.nextInt();
	        }

	        bubbleSort(steps);

	        System.out.println("Daily Step Count Ranking:");
	        for (int i = 0; i < steps.length-1; i++) {
	            System.out.print(steps[i] + " ");
	       }
	 }
}

