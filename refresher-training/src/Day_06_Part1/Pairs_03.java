package Day_06_Part1;

import java.util.*;

public class Pairs_03 {
    public static int pairs(int k, List<Integer> arr) {
        Collections.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int target = arr.get(i) + k;
            if (binarySearch(arr, target)) {
                count++;
            }
        }
        return count;
    }

    public static boolean binarySearch(List<Integer> arr, int target){
        int start = 0;
        int end = arr.size()-1;

        while(start <= end){
            int mid = start+(end-start)/2;

            if(arr.get(mid) == target){
                return true;
            }

            if(arr.get(mid) < target){
                start = mid +1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
}
    public static void main(String[] args) {
        int k = 2;
        List<Integer> arr = Arrays.asList(1,5,3,4,2);
        System.out.println(pairs(k, arr));

    }

}
