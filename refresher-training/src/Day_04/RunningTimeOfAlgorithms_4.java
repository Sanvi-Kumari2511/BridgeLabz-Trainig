package Day_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RunningTimeOfAlgorithms_4 {
    public static int runningTime(List<Integer> arr) {

        int shift = 0;
        int n = arr.size();

        for(int i = 1; i < n; i++){

            //Storing current element
            int key = arr.get(i);

            //Comparing with previous element
            int j = i - 1;

            //Shifting elements greater than key to the right side
            while(j >= 0 && arr.get(j) > key){

                //Shifting element one position to the right
                arr.set(j + 1, arr.get(j));
                shift++;
                j = j-1;
            }

            //Inserting key to its correct place
            arr.set(j + 1, key);
        }
        return shift;
    }

    public static void main(String[] args){
        List<Integer> arr = Arrays.asList(2,1,3,1,2);

        int output = runningTime(arr);
        System.out.println(output);

    }
}
