package idc.orm.ControlSvcRepo;

import idc.orm.OneToMany.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRespository extends JpaRepository<Employee, Long> {

}
