package pers.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public ResponseEntity<EmployeeClass> saveEmployee(@RequestBody EmployeeClass employeeClass) {
        employeeService.saveEmployee(employeeClass);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = {"/getEmployees", "empId"})
    public List<EmployeeClass> getEmployees(@PathVariable(required = false) Long empId) {
        return employeeService.getEmployees(empId);
    }

    @DeleteMapping("delete/{empId}")
    public ResponseEntity removeEmployee(@PathVariable Long empId) {
        employeeService.deleteEmployee(empId);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/{empId}/project/{projectID})")
    public EmployeeClass assignProjectToEmployee(@PathVariable Long empId, @PathVariable Long projectId) {
       return employeeService.assignProjectToEmployee(empId, projectId);
    }
}
