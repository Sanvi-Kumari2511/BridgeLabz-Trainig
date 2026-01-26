package com.csvdatahandling.validatedata;
 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCSVData {
	  //Regex pattern 
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    //Phone number must be exactly 10 digits
    private static final String PHONE_REGEX = "^\\d{10}$";

    public static void main(String[] args) {

        String filePath = "D:\\testing\\Java Programming Workspace\\java-io-streams-practice\\gcr-codebase\\IoStreamPractice\\src\\com\\csvdatahandling\\validatedata\\question8\\user.csv";
        String line;
        int rowNumber = 1;

        Pattern emailPattern = Pattern.compile(EMAIL_REGEX);
        Pattern phonePattern = Pattern.compile(PHONE_REGEX);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            //Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {
                rowNumber++;

                String[] data = line.split(",");

                String email = data[2];
                String phone = data[3];

                boolean valid = true;
                StringBuilder errorMessage = new StringBuilder();

                //validate email
                if (!emailPattern.matcher(email).matches()) {
                    valid = false;
                    errorMessage.append("Invalid Email Format; ");
                }

                //Validate phone number
                if (!phonePattern.matcher(phone).matches()) {
                    valid = false;
                    errorMessage.append("Invalid Phone Number; ");
                }

                //If valid then print results
                if (!valid) {
                    System.out.println("Row " + rowNumber + " is invalid:");
                    System.out.println("Data   : " + line);
                    System.out.println("Error  : " + errorMessage);
                    System.out.println("----------------------------");
                }
            }

        } 
        
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
