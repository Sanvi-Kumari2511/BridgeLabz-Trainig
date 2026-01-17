package com.sensordataordering;

public class CropMonitor {

	    static void quickSort(int[] timestamps, int low, int high) {
	        if (low < high) {
	            int pivotIndex = partition(timestamps, low, high);

	            quickSort(timestamps, low, pivotIndex - 1);
	            quickSort(timestamps, pivotIndex + 1, high);
	        }
	    }

	    static int partition(int[] timestamps, int low, int high) {
	        int pivot = timestamps[high];  // Last element as pivot
	        int i = low - 1;

	        for (int j = low; j < high; j++) {
	            if (timestamps[j] < pivot) {
	                i++;
	                int temp = timestamps[i];
	                timestamps[i] = timestamps[j];
	                timestamps[j] = temp;
	            }
	        }

	        int temp = timestamps[i + 1];
	        timestamps[i + 1] = timestamps[high];
	        timestamps[high] = temp;

	        return i + 1;
	    }

	    public static void main(String[] args) {
	        int[] sensorTimestamps = {45, 12, 78, 34, 56, 9, 67};

	        quickSort(sensorTimestamps, 0, sensorTimestamps.length - 1);

	        System.out.println("Sorted Sensor Data by Timestamp:");
	        for (int t : sensorTimestamps) {
	            System.out.print(t + " ");
	        }
	  }
}


