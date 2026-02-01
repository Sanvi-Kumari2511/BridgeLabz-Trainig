package com.lamdaexpression.notificationfiltering;

public class Alert {
	String message;
    String type;

    //Constructor to initialize the alert details
    public Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }

    //toString method to return information for display
    public String toString() {
        return "Alert Message: " + message +
               "\nAlert Type   : " + type;
    }
}
