package com.corejava.assignment.week1.studentperformance.main;

import com.corejava.assignment.week1.studentperformance.Grade;
import com.corejava.assignment.week1.studentperformance.Student;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Grade grade1 = new Grade(1);

        Student tony = new Student("Tony Stark", grade1);
        tony.studentPerformance(98,98,88,72, "is a very naughty boy!");

        Student john = new Student("John Williams", grade1);
        john.studentPerformance(28,18,8,22);

        Student peter = new Student("Peter Parker", grade1);
        peter.studentPerformance(22,34,65,62);

        Student skippy = new Student("Skippy Peanut", grade1);
        skippy.studentPerformance(8,98,88,92);

        Student roddy = new Student("Roddy Rode", grade1);
        roddy.studentPerformance(98,50,1,92);

        Student mandy = new Student("Mandy Lee", grade1);
        mandy.studentPerformance(68,98,88,92);

        Student james = new Student("James Bond", grade1);
        james.studentPerformance(8,8,38,12);

        Student strange = new Student("Steven Strange", grade1);
        strange.studentPerformance(98,98,88,92);

        Student harry = new Student("Harry Potter", grade1);
        harry.studentPerformance(45,54,25,88);

        Student steve = new Student("Steve Cappy", grade1);
        steve.studentPerformance(45,44,25,88);

        Collections.sort(grade1.getStudents());

        int printOrder=0;
        for (Student ranking : grade1.getStudents()) {
            printOrder++;
            ranking.setResultPosition(printOrder);
            printReport(ranking);
        }
    }

    public static void printReport(Student student) {
        System.out.println();
        System.out.println("************************* Student Annual Report *************************");
        System.out.println("\t\tFull Name\t\t:\t" + student.getFullName()+"\n\t\tGrade\t\t\t:\t"+ student.getGrade().getGradeNumber());
        System.out.println("\t\tAssessment Q1\t:\t\t\t\t\t\t\t\t"+ student.getAssessmentQ1() + "\t/100");
        System.out.println("\t\tAssessment Q2\t:\t\t\t\t\t\t\t\t"+ student.getAssessmentQ2() + "\t/100");
        System.out.println("\t\tAssessment Q3\t:\t\t\t\t\t\t\t\t"+ student.getAssessmentQ3() + "\t/100");
        System.out.println("\t\tAssessment Q4\t:\t\t\t\t\t\t\t\t"+ student.getAssessmentQ4() + "\t/100");
        System.out.println("\t\tAggregate\t\t:\t\t\t\t\t\t\t\t"+ student.getAggregate() + "\t/400");
        System.out.println("\t\tPosition\t\t:\t\t\t\t\t\t\t\t" + student.getResultPosition()+ "\t/"+ student.getGrade().getStudents().size());
        System.out.println("\t\tPercentage\t\t:\t\t\t\t\t\t\t\t" + student.getOverallPercentage()+ "\t%");
        System.out.println("\t\tResult\t\t\t:\t" + student.getResultString());
        System.out.println("Comments : \n" + student.getTeacherComment());
        System.out.println("***************************** End of Report *****************************");

    }

    public static void printGradeSize(Student student) {
        System.out.println("There are " + student.getGrade().getStudents().size() +
                " students in the same grade as " + student.getFullName());
    }

    public static void printPersonalPerformance(Student student) {
        System.out.println(student.getFullName() + " scored");
    }
}