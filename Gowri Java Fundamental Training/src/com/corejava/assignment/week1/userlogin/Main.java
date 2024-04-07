package com.corejava.assignment.week1.userlogin;

import java.util.Scanner;

import static com.corejava.assignment.week1.userlogin.LoginService.loginService;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        UserProfile james = new UserProfile("007", "James Bond");
        UserProfile harry = new UserProfile("wizard", "Harry Potter");
        UserProfile peter = new UserProfile("spiderman", "James Bond");

        System.out.println("Please provide login details to proceed." +
                "\nUsername: ↩ (Hint: \"007\", \"wizard\", \"spiderman\")");
        String enterUsername = input.next();

        System.out.println("Password: ↩ (Hint: default password is password)");
        String enterPassword = input.next();

        loginService.isLoginSuccessful(enterUsername, enterPassword);

    }
}
