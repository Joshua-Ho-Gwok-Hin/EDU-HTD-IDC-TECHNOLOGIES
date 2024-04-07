package com.corejava.assignment.week2.print_employee_details;
//    1. Write a program to print employee details using functional interface.
//    The program should be able to check the employee name in both upper and lowercasing.
//    example: 101 john programmer

import static com.corejava.assignment.week2.print_employee_details.Company.employees;

class Employee {

    private String name;
    private long id;
    private Designation designation;
    private double salary;
    static long count;

    enum Designation {
        PROGRAMMER, ACCOUNTANT
    }

    public Employee(String name, Designation designation) {
        this.name = name;
        this.designation = designation;
        salary = 5000;
        count++;
        id = count;
        employees.add(this);
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public Designation getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return  "\n******** EMPLOYEE DETAILS ********" +
                "\nName:\t\t\t" + name +
                "\nId:\t\t\t\t" + id +
                "\nDesignation:\t" + designation +
                "\nSalary:\t\t\t" + salary +
                "\n**********************************";
    }

}
