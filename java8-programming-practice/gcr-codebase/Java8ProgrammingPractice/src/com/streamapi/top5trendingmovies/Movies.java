package com.streamapi.top5trendingmovies;

public class Movies {
	String name;
    double rating;
    int year;

    //Constructor to initialize movie details
    public Movies(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    //Converts Movies object to readable text
    @Override 
    public String toString() {
        return "Movies: " + name +
               "\nRating: " + rating +
               "\nYear: " + year + 
               "\n";
    }
}
