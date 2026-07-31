package Day_01;

import java.util.List;
import java.util.ArrayList;

public class SimpleArraySum_1 {

    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;

        for (int i = 0; i < ar.size(); i++) {
            sum += ar.get(i);
        }

        return sum;
    }

    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(10);
        num.add(11);

        int finalSum = simpleArraySum(num);

        System.out.println(finalSum);
    }
}