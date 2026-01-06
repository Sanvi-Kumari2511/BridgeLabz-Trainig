package com.sorting;
import java.util.Scanner;

public class CountingSort {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of students: ");
	        int number = sc.nextInt();

	        int[] ages = new int[number];

	        System.out.println("Enter student ages (10 to 18):");
	        for (int i = 0; i < number; i++) {
	            ages[i] = sc.nextInt();
	        }

	        //Age range is fixed (10 to 18)
	        int minAge = 10;
	        int maxAge = 18;

	        //Creating count array
	        int[] count = new int[maxAge - minAge + 1];

	        //Storing frequency of each age
	        for (int i = 0; i < number; i++) {
	            count[ages[i] - minAge]++;
	        }

	        //Rebuilding the sorted array
	        int index = 0;
	        for (int i = 0; i < count.length; i++) {
	            while (count[i] > 0) {
	                ages[index++] = i + minAge;
	                count[i]--;
	            }
	        }

	        //Displaying sorted ages
	        System.out.println("Sorted student ages:");
	        for (int age : ages) {
	            System.out.print(age + " ");
	        }
	    }
	}

