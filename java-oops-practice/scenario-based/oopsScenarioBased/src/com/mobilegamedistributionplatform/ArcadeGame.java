package com.mobilegamedistributionplatform;

public class ArcadeGame extends Game implements IDownloadable {

	    public ArcadeGame(String title, double price, double rating) {
	        super(title, "Arcade", price, rating);
	    }

	    //Override
	    public void download() {
	    	
	    	System.out.println();
	    	 
	        System.out.println(title + " (Arcade) downloaded successfully!");
	        
	        System.out.println();
	    }
	    
	    //Override
	    public void playDemo() {
	    	
	    	System.out.println();
	    	 
	        System.out.println("Playing fast-paced arcade demo of " + title);
	        
	        System.out.println();
	    }
}


