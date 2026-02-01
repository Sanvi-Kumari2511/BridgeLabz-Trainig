package com.functionalinterface.staticmethods.dateformat;

import java.time.LocalDate;

public class InvoiceGenerator {
	public static void main(String args []) {
		
	//Current date
    LocalDate invoiceDate = LocalDate.now();

    System.out.println("Invoice Date Formats:");

    System.out.println("DD-MM-YYYY : " +  DateFormat.formatDateDDMMYYYY(invoiceDate));

    System.out.println("YYYY/MM/DD : " + DateFormat.formatYYYYMMDD(invoiceDate));

    System.out.println("Full Date  : " + DateFormat.formatFullDate(invoiceDate));
    }
}
