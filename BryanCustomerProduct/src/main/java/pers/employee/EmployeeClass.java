package pers.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EmployeeClass")
public class EmployeeClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;

    private String empName;

    @ManyToMany
    @JoinTable(name = "Employee_Project",
            joinColumns = @JoinColumn(name = "employee_Id"),
            inverseJoinColumns = @JoinColumn(name = "project_Id"))
    private Set<ProjectClass> assignedProject = new HashSet<>();

}
