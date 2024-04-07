package com.corejava.assignment.week2.print_student_name_id;

public class Student {

    private String name;
    private long id;
    private static long count;

    public Student(String name) {
        this.name = name;
        count++;
        id = count;
        Main.students.add(this);
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
