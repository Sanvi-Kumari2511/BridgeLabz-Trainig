package Day_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotation_6 {
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        int n = a.size();
        d = d % n;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(a.get((i + d) % n));
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int d = 2;
        List<Integer> res = rotLeft(list, d);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");

        }
    }
}




