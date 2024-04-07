package com.corejava;

public abstract class Calculator {

    abstract double add(double i, double j);
    abstract double minus(double i, double j);
    abstract double multiply(double i, double j);
    abstract double divide(double i, double j);

    public static void main(String[] args) {

        Calculate compute = new Calculate();
        double result = compute.add(21d,7d);
        System.out.println(result);

        result = compute.minus(21d,7d);
        System.out.println(result);

        result = compute.multiply(21d,7d);
        System.out.println(result);

        result = compute.divide(21d,7d);
        System.out.println(result);

    }
}


//888888888888888888888888888888888888888888888888888888

class Calculate extends Calculator {

    @Override
    public double add(double i, double j) {
        return i+j;
    }

    @Override
    public double minus(double i, double j) {
        return i - j;
    }

    @Override
    public double multiply(double i, double j) {
        return i*j;
    }

    @Override
    public double divide(double i, double j) {
        return i/j;
    }
}


