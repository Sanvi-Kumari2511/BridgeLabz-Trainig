package Day_01;

public class CamelCase_4
{
    public static int camelcase(String s) {
        int count = 1;
        for(int i = 0; i < s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))){
                count++;
            }
        }
        return count;


    }
    public static void main(String[] args) {
        String str = "saveChangesInTheEditor";

        int res = camelcase(str);

        System.out.println(res);
    }
}

