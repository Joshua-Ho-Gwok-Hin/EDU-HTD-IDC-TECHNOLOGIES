package com.corejava;

class Parent {
    void printData() {
        System.out.println("Method of parent class");
    }
}

class Child extends Parent {

    @Override
    void printData() {
        System.out.println("Method of child class");
    }
}

public class UpAndDownCasting {

    public static void main(String[] args) {

        Parent parentClass = new Child();
        parentClass.printData();

    }
}
