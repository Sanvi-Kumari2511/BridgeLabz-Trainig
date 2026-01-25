package com.javaregex.advancedproblems;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.List;
import java.util.ArrayList;

public class ExtractProgrammingLanguageNames {
	
	public static void main(String[] args) {

        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        //List of programming languages to extract
        String[] languages = {"Java", "Python", "JavaScript", "Go"};

        //Regex pattern
        String regex = "\\b(" + String.join("|", languages) + ")\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> extracted = new ArrayList<>();
        
        while (matcher.find()) {
            extracted.add(matcher.group());
        }

        //Printing languages
        System.out.println(String.join(", ", extracted));
    }
}
