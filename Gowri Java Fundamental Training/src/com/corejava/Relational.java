package com.corejava;

import java.util.Scanner;

public class Relational {

    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("The value of a and b");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Equal=" + (a == b));
        System.out.println("Greater=" + (a > b));
        System.out.println("Lesser=" + (a < b));
        System.out.println("Greater or equal =" + (a >= b));
        System.out.println("Lesser or equal =" + (a <= b));
        System.out.println("Not Equal=" + (a != b));
    }
}
