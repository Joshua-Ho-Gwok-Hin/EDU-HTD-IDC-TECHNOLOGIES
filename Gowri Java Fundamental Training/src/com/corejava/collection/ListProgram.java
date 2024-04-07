package com.corejava.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListProgram {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();
        queue.add("Apple");
        queue.add("Mango");
        queue.add("Banana");
        queue.add("Coconut");
        queue.add("Grape");
        queue.add("Strawberry");
        queue.add("Durian");
        queue.add("Pear");
        queue.add("Melon");
        System.out.println("queue size = "+ queue.size());
        System.out.println("queue.contains(\"Apple\") = " + queue.contains("Apple"));
        System.out.println(queue.toString());
        queue.clear();
        System.out.println(queue.toString());




//        List<String> list = new ArrayList<String>();
//        list.add("Zero");
//        list.add("One");
//        list.add("Two");
//        list.add("Three");
//        list.add("Four");
//        System.out.println("Built-in toString() = " + list.toString());
//
//        list.add(1,"InsertA");
//        list.add(3,"InsertB");
//        list.add(5,"InsertC");
//        list.add(7,"Insertd");
//        System.out.println("Built-in toString()= " + list.toString());
//
//        System.out.println(list.get(0)+ " " +
//                list.get(1)+ " " +
//                list.get(2)+ " " +
//                list.get(3)+ " " +
//                list.get(4)+ " " +
//                list.get(5));
//
//        for (String each : list) {
//            System.out.println("For Each Loop = " + each);
//        }
    }
}
