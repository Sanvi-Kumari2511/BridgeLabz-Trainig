package com.sorting;
import java.util.Scanner;

public class QuickSort {
	
	    //Method for quick sort
	    static void quickSort(int[] arr, int low, int high) {

	        if (low < high) {

	            //Geting pivot position
	            int position = partition(arr, low, high);

	            //Sort left part
	            quickSort(arr, low, position - 1);

	            //Sort right part
	            quickSort(arr, position + 1, high);
	        }
	    }

	    //Partition method
	    static int partition(int[] arr, int low, int high) {

	        int pivot = arr[high];   
	        int i = low - 1;

	        //Rearrange elements
	        for (int j = low; j < high; j++) {

	            if (arr[j] < pivot) {
	                i++;

	                //Swap arr[i] and arr[j]
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        //Place pivot at correct position
	        int temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;

	        return i + 1;  
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of products: ");
	        int number = sc.nextInt();

	        int[] prices = new int[number];

	        System.out.println("Enter product prices:");
	        for (int i = 0; i < number; i++) {
	            prices[i] = sc.nextInt();
	        }

	        //Calling quick sort
	        quickSort(prices, 0, number - 1);

	        //Printing sorted prices
	        System.out.println("Product prices in ascending order:");
	        for (int price : prices) {
	            System.out.print(price + " ");
	        }
	    }
	}

