package com.corejava.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyExceptionProgram extends RuntimeException{

    public static void main(String[] args) {

        int[] errorArray = {0, 1, 2, 3, 4, 5};
        try {
            System.out.println(errorArray[0]);
            System.out.println(errorArray[1]);
            System.out.println(errorArray[2]);
            System.out.println(errorArray[3]);
            System.out.println(errorArray[4]);
            System.out.println(errorArray[5]);
            System.out.println(errorArray[6]);

        } catch (ArrayIndexOutOfBoundsException message) {
            System.out.println("errorArray only up to index 5. (0,1,2,3,4,5)");
        }finally {
            System.out.println("Time to close");
        }

        MyExceptionProgram exceptionProgram = new MyExceptionProgram();
        exceptionProgram.division();
    }

    public void division(){

        int num1, num2, result;
        System.out.println("Enter num1 and num2");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        result = num1/num2;
        if ((num1 == 0)||(num2==0)) {
            System.out.println("no zero please!!!");
        }

        try {

            num1 = scanner.nextInt();
            num2 = scanner.nextInt();

            result = num1 / num2;
            System.out.println("num1 / num2 = " + result);

        } catch (ArithmeticException | InputMismatchException error) {
            System.out.println("Please do not enter 0.");
            division();
        }



    }

}
