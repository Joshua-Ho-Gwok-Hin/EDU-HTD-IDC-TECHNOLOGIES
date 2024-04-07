package com.corejava.java8;

import java.util.concurrent.Callable;

public class LambdaExpressionProgram {

    public static void main(String[] args) throws Exception{


        final int val = 10;
        Callable<Integer> callable = new Callable<>() {
            @Override
            public Integer call() throws Exception {
                return (val);
            }
        };


        Callable<Integer> c1 = () -> {return 2* val;};
        System.out.println(c1.call());

    }
}