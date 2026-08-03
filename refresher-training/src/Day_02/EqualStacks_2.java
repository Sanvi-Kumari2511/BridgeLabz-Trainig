package Day_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EqualStacks_2 {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        //total height of stack 1
        for(int i = 0; i < h1.size(); i++){
            sum1 += h1.get(i);
        }
        //total height of stack 2
        for(int i = 0; i < h2.size(); i++){
            sum2 += h2.get(i);
        }
        //total height of stack 3
        for(int i = 0; i < h3.size(); i++){
            sum3 += h3.get(i);
        }

        //top positions of stacks
        int i = 0;
        int j = 0;
        int k = 0;

        while(true){

            //if all heights are equal, return 0
            if(sum1 == sum2 && sum1 == sum3){
                return sum1;
            }

            //if any stack is empty then return 0
            if(i == h1.size() || j == h2.size() || k == h3.size()){
                return 0;
            }
            //if sum1 is greater then remove top element
            if(sum1 >= sum2 && sum1 >= sum3){
                sum1 -= h1.get(i);
                i++;
            }
            //if sum2 is greater then remove top element
            else if(sum2 >= sum1 && sum2 >= sum3){
                sum2 -= h2.get(j);
                j++;
            }
            //if sum3 is greater then remove top element
            else{
                sum3 -= h3.get(k);
                k++;
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> h1 = new ArrayList<>(Arrays.asList(3,2,1,1,1));
        List<Integer> h2 = new ArrayList<>(Arrays.asList(4,3,2));
        List<Integer> h3 = new ArrayList<>(Arrays.asList(1,1,4,1));
        int output = equalStacks(h1, h2, h3);
        System.out.println(output);

    }
}

