package com.corejava;

public class Employee {

    private String name;
    private long id;
    private String designation;
    private double salary;

    public Employee(String name, long id, String designation, double salary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        System.out.println("com.corejava.Employee Details:" +
                "\ncom.corejava.Employee Id : " + id +
                "\nName : " + name +
                "\nDesignation : " + designation);
    }

    public double getSalary() {
        return salary;
    }

    private void printSalary() {
        System.out.println("Your salary is " + getSalary());
    }

    public String getName() {
        return name;
    }

    public boolean promotion(double increment) {
        if (0 < increment) {
            salary += increment;
            System.out.println("Congratulations " + getName() +
                    ", you have been promoted and your salary is now: " +
                    salary);
            return true;
        } else {
            System.out.println("Please put in more effort");
            return false;
        }
    }

    public static void main(String[] args) {
        Employee james = new Employee("James Bond", 7, "Agent", 7000);
        james.printSalary();
        james.promotion(1500d);
        james.printSalary();
    }
}
