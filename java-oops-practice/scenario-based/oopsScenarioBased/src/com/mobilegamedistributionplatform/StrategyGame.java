package com.mobilegamedistributionplatform;

public class StrategyGame extends Game implements IDownloadable {

	    public StrategyGame(String title, double price, double rating) {
	        super(title, "Strategy", price, rating);
	    }

	    //Override
	    public void download() {
	    	 
	        System.out.println(title + " (Strategy) downloaded successfully!");
	        
	        System.out.println();
	    }

	    //Override
	    public void playDemo() {
	    	 
	        System.out.println("Playing strategic planning demo of " + title);
	        
	        System.out.println();
	    }
}


