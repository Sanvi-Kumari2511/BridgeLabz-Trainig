package com.Artify;

public class ArtifyApp {
	
	    public static void main(String[] args) {

	        User buyer = new User("Sanvi", 5000);

	        IPurchasable art1 = new DigitalArt("Neon Dreams", "Alex", 2000, "Commercial");
	        IPurchasable art2 = new PrintArt("Vintage Sketch", "Emma", 2500, "Limited");

	        art1.purchase(buyer);
	        art1.license();

	        art2.purchase(buyer);
	        art2.license();

	        System.out.println("Remaining Wallet Balance: " + buyer.getWalletBalance());
	    }
	}

