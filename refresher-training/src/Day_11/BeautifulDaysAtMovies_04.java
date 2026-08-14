package Day_11;

public class BeautifulDaysAtMovies_04 {
    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int count = 0;
        for(int num = i; num <= j; num++){
            int original = num;
            int rev = 0;

            while(num>0){
                int digit = num%10;
                rev = rev*10+digit;
                num = num/10;
            }

            int diff = Math.abs(original-rev);
            if(diff%k==0){
                count++;
            }
            num = original;
        }
        return count;

    }

    public static void main(String[] args) {
        int i = 20;
        int j = 23;
        int k = 6;
        System.out.println(beautifulDays(i,j,k));

    }
}
