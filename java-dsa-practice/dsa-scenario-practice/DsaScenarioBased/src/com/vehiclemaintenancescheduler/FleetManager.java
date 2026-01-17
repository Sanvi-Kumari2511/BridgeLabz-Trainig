package com.vehiclemaintenancescheduler;
import java.util.Scanner;

public class FleetManager {
	
	    //Method to divide the array into smaller parts
	    public static void mergeSort(Vehicle[] vehicles, int left, int right) {

	        //Condition to stop recursion
	        if (left < right) {

	            //Finding middle index
	            int mid = (left + right) / 2;

	            //Sort left half
	            mergeSort(vehicles, left, mid);

	            //Sort right half
	            mergeSort(vehicles, mid + 1, right);

	            //Merge both sorted halves
	            merge(vehicles, left, mid, right);
	        }
	    }

	    //Method to merge two sorted subarrays
	    public static void merge(Vehicle[] vehicles, int left, int mid, int right) {

	        //Size of left and right subarrays
	        int n1 = mid - left + 1;
	        int n2 = right - mid;

	        //Temporary arrays
	        Vehicle[] L = new Vehicle[n1];
	        Vehicle[] R = new Vehicle[n2];

	        //Copy data into temporary arrays
	        for (int i = 0; i < n1; i++)
	            L[i] = vehicles[left + i];

	        for (int j = 0; j < n2; j++)
	            R[j] = vehicles[mid + 1 + j];

	        int i = 0, j = 0, k = left;

	        //Compare and merge elements in sorted order
	        while (i < n1 && j < n2) {
	            if (L[i].mileage <= R[j].mileage) {
	                vehicles[k] = L[i];
	                i++;
	            } else {
	                vehicles[k] = R[j];
	                j++;
	            }
	            k++;
	        }

	        //Copy remaining elements of left subarray
	        while (i < n1) {
	            vehicles[k] = L[i];
	            i++;
	            k++;
	        }

	        //Copy remaining elements of right subarray
	        while (j < n2) {
	            vehicles[k] = R[j];
	            j++;
	            k++;
	        }
	  }
	    
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        //Taking number of vehicles from user
	        System.out.print("Enter number of vehicles: ");
	        int n = sc.nextInt();
	        sc.nextLine(); // Clear input buffer

	        //Creating array to store vehicles
	        Vehicle[] vehicles = new Vehicle[n];

	        //Taking vehicle details from user
	        for (int i = 0; i < n; i++) {

	            System.out.println("\nEnter details of vehicle " + (i + 1));

	            System.out.print("Vehicle ID: ");
	            String id = sc.nextLine();

	            System.out.print("Mileage: ");
	            int mileage = sc.nextInt();
	            
	            sc.nextLine(); 

	            //Storing input data in object
	            vehicles[i] = new Vehicle(id, mileage);
	        }

	        //Applying Merge Sort
	        mergeSort(vehicles, 0, vehicles.length - 1);

	        //Displaying sorted maintenance schedule
	        System.out.println("\nMaster Maintenance Schedule (Sorted by Mileage):");
	        for (Vehicle v : vehicles) {
	            System.out.println(v.vehicleId + " - " + v.mileage);
	        }   
	  }
} 
