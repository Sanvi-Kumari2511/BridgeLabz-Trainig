package Day_08;

public class PermutationOfStrings_01 {
        static void permutation(String str, String ans) {

            if (str.length() == 0) {
                System.out.println(ans);
                return;
            }

            //try for every character
            for (int i = 0; i < str.length(); i++) {

                char ch = str.charAt(i);

                //remove the selected character
                String remaining = str.substring(0, i) + str.substring(i + 1);

                //recursive call
                permutation(remaining, ans + ch);
            }
        }

        public static void main(String[] args) {

            String str = "ABC";

            permutation(str, "");
        }
}
