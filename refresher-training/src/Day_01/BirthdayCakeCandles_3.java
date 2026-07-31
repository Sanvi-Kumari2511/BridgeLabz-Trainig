package Day_01;

import java.util.ArrayList;
import java.util.List;

public class BirthdayCakeCandles_3
{
    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = 0;
        for(int i = 0; i < candles.size(); i++){
            if(candles.get(i) > max){
                max = candles.get(i);
            }
        }
        int count = 0;
        for(int i = 0; i < candles.size(); i++){
            if(candles.get(i) == max){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<>();

        candles.add(3);
        candles.add(2);
        candles.add(1);
        candles.add(3);

        int res = birthdayCakeCandles(candles);

        System.out.println(res);
    }
}

