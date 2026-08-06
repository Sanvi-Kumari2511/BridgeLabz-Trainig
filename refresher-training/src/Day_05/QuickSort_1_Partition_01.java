package Day_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuickSort_1_Partition_01 {
    public static List<Integer> quickSort(List<Integer> arr) {
        List<Integer> left = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int pivot = arr.get(0);

        for(int num : arr){

            if(num < pivot){
                left.add(num);
            }
            else if(num == pivot){
                equal.add(num);
            }
            else{
                right.add(num);
            }
        }

        List<Integer> output = new ArrayList<>();
        output.addAll(left);
        output.addAll(equal);
        output.addAll(right);

        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }
        List<Integer> output = quickSort(arr);
        for(int num : output){
            System.out.println(num + " ");
        }
    }
}

