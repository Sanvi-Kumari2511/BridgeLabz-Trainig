package Day_07;

public class DavisStaircase_03 {
    public static int stepPerms(int n) {
        // Write your code here
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(n==3){
            return 4;
        }
        return stepPerms(n-1)+stepPerms(n-2)+stepPerms(n-3);

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(stepPerms(n));
    }
}
