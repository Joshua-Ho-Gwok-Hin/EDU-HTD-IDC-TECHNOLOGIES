package com.corejava.assignment.week1.studentperformance;

import java.util.ArrayList;

public class Grade {

    private int gradeNumber;
    private ArrayList<Student> students;

    public Grade(int name) {
        gradeNumber = name;
        students = new ArrayList<Student>();
    }

    public int getGradeNumber() {
        return gradeNumber;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
