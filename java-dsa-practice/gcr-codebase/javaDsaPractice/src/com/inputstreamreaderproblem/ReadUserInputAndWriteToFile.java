package com.inputstreamreaderproblem;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReadUserInputAndWriteToFile {

	    public static void main(String[] args) {

	        String fileName = "output.txt";

	        try {
	            //Read user input
	            InputStreamReader isr = new InputStreamReader(System.in);
	            BufferedReader br = new BufferedReader(isr);

	            //FileWriter to write to file
	            FileWriter fw = new FileWriter(fileName, true); 

	            String input;

	            System.out.println("Enter text to write to file (or type 'exit' to stop):");

	            //Read input until "exit"
	            while (true) {
	                input = br.readLine();

	                if (input.equalsIgnoreCase("exit")) {
	                    break;
	                }

	                //Write input to file
	                fw.write(input + "\n");
	            }

	            //Close resources
	            fw.close();
	            br.close();

	            System.out.println("User input has been written to " + fileName);

	        } 
	        catch (IOException e) {
	            System.out.println("Error occurred: " + e.getMessage());
	        }
	    }
	}
