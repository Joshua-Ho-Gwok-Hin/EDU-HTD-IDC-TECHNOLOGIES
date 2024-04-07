package com.corejava.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetProgram {

    public static void main(String[] args) {

        int[] someArray = {23, 24, 56, 23, 89, 37, 56};
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> set1 = new HashSet<Integer>();

        try {
            for (int i = 0; i < someArray.length; i++) {
                set.add(someArray[i]);
            }
            System.out.println(set);
        } catch (Exception e) {
            System.out.println("Error");
        }

        System.out.println("***********");



        try {
            for (int k : someArray) {
                set1.add(k-1);
            }
            System.out.println(set1);
        } catch (Exception e) {
            System.out.println("Error");
        }

        System.out.println("***********");

        System.out.println(Arrays.toString(someArray));


    }
}
