package com.corejava.collection;

import java.util.HashMap;
import java.util.ListIterator;
import java.util.Set;

public class HashMapProgram {

    public static void main(String[] args) {


        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(5, "john");
        hashMap.put(4, "alic");
        hashMap.put(3, "smith");
        hashMap.put(2, "peter");
        hashMap.put(1, "harry");
        hashMap.put(6, "ron");

        System.out.println(hashMap.get(3));
        System.out.println("********");
        System.out.println(hashMap);

        System.out.println("********");
        Set<Integer> set = hashMap.keySet();
        System.out.println(set);
        System.out.println(hashMap.values());





    }
}
