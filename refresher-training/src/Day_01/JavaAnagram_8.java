package Day_01;
import java.util.Arrays;
public class JavaAnagram_8 {
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.length() != b.length()){
            return false;
        }
        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }

    public static void main(String[] args) {
        String a = "anagram";
        String b = "margana";
        boolean res = isAnagram(a,b);
        if(res){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
    }
}
