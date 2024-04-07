package com.corejava;

import java.util.List;
import java.util.stream.Collectors;

public class StringMethodProgram {

    public static void main(String[] args) {

        String s1 = "";
        String s2 = "   ";
        String s3 = "   java program    ";
        System.out.println("s1 is blank " + s1.isBlank());
        System.out.println("s2 is blank " + s2.isBlank());
        System.out.println("Repeat " + s3.repeat(5));

        System.out.println("$" + s3 + "$");
        System.out.println("$" + s3.stripLeading() + "$");
        System.out.println("$" + s3.stripTrailing() + "$");
        System.out.println("$" + s3.strip() + "$");

        String s4 = "This\nis\na\njava";
        List<String> stringList = s4.lines().toList();
        System.out.println(s4);
        System.out.println(stringList);

    }
}
