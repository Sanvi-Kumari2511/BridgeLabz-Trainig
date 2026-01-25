package com.javajunit.basicproblems.filehandlingtesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class FileProcessorTest {
	private final String fileName = "testfile.txt";
    private final String content = "JUnit File Handling Test";

    //Testing writing and reading file content
    @Test
    void testWriteAndReadFile() throws IOException {

        FileProcessor.writeToFile(fileName, content);
        String readData = FileProcessor.readFromFile(fileName);

        assertEquals(content, readData);
    }

    //Test if file exists after writing
    @Test
    void testFileExistsAfterWrite() throws IOException {

        FileProcessor.writeToFile(fileName, content);
        File file = new File(fileName);

        assertTrue(file.exists());
    }

    //Test exception when file does not found
    @Test
    void testReadFileNotFound() {

        assertThrows(IOException.class, () -> {
            FileProcessor.readFromFile("nofile.txt");
        });
    }

    //Clean after each test
    @AfterEach
    void deleteFile() {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
    }
}
