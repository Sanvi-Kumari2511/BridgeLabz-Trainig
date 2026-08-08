package Day_06_Part2;

import java.util.Arrays;
import java.util.List;

public class SherlockAndArray_01 {
    public static String balancedSums(List<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }

        int leftSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int rightSum = sum - leftSum - arr.get(i);
            if (leftSum == rightSum) {
                return "YES";
            }
            leftSum += arr.get(i);
        }
        return "NO";
    }

    public static void main(String[] args) {
        List<Integer> n1 = Arrays.asList(1,2,3);
        System.out.println(n1);
        System.out.println(balancedSums(n1));

        System.out.println();

        List<Integer> n2 = Arrays.asList(1,2,3,3);
        System.out.println(n2);
        System.out.println(balancedSums(n2));

    }

}

