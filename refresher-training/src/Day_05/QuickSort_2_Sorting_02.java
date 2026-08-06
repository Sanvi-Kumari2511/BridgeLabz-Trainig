package Day_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuickSort_2_Sorting_02 {
        static List<Integer> quickSort(List<Integer> arr){
            if(arr.size() <= 1){
                return arr;
            }
            int pivot = arr.get(0);

            List<Integer> left = new ArrayList<>();
            List<Integer> equal = new ArrayList<>();
            List<Integer> right = new ArrayList<>();

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

            left = quickSort(left);
            right = quickSort(right);

            List<Integer> output = new ArrayList<>();

            output.addAll(left);
            output.addAll(equal);
            output.addAll(right);

            for(int i : output)
                System.out.print(i + " ");
            System.out.println();

            return output;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }
            quickSort(arr);
        }
}
