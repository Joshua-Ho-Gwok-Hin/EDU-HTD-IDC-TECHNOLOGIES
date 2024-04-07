package idc.orm.ControlSvcRepo;

import idc.orm.OneToMany.Employee;
import idc.orm.OneToMany.Qualification;
import idc.orm.OneToMany.ToDoTask;
import idc.orm.OneToOne.Login;
import idc.orm.OneToOne.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    @Autowired
    LoginRepository loginRepository;
    @Autowired
    UserProfileRepository userProfileRepository;
    @Autowired
    QualificationRepository qualificationRepository;


    @Autowired
    EmployeeRespository employeeRespository;
    @Autowired
    ToDoTaskRepository toDoTaskRepository;

    public Employee save(Employee e) {
        return employeeRespository.save(e);
    }

    public ToDoTask save(ToDoTask t) {
        return toDoTaskRepository.save(t);
    }

    public List<ToDoTask> saveAllTask(List<ToDoTask> tt) {
        return toDoTaskRepository.saveAll(tt);
    }

    public UserProfile save(UserProfile up) {
        return userProfileRepository.save(up);
    }
    public Login save(Login lg) {
        return loginRepository.save(lg);
    }

    public Qualification save(Qualification q) {
        return qualificationRepository.save(q);
    }

    public List<Qualification> saveAll(List<Qualification> qq) {
        return qualificationRepository.saveAll(qq);
    }


}
