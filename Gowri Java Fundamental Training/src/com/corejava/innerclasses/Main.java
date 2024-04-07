package com.corejava.innerclasses;

import com.corejava.innerclasses.OuterClass.InnerPublic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;


public class Main {

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        InnerPublic innerPublic = outerClass.new InnerPublic();

        outerClass.outerPublic();
        innerPublic.innerPublicPublic();

        System.out.println(OuterClass.class.isNestmateOf(InnerPublic.class));
        System.out.println(InnerPublic.class.getNestHost());
        System.out.println(Arrays.toString(OuterClass.class.getNestMembers()));
//        Set<String> stringSet = Arrays.stream(InnerPublic.class.getNestMembers());
//                        .map((Class::getName))
//                .collect(Collections.toSet());
//        System.out.println(stringSet);

        outerClass.outerPublic();
        OuterClass.outerPublicStatic();

        innerPublic.innerPublicPublic();
        InnerPublic.innerPublicPublicStatic();





    }


}
