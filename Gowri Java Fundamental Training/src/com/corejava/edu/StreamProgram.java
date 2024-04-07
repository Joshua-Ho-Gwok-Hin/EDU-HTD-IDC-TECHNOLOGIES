package com.corejava.edu;

import java.util.ArrayList;
import java.util.List;

public class StreamProgram {

    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();
        list.add("Singapore");
        list.add("UK");
        list.add("US");
        list.add("France");

        list.forEach(System.out::println);

    }
}
