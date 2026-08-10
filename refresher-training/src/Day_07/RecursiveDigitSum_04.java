package Day_07;

public class RecursiveDigitSum_04 {
    public static int superDigit(String n, int k) {

        int num = Integer.parseInt(n);
        int a = digitSum(num);
        int ans = a*k;

        if(ans < 10){
            return ans;
        }
        else{
            return superDigit(String.valueOf(ans), 1);
        }
    }
    public static int digitSum(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + digitSum(n/10);
    }

    public static void main(String[] args) {
        System.out.println(superDigit("123", 3));
    }
}
