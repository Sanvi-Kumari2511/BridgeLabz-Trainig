package com.shelfloadingrobot;


public class RobotWarehouse {
	    public static void insertionSort(int[] weights) {
	        for (int i = 1; i < weights.length; i++) {
	            int current = weights[i];   
	            int j = i - 1;

	            //Shift heavier packages to the right
	            while (j >= 0 && weights[j] > current) {
	                weights[j + 1] = weights[j];
	                j--;
	            }

	            //Insert the package at correct position
	            weights[j + 1] = current;
	        }
	    }

	    public static void main(String[] args) {
	        int[] packages = {40, 10, 30, 20, 50};

	        insertionSort(packages);

	        System.out.println("Shelf order by weight:");
	        for (int w : packages) {
	            System.out.print(w + " ");
	        }
	    }
}

