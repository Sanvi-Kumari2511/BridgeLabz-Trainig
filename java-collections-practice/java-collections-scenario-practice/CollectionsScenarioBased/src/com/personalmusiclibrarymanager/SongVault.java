package com.personalmusiclibrarymanager;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class SongVault {
	
	 //Regex patterns to get song fields
    private static final Pattern TITLE_PATTERN = Pattern.compile("^Title:\\s*(.*)$");
    private static final Pattern ARTIST_PATTERN = Pattern.compile("^Artist:\\s*(.*)$");
    private static final Pattern DURATION_PATTERN = Pattern.compile("^Duration:\\s*(.*)$");
    private static final Pattern GENRE_PATTERN = Pattern.compile("^Genre:\\s*(.*)$");

    //Reads all song files from a folder and returns list of Song objects
    public static <T> List<Song<T>> loadSongs(String folderPath) throws IOException {
        List<Song<T>> songs = new ArrayList<>();

        //List .txt files 
        Files.list(Paths.get(folderPath)).filter(f -> f.toString().endsWith(".txt")).forEach(file -> {
                	
                    try (BufferedReader br = new BufferedReader(new FileReader(file.toFile()))) {
                        String title = "", artist = "", duration = "", genre = "";
                        String line;
                        
                        while ((line = br.readLine()) != null) {
                            Matcher m;
                            if ((m = TITLE_PATTERN.matcher(line)).matches()) title = m.group(1);
                            
                            else if ((m = ARTIST_PATTERN.matcher(line)).matches()) artist = m.group(1);
                            
                            else if ((m = DURATION_PATTERN.matcher(line)).matches()) duration = m.group(1);
                            
                            else if ((m = GENRE_PATTERN.matcher(line)).matches()) genre = m.group(1);
                        }
                        
                        songs.add(new Song<>(title, artist, duration, genre, null));
                    }
                    
                    catch (IOException e) {
                        System.out.println("Error reading file: " + file);
                    }
                });

        return songs;
    }

    //Song group by generic
    public static <T> Map<String, List<Song>> groupByGenre(List<Song<T>> songs) {
        return songs.stream().collect(Collectors.groupingBy(Song::getGenre));
    }

    //Get unique artists
    public static <T> Set<String> uniqueArtists(List<Song<T>> songs) {
        return songs.stream().map(Song::getArtist).collect(Collectors.toSet());
    }

    //Filter songs by genre
    public static <T> List<Song<T>> filterByGenre(List<Song<T>> songs, String genre) {
        return songs.stream().filter(s -> s.getGenre().equalsIgnoreCase(genre)).collect(Collectors.toList());
    }

    //Sort songs by title
    public static <T> List<Song<T>> sortByTitle(List<Song<T>> songs) {
        return songs.stream().sorted(Comparator.comparing(Song::getTitle)).collect(Collectors.toList());
    }

	public static List<Song<Object>> loadSongs11(String folderPath) {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<Song<Object>> loadSongs1(String folderPath) {
		// TODO Auto-generated method stub
		return null;
	}
}
