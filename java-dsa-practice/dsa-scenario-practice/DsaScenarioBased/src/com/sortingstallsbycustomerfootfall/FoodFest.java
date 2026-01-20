package com.sortingstallsbycustomerfootfall;

import java.util.Scanner;

public class FoodFest {
	
	//Merge two sorted arrays
    public static int[] merge(int[] zone1, int[] zone2) {
        int i = 0, j = 0, k = 0;
        int[] merged = new int[zone1.length + zone2.length];

        //Compare and merge elements 
        while (i < zone1.length && j < zone2.length) {
            if (zone1[i] <= zone2[j]) {
            	
                merged[k++] = zone1[i++];
            } 
            else {
                
            	merged[k++] = zone2[j++];
            }
        }

        //Copy remaining elements
        while (i < zone1.length) {
            merged[k++] = zone1[i++];
        }

        while (j < zone2.length) {
            merged[k++] = zone2[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking user's input and displaying results
        System.out.print("Enter number of stalls in Zone 1: ");
        int n1 = sc.nextInt();
        int[] zone1 = new int[n1];

        System.out.println("Enter sorted footfall for Zone 1:");
        for (int i = 0; i < n1; i++) {
            zone1[i] = sc.nextInt();
        }

        System.out.print("\nEnter number of stalls in Zone 2: ");
        int n2 = sc.nextInt();
        int[] zone2 = new int[n2];

        System.out.println("Enter sorted footfall for Zone 2:");
        for (int i = 0; i < n2; i++) {
            zone2[i] = sc.nextInt();
        }

        int[] masterList = merge(zone1, zone2);

        System.out.println("\nMaster Footfall List (Sorted):");
        for (int val : masterList) {
            System.out.print(val + " ");
        }
    }
}
