package com.corejava.AbstractClass;

public abstract class Car {

    private String name;
    private int drive;

    public Car(String name, int drive) {
        this.name = name;
        this.drive = drive;
    }


    public String getName() {
        return name;
    }

    public int getDrive() {
        return drive;
    }
}
