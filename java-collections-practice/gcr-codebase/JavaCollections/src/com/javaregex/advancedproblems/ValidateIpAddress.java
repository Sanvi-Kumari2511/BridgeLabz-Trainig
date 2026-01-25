package com.javaregex.advancedproblems;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateIpAddress {
   public static void main(String args []) {
	   
	   //Regex pattern
	   String ipRegex = "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.){3}"
               + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";
	   
	   Scanner sc = new Scanner(System.in);
       System.out.print("Enter IPv4 address: ");
       String ip = sc.nextLine();

       if (Pattern.matches(ipRegex, ip)) {
           System.out.println(ip + " : Valid");
       } 
       
       else {
           System.out.println(ip + " : Invalid");
       }
   }
}
