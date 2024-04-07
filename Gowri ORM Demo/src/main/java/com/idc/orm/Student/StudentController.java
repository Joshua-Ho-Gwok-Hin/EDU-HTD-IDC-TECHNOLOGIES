package com.idc.orm.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public Student addStudent(@RequestBody Student s) {
        return studentService.addStudent(s);
    }

    @PostMapping("/save-all")
    public List<Student> addAllStudent(@RequestBody List<Student> sss) {
        return studentService.addStudents(sss);
    }

    @GetMapping("/list-all-students")
    public List<Student> listAllStudents() {
        return studentService.findAllStudents();
    }

    @GetMapping("get-student/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.findStudentById(id);
    }

    @PutMapping("/update-student/{id}")
    public Student updateStudent(@RequestBody Student s) {
        return studentService.updateStudent(s);
    }

    @DeleteMapping("delete-student/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        return studentService.deleteStudent(id);
    }
}
