package com.javareflection.intermediatelevel;

public class Configuration {
	 //Private static field
    private static String API_KEY = "DEFAULT_KEY";

    //Method to display API key
    public static void showKey() {
        System.out.println("API Key: " + API_KEY);
    }
}
