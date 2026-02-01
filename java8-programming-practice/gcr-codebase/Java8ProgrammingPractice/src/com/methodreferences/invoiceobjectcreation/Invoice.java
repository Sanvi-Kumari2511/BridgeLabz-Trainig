package com.methodreferences.invoiceobjectcreation;

public class Invoice {
	int transactionId;

    //Constructor to initialize transaction id
    public Invoice(int transactionId) {
        this.transactionId = transactionId;
    }

    //toString method to display invoice
    public String toString() {
        return "Invoice Transaction ID: " + transactionId;
    }
}
