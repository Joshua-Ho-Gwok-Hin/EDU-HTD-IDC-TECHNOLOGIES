package com.idc.orm.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student addStudent(Student s) {
        return studentRepository.save(s);
    }

    public List<Student> addStudents(List<Student> sss) {
        return studentRepository.saveAll(sss);
    }

    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    public Student findStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student updateStudent(Student s) {
        return studentRepository.save(s);
    }

    public String deleteStudent(Long id) {
        studentRepository.deleteById(id);
        return "Student deleted successfully";
    }
}
