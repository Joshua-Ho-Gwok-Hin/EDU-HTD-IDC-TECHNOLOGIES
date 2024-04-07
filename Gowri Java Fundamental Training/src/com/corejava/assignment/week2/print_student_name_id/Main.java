package com.corejava.assignment.week2.print_student_name_id;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main extends InputMismatchException {

    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        Student john = new Student("John");
        Student peter = new Student("Peter");
        Student david = new Student("David");
        Student danny = new Student("Danny");
        Student mark = new Student("Mark");
        Student smith = new Student("Smith");
        start();
    }

    static void start() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        printMenu();

        while (!quit) {
            try {
                int menuOptions = scanner.nextInt();
                if (menuOptions < 0 || 3 < menuOptions) {
                    System.out.println("Invalid input...");
                    printMenu();
                }
                switch (menuOptions) {
                    case 1:
                        boolean exit = false;
                        while (!exit) {
                            System.out.println("Enter \"e\" to go back to main menu.");
                            System.out.println("Search student by name:");
                            String searchInput = scanner.next();
                            scanner.nextLine();
                            if (searchInput.equals("e")) {
                                System.out.println("-> back to main menu...\n");
                                exit = true;
                            } else
                                searchStudentId(searchInput);
                        }
                    case 2:
                        printMenu();
                        break;
                    case 3:
                        printOnlyName(students);
                        break;
                    case 0:
                        System.out.println("Quit - Shutting down...");
                        quit = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("This section only accept number inputs.");
                quit = true;
                start();
            }
        }
    }

    static void printOnlyName(ArrayList<Student> students) {
        System.out.println("\nList of Students: ");
        String[] nameArray = new String[students.size()];
        for (int i=0;i<students.size();i++) {
            nameArray[i] = students.get(i).getName();
            System.out.println("ID: " + (i+1)+ "\tName: "+ nameArray[i]);
        }
        System.out.println("Total number of students: "+ students.size());
        Object[] nameList = Arrays.stream(nameArray).toArray(); //**************************************
        System.out.println("\nResult in array: " + Arrays.toString(nameList));
    }

    static int searchStudentId(String name) {

        String lowerCase = name.toLowerCase();

        if (lowerCase.length() < 3 || 12 < lowerCase.length()) {
            System.out.println("Invalid name, please key between 3 to 12 letters.");
        } else {
            for (int i=0;i<students.size();i++) {
                Student findStudent = students.get(i);
                String foundLowerCase = findStudent.getName().toLowerCase();
                if (foundLowerCase.equals(lowerCase)) {
                    System.out.println("Found! ID:  " + findStudent.getId() + ", Name: " + findStudent.getName()+"\n");
                    return i+1;
                }
            }
            System.out.println("No match found.");
        }
        return -1;
    }

    static void printMenu() {
        System.out.println("""
                Options available:
                1 - Search student by name
                2 - See available options
                3 - Print list of students
                0 - Quit program""");
    }

}
