package com.dailysalessummaryreports;
import java.util.*;

public class ZipZipMart {
	
	//Merge Sort method 
    static void mergeSort(Transaction[] arr, int left, int right) {

        //Check if there are at least two elements
        if (left < right) {

            //Finding middle index
            int mid = (left + right) / 2;

            //Recursively sort left half
            mergeSort(arr, left, mid);

            //Recursively sort right half
            mergeSort(arr, mid + 1, right);

            //Merge the two sorted halves
            merge(arr, left, mid, right);
        }
    }

    //Merge two sorted subarrays into one sorted array
    static void merge(Transaction[] arr, int left, int mid, int right) {

        //Size of left and right subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        //Temporary arrays to store data
        Transaction[] Left = new Transaction[n1];
        Transaction[] Right = new Transaction[n2];

        //Copy data into left temporary array
        for (int i = 0; i < n1; i++) {
            Left[i] = arr[left + i];
        }

        //Copy data into right temporary array
        for (int j = 0; j < n2; j++) {
            Right[j] = arr[mid + 1 + j];
        }

        //Indexes for left, right, and main array
        int i = 0, j = 0, k = left;

        //Merge elements while both arrays have elements
        while (i < n1 && j < n2) {

            //Compare transactions by date first, then amount
            if (compare(Left[i], Right[j]) <= 0) {
                arr[k] = Left[i];  
                i++;
            } 
            
            else {
            	
                arr[k] = Right[j];
                j++;
            }
            
            k++;
        }

        //Copy remaining elements of left array (if any)
        while (i < n1) 
        {
            arr[k] = Left[i];
            i++;
            k++;
        }
        //Copy remaining elements of right array (if any)
        while (j < n2) {
        	
            arr[k] = Right[j];
            j++;
            k++;
        }
    }

    //Custom comparison method
    static int compare(Transaction t1, Transaction t2) {

        //Compare dates first 
        if (!t1.date.equals(t2.date)) {
        	
            return t1.date.compareTo(t2.date);
        }

        //If dates are same, compare amounts
        if (t1.amount < t2.amount) return -1;
        if (t1.amount > t2.amount) return 1;

        //If both date and amount are same
        return 0;
    }
}
