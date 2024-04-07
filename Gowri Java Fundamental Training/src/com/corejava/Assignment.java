package com.corejava;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
        int a, var;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        a = scanner.nextInt();
        System.out.println("Enter the value of var ");
        var = scanner.nextInt();
        var += a;
        System.out.println("com.corejava.Assignment = " + var);
        var *= a;
        System.out.println("com.corejava.Assignment = " + var);
        var /= a;
        System.out.println("com.corejava.Assignment = " + var);
        var %= a;
        System.out.println("com.corejava.Assignment = " + var);
        var -= a;

    }



}
