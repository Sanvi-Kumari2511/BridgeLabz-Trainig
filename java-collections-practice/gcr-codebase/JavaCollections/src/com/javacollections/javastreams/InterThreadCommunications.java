package com.javacollections.javastreams;

import java.io.*;

public class InterThreadCommunications {
	
	    public static void main(String[] args) {

	        try {
	        	
	            //Creating piped streams
	            PipedOutputStream pos = new PipedOutputStream();
	            PipedInputStream pis = new PipedInputStream(pos); // connect both

	            //Creating threads
	            Thread writerThread = new Thread(new Writer(pos));
	            Thread readerThread = new Thread(new Reader(pis));

	            //Start threads
	            writerThread.start();
	            readerThread.start();

	        } 
	        
	        catch (IOException e) {
	            System.out.println("Pipe connection error: " + e.getMessage());
	        }
	    }
	}

	// ---------------- WRITER THREAD ----------------
	class Writer implements Runnable {

	    private PipedOutputStream pos;

	    public Writer(PipedOutputStream pos) {
	        this.pos = pos;
	    }

	    //Override
	    public void run() {
	    	
	        try {
	        	
	            String message = "Hello from Writer Thread!";
	            pos.write(message.getBytes()); 
	            pos.close(); 
	        } 
	        
	        catch (IOException e) {
	            System.out.println("Writer error: " + e.getMessage());
	        }
	    }
	}

	// ---------------- READER THREAD ----------------
	class Reader implements Runnable {

	    private PipedInputStream pis;

	    public Reader(PipedInputStream pis) {
	        this.pis = pis;
	    }

	    //Override
	    public void run() {
	        try {
	            int data;
	            System.out.print("Reader received: ");

	            //Read until stream ends
	            while ((data = pis.read()) != -1) {
	                System.out.print((char) data);
	            }

	            pis.close();
	        } catch (IOException e) {
	            System.out.println("Reader error: " + e.getMessage());
	        }
      }
}
