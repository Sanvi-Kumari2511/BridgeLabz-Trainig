package com.sorting;
import java.util.*;

public class BubbleSort {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        //Taking number of students
	        System.out.print("Enter number of students: ");
	        int number = sc.nextInt();

	        int[] marks = new int[number];

	        //Taking input for student's marks
	        System.out.println("Enter student marks:");
	        for (int i = 0; i < number; i++) {
	            marks[i] = sc.nextInt();
	        }

	        //Bubble Sort logic
	        for (int i = 0; i < number - 1; i++) {

	            //Flag to check if swapping happens
	            boolean swap = false;

	            for (int j = 0; j < number - 1 - i; j++) {

	                //Compare adjacent elements
	                if (marks[j] > marks[j + 1]) {

	                    //Swap if they are in wrong order
	                    int temp = marks[j];
	                    marks[j] = marks[j + 1];
	                    marks[j + 1] = temp;

	                    swap = true;
	                }
	            }

	            //If no swapping occurred, array is already sorted
	            if (swap == false) {
	                break;
	            }
	        }

	        //Displaying sorted marks
	        System.out.println("Student marks in ascending order:");
	        
	        for (int i = 0; i < number; i++) {
	            System.out.print(marks[i] + " ");
	        }
	           System.out.println();
	        }
	    }
	