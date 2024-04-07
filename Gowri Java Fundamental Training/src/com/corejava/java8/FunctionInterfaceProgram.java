package com.corejava.java8;

import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.*;



public class FunctionInterfaceProgram {

    public static void main(String[] args) {

//        Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
//        consumer.accept("consumer: lower case");
//
//        Consumer<String> consumer1 = (s) -> System.out.println(s.toLowerCase());
//        consumer1.accept("CONSUMER1: UPPER CASE");

//        consumer.andThen(consumer1).accept("java");

        String name = "java program";
        Supplier<Boolean> supplier1 = () -> name.length() ==10;
        Supplier<Integer> supplier2 = () -> name.length();
        Supplier<String> supplier3 = () -> name.toUpperCase();

        Supplier<Boolean> supplier4 = () -> name.length() ==10;
        Supplier<Integer> supplier5 = name::length;
        Supplier<String> supplier6 = name::toUpperCase;

//        BiFunction<String,String,String> biFunction1 = () ->

        System.out.println(supplier1.get());
        System.out.println(supplier2.get());
        System.out.println(supplier3.get());

        System.out.println(supplier4.get());
        System.out.println(supplier5.get());
        System.out.println(supplier6.get());




    }
}
