package Day_11;

public class CountingValleys_02 {
    public static int countingValleys(int steps, String path) {
        // Write your code here
        int level = 0;
        int valleys = 0;
        for(int i=0; i<steps; i++){
            if(path.charAt(i) == 'U'){
                level++;
            }
            else{
                level--;
            }
            if(path.charAt(i)=='U'&& level==0){
                valleys++;
            }
        }
        return valleys;

    }

    public static void main(String[] args) {
        int steps = 8;
        String path = "DDUUUUDD";
        System.out.println(countingValleys(steps, path));
    }
}
