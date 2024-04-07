package com.corejava.java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MethodReferenceProgram {

    static int comparing(Integer a, Integer b) {
        return Integer.compare(a, b);
    }

    public static void main(String[] args) {

        System.out.println(comparing(5, 3));
        System.out.println(comparing(6, 3));
        System.out.println(comparing(5, 5));
        System.out.println(comparing(1, 3));

        Comparator<Integer> lambdaComparator = MethodReferenceProgram::comparing;
        System.out.println("lambdaComparator: " + comparing(10,20));

        Comparator<Integer> methodReferencing = MethodReferenceProgram::comparing;
//        System.out.println("MethodReference " + methodReferencing.comparing(5,5));







    }


}
