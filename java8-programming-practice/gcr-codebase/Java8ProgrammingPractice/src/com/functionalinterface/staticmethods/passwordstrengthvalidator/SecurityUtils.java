package com.functionalinterface.staticmethods.passwordstrengthvalidator;

public interface SecurityUtils {
  static boolean isStrongPassword(String password) {
	   if(password.length() < 8) {
		   return false;
	   }
	   
	   boolean hasUpper = false;
	   boolean hasDigit = false;
	   boolean hasSpecial = false;
	   
	   for(char ch : password.toCharArray()) {
		   if(Character.isUpperCase(ch)) hasUpper = true;
		   else if(Character.isDigit(ch)) hasDigit = true;
		   else if(!Character.isLetterOrDigit(ch)) hasSpecial = true;
		   
	   }
	   
	   return hasUpper && hasDigit && hasSpecial;
   }
}
