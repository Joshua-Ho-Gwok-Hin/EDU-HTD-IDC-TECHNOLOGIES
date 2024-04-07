package com.corejava;

import java.util.Optional;
import java.util.function.Supplier;

public class NullPointerExceptionProgram {

    public static void main(String[] args) {

        String s = "";
        System.out.println(s);

        Optional<String> b = Optional.ofNullable("java8");
        System.out.println(b.get());

        Optional<String> b1 = Optional.ofNullable(null);
        System.out.println("is present " + b.isPresent());

        Optional<String> a = Optional.empty();
        System.out.println(a);

        Optional<String> c = Optional.of(null);
        System.out.println(c);

        Optional<String> user = Optional.of("sdsadsd");
        user = Optional.empty();

        Supplier<String> supplier = () -> "abcdef";
        System.out.println();
    }

}
