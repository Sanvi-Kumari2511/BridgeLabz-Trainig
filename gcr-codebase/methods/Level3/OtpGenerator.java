import java.util.Arrays;

    public class OtpGenerator {

        //Creating a method to generate a 6-digit OTP number using Math.random()
        public static int otp() {
	
        return (int)(Math.random() * 900000) + 100000;
        }
		
        //Creating a method to check all the generated OTPs are unique
        public static boolean isUnique(int[] otp) {
        for (int i = 0; i < otp.length; i++) {
        for (int j = i + 1; j < otp.length; j++) {
        if (otp[i] == otp[j]) {
        return false; 
        }
        }
        }
        return true; 
        }

        public static void main(String[] args) {
            int[] arr = new int[10];

            //Generating 10 OTPs
            for (int i = 0; i < 10; i++) {
            arr[i] = otp();
            }

            //Displaying results
            System.out.println("Generated OTPs are ");
            System.out.println(Arrays.toString(arr));

            //Checking OTP number is unique or not
            if (isUnique(arr)) {
            System.out.println("All generated OTPs are unique");
            }   
		    else {
            System.out.println("Some generated OTPs are not unique");
            }
            }
            }
