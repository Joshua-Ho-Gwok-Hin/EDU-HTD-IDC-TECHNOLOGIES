package com.corejava.exceptionhandling;

public class MyPasswordVerification extends RuntimeException{

    public void verifyPassword(String password) throws MyPasswordVerification {

        if (password.length() < 8) {
            MyPasswordVerification myPasswordValidation = new MyPasswordVerification();
            throw myPasswordValidation;
        } else {
            System.out.println("Correct password");
        }

    }
}
