package com.highscorerankingsystem;

import java.util.Scanner;

public class GamerZone {
	
	    //Quick Sort method
	    static void quickSort(int[] scores, int low, int high) {
	        if (low < high) {
	            int pivotIndex = partition(scores, low, high);
	            quickSort(scores, low, pivotIndex - 1);
	            quickSort(scores, pivotIndex + 1, high);
	        }
	    }

	    //Partition logic using last element as pivot
	    static int partition(int[] scores, int low, int high) {
	        int pivot = scores[high];
	        int i = low - 1;

	        for (int j = low; j < high; j++) {
	            if (scores[j] >= pivot) {   
	                i++;
	                int temp = scores[i];
	                scores[i] = scores[j];
	                scores[j] = temp;
	            }
	        }

	        int temp = scores[i + 1];
	        scores[i + 1] = scores[high];
	        scores[high] = temp;

	        return i + 1;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of players: ");
	        int number = sc.nextInt();

	        int[] scores = new int[number];

	        System.out.println("Enter player scores:");
	        for (int i = 0; i < number; i++) {
	            scores[i] = sc.nextInt();
	        }

	        quickSort(scores, 0, number - 1);

	        System.out.println("\nLeaderboard (High to Low):");
	        for (int score : scores) {
	            System.out.print(score + " ");
	        }

	    }
 }
