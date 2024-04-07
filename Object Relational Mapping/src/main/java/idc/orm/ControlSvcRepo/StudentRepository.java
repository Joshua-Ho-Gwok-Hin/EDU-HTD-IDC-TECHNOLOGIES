package idc.orm.ControlSvcRepo;

import idc.orm.ManyToMany.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}