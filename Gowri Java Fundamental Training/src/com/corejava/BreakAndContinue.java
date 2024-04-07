package com.corejava;

public class BreakAndContinue {

    public static void main(String[] args) {

        for (int i = 1; i < 51; i++) {

            if ((i%3==0)&&(i%5==0)) {
                System.out.println("Hello World");
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("World");
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("Hello");
                continue;
            }
            if (i == 31) {
                break;
            }
            System.out.println(i);

        }
    }
}
