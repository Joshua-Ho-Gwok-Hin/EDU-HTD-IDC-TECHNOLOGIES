package com.corejava.AbstractClass;

public class FourWheelDrive extends Car {

    public FourWheelDrive(String name, int drive) {
        super(name, drive);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getDrive() {
        return super.getDrive();
    }


    public static void main(String[] args) {

        Car world = new FourWheelDrive("four", 4);
        System.out.println(world.getName());

    }
}
