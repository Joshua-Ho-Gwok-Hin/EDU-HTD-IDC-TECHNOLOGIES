package com.corejava;

public class MethodProgram {

    public int addNumber(int i, int j) {
        int sum = i+j;
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {

        MethodProgram testMethodOne = new MethodProgram();
        testMethodOne.addNumber(5, 6);

    }
}
