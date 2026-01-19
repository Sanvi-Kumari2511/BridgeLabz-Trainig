package com.addressbooksystem;

public class Contact implements Comparable<Contact> {
	 private String firstName;
	    private String lastName;
	    private String phone;
	    private String email;
	    private Address address;

	    //Constructor to initialize Contact details
	    public Contact(String firstName, String lastName, String phone, String email, Address address) {
	    	
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.phone = phone;
	        this.email = email;
	        this.address = address;
	    }

	    //Getters & setters methods
	    
	    public String getFirstName() {
	        return firstName;
	    }

	    public void setPhone(String phone) {
	        this.phone = phone;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public Address getAddress() {
	        return address;
	    }

	    //Duplicate check
	    public boolean sameName(String fname, String lname) {
	        return firstName.equalsIgnoreCase(fname) && lastName.equalsIgnoreCase(lname);
	    }

	    //Sorting alphabetically(Override)
	    public int compareTo(Contact c) {
	        return this.firstName.compareToIgnoreCase(c.firstName);
	    }

	    //Displaying contacts
	    public void display() {
	        System.out.println(firstName + " " + lastName +
	                " | Phone: " + phone +
	                " | Email: " + email +
	                " | Address: " + address);
	    }
}
