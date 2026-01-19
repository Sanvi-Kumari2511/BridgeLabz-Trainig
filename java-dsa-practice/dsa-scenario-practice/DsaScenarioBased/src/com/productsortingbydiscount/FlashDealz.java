package com.productsortingbydiscount;
import java.util.Scanner;

public class FlashDealz {
	
	    //Partition method
	    static int partition(int[] arr, int low, int high) {
	        int pivot = arr[high]; 
	        int i = low - 1;

	        for (int j = low; j < high; j++) {
	            if (arr[j] > pivot) {   
	                i++;
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        int temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;

	        return i + 1;
	    }

	    //Quick Sort
	    static void quickSort(int[] arr, int low, int high) {
	        if (low < high) {
	            int pi = partition(arr, low, high);
	            quickSort(arr, low, pi - 1);
	            quickSort(arr, pi + 1, high);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of products: ");
	        int number = sc.nextInt();

	        int[] discounts = new int[number];

	        System.out.println("Enter discount percentages:");
	        for (int i = 0; i < number; i++) {
	            discounts[i] = sc.nextInt();
	        }

	        quickSort(discounts, 0, number - 1);

	        System.out.println("Top Discounted Products:");
	        for (int d : discounts) {
	            System.out.print(d + "% ");
	       }
	 }
}

