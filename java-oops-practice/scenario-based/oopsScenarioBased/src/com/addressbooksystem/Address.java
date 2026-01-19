package com.addressbooksystem;

public class Address {
	private String city;
    private String state;
    private String zip;

    //Constructor to initialize details of address
    public Address(String city, String state, String zip) {
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    //Getter method to get city
    public String getCity() {
        return city;
    }

  //Getter method to get state
    public String getState() {
        return state;
    }

    //Displaying address
    public String toString() {
        return city + ", " + state + " - " + zip;
    }
}
