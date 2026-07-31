package Day_01;

import java.util.ArrayList;
import java.util.List;

public class Arrays_DS_5
{
    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> b = new ArrayList<>();
        for(int i = a.size()-1; i >= 0; i--){
            b.add(a.get(i));
        }
        return b;
    }
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();

        num.add(1);
        num.add(4);
        num.add(3);
        num.add(2);

        List<Integer> rev = reverseArray(num);

        System.out.println(num);
        System.out.println(rev);
    }
}

