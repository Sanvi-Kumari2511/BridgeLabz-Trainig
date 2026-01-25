package com.javaregex.basicproblems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateLicensePlateNumber {
	 public static void main(String[] args) {
		 
    //Regex pattern for license plate number
	String licenseRegex = "^[A-Z]{2}[0-9]{4}$";
	
	Scanner sc = new Scanner (System.in);
	
	System.out.print("Enter license plate number: ");
	String license = sc.nextLine();
	
	//Validate license number
	if(Pattern.matches(licenseRegex, license)) {
		System.out.println(license + " : Valid");
	}
	else {
		System.out.println(license + " : Invalid");
	 }
   }
}
