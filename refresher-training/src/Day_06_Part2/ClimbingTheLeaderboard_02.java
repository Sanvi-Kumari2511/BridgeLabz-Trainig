package Day_06_Part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClimbingTheLeaderboard_02 {
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {

        List<Integer> output = new ArrayList<Integer>();

        List<Integer> rank = new ArrayList<Integer>();

        for(int i = 0; i < ranked.size(); i++){
            if(i ==0 || !ranked.get(i).equals(ranked.get(i-1))){
                rank.add(ranked.get(i));
            }
        }
        for(int i = 0; i < player.size(); i++){
            int low = 0;
            int high = rank.size()-1;

            while(low <= high){
                int mid = (low+high)/2;

                if(player.get(i) >= rank.get(mid)){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            output.add(low+1);
        }
        return output;

    }

    public static void main(String[] args) {
        List<Integer> ranked = Arrays.asList(100,100,50,40,40,20,10);
        List<Integer> player = Arrays.asList(5,25,50,120);

        List<Integer> output = climbingLeaderboard(ranked, player);
        System.out.println(output);
    }
}

