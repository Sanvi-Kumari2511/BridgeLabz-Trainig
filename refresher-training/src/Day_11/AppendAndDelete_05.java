package Day_11;

public class AppendAndDelete_05 {
    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here
        int same = 0;
        while(same < s.length() && same < t.length() && s.charAt(same) == t.charAt(same)){
            same++;
        }

        int remove = s.length()-same;
        int add = t.length()-same;

        int steps = remove + add;

        if(steps>k){
            return "No";
        }

        int extra = k - steps;

        if(extra % 2 == 0){
            return "Yes";
        }

        if(k >= s.length() + t.length()){
            return "Yes";
        }
        return "No";

    }

    public static void main(String[] args) {
        String s="hackerhappy";
        String t="hackerrank";
        int k = 9;

        System.out.println(appendAndDelete(s,t,k));
    }
}
