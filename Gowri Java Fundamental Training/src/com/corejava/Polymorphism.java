package com.corejava;

public class Polymorphism {

    public static void main(String[] args) {

        MethodOverloading testMethod = new MethodOverloading();
        testMethod.display('A');
        testMethod.display('A', 20);
        testMethod.display(7,"James", 99 );

        Vehicle toyota = new Toyota();
        toyota.travel(250);
    }
}

class MethodOverloading {

    public void display(char character) {
        System.out.println(character);
    }

    public void display(char character, int number) {
        System.out.println(character + " " + number);
    }

    public void display(int id, String name, int mark) {
        System.out.println("ID = " + id + ", Name = " + name + ", Mark = " + mark);
    }
}

abstract class Vehicle {
    public void travel(int speed) {
        System.out.println("com.corejava.Vehicle is travelling at " + speed + " km/h");
    }
}

class Toyota extends Vehicle{
    @Override
    public void travel(int speed) {
        super.travel(speed);
        System.out.println("This com.corejava.Toyota top speed is " + speed + " km/h");
    }
}