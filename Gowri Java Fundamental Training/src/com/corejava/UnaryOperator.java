package com.corejava;

public class UnaryOperator {

    public static void main(String[] args) {
        int a=6, incrementExample;
        int b=8, decrementExample;

        incrementExample = a++;
        System.out.println("before post-increment, value of a = " + incrementExample);

        incrementExample = a;
        System.out.println("after post incremented, value of a = " + incrementExample);

        incrementExample = ++a;
        System.out.println("pre-incremented, value of a = " + incrementExample);

        decrementExample = b--;
        System.out.println("before post-decrement, value of b = " + decrementExample);

        decrementExample = b;
        System.out.println("after post-decremented, value of b = " + decrementExample);

        decrementExample = --b;
        System.out.println("pre-decremented, value of b = " + decrementExample);

    }
}
