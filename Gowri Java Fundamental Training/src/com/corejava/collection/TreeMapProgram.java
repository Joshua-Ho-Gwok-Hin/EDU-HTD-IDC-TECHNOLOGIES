package com.corejava.collection;


import java.util.TreeMap;

public class TreeMapProgram {

    public static void main(String[] args) {

        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(105, "Eunice");
        tm.put(102, "Peter");
        tm.put(103, "Kelly");
        tm.put(104, "Kate");
        tm.put(101, "Jason");
        tm.put(100, "Alice");

        System.out.println(tm);


    }
}
