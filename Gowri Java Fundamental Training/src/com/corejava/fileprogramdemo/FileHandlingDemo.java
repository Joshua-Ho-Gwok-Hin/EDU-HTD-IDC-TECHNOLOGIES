package com.corejava.fileprogramdemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingDemo {

    public static void main(String[] args) throws IOException {

        File fileObject = new File("D:\\Program Files\\IdeaProjects\\IDC\\src\\com\\corejava\\fileprogramdemo\\test.txt");
        if (fileObject.createNewFile()) {
            System.out.println("File :" + fileObject.getName());
        } else {
            System.out.println("File alredly exit");

        }

        try {
            FileWriter fileWriter = new FileWriter("D:\\Program Files\\IdeaProjects\\IDC\\src\\com\\corejava\\fileprogramdemo\\test.txt");
            fileWriter.write("TESTing a writing");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//            File fileObject1 = new File("D:\\Program Files\\IdeaProjects\\IDC\\src\\com\\corejava\\fileprogramdemo\\test.txt");
//            Scanner myReader = new Scanner(fileObject1);
//            while (myReader.hasNext()) {
//                String data = myReader.nextLine();
//                System.out.println(data);
//            }
//        }





    }

}
