package com.vitalii.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class GetFileModifiedDateNio {
    static void main(String[] args) {
        // Replace with your actual file path
        Path filePath = Paths.get("/");

        try {
            // Retrieve the last modified time
            FileTime fileTime = Files.getLastModifiedTime(filePath);

            // Convert FileTime to LocalDateTime using the system's default time zone
            LocalDateTime localDateTime = LocalDateTime.ofInstant(fileTime.toInstant(), ZoneId.systemDefault());

            // Format the date and time
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDate = localDateTime.format(formatter);

            System.out.println("Last Modified Date: " + formattedDate);

        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
