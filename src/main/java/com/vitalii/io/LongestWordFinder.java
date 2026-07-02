package com.vitalii.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWordFinder {
    static void main(String[] args) {
        // Specify the path to your text file
        File file = new File("sample.txt");

        try {
            String longestWord = findLongestWord(file);

            if (!longestWord.isEmpty()) {
                System.out.println("The longest word is: " + longestWord);
                System.out.println("Length: " + longestWord.length() + " characters");
            } else {
                System.out.println("The file is empty or contains no words.");
            }

        } catch (FileNotFoundException e) {
            System.err.println("Error: The file '" + file.getName() + "' could not be found.");
        }
    }

    /**
     * Reads a file and returns the longest word found.
     */
    public static String findLongestWord(File file) throws FileNotFoundException {
        String longestWord = "";

        // Use try-with-resources to automatically close the scanner
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String currentWord = scanner.next();

                // Optional: Clean up punctuation (e.g., "word," becomes "word")
                currentWord = currentWord.replaceAll("[^a-zA-Z0-9]", "");

                // Track the word with the maximum length
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }
            }
        }

        return longestWord;
    }
}