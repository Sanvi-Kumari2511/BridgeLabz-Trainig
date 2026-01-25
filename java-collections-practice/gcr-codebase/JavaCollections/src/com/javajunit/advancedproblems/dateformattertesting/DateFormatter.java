package com.javajunit.advancedproblems.dateformattertesting;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {
	//Method to converts yyyy-MM-dd to dd-MM-yyyy
    public static String formatDate(String inputDate) {

        try {
            DateTimeFormatter inputFormat =
                    DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter outputFormat =
                    DateTimeFormatter.ofPattern("dd-MM-yyyy");

            LocalDate date = LocalDate.parse(inputDate, inputFormat);
            return date.format(outputFormat);

        }
        
        catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format");
        }
    }
}
