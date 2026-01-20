package com.javacollections.javastreams;

import java.io.*;

public class ConvertImageToByteArray {
	
	    public static void main(String[] args) {

	        //Original image file
	        String sourceImage = "original_image.jpg";  
	        //New image file to write bytes back
	        String newImage = "copied_image.jpg";        

	        try {
	            
	            //Read original image into byte array
	           
	            File file = new File(sourceImage);
	            FileInputStream fis = new FileInputStream(file);

	            //Create byte array same size as file
	            byte[] imageBytes = new byte[(int) file.length()];

	            // Read the image into the byte array
	            fis.read(imageBytes);
	            fis.close();

	            System.out.println("Image read into byte array successfully.");

	            
	            //Use ByteArrayInputStream and ByteArrayOutputStream
	            
	            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
	            ByteArrayOutputStream baos = new ByteArrayOutputStream();

	            byte[] buffer = new byte[1024]; // Read/write in 1 KB chunks
	            int bytesRead;

	            while ((bytesRead = bais.read(buffer)) != -1) {
	                baos.write(buffer, 0, bytesRead);
	            }

	            bais.close();

	            //Get final byte array from ByteArrayOutputStream
	            byte[] finalBytes = baos.toByteArray();
	            baos.close();

	          
	            //Write byte array back to new image file
	            
	            FileOutputStream fos = new FileOutputStream(newImage);
	            fos.write(finalBytes);
	            fos.close();

	            System.out.println("New image file created successfully: " + newImage);

	        } 
	        
	        catch (IOException e) {
	            System.out.println("Error occurred: " + e.getMessage());
	        }
	  }
}


