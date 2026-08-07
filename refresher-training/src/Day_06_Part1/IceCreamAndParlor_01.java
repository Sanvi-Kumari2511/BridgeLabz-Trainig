package Day_06_Part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IceCreamAndParlor_01 {
    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {

        int[][] items = new int[arr.size()][2];

        for(int i = 0; i < arr.size(); i++){
            items[i][0] = arr.get(i);
            items[i][1] = i+1;
        }
        Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i = 0; i < items.length; i++){
            int remaining = m-items[i][0];

            int left = i+1;
            int right = items.length-1;
            while(left <= right){
                int mid = (left+right)/2;
                if(items[mid][0] == remaining){
                    List<Integer> output = new ArrayList<>();

                    if(items[i][1] < items[mid][1]){
                        output.add(items[i][1]);
                        output.add(items[mid][1]);
                    }
                    else{
                        output.add(items[mid][1]);
                        output.add(items[i][1]);
                    }
                    return output;
                }
                if(items[mid][0] < remaining){
                    left = mid +1;
                }
                else{
                    right = mid-1;
                }
            }
        }
        return new ArrayList<>();

    }

    public static void main(String[] args) {
        List<Integer> n1 = Arrays.asList(1,4,5,3,2);
        int budget1 = 4;

        System.out.println(n1);
        System.out.println(budget1);
        System.out.println(icecreamParlor(budget1, n1));

        System.out.println();

        List<Integer> n2 = Arrays.asList(2,2,4,3);
        int budget2 = 4;

        System.out.println(n2);
        System.out.println(budget2);
        System.out.println(icecreamParlor(budget2, n2));

    }
}
