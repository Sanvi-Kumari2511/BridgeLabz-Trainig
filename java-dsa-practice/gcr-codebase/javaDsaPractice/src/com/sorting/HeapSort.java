package com.sorting;
import java.util.Scanner;

public class HeapSort {
	
	    //Heap Sort method
	    static void heapSort(int[] arr) {

	        int n = arr.length;

	        //Building Max Heap
	        for (int i = n / 2 - 1; i >= 0; i--) {
	            heapify(arr, n, i);
	        }

	        //Extracting elements from heap one by one
	        for (int i = n - 1; i > 0; i--) {

	            // Swap root (largest) with last element
	            int temp = arr[0];
	            arr[0] = arr[i];
	            arr[i] = temp;

	            //Heapify remaining heap
	            heapify(arr, i, 0);
	        }
	    }

	    //Heapify method to maintain max heap
	    static void heapify(int[] arr, int n, int i) {

	        int largest = i;
	        int left = 2 * i + 1;
	        int right = 2 * i + 2;

	        //Checking left child
	        if (left < n && arr[left] > arr[largest]) {
	            largest = left;
	        }

	        //Checking right child
	        if (right < n && arr[right] > arr[largest]) {
	            largest = right;
	        }

	        //Swap if root is not largest
	        if (largest != i) {

	            int temp = arr[i];
	            arr[i] = arr[largest];
	            arr[largest] = temp;

	            //Heapify the affected subtree
	            heapify(arr, n, largest);
	        }
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of applicants: ");
	        int number = sc.nextInt();

	        int[] salary = new int[number];

	        System.out.println("Enter salary demands:");
	        for (int i = 0; i < number; i++) {
	            salary[i] = sc.nextInt();
	        }

	        // Call heap sort
	        heapSort(salary);

	        // Print sorted salaries
	        System.out.println("Salary demands in ascending order:");
	        for (int s : salary) {
	            System.out.print(s + " ");
	        }
	    }
	}

