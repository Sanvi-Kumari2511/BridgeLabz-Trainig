package Day_04;

import java.util.Arrays;
import java.util.List;

public class InsertionSortPart2_2 {
    public static void insertionSort2(int n, List<Integer> arr) {

        for (int i = 1; i < n; i++) {
            int key = arr.get(i);
            int j = i - 1;
            while (j >= 0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));
                j--;
            }

            arr.set(j + 1, key);

            for (int k = 0; k < n; k++) {
                System.out.print(arr.get(k));

                System.out.print(" ");
            }

            System.out.println();

        }
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,4,3,5,6,2);
        insertionSort2(arr.size(), arr);

    }
}



