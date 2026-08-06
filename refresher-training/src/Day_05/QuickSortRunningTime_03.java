package Day_05;

import java.util.Scanner;

public class QuickSortRunningTime_03 {
        static int quickSwaps = 0;
        static int insertionShift = 0;

        static void insertionSort(int[] arr){
            for(int i = 1; i < arr.length; i++){

                int key = arr[i];
                int j = i-1;

                while(j >= 0 && arr[j] > key){
                    arr[j+1] = arr[j];
                    insertionShift++;
                    j--;
                }

                arr[j+1] = key;
            }

        }
        static int partition(int[] arr, int left, int right){
            int pivot = arr[right];

            int i = left-1;

            for(int j = left; j < right; j++){
                if(arr[j] < pivot){
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    quickSwaps++;
                }
            }

            int temp = arr[i+1];
            arr[i+1] = arr[right];
            arr[right] = temp;

            quickSwaps++;
            return i+1;
        }

        static void quickSort(int[] arr, int left, int right){
            if(left < right){
                int p = partition(arr, left, right);
                quickSort(arr, left, p-1);
                quickSort(arr, p+1, right);
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int[] arr1 = new int[n];
            int[] arr2 = new int[n];

            for(int i = 0; i < n; i++){
                int x = sc.nextInt();

                arr1[i] = x;
                arr2[i] = x;
            }

            insertionSort(arr1);

            quickSort(arr2, 0, n-1);
            System.out.println(insertionShift - quickSwaps);
        }
}
