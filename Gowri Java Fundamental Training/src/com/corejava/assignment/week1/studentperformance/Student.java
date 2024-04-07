package com.corejava.assignment.week1.studentperformance;

public class Student implements Comparable<Student>{

    private String fullName;
    private Grade grade;
    private int assessmentQ1, assessmentQ2, assessmentQ3, assessmentQ4;
    private int aggregate;
    private int overallPercentage;
    private String resultString;
    private int resultPosition;
    private String teacherComment;

    public int getResultPosition() {
        return resultPosition;
    }

    public String getResultString() {
        return resultString;
    }

    public void setResultPosition(int resultPosition) {
        this.resultPosition = resultPosition;
    }

    public Student(String fullName, Grade grade) {
        this.fullName = fullName;
        this.grade = grade;
        grade.getStudents().add(this);
    }


    public String getFullName() {
        return fullName;
    }

    public Grade getGrade() {
        return grade;
    }

    public int getAssessmentQ1() {
        return assessmentQ1;
    }

    public int getAssessmentQ2() {
        return assessmentQ2;
    }

    public int getAssessmentQ3() {
        return assessmentQ3;
    }

    public int getAssessmentQ4() {
        return assessmentQ4;
    }

    public void studentPerformance(int q1, int q2, int q3, int q4, String comments) {
        studentPerformance(q1, q2, q3, q4);
        teacherComment = fullName + " " + comments;
    }

    public void studentPerformance(int q1, int q2, int q3, int q4) {
        assessmentQ1 = q1;
        assessmentQ2 = q2;
        assessmentQ3 = q3;
        assessmentQ4 = q4;
        aggregate = q1 + q2 + q3 + q4;
        overallPercentage = aggregate / 4;
        if (90 <= overallPercentage) {
            teacherComment = "Well done " + fullName + "! Keep it up!";
            resultString = "Distinction";
        } else if (70 <= overallPercentage) {
            teacherComment = fullName + " has done well. More to come! ";
            resultString = "Merit";
        } else if (50 <= overallPercentage) {
            teacherComment = fullName + " has yet to unleash that full potential. You can do it!";
            resultString = "Pass";
        } else if (30 <= overallPercentage) {
            teacherComment = fullName + " got to work very hard. Please pay more attention in class.";
            resultString = "Fail";
        } else if (0 <= overallPercentage) {
            teacherComment = fullName + " gets easily distracted in class. Go study this holiday!";
            resultString = "Ungraded";
        }
    }

    @Override
    public int compareTo(Student compareStudent) {
        int compareAggregate = ((Student)compareStudent).getAggregate();
        return compareAggregate - this.aggregate;
    }

    public String autoComment() {
        return "hello";
    }

    public String getTeacherComment() {
        return teacherComment;
    }

    public int getAggregate() {
        return aggregate;
    }

    public int getOverallPercentage() {
        return overallPercentage;
    }
}
