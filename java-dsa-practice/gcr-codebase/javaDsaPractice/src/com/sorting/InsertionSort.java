package com.sorting;
import java.util.Scanner;

public class InsertionSort {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        //Taking number of employees
	        System.out.print("Enter number of employees: ");
	        int number = sc.nextInt();

	        //Array to store employee IDs
	        int[] empId = new int[number];

	        //Taking input for employee IDs
	        System.out.println("Enter employee IDs:");
	        for (int i = 0; i < number; i++) {
	            empId[i] = sc.nextInt();
	        }

	        //Insertion Sort logic
	        for (int i = 1; i < number; i++) {

	            //Current element to be inserted
	            int key = empId[i];
	            int j = i - 1;

	            //Shifting elements greater than key to one position ahead
	            while (j >= 0 && empId[j] > key) {
	                empId[j + 1] = empId[j];
	                j--;
	            }

	            //Inserting key at the correct position
	            empId[j + 1] = key;
	        }

	        //Displaying sorted employee IDs
	        System.out.println("Employee IDs in ascending order:");
	        for (int id : empId) {
	            System.out.print(id + " ");
	        }
	    }
	}

