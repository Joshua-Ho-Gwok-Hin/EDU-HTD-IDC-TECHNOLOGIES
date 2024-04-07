package com.corejava;

import java.util.Arrays;
import java.util.List;

public class ArrayProgram {
    public static void main(String[] args) {

        List<String> list = List.of("john", "stephen", "martin");
        String[] stringArray = list.toArray(new String[list.size()]);

        System.out.println(Arrays.toString(stringArray));
        System.out.println(list.toString());

        String[] stringArray2 = list.toArray(String[]::new);
        System.out.println(Arrays.toString(stringArray2));

    }
}
