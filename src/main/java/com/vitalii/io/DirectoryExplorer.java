package com.vitalii.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Lists all files and directories in a specified directory.
 */
public class DirectoryExplorer {
    static void main(String[] args) {
        Path path = Paths.get("/");

        try (Stream<Path> stream = Files.list(path)) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
