package com.idc.orm.Address;

import com.idc.orm.Student.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "address_information")
@Transactional
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id")
    private Long addressId;

    private String city;

    private String addressType;

//    @JoinColumn(name = "fk_student_id")
//    @JoinColumn(name = "student_id")
    @ManyToOne(cascade = CascadeType.ALL)
    private Student student;




}
