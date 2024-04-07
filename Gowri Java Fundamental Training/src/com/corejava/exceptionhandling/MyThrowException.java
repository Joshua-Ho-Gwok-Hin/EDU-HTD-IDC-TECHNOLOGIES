package com.corejava.exceptionhandling;

public class MyThrowException {

    public int division(int a, int b) throws ArithmeticException {
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {
        MyThrowException throwExcept = new MyThrowException();

        try {
            int result2 = throwExcept.division(100, 20);

        } catch (MyExceptionProgram exceptionProgram) {
            System.out.println("worng");
        }
    }
}