package com.mobilegamedistributionplatform;

public class GameBoxApp {
	
	    public static void main(String[] args) {

	        //Creating games
	        ArcadeGame arcade = new ArcadeGame("Speed Racer", 300, 4.0);
	        StrategyGame strategy = new StrategyGame("War Planner", 499, 5.0);

	        //Applying seasonal offer (operator usage)
	        strategy.applySeasonalOffer(20); 

	        //Playing demos (polymorphism)
	        arcade.playDemo();
	        strategy.playDemo();

	        //Download games
	        arcade.download();
	        strategy.download();

	        //Creating user
	        User user = new User("Sanvi");

	        //Adding games to user's account
	        user.addGame(arcade);
	        user.addGame(strategy);

	        //Showing user's games
	        user.showOwnedGames();
	    }
}


