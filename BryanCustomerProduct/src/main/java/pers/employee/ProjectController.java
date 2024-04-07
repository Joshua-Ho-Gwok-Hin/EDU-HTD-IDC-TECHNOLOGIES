package pers.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("/saveProject")
    public ResponseEntity<ProjectClass> saveProject(@RequestBody ProjectClass p) {
        projectService.saveProject(p);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = {"/get-projects", "{p}"})
    public List<ProjectClass> getProjects(@PathVariable(required = false) Long p) {
        return projectService.getProjects(p);
    }

    @DeleteMapping("delete-project/{pId}")
    public ResponseEntity removeProject(@PathVariable Long pId) {
        projectService.deleteProject(pId);
        return new ResponseEntity(HttpStatus.OK);
    }

//    @PutMapping("/{empId}/project/{projectID})")
//    public ProjectClass assignProjectToEmployee(@PathVariable Long empId, @PathVariable Long projectId) {
//        return projectService.assignProjectToEmployee(empId, projectId);
//    }
}
