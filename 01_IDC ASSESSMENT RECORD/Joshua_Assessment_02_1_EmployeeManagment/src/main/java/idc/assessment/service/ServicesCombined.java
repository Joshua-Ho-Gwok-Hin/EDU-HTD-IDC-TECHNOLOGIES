package idc.assessment.service;

import idc.assessment.model.Employee;
import idc.assessment.respository.EmployeeRepository;
import idc.assessment.respository.LoginRepository;
import idc.assessment.respository.QualificationRepository;
import idc.assessment.respository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicesCombined {

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    LoginRepository loginRepository;
    @Autowired
    TaskRepository taskRepository;
    @Autowired
    QualificationRepository qualificationRepository;

    public Employee save(Employee e) {
        return employeeRepository.save(e);
    }
}
