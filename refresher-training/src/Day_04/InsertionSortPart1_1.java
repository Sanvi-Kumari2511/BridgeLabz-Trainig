package Day_04;

import java.util.Arrays;
import java.util.List;

public class InsertionSortPart1_1 {

    public static void insertionSort1(int n, List<Integer> arr) {
        int key = arr.get(n-1);
        int i = n-2;
        while(i >=0 && arr.get(i) > key){
            arr.set(i+1, arr.get(i));
            for(int j = 0; j < n; j++){
                System.out.print(arr.get(j));

                System.out.print(" ");
            }

            System.out.println();
            i--;
        }

        arr.set(i+1, key);
        for(int j = 0; j < n; j++){
            System.out.print(arr.get(j));

            System.out.print(" ");
        }

        System.out.println();

    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2,4,6,8,3);
        int n = arr.size();

        insertionSort1(n, arr);
    }

}

