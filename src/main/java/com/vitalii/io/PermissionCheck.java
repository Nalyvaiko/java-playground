package com.vitalii.io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PermissionCheck {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\Public\\Documents\\sample.txt");

        if (Files.exists(path)) {
            System.out.println("Path: " + path.toAbsolutePath());
            System.out.println("Readable: " + Files.isReadable(path));
            System.out.println("Writable: " + Files.isWritable(path));
        } else {
            System.out.println("Path does not exist.");
        }
    }
}
