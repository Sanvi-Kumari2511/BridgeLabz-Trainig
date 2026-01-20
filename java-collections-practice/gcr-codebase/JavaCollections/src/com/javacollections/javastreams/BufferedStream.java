package com.javacollections.javastreams;

import java.io.*;

public class BufferedStream {
	public static void main(String[] args) {

        //Source and destination files
        String sourceFile = "largefile.txt";       
        String destFileUnbuffered = "copy_unbuffered.txt";
        String destFileBuffered = "copy_buffered.txt";

        //Size of chunk
        int bufferSize = 4096; 

        
        //Unbuffered File Copy
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFileUnbuffered)) {

            long start = System.nanoTime(); 

            byte[] buffer = new byte[bufferSize];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            long end = System.nanoTime(); 
            System.out.println("Unbuffered copy completed in " + (end - start) / 1_000_000 + " ms");

        }
        
        catch (IOException e) {
            System.out.println("Error in unbuffered copy: " + e.getMessage());
        }

       
        //Buffered File Copy
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFileBuffered))) {

            long start = System.nanoTime(); 

            byte[] buffer = new byte[bufferSize];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            bos.flush(); 

            long end = System.nanoTime();
            System.out.println("Buffered copy completed in " + (end - start) / 1_000_000 + " ms");

        } 
        
        catch (IOException e) {
            System.out.println("Error in buffered copy: " + e.getMessage());
        }
    }
}
