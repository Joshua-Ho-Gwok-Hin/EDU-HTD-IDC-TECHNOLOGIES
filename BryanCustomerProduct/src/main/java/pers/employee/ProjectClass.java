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
@Table(name = "ProjectClass")
public class ProjectClass {

    @Id
    @GeneratedValue
    private Long projectId;
    private String projectName;

    @ManyToMany(mappedBy = "assignedProject")
    private Set<EmployeeClass> employeeClassSet = new HashSet<>();
}
