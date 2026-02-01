package com.functionalinterface.staticmethods.dateformat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface DateFormat {
   //static method to format date as DD-MM-YYYY
	static String formatDateDDMMYYYY(LocalDate date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		return date.format(formatter);
	}
	
	//Static method to format date as YYYY-MM-DD
	static String formatYYYYMMDD(LocalDate date) {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    return date.format(formatter);
    }
	
	//Static method to format date as MM-DD-YYYY
	static String formatFullDate(LocalDate date) {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        return date.format(formatter);
	}
}
