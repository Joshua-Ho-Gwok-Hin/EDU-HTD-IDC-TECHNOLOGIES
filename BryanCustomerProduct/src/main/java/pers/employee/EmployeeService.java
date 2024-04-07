package pers.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ProjectRepository projectRepository;

    public void saveEmployee(EmployeeClass employeeClass) {
        employeeRepository.save(employeeClass);
    }

    public List<EmployeeClass> getEmployees(Long empId) {
        if (empId != null) {
            return employeeRepository.findByEmpId(empId);
        } else {
            return employeeRepository.findAll();
        }
    }

    public EmployeeClass assignProjectToEmployee(Long empId, Long projectId) {
        Set<ProjectClass> projectClassSet = null;
        EmployeeClass employeeClass = employeeRepository.findById(empId).get();
        ProjectClass projectClass = projectRepository.findById(projectId).get();
        projectClassSet = employeeClass.getAssignedProject();
        projectClassSet.add(projectClass);
        employeeClass.setAssignedProject(projectClassSet);
        return employeeRepository.save(employeeClass);
    }

    public void deleteEmployee(Long empId) {
        employeeRepository.deleteById(empId);
    }
}
