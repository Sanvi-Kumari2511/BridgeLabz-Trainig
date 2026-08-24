package Day_17;

import java.util.Scanner;

public class Solution_02 {

        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            while(in.hasNext()){
                String IP = in.next();
                System.out.println(IP.matches(new MyRegex().pattern));
            }

        }
    }

//Write your code
    class MyRegex {

//           String pattern =
//         "^(0{0,2}[0-9]|0{0,1}[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\." +
//         "(0{0,2}[0-9]|0{0,1}[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\." +
//         "(0{0,2}[0-9]|0{0,1}[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\." +
//         "(0{0,2}[0-9]|0{0,1}[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";

        String number = "(\\d|\\d\\d|[01]\\d\\d|2[0-4]\\d|25[0-5])";
        String pattern = number + "\\."  + number + "\\." + number + "\\." + number;

}
