package com.corejava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileProgram {

    public static void main(String[] args){

        try {
            Path path = Paths.get("D://Program Files/IdeaProjects/IDC/src/com/corejava/testfile.txt");
            String data = Files.readString(path);
            System.out.println(data);





            path = Files.writeString(path,"I used to dream, I used to glance beyond the stars.\n" + data);
            String newData = Files.readString(path);
            System.out.println(newData);
//            path = Files.(path, "Now I dunno where we are, although I know!");
//            path = Files.writeString(path, "We've drifted far!");
//
//
//            String newData = Files.readString(path2);
//            System.out.println(newData);


        } catch (IOException e) {

            System.out.println(e.getMessage());
        }




    }
}
