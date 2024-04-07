package com.idc.orm.Student;

import com.idc.orm.Address.Address;
//import com.idc.orm.Course.Course;
//import com.idc.orm.Login.Login;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student_information")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long studentId;

    private String studentName;

    private int mark;

//    @OneToOne(optional = false, mappedBy = "student", cascade = CascadeType.ALL)
//    private Login login;

    // Cascading: perform some action on the target entity, the same action will be applied to the associated entity.
    @OneToOne(optional = false, mappedBy = "student", cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_add_id")
    private Address address;

//    Lazy= Lazy loading is a pattern
//    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//    @JoinTable(
//            name = "students_n_courses",
//            joinColumns = @JoinColumn(name = "student_id"),
//            inverseJoinColumns = @JoinColumn(name = "course_id"))
//    private Set<Course> courses;

    public Long getStudentId() {

        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

//    public Set<Course> getCourses() {
//        return courses;
//    }
//
//    public void setCourses(Set<Course> courses) {
//        this.courses = courses;
//    }
}
