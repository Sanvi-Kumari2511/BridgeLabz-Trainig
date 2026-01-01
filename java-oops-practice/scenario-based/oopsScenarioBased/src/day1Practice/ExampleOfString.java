package day1Practice;

public class ExampleOfString {

	    public static void main(String[] args) {

	        String input = "  java programming  ";
	        StringBuilder sb = new StringBuilder(input.trim());

	        sb.replace(0, 4, "CORE JAVA");

	        System.out.println(sb.toString());
	    }
	}

