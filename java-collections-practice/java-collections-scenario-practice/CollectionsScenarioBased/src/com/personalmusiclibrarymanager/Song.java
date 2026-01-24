package com.personalmusiclibrarymanager;

import java.util.Objects;

public class Song<T> {
	
	private String title;
    private String artist;
    private String duration;
    private String genre;
    private T mediaType; 

    //Constructor to initialize the song's details
    public Song(String title, String artist, String duration, String genre, T mediaType) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
        this.mediaType = mediaType;
    }

    // Getter methods to get inputs
    public String getTitle() { 
    	return title;
    	}
    
    public String getArtist() { 
    	return artist;
    	}
    
    public String getDuration() {
    	return duration; 
    	}
    
    public String getGenre() {
    	return genre; 
    	}
    public T getMediaType() {
    	return mediaType; 
    	}

    //Override equals and hashCode for Set operations
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        
        if (!(obj instanceof Song)) return false;
        Song<?> song = (Song<?>) obj;
        
        return Objects.equals(title, song.title) && Objects.equals(artist, song.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist);
    }

    @Override
    public String toString() {
        return title + " by " + artist + " [" + duration + "] Genre: " + genre;
    }
}
