package com.methodreferences.invoiceobjectcreation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GenerateInvoice {
	public static void main(String[] args) {

        //Creating a list of transaction IDs
        List<Integer> transactionIds = Arrays.asList(101, 102, 103, 104, 105);

        //Generating Invoice objects using constructor reference
        List<Invoice> invoices = transactionIds.stream()
                                               .map(Invoice::new)
                                               .collect(Collectors.toList());

        //Printing all generated invoices
        System.out.println("Generated Invoices:");
        invoices.forEach(System.out::println);
    }
}
