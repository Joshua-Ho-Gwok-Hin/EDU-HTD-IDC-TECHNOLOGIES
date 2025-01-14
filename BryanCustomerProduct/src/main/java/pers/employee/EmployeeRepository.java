package pers.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeClass, Long> {

    List<EmployeeClass> findByEmpId(Long empId);
}
