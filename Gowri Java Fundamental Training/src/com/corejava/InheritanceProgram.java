package com.corejava;

public class InheritanceProgram {

    public static void main(String[] args) {
        PrintResult print = new PrintResult();
        print.addition(25,5);
        print.division(25,5);
        print.multiply(25,5);
        print.subtract(25,5);
    }
}

class PrintResult extends CalculationFunctions {
    // Empty Class
}

abstract class CalculationFunctions implements Addition, Division, Multiplication, Subtraction {

    @Override
    public void addition(double i, double j) {
        System.out.println("com.corejava.Addition = " + (i+j));
    }

    @Override
    public void division(double i, double j) {
        System.out.println("com.corejava.Division = " + (i/j));

    }

    @Override
    public void multiply(double i, double j) {
        System.out.println("com.corejava.Multiplication = " + (i*j));

    }

    @Override
    public void subtract(double i, double j) {
        System.out.println("com.corejava.Subtraction = " + (i-j));

    }
}

interface Addition {
    void addition(double i, double j);
}

interface Division {
    void division(double i, double j);
}

interface Multiplication {
    void multiply(double i, double j);
}

interface Subtraction {
    void subtract(double i, double j);
}

