package com.mobilegamedistributionplatform;
import java.util.*;

public class User {
	
	    private String username;

	    //Encapsulation: user-owned games are protected
	    private List<Game> ownedGames;

	    public User(String username) {
	        this.username = username;
	        this.ownedGames = new ArrayList<>();
	    }

	    public void addGame(Game game) {
	        ownedGames.add(game);
	    }

	    
	   //Displays owned games
	     
	    public void showOwnedGames() {
	        System.out.println("Games owned by " + username + ":");
	        for (Game game : ownedGames) {
	            System.out.println("- " + game.getTitle());
	        }
	   }
}


