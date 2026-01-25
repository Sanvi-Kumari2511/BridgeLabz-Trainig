package com.javaregex.advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class ExtractCurrencyValues {
	public static void main(String[] args) {

        String text = "The price is $45.99, and the discount is 10.50.";

        //Regex pattern 
        String currencyRegex = "\\$?\\d+(\\.\\d+)?";

        Pattern pattern = Pattern.compile(currencyRegex);
        Matcher matcher = pattern.matcher(text);

        List<String> values = new ArrayList<>();

        while (matcher.find()) {
            values.add(matcher.group());
        }

        //Printing extracted values
        System.out.println(String.join(", ", values));
    }
}
