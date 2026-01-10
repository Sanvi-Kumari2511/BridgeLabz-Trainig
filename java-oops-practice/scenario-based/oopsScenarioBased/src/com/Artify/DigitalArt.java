package com.Artify;

 class DigitalArt extends Artwork implements IPurchasable {
            
	        //Constructor to show the details of digital art
		    public DigitalArt(String title, String artist, double price, String licenseType) {
		        super(title, artist, price, licenseType);
		    }

		    //Override
		    public void purchase(User user) {
		        if (user.getWalletBalance() >= price) {
		            user.deductBalance(price);
		            System.out.println(user.getName() + " purchased digital art: " + title);
		        } else {
		            System.out.println("Insufficient balance to purchase digital art");
		        }
		    }

		    //Override
		    public void license() {
		        System.out.println("Digital Art licensed for personal & commercial use");
		    }
		}
