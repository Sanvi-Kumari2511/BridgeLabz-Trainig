package com.algorithmruntimeanalysis;
import java.util.Arrays;
import java.util.Random;

public class SortingLargeData {

	    //Bubble Sort
	    public static void bubbleSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }

	    //Merge Sort
	    public static void mergeSort(int[] arr, int left, int right) {
	        if (left < right) {
	            int mid = (left + right) / 2;

	            mergeSort(arr, left, mid);
	            mergeSort(arr, mid + 1, right);

	            merge(arr, left, mid, right);
	        }
	    }

	    private static void merge(int[] arr, int left, int mid, int right) {
	        int[] temp = new int[right - left + 1];
	        int i = left, j = mid + 1, k = 0;

	        while (i <= mid && j <= right) {
	            if (arr[i] <= arr[j])
	                temp[k++] = arr[i++];
	            else
	                temp[k++] = arr[j++];
	        }

	        while (i <= mid)
	            temp[k++] = arr[i++];

	        while (j <= right)
	            temp[k++] = arr[j++];

	        System.arraycopy(temp, 0, arr, left, temp.length);
	    }

	    //Quick Sort
	    public static void quickSort(int[] arr, int low, int high) {
	        if (low < high) {
	            int pivotIndex = partition(arr, low, high);
	            quickSort(arr, low, pivotIndex - 1);
	            quickSort(arr, pivotIndex + 1, high);
	        }
	    }

	    private static int partition(int[] arr, int low, int high) {
	        int pivot = arr[high];
	        int i = low - 1;

	        for (int j = low; j < high; j++) {
	            if (arr[j] < pivot) {
	                i++;
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        int temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;

	        return i + 1;
	    }

	    public static void main(String[] args) {

	        int number = 10000;
	        int[] data1 = new int[number];
	        int[] data2 = new int[number];
	        int[] data3 = new int[number];

	        Random random = new Random();

	        for (int i = 0; i < number; i++) {
	            int value = random.nextInt(number);
	            data1[i] = value;
	            data2[i] = value;
	            data3[i] = value;
	        }

	        long start, end;

	        //Bubble Sort
	        start = System.nanoTime();
	        bubbleSort(data1);
	        end = System.nanoTime();
	        System.out.println("Bubble Sort Time: " + (end - start) / 1000000.0 + " ms");

	        //Merge Sort
	        start = System.nanoTime();
	        mergeSort(data2, 0, data2.length - 1);
	        end = System.nanoTime();
	        System.out.println("Merge Sort Time: " + (end - start) / 1000000.0 + " ms");

	        //Quick Sort
	        start = System.nanoTime();
	        quickSort(data3, 0, data3.length - 1);
	        end = System.nanoTime();
	        System.out.println("Quick Sort Time: " + (end - start) / 1000000.0 + " ms");
	    }
	}

