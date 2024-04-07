package com.corejava;

import java.util.Scanner;

public class FirstProgram {

    public static void main(String[] args) {

        int a, b, c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values of a and b");

        a= scanner.nextInt();
        b= scanner.nextInt();

        System.out.println("Addition " + (a + b));
        System.out.println("Subtraction " + (a - b));
        System.out.println("Multiply " + (a * b));
        System.out.println("Division " + (a / b));
        System.out.println("Remainder " + (a % b));

    }


}
