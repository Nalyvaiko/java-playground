package com.vitalii.io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathCheckNIO {
    static void main() {
        // Define your pathname string here
        String pathname = "C:/";

        // Convert the string into a Path object
        Path path = Paths.get(pathname);

        // Check if the path exists first to avoid invalid conclusions
        if (Files.exists(path)) {
            if (Files.isDirectory(path)) {
                System.out.println(pathname + " is a directory.");
            } else if (Files.isRegularFile(path)) {
                System.out.println(pathname + " is a file.");
            } else {
                System.out.println(pathname + " exists but is neither a regular file nor a directory (e.g., symbolic link).");
            }
        } else {
            System.out.println("The specified pathname does not exist.");
        }
    }
}