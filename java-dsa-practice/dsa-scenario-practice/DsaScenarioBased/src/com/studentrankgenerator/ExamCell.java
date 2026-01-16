package com.studentrankgenerator;

public class ExamCell {
	 //Merge Sort method
    static void mergeSort(Student[] arr, int left, int right) {

        //Base condition: at least two elements
        if (left < right) {

            int mid = (left + right) / 2;

            //Sort left half
            mergeSort(arr, left, mid);

            //Sort right half
            mergeSort(arr, mid + 1, right);

            //Merge both halves
            merge(arr, left, mid, right);
        }
    }

    //Merge two sorted subarrays
    static void merge(Student[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        //Temporary arrays
        Student[] Left = new Student[n1];
        Student[] Right = new Student[n2];

        //Copy data to temporary arrays
        for (int i = 0; i < n1; i++)
            Left[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            Right[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge while maintaining descending order by score
        while (i < n1 && j < n2) {

            //Higher score gets higher rank (comes first)
            if (Left[i].score >= Right[j].score) {
                arr[k] = Left[i];   
                i++;
            } 
            
            else {
                arr[k] = Right[j];
                j++;
            }
            
            k++;
        }

        //Copy remaining elements (if any)
        while (i < n1) {
            arr[k++] = Left[i++];
        }

        while (j < n2) {
            arr[k++] = Right[j++];
        }
    }
}
