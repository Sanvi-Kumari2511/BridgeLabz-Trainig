package com.Artify;

 class PrintArt extends Artwork implements IPurchasable {
	 
	        //Constructor to show the details of print art
		    public PrintArt(String title, String artist, double price, String licenseType) {
		        super(title, artist, price, licenseType);
		    }

		    //Override
		    public void purchase(User user) {
		        if (user.getWalletBalance() >= price) {
		            user.deductBalance(price);
		            System.out.println(user.getName() + " purchased print art: " + title);
		        } else {
		            System.out.println("Insufficient balance to purchase print art.");
		        }
		    }

		    //Override
		    public void license() {
		        System.out.println("Print Art licensed for single physical reproduction.");
		    }
		}

