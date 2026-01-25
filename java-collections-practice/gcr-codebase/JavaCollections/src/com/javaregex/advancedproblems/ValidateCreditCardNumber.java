package com.javaregex.advancedproblems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateCreditCardNumber {
	public static void main(String[] args) {

        String ccRegex = "^(4[0-9]{15}|5[0-9]{15})$";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter credit card number: ");
        String ccNumber = sc.nextLine();

        if (Pattern.matches(ccRegex, ccNumber)) {
            if (ccNumber.startsWith("4")) {
            	
                System.out.println(ccNumber + " : Valid Visa card");
            } 
            
            else {
                System.out.println(ccNumber + " : Valid MasterCard");
            }
        } 
        
        else {
            System.out.println(ccNumber + " : Invalid credit card number");
        }
    }
}
