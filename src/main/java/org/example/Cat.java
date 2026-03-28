package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Cat {
    public static void printCat() {
        System.out.println("Hello cat!");
    }

    public static void printLittleCat() {
        System.out.println("Bye, little cat!");
    }

    public static void printBigCat() {
        System.out.println("Bye, big cat!");
    }

    public static void readMeFile(String path){
        if(path.equals("hello.txt")){
            System.out.println("You can't read this file!!!");
            return;
        }

        Path filePath = Paths.get(path); // Ensure "example.txt" is in the project root

        try {
            // Read the entire file content into a string
            String content = Files.readString(filePath);

            // Display the file's contents
            System.out.println("Full file content:");
            System.out.println(content);
        } catch (IOException e) {
            // Handle exceptions, e.g., if the file is not found
            e.printStackTrace();
        }
    }
}