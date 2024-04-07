//package com.idc.orm.Course;
//
//import com.idc.orm.Student.Student;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.persistence.*;
//import java.util.Set;
//
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Transactional
//@Table(name = "course")
//public class Course {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "course_id")
//    private int courseId;
//
//    private String courseName;
//
//    @ManyToMany(mappedBy = "courses")
//    Set<Student> studentCourses;
//
//    public int getCourseId() {
//        return courseId;
//    }
//
//    public void setCourseId(int courseId) {
//        this.courseId = courseId;
//    }
//
//    public String getCourseName() {
//        return courseName;
//    }
//
//    public void setCourseName(String courseName) {
//        this.courseName = courseName;
//    }
//
//    public Set<Student> getStudentCourses() {
//        return studentCourses;
//    }
//
//    public void setStudentCourses(Set<Student> studentCourses) {
//        this.studentCourses = studentCourses;
//    }
//}
