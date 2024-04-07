package com.corejava.assignment.week1.employeescanner;

public class Employee{

    private String name;
    private double salary;
    private long id;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
