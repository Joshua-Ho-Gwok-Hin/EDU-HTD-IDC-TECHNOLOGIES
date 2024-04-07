package com.corejava.collection;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListProgram {

    public static void main(String[] args) {


        LinkedList abc = new LinkedList();
        Object abc1 = new LinkedList();
        abc.add('e');
        abc.add("OOPS");
        abc.add(10);
        System.out.println(abc);
        System.out.println("*********");
        System.out.println(abc.toArray());
        System.out.println("*********");

        abc1 = (LinkedList) abc.clone();
        System.out.println(abc1);
    }
}
