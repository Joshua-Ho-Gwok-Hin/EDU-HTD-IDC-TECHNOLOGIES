package idc.orm.ControlSvcRepo;

import idc.orm.OneToMany.ToDoTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoTaskRepository extends JpaRepository<ToDoTask, Long> {
}