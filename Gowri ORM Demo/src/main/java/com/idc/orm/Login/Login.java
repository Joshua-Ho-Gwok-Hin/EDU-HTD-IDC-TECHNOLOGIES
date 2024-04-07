//package com.idc.orm.Login;
//
//import com.idc.orm.Student.Student;
//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;
//import org.hibernate.annotations.GeneratorType;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.persistence.*;
//
//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Table(name = "login_tbl")
//public class Login {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    @OneToOne(optional = false)
//    @JoinColumn(name = "fk_student_id")
//    private Student student;
//
//    private String username;
//
//    private String password;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Student getStudent() {
//        return student;
//    }
//
//    public void setStudent(Student student) {
//        this.student = student;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//}
