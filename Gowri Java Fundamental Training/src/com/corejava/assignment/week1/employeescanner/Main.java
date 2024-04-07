package com.corejava.assignment.week1.employeescanner;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Company abc = new Company();

    public static void main(String[] args) {

        abc.addEmployee("John",5000d);
        abc.addEmployee("Peter", 5000d);
        abc.addEmployee("Mark", 3000d);
        abc.addEmployee("Jason", 4000d);
        abc.addEmployee("Kate",5000d);
        abc.addEmployee("Kelly", 5000d);
        abc.addEmployee("Joanne", 3000d);
        abc.addEmployee("Smith", 4000d);
        startup();
    }

    static void startup() {
        Company company = new Company();

        System.out.println("\n" + company.getName());
        System.out.println("Welcome to Employee Management System");
        printMenu();
        boolean quit = false;

        while (!quit) {

            int userInput = scanner.nextInt();
            scanner.nextLine();

            switch (userInput) {
                case 1 -> searchEmployee();
                case 2 -> printMenu();
                case 0 -> {
                    System.out.println("Shutting down...");
                    quit = true;
                }
            }
        }

    }

    static void printMenu() {
        System.out.println("""
                Administrator Menu
                0. Shut down
                1. Search Employee ID
                2. Print Menu
                """);
    }

    static void searchEmployee() {
        boolean exit = false;
        while (!exit) {
            System.out.println("You are now at Submenu Employee ID Search" +
                    "Enter 0 to Quit. " +
                    "Enter Employee ID to get details:");
            int hello = scanner.nextInt();

            if ((hello == 0) || (abc.getEmployees().size() < hello)) {
                System.out.println("You have entered 0 or invalid employee ID number. Exiting to main menu...");
                printMenu();
                exit = true;
            } else {
                System.out.println("Name : " + abc.getEmployees().get(hello - 1).getName());
                System.out.println("ID : " + abc.getEmployees().get(hello - 1).getId());
                System.out.println("Salary :  $" + abc.getEmployees().get(hello - 1).getSalary() + ".00");
            }

        }
    }
}
