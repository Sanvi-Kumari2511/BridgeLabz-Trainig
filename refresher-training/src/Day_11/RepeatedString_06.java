package Day_11;

public class RepeatedString_06 {
    public static long repeatedString(String s, long n) {
        // Write your code here
        long count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='a'){
                count++;
            }
        }
        long full = n/s.length();
        long remaining = n%s.length();

        long total = full*count;

        for(int i = 0; i < remaining; i++){
            if(s.charAt(i) == 'a'){
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        String s = "aba";
        long n = 10;

        System.out.println(repeatedString(s,n));
    }

}
