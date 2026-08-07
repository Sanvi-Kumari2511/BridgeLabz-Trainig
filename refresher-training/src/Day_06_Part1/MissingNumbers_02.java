package Day_06_Part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingNumbers_02 {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        Collections.sort(arr);
        Collections.sort(brr);

        List<Integer> output = new ArrayList<>();

        for (int i = 0; i < brr.size(); i++) {
            int num = brr.get(i);

            if (i > 0 && num == brr.get(i - 1)) {
                continue;
            }

            int arrCount = countOccurrences(arr, num);
            int brrCount = countOccurrences(brr, num);

            if (arrCount != brrCount) {
                output.add(num);
            }
        }
        return output;
    }

    public static int countOccurrences(List<Integer> list, int target) {
        int first = firstOccurrence(list, target);

        if (first == -1) {
            return 0;
        }

        int last = lastOccurrence(list, target);

        return last - first + 1;
    }public static int firstOccurrence(List<Integer> list, int target) {
        int start = 0;
        int end = list.size() - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (list.get(mid) == target) {
                ans = mid;
                end = mid - 1;
            } else if (list.get(mid) < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }
        public static int lastOccurrence(List<Integer> list, int target){
        int start = 0;
        int end = list.size()-1;
        int ans = -1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(list.get(mid) == target){
                ans = mid;
                start = mid+1;
            }
            else if(list.get(mid) < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(
                203,204,205,206,207,
                208,203,204,205,206
        );

        List<Integer> brr = Arrays.asList(
                203, 204, 204, 205, 206,
                207, 205, 208, 203, 206,
                205,206,204
        );

        List<Integer> output = missingNumbers(arr, brr);
        System.out.println(output);

    }
}

