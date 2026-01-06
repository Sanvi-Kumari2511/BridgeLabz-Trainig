package com.sorting;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        //Taking number of students
		        System.out.print("Enter number of students: ");
		        int number = sc.nextInt();

		        //Array to store exam scores
		        int[] scores = new int[number];

		        //Taking input for exam scores
		        System.out.println("Enter score:");
		        for (int i = 0; i < number; i++) {
		            scores[i] = sc.nextInt();
		        }

		        //Selection Sort logic
		        for (int i = 0; i < number - 1; i++) {

		            //Assume current index has minimum value
		            int minIndex = i;

		            //Find minimum element in remaining array
		            for (int j = i + 1; j < number; j++) {
		                if (scores[j] < scores[minIndex]) {
		                    minIndex = j;
		                }
		            }

		            //Swap the found minimum with first unsorted element
		            int temp = scores[minIndex];
		            scores[minIndex] = scores[i];
		            scores[i] = temp;
		        }

		        //Display sorted scores
		        System.out.println("Exam scores in ascending order:");
		        for (int score : scores) {
		            System.out.print(score + " ");
		        }
		    }
		}
