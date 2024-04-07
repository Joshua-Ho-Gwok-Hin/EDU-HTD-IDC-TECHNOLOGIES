package com.corejava.assignment.week2.print_employee_details;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Company {

    static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        Employee allan = new Employee("Allan", Employee.Designation.PROGRAMMER);
        Employee alvin = new Employee("Alvin", Employee.Designation.PROGRAMMER);
        Employee jason = new Employee("Jason", Employee.Designation.PROGRAMMER);
        Employee wendy = new Employee("Wendy", Employee.Designation.ACCOUNTANT);
        Employee caleb = new Employee("Caleb", Employee.Designation.ACCOUNTANT);
        Employee alice = new Employee("Alice", Employee.Designation.PROGRAMMER);
        Employee peter = new Employee("Peter", Employee.Designation.PROGRAMMER);
        Employee john = new Employee("John", Employee.Designation.PROGRAMMER);
        Employee steven = new Employee("Steven", Employee.Designation.ACCOUNTANT);
        Employee mark = new Employee("Mark", Employee.Designation.ACCOUNTANT);
        start();
    }

    private static void start() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            System.out.println("\nEnter \"q\" to quit.\nEnter name to search:");
            String searchName = scanner.next();
            scanner.nextLine();
            if (searchName.equals("q")) {
                System.out.println("You have entered \"q\" to quit the program.\nShutting down...");
                quit = true;
            } else {
                processElements(
                        employees,
                        e -> e.getName().equalsIgnoreCase(searchName),
                        Employee::toString,
                        System.out::println
                );
            }
        }
    }

    public static <E, R> void processElements(
            Iterable<E> employees,
            Predicate<E> validation,
            Function<E, R> mapper,
            Consumer<R> content) {
        for (E e : employees) {
            if (validation.test(e)) {
                R data = mapper.apply(e);
                content.accept(data);
            }
        }
    }
}
