package com.functionalinterface.staticmethods.passwordstrengthvalidator;

import java.util.Scanner;

public class PasswordChecker {
   public static void main(String args []) {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter password: ");
	   String password = sc.nextLine();
	   
	   //Calling static method from interface
	   if(SecurityUtils.isStrongPassword(password)) {
		   System.out.println("Password is strong");
	   }
	   
	   else {
		   System.out.println("Password is weak");
	   }
   }
}
