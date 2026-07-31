package Day_01;
import java.util.Scanner;

public class JavaStringTokens_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        if(s.isEmpty()){
            System.out.println(0);
            return;
        }
        String[] tokens = s.split("[!,?._'@\\s]+");
        System.out.println(tokens.length);

        for(int i = 0; i < tokens.length; i++){
            System.out.println(tokens[i]);
        }

        scan.close();
    }
}

