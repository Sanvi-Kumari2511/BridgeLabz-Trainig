package com.streamapi.top5trendingmovies;

import java.util.ArrayList;
import java.util.List;

public class MoviesApp {
	public static void main(String[] args) {

		//Creating a list of movies
        List<Movies> movies = new ArrayList<>();

        movies.add(new Movies("Movie 1", 4.8, 2024));
        movies.add(new Movies("Movie 2", 4.2, 2023));
        movies.add(new Movies("Movie 3", 4.9, 2025));
        movies.add(new Movies("Movie 4", 3.9, 2022));
        movies.add(new Movies("Movie 5", 4.7, 2026));
        movies.add(new Movies("Movie 6", 4.6, 2025));
        movies.add(new Movies("Movie 7", 4.1, 2021));

        //Printing results
        System.out.println("Top 5 Trending Movies are:\n");

        movies.stream()
              .filter(m -> m.year >= 2023)
              .sorted((m1, m2) -> Double.compare(m2.rating, m1.rating))
              .limit(5)
              .forEach(m -> System.out.println(m));
    }
}
