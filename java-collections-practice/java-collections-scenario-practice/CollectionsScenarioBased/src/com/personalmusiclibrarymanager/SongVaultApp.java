package com.personalmusiclibrarymanager;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class SongVaultApp {
	 public static void main(String[] args) {

	        try {
	        	
	            //Path containing song .txt files
	            String folderPath = "D:\\testing\\Java Programming Workspace\\java-collections-practice\\java-collections-scenario-practice\\CollectionsScenarioBased\\src\\songs";

	            //Loading songs
	            List<Song<Object>> songs = SongVault.loadSongs(folderPath);

	            //Group by genre
	            Map<String, List<Song>> byGenre = SongVault.groupByGenre(songs);

	            //Unique artists
	            Set<String> artists = SongVault.uniqueArtists(songs);

	            //Displaying results
	            System.out.println("Unique Artists: " + artists);

	            System.out.println("\nSongs grouped by Genre:");
	            byGenre.forEach((genre, list) -> {
	                System.out.println("\nGenre: " + genre);
	                list.forEach(System.out::println);
	            });

	            //Filter Rock songs and sort by title
	            System.out.println("\nRock Songs (Sorted by Title):");
	            
	            List<Song<Object>> rockSongs = SongVault.sortByTitle(SongVault.filterByGenre(songs, "Rock"));
	            rockSongs.forEach(System.out::println);

	        } 
	        
	        catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }
}
