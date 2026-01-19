package com.ranksheetgenerator;
import java.util.Scanner;

public class EduResults {

	    //Merge two sorted halves
	    static void merge(int[] arr, int left, int mid, int right) {
	        int n1 = mid - left + 1;
	        int n2 = right - mid;

	        int[] Left = new int[n1];
	        int[] Right = new int[n2];

	        for (int i = 0; i < n1; i++)
	            Left[i] = arr[left + i];

	        for (int j = 0; j < n2; j++)
	            Right[j] = arr[mid + 1 + j];

	        int i = 0, j = 0, k = left;

	        while (i < n1 && j < n2) {
	            if (Left[i] <= Right[j]) {   
	                arr[k++] = Left[i++];
	            } 
	            
	            else {
	                arr[k++] = Right[j++];
	            }
	        }

	        while (i < n1)
	            arr[k++] = Left[i++];

	        while (j < n2)
	            arr[k++] = Right[j++];
	    }

	    //Merge Sort
	    static void mergeSort(int[] arr, int left, int right) {
	        if (left < right) {
	            int mid = (left + right) / 2;
	            mergeSort(arr, left, mid);
	            mergeSort(arr, mid + 1, right);
	            merge(arr, left, mid, right);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        //Taking input from user
	        System.out.print("Enter number of students: ");
	        int number = sc.nextInt();

	        int[] marks = new int[number];

	        System.out.println("Enter student marks:");
	        for (int i = 0; i < number; i++) {
	            marks[i] = sc.nextInt();
	        }

	        mergeSort(marks, 0, number - 1);

	        System.out.println("Final State-wise Rank List:");
	        for (int m : marks) {
	            System.out.print(m + " ");
	      }
     }
}
