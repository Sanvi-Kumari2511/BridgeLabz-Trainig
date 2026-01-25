package com.javajunit.basicproblems.filehandlingtesting;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileProcessor {
	
	//Writes content to a file
    public static void writeToFile(String filename, String content) throws IOException {
        FileWriter writer = new FileWriter(filename);
        writer.write(content);
        writer.close();
    }

    //Reads content from a file
    public static String readFromFile(String filename) throws IOException {
        return Files.readString(Path.of(filename));
    }
}
