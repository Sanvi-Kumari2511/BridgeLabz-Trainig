package Day_01;

import java.util.ArrayList;
import java.util.List;
public class PlusMinus_2
{
        public static void plusMinus(List<Integer> arr) {
            int pos = 0;
            int neg  = 0;
            int zero = 0;
            for(int i = 0; i < arr.size(); i++){
                if(arr.get(i) > 0){
                    pos++;
                }
                else if(arr.get(i) < 0){
                    neg++;
                }
                else{
                    zero++;
                }
            }
            System.out.printf("%.6f%n", (double) pos/arr.size());
            System.out.printf("%.6f%n", (double) neg/arr.size());
            System.out.printf("%.6f%n", (double) zero/arr.size());

        }

    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();

        num.add(-4);
        num.add(3);
        num.add(-9);
        num.add(0);
        num.add(4);
        num.add(1);

        plusMinus(num);
    }
}
