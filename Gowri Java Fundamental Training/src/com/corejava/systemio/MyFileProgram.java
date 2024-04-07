package com.corejava.systemio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class MyFileProgram {

    public static void main(String[] args) throws IOException {

//        MyFileProgram myFileProgram = new MyFileProgram();
        Properties properties = new Properties();

        FileInputStream fileInputStream = new FileInputStream("D://Desktop/fileInputStreamTest.txt");
        properties.load(fileInputStream);
        System.out.println(properties);
        System.out.println(properties.getProperty("cake"));
        System.out.println(properties.setProperty("cake", "10"));
        System.out.println(properties.setProperty("coconut", "10"));
        System.out.println(properties.setProperty("chocolate", "10"));
        System.out.println(properties.put("tea", "10"));
        System.out.println(properties.put("apple", "10"));
        System.out.println(properties.put("orange", "10"));
        System.out.println(properties.put("pear", "10"));
        System.out.println(properties);

        FileOutputStream fileOutputStream = new FileOutputStream("D://Program Files/IdeaProjects/IDC/src/com/corejava/systemio/updated.txt");
        properties.store(fileOutputStream,"updated list");


    }
}
