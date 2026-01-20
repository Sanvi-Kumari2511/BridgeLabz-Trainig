package com.theatershowlisting;
import java.util.Scanner;

public class MovieTime {
	
	//Insertion Sort method
    public static void insertionSort(int[] showTimes) {
        for (int i = 1; i < showTimes.length; i++) {
            int current = showTimes[i];
            int j = i - 1;

            while (j >= 0 && showTimes[j] > current) {
                showTimes[j + 1] = showTimes[j];
                j--;
            }
            showTimes[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of shows: ");
        int number = sc.nextInt();

        int[] showTimes = new int[number];

        System.out.println("Enter show times:");
        for (int i = 0; i < number; i++) {
            showTimes[i] = sc.nextInt();
        }

        insertionSort(showTimes);

        System.out.println("\nSorted Showtimes:");
        for (int time : showTimes) {
            System.out.print(time + " ");
        }
    }
}
