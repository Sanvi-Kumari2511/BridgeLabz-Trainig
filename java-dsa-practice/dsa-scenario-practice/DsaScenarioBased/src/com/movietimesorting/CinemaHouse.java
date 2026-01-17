package com.movietimesorting;

public class CinemaHouse {

	    public static void bubbleSort(int[] showTimes) {
	        int n = showTimes.length;

	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {

	                //Compare adjacent showtimes
	                if (showTimes[j] > showTimes[j + 1]) {
	                    int temp = showTimes[j];
	                    showTimes[j] = showTimes[j + 1];
	                    showTimes[j + 1] = temp;
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int[] shows = {1800, 1400, 2100, 1600, 1200};

	        bubbleSort(shows);

	        System.out.println("Sorted Movie Showtimes:");
	        for (int time : shows) {
	            System.out.print(time + " ");
	        }
	  }
}


