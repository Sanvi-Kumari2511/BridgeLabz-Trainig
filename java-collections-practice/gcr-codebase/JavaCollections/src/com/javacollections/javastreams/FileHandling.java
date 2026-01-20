package com.javacollections.javastreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {
  public static void main(String args []) {
	  
	  //Source file path
      String sourceFile = "source.txt";
      
      //Destination file path
      String destinationFile = "destination.txt";
      
      FileInputStream fis = null;
      FileOutputStream fos = null;
      
      try {
    	  
      
          //FileInputStream: to read source file
          fis = new FileInputStream(sourceFile);
          
          //FileOutputStream: to write the destination file
          fos = new FileOutputStream(destinationFile);
          int data;
          
          
          while ((data = fis.read()) != -1) {
              fos.write(data); 
          }
          
          System.out.println("File copied successfully!");

     } 
      
      catch (IOException e) {
          System.out.println("Source file not found or error occurred.");
      } 
      
      finally {
          try {
              // Streams close karna zaroori hota hai
              if (fis != null) {
                  fis.close();
              }
              if (fos != null) {
                  fos.close();
              }
          } catch (IOException e) {
              System.out.println("Error while closing the file.");
          }
       }
      
   }
  
}
