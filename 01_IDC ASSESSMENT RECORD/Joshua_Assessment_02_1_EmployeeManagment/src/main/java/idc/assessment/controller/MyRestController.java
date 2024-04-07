package idc.assessment.controller;

import idc.assessment.model.Employee;
import idc.assessment.model.Task;
import idc.assessment.service.ServicesCombined;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyRestController {

    @Autowired
    ServicesCombined servicesCombined;

    @PostMapping("/add-employee")
    public Employee save(@RequestBody Employee e) {
        e.getTaskList().forEach(task -> task.setEmployee(e));
        return servicesCombined.save(e);
    }
//      Postman postRequest for testing
//    {"firstName":"Stephen","lastName":"Strange",
//            "taskList":[
//        {"description":"C New Task"},
//        {"description":"D New Task"}],
//        "qualifications":[
//        {"school":"LITHAN","field":"ICT"},
//        {"school":"LCM","field":"Grade 3"}]}

}
