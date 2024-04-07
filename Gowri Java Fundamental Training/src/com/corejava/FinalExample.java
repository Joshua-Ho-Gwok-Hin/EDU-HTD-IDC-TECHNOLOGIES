package com.corejava;

public class FinalExample extends Test{

    final int speedLimit = 60;

    @Override
    void show() {
        super.show();
        System.out.println("OverWritten Java");;
    }

    void controlSpeed() {
        System.out.println(speedLimit);
    }

    public static void main(String[] args) {
        FinalExample finalExample = new FinalExample();
        finalExample.controlSpeed();
        finalExample.show();

    }
}

class Test {
    void show() {
        System.out.println("Java Program");
    }
}