package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
    Path path = FileSystems.getDefault().getPath("WorkingDirectory.txt");
    printFile(path);
    Path filepath = FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
    printFile(filepath);
    filepath = Paths.get("C:\\Users\\90531\\Desktop\\java\\OutThere.txt");
    printFile(filepath);
    filepath = Paths.get(".");
    System.out.println(filepath.toAbsolutePath());



    }
    private  static void printFile(Path path){
        try(BufferedReader fileReader = Files.newBufferedReader(path)){
            String line;
            while ((line = fileReader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
