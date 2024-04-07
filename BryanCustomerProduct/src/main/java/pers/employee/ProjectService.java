package pers.employee;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public void saveProject(ProjectClass p) {
        projectRepository.save(p);
    }

    public List<ProjectClass> getProjects(Long pId) {
        if (pId != null) {
            return projectRepository.findProjectById(pId);
        } else {
            return projectRepository.findAll();
        }
    }


//    public ProjectClass assignProjectToEmployee(Long empId, Long projectId) {
//        Set<ProjectClass> projectClassSet = null;
//        EmployeeClass employeeClass = projectRepository.findById(empId).get();
//        ProjectClass projectClass = projectRepository.findById(projectId).get();
//        projectClassSet = employeeClass.getAssignedProject();
//        projectClassSet.add(projectClass);
//        employeeClass.setAssignedProject();
//        return projectRepository.save(employeeClass);
//    }

    public void deleteProject(Long d) {
        projectRepository.deleteById(d);

    }
}
