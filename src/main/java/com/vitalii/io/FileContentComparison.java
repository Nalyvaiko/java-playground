package com.vitalii.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileContentComparison {
    public static void main(String[] args) {
        String file1Path = "file1.txt";
        String file2Path = "file2.txt";

        try {
            int comparisonResult = compareFileContents(file1Path, file2Path);
            System.out.println("Content comparison numeric result: " + comparisonResult);

            if (comparisonResult < 0) {
                System.out.println("file1.txt is lexicographically LESS than file2.txt");
            } else if (comparisonResult > 0) {
                System.out.println("file1.txt is lexicographically GREATER than file2.txt");
            } else {
                System.out.println("Both files have identical content.");
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the files: " + e.getMessage());
        }
    }

    public static int compareFileContents(String path1, String path2) throws IOException {
        try (BufferedReader reader1 = new BufferedReader(new FileReader(path1));
             BufferedReader reader2 = new BufferedReader(new FileReader(path2))) {

            String line1, line2;

            // Read both files line by line simultaneously
            while (true) {
                line1 = reader1.readLine();
                line2 = reader2.readLine();

                // Case 1: Both files reached EOF at the same time
                if (line1 == null && line2 == null) {
                    return 0;
                }
                // Case 2: File 1 is shorter than File 2 (EOF reached first)
                if (line1 == null) {
                    return -1;
                }
                // Case 3: File 2 is shorter than File 1 (EOF reached first)
                if (line2 == null) {
                    return 1;
                }

                // Case 4: Compare current lines lexicographically
                int diff = line1.compareTo(line2);
                if (diff != 0) {
                    return diff; // Return immediately at the first mismatch
                }
            }
        }
    }
}
