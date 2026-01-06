package com.sorting;
import java.util.Scanner;

public class MergeSort {

	    //Method to perform merge sort
	    static void mergeSort(int[] arr, int left, int right) {

	        if (left < right) {

	            int mid = (left + right) / 2;

	            //Sort left half
	            mergeSort(arr, left, mid);

	            //Sort right half
	            mergeSort(arr, mid + 1, right);

	            //Merge both halves
	            merge(arr, left, mid, right);
	        }
	    }

	    //Method to merge two sorted parts
	    static void merge(int[] arr, int left, int mid, int right) {

	        int i = left;
	        int j = mid + 1;
	        int k = 0;

	        int[] temp = new int[right - left + 1];

	        //Comparing and storing smaller element
	        while (i <= mid && j <= right) {
	            if (arr[i] < arr[j]) {
	                temp[k++] = arr[i++];
	            } 
	            else {
	                temp[k++] = arr[j++];
	            }
	        }

	        //Copy remaining elements
	        while (i <= mid) {
	            temp[k++] = arr[i++];
	        }

	        while (j <= right) {
	            temp[k++] = arr[j++];
	        }

	        //Copy back to original array
	        for (int x = 0; x < temp.length; x++) {
	            arr[left + x] = temp[x];
	        }
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of books: ");
	        int number = sc.nextInt();

	        int[] prices = new int[number];

	        System.out.println("Enter book prices:");
	        for (int i = 0; i < number; i++) {
	            prices[i] = sc.nextInt();
	        }

	        //Calling merge sort
	        mergeSort(prices, 0, number - 1);

	        //Printing sorted prices
	        System.out.println("Sorted book prices:");
	        for (int price : prices) {
	            System.out.print(price + " ");
	        }
	    }
	}

