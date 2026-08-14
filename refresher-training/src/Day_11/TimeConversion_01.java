package Day_11;

public class TimeConversion_01 {
    public static String timeConversion(String s) {
        // Write your code here
        String per = s.substring(8, 10);
        int hour = Integer.parseInt(s.substring(0,2));

        if(per.equals("AM")){
            if(hour==12){
                hour=0;
            }
        }
        else{
            if(hour != 12){
                hour += 12;
            }
        }
        return String.format("%02d", hour)+s.substring(2,8);

    }

    public static void main(String[] args) {
        String s = "07:05:45PM";
        System.out.println(timeConversion(s));

    }

}
