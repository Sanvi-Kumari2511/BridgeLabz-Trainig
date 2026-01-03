package com.cabbygo;

public class Driver {
  private String name;
  private String licenseNumber;
  double rating;
  
  //Constructor of Driver class
  Driver(String name, String lisenseNumber, double rating){
	  this.name = name;
	  this.licenseNumber = licenseNumber;
	  this.rating = rating;
  }
  
  //Getter method to access driver name
  public String getName() {
      return name;
  }

  //Getter method to access rating
  public double getRating() {
      return rating;
   }
}
