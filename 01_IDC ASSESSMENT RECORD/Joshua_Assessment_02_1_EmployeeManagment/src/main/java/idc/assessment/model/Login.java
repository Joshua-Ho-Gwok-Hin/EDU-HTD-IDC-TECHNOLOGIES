package idc.assessment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "login")
public class Login {
    @Id
    @Column(name = "employee_id", nullable = false)
    private Long id;

    @Column(name = "user_name")
    private String username;
    @Column(name = "pass_word")
    private String password;

    @OneToOne
    @MapsId
    @JoinColumn(name = "employee_id")
    private Employee employee;


}