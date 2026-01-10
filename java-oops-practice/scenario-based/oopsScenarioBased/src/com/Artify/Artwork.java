package com.Artify;

public class Artwork {
   protected String title;
   protected String artist;
   protected double price;
   protected String licenseType;
   
   Artwork(String title, String artist, double price, String licenseType){
	   this.title = title; 
	   this.artist = artist;
	   this.price = price;
	   this.licenseType = licenseType;
   }
   
   void show() {
	   System.out.println("Details of Artwork: ");
	   System.out.println("Title: " + title);
	   System.out.println("Artist: " + artist);
	   System.out.println("Price: " + price);
	   System.out.println("LicenseType: " + licenseType);
	   
   }
}
