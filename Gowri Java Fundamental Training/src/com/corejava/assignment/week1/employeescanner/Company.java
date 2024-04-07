package com.corejava.assignment.week1.employeescanner;

import java.util.ArrayList;

public class Company {

    private String name;
    private ArrayList<Employee> employees;

    public Company() {
        name = "************ ABC Company ************";
        employees = new ArrayList<Employee>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(String name, double salary) {
        Employee employee = new Employee(name, salary);
        employees.add(employee);
        employee.setId(employees.size());
    }


}
