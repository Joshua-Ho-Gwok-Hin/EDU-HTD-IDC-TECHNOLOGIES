package com.corejava.exceptionhandling;

public class MyTestPassword {

    public static void main(String[] args) {

        MyPasswordVerification myCheckPassword = new MyPasswordVerification();

        try {
            myCheckPassword.verifyPassword("john123");

        } catch (MyPasswordVerification myPasswordVerification) {
            System.out.println("Enter 8 character");
        }

    }
}
