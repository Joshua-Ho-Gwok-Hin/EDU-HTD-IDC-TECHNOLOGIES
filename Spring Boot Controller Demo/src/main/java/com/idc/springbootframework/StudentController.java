package com.idc.springbootframework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent() {
        return new Student("Peter", "Cook", 3);
    }

    @GetMapping("/string")
    public String getStudentString() {
        return new Student("John", "Smith",101).toString();
    }

    @GetMapping("students")
    public List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Harry", "Potter",91));
        studentList.add(new Student("Tony", "Stark",92));
        studentList.add(new Student("Peter", "Parker",93));
        studentList.add(new Student("Tom", "Riddle",94));
        return studentList;
    }

    @GetMapping("/addstudent/{fName}/{lName}/{num}")
    public Student studentPathVariable(@PathVariable("fName") String firstName,
                                       @PathVariable("lName") String lastName,
                                       @PathVariable("num") Integer num) {
        return new Student(firstName,lastName, num);
    }
//    http://localhost:8080/addstudent/hello/panda/4

    @GetMapping("/addparam/query")
    public Student studentRequestParam(@RequestParam("fname") String firstName,
                                       @RequestParam("lname") String lastName,
                                       @RequestParam("id") int num){
        return new Student(firstName, lastName, num);
    }
//    http://localhost:8080/addparam/query?fname=Hello&lname=Panda&id=48
}