package com.javajunit.basicproblems.beforeafterannotationtesting;

public class DatabaseConnection {
	private boolean connected = false;

    //Method to connect database
    public void connect() {
        connected = true;
        System.out.println("Database connected");
    }

    //Method to disconnect database
    public void disconnect() {
        connected = false;
        System.out.println("Database disconnected");
    }

    //Method to verify connection
    public boolean isConnected() {
        return connected;
    }
}
